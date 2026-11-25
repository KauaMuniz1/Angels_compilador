"""SemanticVisitor da linguagem Angels.

Reporta:
  * uso de variável (ou chamada de função) antes da declaração;
  * declaração duplicada no mesmo escopo;
  * tipos: float guardado em int, argumentos e retorno incompatíveis;
  * número errado de argumentos numa chamada;
  * 'break' fora de um laço e 'return' fora de uma função;
  * nome de função usado como variável (e variável usada como função).

Os visitX de expressão DEVOLVEM o tipo da expressão ("int", "float" ou None
quando o tipo é desconhecido por causa de um erro já reportado).
"""
from AngelsParser import AngelsParser
from AngelsVisitor import AngelsVisitor
from tabela_de_simbolos import TabelaDeSimbolos


class SemanticVisitor(AngelsVisitor):
    def __init__(self):
        super().__init__()
        self.tabela = TabelaDeSimbolos()
        self.erros = []
        self.lacos = 0              # quantos 'while' estão abertos neste momento
        self.funcao_atual = None    # (nome, tipo) da função cujo corpo estamos visitando

    # ---- utilidades ------------------------------------------------
    def _erro(self, token, mensagem):
        # token.column é 0-based no ANTLR; mostramos 1-based como o lexer
        self.erros.append(f"Erro semântico [linha {token.line}:{token.column + 1}]: {mensagem}")

    def _declarar(self, token, tipo, categoria, rotulo, params=None):
        nome = token.text
        if self.tabela.declarar(nome, tipo, categoria, token.line, params) is None:
            anterior = self.tabela.buscar_no_escopo_atual(nome)
            self._erro(token, f"declaração duplicada de {rotulo} '{nome}' no mesmo escopo "
                              f"(primeira declaração na linha {anterior.linha}).")

    def _compativel(self, destino, origem):
        return destino is None or origem is None or not (destino == "int" and origem == "float")

    def _checar_atribuicao(self, token, destino, origem, contexto):
        if not self._compativel(destino, origem):
            self._erro(token, f"{contexto}: um valor float não cabe em int.")

    def _unir(self, tipos):
        """Tipo do resultado de uma operação aritmética: float se algum operando
        for float; int se todos forem int; None se algum for desconhecido."""
        if None in tipos:
            return None
        return "float" if "float" in tipos else "int"

    # ---- declarações ----------------------------------------------
    def visitVarDecl(self, ctx: AngelsParser.VarDeclContext):
        tipo = ctx.tipo().getText()
        # O inicializador é avaliado ANTES de a variável existir:
        # `int x = x + 1;` usa x antes da declaração.
        if ctx.expr() is not None:
            tipo_expr = self.visit(ctx.expr())
            nome = ctx.ID().getText()
            self._checar_atribuicao(ctx.ID().symbol, tipo, tipo_expr, f"inicialização de '{nome}'")
        self._declarar(ctx.ID().symbol, tipo, "variavel", "variável")
        return None

    def visitFuncDecl(self, ctx: AngelsParser.FuncDeclContext):
        nome = ctx.ID().getText()
        tipo = ctx.tipo().getText()
        tipos_params = ([p.tipo().getText() for p in ctx.params().param()]
                        if ctx.params() is not None else [])

        # A função entra na tabela ANTES do corpo (permite recursão).
        self._declarar(ctx.ID().symbol, tipo, "funcao", "função", tipos_params)

        anterior = self.funcao_atual
        self.funcao_atual = (nome, tipo)

        self.tabela.entrar_escopo()          # parâmetros e corpo dividem o escopo
        if ctx.params() is not None:
            self.visit(ctx.params())
        for stmt in ctx.bloco().statement():
            self.visit(stmt)
        self.tabela.sair_escopo()

        self.funcao_atual = anterior
        return None

    def visitParam(self, ctx: AngelsParser.ParamContext):
        self._declarar(ctx.ID().symbol, ctx.tipo().getText(), "parametro", "parâmetro")
        return None

    def visitBloco(self, ctx: AngelsParser.BlocoContext):
        self.tabela.entrar_escopo()
        self.visitChildren(ctx)
        self.tabela.sair_escopo()
        return None

    # ---- comandos de controle ---------------------------------------
    def visitWhileStmt(self, ctx: AngelsParser.WhileStmtContext):
        self.visit(ctx.expr())
        self.lacos += 1                      # entrei num laço
        self.visit(ctx.statement())
        self.lacos -= 1                      # saio do laço
        return None

    def visitBreakStmt(self, ctx: AngelsParser.BreakStmtContext):
        if self.lacos == 0:
            self._erro(ctx.BREAK().symbol, "'break' fora de um laço.")
        return None

    def visitReturnStmt(self, ctx: AngelsParser.ReturnStmtContext):
        tipo_expr = self.visit(ctx.expr())
        token = ctx.RETURN().symbol
        if self.funcao_atual is None:
            self._erro(token, "'return' fora de uma função.")
        else:
            nome, tipo = self.funcao_atual
            self._checar_atribuicao(token, tipo, tipo_expr, f"retorno da função '{nome}'")
        return None

    # ---- atribuição ---------------------------------------------------
    def visitAtrib(self, ctx: AngelsParser.AtribContext):
        token = ctx.ID().symbol
        simbolo = self.tabela.buscar(token.text)
        tipo_alvo = None
        if simbolo is None:
            self._erro(token, f"variável '{token.text}' usada antes de ser declarada.")
        elif simbolo.categoria == "funcao":
            self._erro(token, f"'{token.text}' é uma função e não pode receber um valor.")
        else:
            tipo_alvo = simbolo.tipo
        tipo_expr = self.visit(ctx.expr())
        self._checar_atribuicao(token, tipo_alvo, tipo_expr, f"atribuição a '{token.text}'")
        return None

    # ---- expressões (devolvem o tipo) ----------------------------------
    def visitExpr(self, ctx: AngelsParser.ExprContext):
        tipos = [self.visit(r) for r in ctx.exprRel()]
        return "int" if len(tipos) > 1 else tipos[0]      # && e || dão 0/1

    def visitExprRel(self, ctx: AngelsParser.ExprRelContext):
        tipos = [self.visit(a) for a in ctx.exprArt()]
        return "int" if len(tipos) > 1 else tipos[0]      # comparação dá 0/1

    def visitExprArt(self, ctx: AngelsParser.ExprArtContext):
        return self._unir([self.visit(t) for t in ctx.termo()])

    def visitTermo(self, ctx: AngelsParser.TermoContext):
        return self._unir([self.visit(f) for f in ctx.fator()])

    def visitFator(self, ctx: AngelsParser.FatorContext):
        if ctx.INT() is not None:
            return "int"
        if ctx.REAL() is not None:
            return "float"
        if ctx.ID() is not None:                          # uso de uma variável
            token = ctx.ID().symbol
            simbolo = self.tabela.buscar(token.text)
            if simbolo is None:
                self._erro(token, f"variável '{token.text}' usada antes de ser declarada.")
                return None
            if simbolo.categoria == "funcao":
                self._erro(token, f"'{token.text}' é uma função; para usar o valor, "
                                  f"chame '{token.text}(...)'.")
                return None
            return simbolo.tipo
        if ctx.chamadaFuncao() is not None:
            return self.visit(ctx.chamadaFuncao())
        if ctx.expr() is not None:                        # ( expr )
            return self.visit(ctx.expr())
        self.visit(ctx.fator())                           # '!' fator
        return "int"

    def visitChamadaFuncao(self, ctx: AngelsParser.ChamadaFuncaoContext):
        token = ctx.ID().symbol
        simbolo = self.tabela.buscar(token.text)
        if simbolo is None:
            self._erro(token, f"função '{token.text}' chamada antes de ser declarada.")
        elif simbolo.categoria != "funcao":
            self._erro(token, f"'{token.text}' não é uma função.")

        # Os argumentos são sempre visitados (podem conter outros erros).
        args = ctx.argumentos().expr() if ctx.argumentos() is not None else []
        tipos_args = [self.visit(a) for a in args]

        if simbolo is None or simbolo.categoria != "funcao":
            return None

        esperados = simbolo.params
        if len(tipos_args) != len(esperados):
            self._erro(token, f"função '{token.text}' espera {len(esperados)} "
                              f"argumento(s), mas recebeu {len(tipos_args)}.")
        else:
            for i, (esperado, recebido) in enumerate(zip(esperados, tipos_args), start=1):
                if not self._compativel(esperado, recebido):
                    self._erro(token, f"argumento {i} de '{token.text}': "
                                      f"esperado {esperado}, recebido {recebido}.")
        return simbolo.tipo