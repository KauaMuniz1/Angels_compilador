"""Lê tokens.tsv, alimenta o parser ANTLR via ListTokenSource e mostra a árvore."""
import sys
from semantic_visitor import SemanticVisitor
from antlr4 import CommonTokenStream
from antlr4.ListTokenSource import ListTokenSource
from antlr4.Token import CommonToken, Token
from antlr4.error.ErrorListener import ErrorListener

from AngelsParser import AngelsParser


def montar_vocabulario():
    """Descobre, a partir do parser gerado, qual número o ANTLR deu a cada token.

    por_nome:    'ID' -> número, 'INT' -> número, 'IF' -> número ...
    por_literal: ';' -> número, '==' -> número, 'num' -> número ...
    """
    por_nome = {}
    por_literal = {}
    for tipo in range(1, len(AngelsParser.symbolicNames)):
        nome = AngelsParser.symbolicNames[tipo]
        if nome != "<INVALID>":
            por_nome[nome] = tipo
        if tipo < len(AngelsParser.literalNames):
            lit = AngelsParser.literalNames[tipo]
            if lit != "<INVALID>":
                por_literal[lit.strip("'")] = tipo
    return por_nome, por_literal


def ler_tokens_tsv(caminho):
    por_nome, por_literal = montar_vocabulario()
    tokens = []
    ultima_linha, ultima_coluna = 1, 0

    with open(caminho, "r", encoding="utf-8") as f:
        for n, texto_linha in enumerate(f, start=1):
            texto_linha = texto_linha.rstrip("\n")
            if not texto_linha:
                continue
            tipo_lexer, linha, coluna, lexema = texto_linha.split("\t", 3)

            # ID, INT e REAL têm o mesmo nome no lexer e na gramática.
            # Os outros (num, if, ==, ;, ...) são achados pelo próprio lexema.
            if tipo_lexer in por_nome:
                tipo = por_nome[tipo_lexer]
            elif lexema in por_literal:
                tipo = por_literal[lexema]
            else:
                sys.exit(f"{caminho}:{n}: token '{lexema}' ({tipo_lexer}) "
                         f"não existe na gramática Angels.g4")

            tok = CommonToken(CommonToken.EMPTY_SOURCE, tipo, Token.DEFAULT_CHANNEL, -1, -1)
            tok.text = lexema
            tok.line = int(linha)
            tok.column = int(coluna) - 1      # seu lexer conta de 1, o ANTLR de 0
            tok.tokenIndex = len(tokens)
            tokens.append(tok)
            ultima_linha, ultima_coluna = tok.line, tok.column + len(lexema)

    # O parser espera um token EOF no final
    eof = CommonToken(CommonToken.EMPTY_SOURCE, Token.EOF, Token.DEFAULT_CHANNEL, -1, -1)
    eof.text = "<EOF>"
    eof.line, eof.column = ultima_linha, ultima_coluna
    eof.tokenIndex = len(tokens)
    tokens.append(eof)
    return tokens


class ColetorErrosSintaxe(ErrorListener):
    def __init__(self):
        super().__init__()
        self.erros = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.erros.append(f"Erro sintático [linha {line}:{column + 1}]: {msg}")


def main():
    caminho = sys.argv[1] if len(sys.argv) > 1 else "tokens.tsv"

    tokens = ler_tokens_tsv(caminho)
    fonte = ListTokenSource(tokens)        # a lista pronta vira um TokenSource
    stream = CommonTokenStream(fonte)
    parser = AngelsParser(stream)

    coletor = ColetorErrosSintaxe()
    parser.removeErrorListeners()
    parser.addErrorListener(coletor)

    arvore = parser.program()

    print("ÁRVORE SINTÁTICA")
    print(arvore.toStringTree(recog=parser))

    if coletor.erros:
        print("\nERROS SINTÁTICOS (análise semântica não executada)")
        for e in coletor.erros:
            print(e)
        sys.exit(1)

    visitor = SemanticVisitor()
    visitor.visit(arvore)

    print("\nTABELA DE SÍMBOLOS")
    print(visitor.tabela.dump())

    print("RESULTADO SEMÂNTICO")
    if visitor.erros:
        for e in visitor.erros:
            print(e)
        print(f"\n{len(visitor.erros)} erro(s) semântico(s).")
        sys.exit(1)
    print("Análise semântica concluída sem erros.")

if __name__ == "__main__":
    main()