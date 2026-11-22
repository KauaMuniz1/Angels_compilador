// Generated from /home/kaua/Documents/Programacao/Faculdade/sexto_periodo/Compiladores/atividades/construcao_analisador_lexico/Angels.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngelsParser}.
 */
public interface AngelsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngelsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngelsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngelsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AngelsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AngelsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(AngelsParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(AngelsParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(AngelsParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(AngelsParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(AngelsParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(AngelsParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(AngelsParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(AngelsParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(AngelsParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(AngelsParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(AngelsParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(AngelsParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(AngelsParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(AngelsParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(AngelsParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(AngelsParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(AngelsParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(AngelsParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(AngelsParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(AngelsParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(AngelsParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(AngelsParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AngelsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AngelsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#exprRel}.
	 * @param ctx the parse tree
	 */
	void enterExprRel(AngelsParser.ExprRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#exprRel}.
	 * @param ctx the parse tree
	 */
	void exitExprRel(AngelsParser.ExprRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#exprArt}.
	 * @param ctx the parse tree
	 */
	void enterExprArt(AngelsParser.ExprArtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#exprArt}.
	 * @param ctx the parse tree
	 */
	void exitExprArt(AngelsParser.ExprArtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AngelsParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AngelsParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(AngelsParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(AngelsParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(AngelsParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(AngelsParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngelsParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(AngelsParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngelsParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(AngelsParser.ArgumentosContext ctx);
}