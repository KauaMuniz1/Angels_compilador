// Generated from /home/kaua/Documents/Programacao/Faculdade/sexto_periodo/Compiladores/atividades/construcao_analisador_lexico/Angels.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AngelsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T_INT=21, T_FLOAT=22, IF=23, ELIF=24, ELSE=25, 
		WHILE=26, RETURN=27, BREAK=28, REAL=29, INT=30, ID=31, WS=32, LINE_COMMENT=33;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_bloco = 2, RULE_tipo = 3, RULE_varDecl = 4, 
		RULE_atrib = 5, RULE_funcDecl = 6, RULE_params = 7, RULE_param = 8, RULE_returnStmt = 9, 
		RULE_breakStmt = 10, RULE_ifStmt = 11, RULE_whileStmt = 12, RULE_expr = 13, 
		RULE_exprRel = 14, RULE_exprArt = 15, RULE_termo = 16, RULE_fator = 17, 
		RULE_chamadaFuncao = 18, RULE_argumentos = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "bloco", "tipo", "varDecl", "atrib", "funcDecl", 
			"params", "param", "returnStmt", "breakStmt", "ifStmt", "whileStmt", 
			"expr", "exprRel", "exprArt", "termo", "fator", "chamadaFuncao", "argumentos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'='", "'('", "')'", "','", "'&&'", "'||'", 
			"'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", 
			"'!'", "'int'", "'float'", "'if'", "'elif'", "'else'", "'while'", "'return'", 
			"'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "T_INT", "T_FLOAT", 
			"IF", "ELIF", "ELSE", "WHILE", "RETURN", "BREAK", "REAL", "INT", "ID", 
			"WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Angels.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngelsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngelsParser.EOF, 0); }
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4243587108L) != 0)) {
				{
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(40);
					funcDecl();
					}
					break;
				case 2:
					{
					setState(41);
					statement();
					}
					break;
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				varDecl();
				setState(50);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				atrib();
				setState(53);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				expr();
				setState(56);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				returnStmt();
				setState(59);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				breakStmt();
				setState(62);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				ifStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				whileStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				bloco();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__1);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4243587108L) != 0)) {
				{
				{
				setState(70);
				statement();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode T_INT() { return getToken(AngelsParser.T_INT, 0); }
		public TerminalNode T_FLOAT() { return getToken(AngelsParser.T_FLOAT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==T_INT || _la==T_FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(AngelsParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			tipo();
			setState(81);
			match(ID);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(82);
				match(T__3);
				setState(83);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngelsParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(ID);
			setState(87);
			match(T__3);
			setState(88);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(AngelsParser.ID, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			tipo();
			setState(91);
			match(ID);
			setState(92);
			match(T__4);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_INT || _la==T_FLOAT) {
				{
				setState(93);
				params();
				}
			}

			setState(96);
			match(T__5);
			setState(97);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			param();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(100);
				match(T__6);
				setState(101);
				param();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(AngelsParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			tipo();
			setState(108);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngelsParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(RETURN);
			setState(111);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(AngelsParser.BREAK, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngelsParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(AngelsParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(AngelsParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(AngelsParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IF);
			setState(116);
			match(T__4);
			setState(117);
			expr();
			setState(118);
			match(T__5);
			setState(119);
			statement();
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					match(ELIF);
					setState(121);
					match(T__4);
					setState(122);
					expr();
					setState(123);
					match(T__5);
					setState(124);
					statement();
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(131);
				match(ELSE);
				setState(132);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AngelsParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(WHILE);
			setState(136);
			match(T__4);
			setState(137);
			expr();
			setState(138);
			match(T__5);
			setState(139);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<ExprRelContext> exprRel() {
			return getRuleContexts(ExprRelContext.class);
		}
		public ExprRelContext exprRel(int i) {
			return getRuleContext(ExprRelContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			exprRel();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				{
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				exprRel();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelContext extends ParserRuleContext {
		public List<ExprArtContext> exprArt() {
			return getRuleContexts(ExprArtContext.class);
		}
		public ExprArtContext exprArt(int i) {
			return getRuleContext(ExprArtContext.class,i);
		}
		public ExprRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRel; }
	}

	public final ExprRelContext exprRel() throws RecognitionException {
		ExprRelContext _localctx = new ExprRelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			exprArt();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) {
				{
				setState(150);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				exprArt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprArtContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public ExprArtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprArt; }
	}

	public final ExprArtContext exprArt() throws RecognitionException {
		ExprArtContext _localctx = new ExprArtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprArt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			termo();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==T__16) {
				{
				{
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				termo();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			fator();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18) {
				{
				{
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				fator();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AngelsParser.INT, 0); }
		public TerminalNode REAL() { return getToken(AngelsParser.REAL, 0); }
		public TerminalNode ID() { return getToken(AngelsParser.ID, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fator);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				chamadaFuncao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(T__4);
				setState(175);
				expr();
				setState(176);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(T__19);
				setState(179);
				fator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngelsParser.ID, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ID);
			setState(183);
			match(T__4);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3759144992L) != 0)) {
				{
				setState(184);
				argumentos();
				}
			}

			setState(187);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			expr();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(190);
				match(T__6);
				setState(191);
				expr();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u00c6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0005\u0000+\b\u0000"+
		"\n\u0000\f\u0000.\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001D\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006_\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007g\b\u0007\n\u0007\f\u0007j\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u007f"+
		"\b\u000b\n\u000b\f\u000b\u0082\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0086\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u0091\b\r\n\r\f\r\u0094\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0099\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u009e\b\u000f\n\u000f\f\u000f\u00a1\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00a6\b\u0010\n\u0010\f\u0010\u00a9"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00b5"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ba\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00c1\b\u0013\n\u0013\f\u0013\u00c4\t\u0013\u0001\u0013\u0000\u0000\u0014"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&\u0000\u0005\u0001\u0000\u0015\u0016\u0001\u0000\b\t"+
		"\u0001\u0000\n\u000f\u0001\u0000\u0010\u0011\u0001\u0000\u0012\u0013\u00cb"+
		"\u0000,\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0004E"+
		"\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bP\u0001\u0000"+
		"\u0000\u0000\nV\u0001\u0000\u0000\u0000\fZ\u0001\u0000\u0000\u0000\u000e"+
		"c\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012n\u0001"+
		"\u0000\u0000\u0000\u0014q\u0001\u0000\u0000\u0000\u0016s\u0001\u0000\u0000"+
		"\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u008d\u0001\u0000\u0000"+
		"\u0000\u001c\u0095\u0001\u0000\u0000\u0000\u001e\u009a\u0001\u0000\u0000"+
		"\u0000 \u00a2\u0001\u0000\u0000\u0000\"\u00b4\u0001\u0000\u0000\u0000"+
		"$\u00b6\u0001\u0000\u0000\u0000&\u00bd\u0001\u0000\u0000\u0000(+\u0003"+
		"\f\u0006\u0000)+\u0003\u0002\u0001\u0000*(\u0001\u0000\u0000\u0000*)\u0001"+
		"\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000/0\u0005\u0000\u0000\u00010\u0001\u0001\u0000\u0000\u000012\u0003"+
		"\b\u0004\u000023\u0005\u0001\u0000\u00003D\u0001\u0000\u0000\u000045\u0003"+
		"\n\u0005\u000056\u0005\u0001\u0000\u00006D\u0001\u0000\u0000\u000078\u0003"+
		"\u001a\r\u000089\u0005\u0001\u0000\u00009D\u0001\u0000\u0000\u0000:;\u0003"+
		"\u0012\t\u0000;<\u0005\u0001\u0000\u0000<D\u0001\u0000\u0000\u0000=>\u0003"+
		"\u0014\n\u0000>?\u0005\u0001\u0000\u0000?D\u0001\u0000\u0000\u0000@D\u0003"+
		"\u0016\u000b\u0000AD\u0003\u0018\f\u0000BD\u0003\u0004\u0002\u0000C1\u0001"+
		"\u0000\u0000\u0000C4\u0001\u0000\u0000\u0000C7\u0001\u0000\u0000\u0000"+
		"C:\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0003\u0001"+
		"\u0000\u0000\u0000EI\u0005\u0002\u0000\u0000FH\u0003\u0002\u0001\u0000"+
		"GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000LM\u0005\u0003\u0000\u0000M\u0005\u0001\u0000\u0000\u0000"+
		"NO\u0007\u0000\u0000\u0000O\u0007\u0001\u0000\u0000\u0000PQ\u0003\u0006"+
		"\u0003\u0000QT\u0005\u001f\u0000\u0000RS\u0005\u0004\u0000\u0000SU\u0003"+
		"\u001a\r\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\t"+
		"\u0001\u0000\u0000\u0000VW\u0005\u001f\u0000\u0000WX\u0005\u0004\u0000"+
		"\u0000XY\u0003\u001a\r\u0000Y\u000b\u0001\u0000\u0000\u0000Z[\u0003\u0006"+
		"\u0003\u0000[\\\u0005\u001f\u0000\u0000\\^\u0005\u0005\u0000\u0000]_\u0003"+
		"\u000e\u0007\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`a\u0005\u0006\u0000\u0000ab\u0003\u0004\u0002"+
		"\u0000b\r\u0001\u0000\u0000\u0000ch\u0003\u0010\b\u0000de\u0005\u0007"+
		"\u0000\u0000eg\u0003\u0010\b\u0000fd\u0001\u0000\u0000\u0000gj\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u000f"+
		"\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0003\u0006\u0003"+
		"\u0000lm\u0005\u001f\u0000\u0000m\u0011\u0001\u0000\u0000\u0000no\u0005"+
		"\u001b\u0000\u0000op\u0003\u001a\r\u0000p\u0013\u0001\u0000\u0000\u0000"+
		"qr\u0005\u001c\u0000\u0000r\u0015\u0001\u0000\u0000\u0000st\u0005\u0017"+
		"\u0000\u0000tu\u0005\u0005\u0000\u0000uv\u0003\u001a\r\u0000vw\u0005\u0006"+
		"\u0000\u0000w\u0080\u0003\u0002\u0001\u0000xy\u0005\u0018\u0000\u0000"+
		"yz\u0005\u0005\u0000\u0000z{\u0003\u001a\r\u0000{|\u0005\u0006\u0000\u0000"+
		"|}\u0003\u0002\u0001\u0000}\u007f\u0001\u0000\u0000\u0000~x\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0085\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0019\u0000"+
		"\u0000\u0084\u0086\u0003\u0002\u0001\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0017\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005\u001a\u0000\u0000\u0088\u0089\u0005\u0005\u0000"+
		"\u0000\u0089\u008a\u0003\u001a\r\u0000\u008a\u008b\u0005\u0006\u0000\u0000"+
		"\u008b\u008c\u0003\u0002\u0001\u0000\u008c\u0019\u0001\u0000\u0000\u0000"+
		"\u008d\u0092\u0003\u001c\u000e\u0000\u008e\u008f\u0007\u0001\u0000\u0000"+
		"\u008f\u0091\u0003\u001c\u000e\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u001b\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0003\u001e\u000f\u0000"+
		"\u0096\u0097\u0007\u0002\u0000\u0000\u0097\u0099\u0003\u001e\u000f\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u001d\u0001\u0000\u0000\u0000\u009a\u009f\u0003 \u0010\u0000\u009b"+
		"\u009c\u0007\u0003\u0000\u0000\u009c\u009e\u0003 \u0010\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u001f"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a7"+
		"\u0003\"\u0011\u0000\u00a3\u00a4\u0007\u0004\u0000\u0000\u00a4\u00a6\u0003"+
		"\"\u0011\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8!\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00b5\u0005\u001e\u0000\u0000\u00ab\u00b5\u0005\u001d\u0000"+
		"\u0000\u00ac\u00b5\u0005\u001f\u0000\u0000\u00ad\u00b5\u0003$\u0012\u0000"+
		"\u00ae\u00af\u0005\u0005\u0000\u0000\u00af\u00b0\u0003\u001a\r\u0000\u00b0"+
		"\u00b1\u0005\u0006\u0000\u0000\u00b1\u00b5\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0014\u0000\u0000\u00b3\u00b5\u0003\"\u0011\u0000\u00b4\u00aa"+
		"\u0001\u0000\u0000\u0000\u00b4\u00ab\u0001\u0000\u0000\u0000\u00b4\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b4\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5#\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u001f\u0000\u0000\u00b7\u00b9\u0005"+
		"\u0005\u0000\u0000\u00b8\u00ba\u0003&\u0013\u0000\u00b9\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0006\u0000\u0000\u00bc%\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c2\u0003\u001a\r\u0000\u00be\u00bf\u0005\u0007\u0000\u0000"+
		"\u00bf\u00c1\u0003\u001a\r\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c3\'\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u0010*,CIT^h\u0080\u0085\u0092\u0098\u009f\u00a7"+
		"\u00b4\u00b9\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}