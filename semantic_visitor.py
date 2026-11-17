"""SemanticVisitor da linguagem Angels.

Reporta:
  * uso de variável (ou chamada de função) antes da declaração;
  * declaração duplicada no mesmo escopo.
"""
from AngelsParser import AngelsParser
from AngelsVisitor import AngelsVisitor
from tabela_de_simbolos import TabelaDeSimbolos


class SemanticVisitor(AngelsVisitor):
    def __init__(self):
        super().__init__()
        self.tabela = TabelaDeSimbolos()
        self.erros = []

    def _erro(self, token, mensagem):
        # token.column é 0-based no ANTLR; mostramos 1-based como o lexer
        self.erros.append(f"Erro semântico [linha {token.line}:{token.column + 1}]: {mensagem}")

    def _declarar(self, token, tipo, categoria, rotulo):
        nome = token.text
        if self.tabela.declarar(nome, tipo, categoria, token.line) is None:
            anterior = self.tabela.buscar_no_escopo_atual(nome)
            self._erro(token, f"declaração duplicada de {rotulo} '{nome}' no mesmo escopo "
                              f"(primeira declaração na linha {anterior.linha}).")

    # ---- declarações ----------------------------------------------
    def visitVarDecl(self, ctx: AngelsParser.VarDeclContext):
        # O inicializador é avaliado ANTES de a variável existir:
        # `num x = x + 1;` usa x antes da declaração.
        if ctx.expr() is not None:
            self.visit(ctx.expr())
        self._declarar(ctx.ID().symbol, ctx.tipo().getText(), "variavel", "variável")
        return None

    def visitFuncDecl(self, ctx: AngelsParser.FuncDeclContext):
        # A função entra na tabela ANTES do corpo (permite recursão).
        self._declarar(ctx.ID().symbol, ctx.tipo().getText(), "funcao", "função")

        self.tabela.entrar_escopo()          # parâmetros e corpo dividem o escopo
        if ctx.params() is not None:
            self.visit(ctx.params())
        for stmt in ctx.bloco().statement():
            self.visit(stmt)
        self.tabela.sair_escopo()
        return None

    def visitParam(self, ctx: AngelsParser.ParamContext):
        self._declarar(ctx.ID().symbol, ctx.tipo().getText(), "parametro", "parâmetro")
        return None

    def visitBloco(self, ctx: AngelsParser.BlocoContext):
        self.tabela.entrar_escopo()
        self.visitChildren(ctx)
        self.tabela.sair_escopo()
        return None

    # ---- usos -----------------------------------------------------
    def visitAtrib(self, ctx: AngelsParser.AtribContext):
        token = ctx.ID().symbol
        if self.tabela.buscar(token.text) is None:
            self._erro(token, f"variável '{token.text}' usada antes de ser declarada.")
        self.visit(ctx.expr())
        return None

    def visitFator(self, ctx: AngelsParser.FatorContext):
        # fator -> ID é o uso de uma variável. Os outros casos
        # (número, chamada, parênteses, '!') descem pela árvore.
        if ctx.ID() is not None:
            token = ctx.ID().symbol
            if self.tabela.buscar(token.text) is None:
                self._erro(token, f"variável '{token.text}' usada antes de ser declarada.")
            return None
        return self.visitChildren(ctx)

    def visitChamadaFuncao(self, ctx: AngelsParser.ChamadaFuncaoContext):
        token = ctx.ID().symbol
        if self.tabela.buscar(token.text) is None:
            self._erro(token, f"função '{token.text}' chamada antes de ser declarada.")
        return self.visitChildren(ctx)