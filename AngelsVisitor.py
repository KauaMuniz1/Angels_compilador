# Generated from Angels.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .AngelsParser import AngelsParser
else:
    from AngelsParser import AngelsParser

# This class defines a complete generic visitor for a parse tree produced by AngelsParser.

class AngelsVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by AngelsParser#program.
    def visitProgram(self, ctx:AngelsParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#statement.
    def visitStatement(self, ctx:AngelsParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#bloco.
    def visitBloco(self, ctx:AngelsParser.BlocoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#tipo.
    def visitTipo(self, ctx:AngelsParser.TipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#varDecl.
    def visitVarDecl(self, ctx:AngelsParser.VarDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#atrib.
    def visitAtrib(self, ctx:AngelsParser.AtribContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#funcDecl.
    def visitFuncDecl(self, ctx:AngelsParser.FuncDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#params.
    def visitParams(self, ctx:AngelsParser.ParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#param.
    def visitParam(self, ctx:AngelsParser.ParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#returnStmt.
    def visitReturnStmt(self, ctx:AngelsParser.ReturnStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#breakStmt.
    def visitBreakStmt(self, ctx:AngelsParser.BreakStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#ifStmt.
    def visitIfStmt(self, ctx:AngelsParser.IfStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#whileStmt.
    def visitWhileStmt(self, ctx:AngelsParser.WhileStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#expr.
    def visitExpr(self, ctx:AngelsParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#exprRel.
    def visitExprRel(self, ctx:AngelsParser.ExprRelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#exprArt.
    def visitExprArt(self, ctx:AngelsParser.ExprArtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#termo.
    def visitTermo(self, ctx:AngelsParser.TermoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#fator.
    def visitFator(self, ctx:AngelsParser.FatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#chamadaFuncao.
    def visitChamadaFuncao(self, ctx:AngelsParser.ChamadaFuncaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by AngelsParser#argumentos.
    def visitArgumentos(self, ctx:AngelsParser.ArgumentosContext):
        return self.visitChildren(ctx)



del AngelsParser