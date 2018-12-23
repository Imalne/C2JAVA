// Generated from LabeledExpr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, CHAR=47, WS=48, VTYPE=49, INT=50, HEAD=51, STRING=52, BOOL=53, 
		ID=54;
	public static final int
		RULE_prog = 0, RULE_include = 1, RULE_mainDecl = 2, RULE_normalFunc = 3, 
		RULE_valDecl = 4, RULE_arrayInitValues = 5, RULE_stringArrayInit = 6, 
		RULE_intArrayInit = 7, RULE_boolArrayInit = 8, RULE_parameters = 9, RULE_parameter = 10, 
		RULE_block = 11, RULE_stat = 12, RULE_elseif = 13, RULE_switch_case = 14, 
		RULE_switch_default = 15, RULE_assign = 16, RULE_forLoop = 17, RULE_whileLoop = 18, 
		RULE_expr = 19, RULE_exprList = 20, RULE_type = 21;
	public static final String[] ruleNames = {
		"prog", "include", "mainDecl", "normalFunc", "valDecl", "arrayInitValues", 
		"stringArrayInit", "intArrayInit", "boolArrayInit", "parameters", "parameter", 
		"block", "stat", "elseif", "switch_case", "switch_default", "assign", 
		"forLoop", "whileLoop", "expr", "exprList", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#include'", "'using'", "'namespace'", "';'", "'main'", "'('", 
		"')'", "'='", "'['", "']'", "'{'", "'}'", "','", "'if'", "'else'", "'switch'", 
		"'return'", "'case'", "':'", "'default'", "'for'", "'while'", "'printf'", 
		"'getchar()'", "'!'", "'<<'", "'>>'", "'&'", "'|'", "'^'", "'*'", "'/'", 
		"'+'", "'-'", "'++'", "'--'", "'+='", "'-='", "'=='", "'!='", "'<='", 
		"'>='", "'<'", "'>'", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "CHAR", 
		"WS", "VTYPE", "INT", "HEAD", "STRING", "BOOL", "ID"
	};
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
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public MainDeclContext mainDecl() {
			return getRuleContext(MainDeclContext.class,0);
		}
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<NormalFuncContext> normalFunc() {
			return getRuleContexts(NormalFuncContext.class);
		}
		public NormalFuncContext normalFunc(int i) {
			return getRuleContext(NormalFuncContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(44);
				include();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					normalFunc();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(56);
			mainDecl();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VTYPE) {
				{
				{
				setState(57);
				normalFunc();
				}
				}
				setState(62);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode HEAD() { return getToken(LabeledExprParser.HEAD, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_include);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(63);
				match(T__0);
				setState(64);
				match(HEAD);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(65);
				match(T__1);
				setState(66);
				match(T__2);
				setState(67);
				match(ID);
				setState(68);
				match(T__3);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MainDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MainDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitMainDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclContext mainDecl() throws RecognitionException {
		MainDeclContext _localctx = new MainDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			type();
			setState(72);
			match(T__4);
			setState(73);
			match(T__5);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VTYPE) {
				{
				setState(74);
				parameters();
				}
			}

			setState(77);
			match(T__6);
			setState(78);
			block();
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

	public static class NormalFuncContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public NormalFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNormalFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFuncContext normalFunc() throws RecognitionException {
		NormalFuncContext _localctx = new NormalFuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_normalFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			type();
			setState(81);
			match(ID);
			setState(82);
			match(T__5);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VTYPE) {
				{
				setState(83);
				parameters();
				}
			}

			setState(86);
			match(T__6);
			setState(87);
			block();
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

	public static class ValDeclContext extends ParserRuleContext {
		public ValDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valDecl; }
	 
		public ValDeclContext() { }
		public void copyFrom(ValDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayVariableContext extends ValDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public ArrayVariableContext(ValDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitArrayVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleVariableContext extends ValDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SingleVariableContext(ValDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSingleVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayInitVariableContext extends ValDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ArrayInitValuesContext arrayInitValues() {
			return getRuleContext(ArrayInitValuesContext.class,0);
		}
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public ArrayInitVariableContext(ValDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitArrayInitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValDeclContext valDecl() throws RecognitionException {
		ValDeclContext _localctx = new ValDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valDecl);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new SingleVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				type();
				setState(90);
				match(ID);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(91);
					match(T__7);
					setState(92);
					expr(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new ArrayVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				type();
				setState(96);
				match(ID);
				setState(97);
				match(T__8);
				setState(98);
				match(INT);
				setState(99);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new ArrayInitVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				type();
				setState(102);
				match(ID);
				setState(103);
				match(T__8);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(104);
					match(INT);
					}
				}

				setState(107);
				match(T__9);
				setState(108);
				match(T__7);
				setState(109);
				arrayInitValues();
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

	public static class ArrayInitValuesContext extends ParserRuleContext {
		public StringArrayInitContext stringArrayInit() {
			return getRuleContext(StringArrayInitContext.class,0);
		}
		public IntArrayInitContext intArrayInit() {
			return getRuleContext(IntArrayInitContext.class,0);
		}
		public BoolArrayInitContext boolArrayInit() {
			return getRuleContext(BoolArrayInitContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayInitValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitArrayInitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitValuesContext arrayInitValues() throws RecognitionException {
		ArrayInitValuesContext _localctx = new ArrayInitValuesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayInitValues);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(113);
				match(T__10);
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
					{
					setState(114);
					stringArrayInit();
					}
					break;
				case INT:
					{
					setState(115);
					intArrayInit();
					}
					break;
				case BOOL:
					{
					setState(116);
					boolArrayInit();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(119);
				match(T__11);
				}
				}
				break;
			case T__5:
			case T__22:
			case T__24:
			case T__33:
			case T__34:
			case T__35:
			case CHAR:
			case INT:
			case STRING:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StringArrayInitContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(LabeledExprParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(LabeledExprParser.CHAR, i);
		}
		public StringArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringArrayInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStringArrayInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringArrayInitContext stringArrayInit() throws RecognitionException {
		StringArrayInitContext _localctx = new StringArrayInitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringArrayInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(CHAR);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(125);
				match(T__12);
				setState(126);
				match(CHAR);
				}
				}
				setState(131);
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

	public static class IntArrayInitContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(LabeledExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LabeledExprParser.INT, i);
		}
		public IntArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrayInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitIntArrayInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntArrayInitContext intArrayInit() throws RecognitionException {
		IntArrayInitContext _localctx = new IntArrayInitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_intArrayInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(INT);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(133);
				match(T__12);
				setState(134);
				match(INT);
				}
				}
				setState(139);
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

	public static class BoolArrayInitContext extends ParserRuleContext {
		public List<TerminalNode> BOOL() { return getTokens(LabeledExprParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(LabeledExprParser.BOOL, i);
		}
		public BoolArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolArrayInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitBoolArrayInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolArrayInitContext boolArrayInit() throws RecognitionException {
		BoolArrayInitContext _localctx = new BoolArrayInitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolArrayInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(BOOL);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(141);
				match(T__12);
				setState(142);
				match(BOOL);
				}
				}
				setState(147);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			parameter();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(149);
				match(T__12);
				setState(150);
				parameter();
				}
				}
				setState(155);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			type();
			setState(157);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__10);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << CHAR) | (1L << VTYPE) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(160);
				stat();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(T__11);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewBlockContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NewBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNewBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableAssignContext extends StatContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public VariableAssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitVariableAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ForContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDeclareContext extends StatContext {
		public ValDeclContext valDecl() {
			return getRuleContext(ValDeclContext.class,0);
		}
		public VariableDeclareContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitVariableDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public IfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public Switch_defaultContext switch_default() {
			return getRuleContext(Switch_defaultContext.class,0);
		}
		public SwitchContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stat);
		int _la;
		try {
			int _alt;
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new NewBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				block();
				}
				break;
			case 2:
				_localctx = new VariableDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				valDecl();
				setState(170);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(T__13);
				setState(173);
				match(T__5);
				setState(174);
				expr(0);
				setState(175);
				match(T__6);
				setState(176);
				stat();
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(177);
						elseif();
						}
						} 
					}
					setState(182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(183);
					match(T__14);
					setState(184);
					stat();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new SwitchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(T__15);
				setState(188);
				match(T__5);
				setState(189);
				expr(0);
				setState(190);
				match(T__6);
				setState(191);
				match(T__10);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(192);
					switch_case();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(198);
					switch_default();
					}
				}

				setState(201);
				match(T__11);
				}
				break;
			case 5:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				forLoop();
				}
				break;
			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				whileLoop();
				}
				break;
			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(205);
				match(T__16);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__22) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					setState(206);
					expr(0);
					}
				}

				setState(209);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new VariableAssignContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(210);
				assign();
				setState(211);
				match(T__3);
				}
				break;
			case 9:
				_localctx = new StatExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(213);
				expr(0);
				setState(214);
				match(T__3);
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

	public static class ElseifContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__14);
			setState(219);
			match(T__13);
			setState(220);
			match(T__5);
			setState(221);
			expr(0);
			setState(222);
			match(T__6);
			setState(223);
			stat();
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

	public static class Switch_caseContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__17);
			setState(226);
			((Switch_caseContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==STRING) ) {
				((Switch_caseContext)_localctx).value = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			match(T__18);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << CHAR) | (1L << VTYPE) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(228);
				stat();
				}
				}
				setState(233);
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

	public static class Switch_defaultContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Switch_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_default; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSwitch_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_defaultContext switch_default() throws RecognitionException {
		Switch_defaultContext _localctx = new Switch_defaultContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switch_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__19);
			setState(235);
			match(T__18);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << CHAR) | (1L << VTYPE) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(236);
				stat();
				}
				}
				setState(241);
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

	public static class AssignContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			expr(0);
			setState(243);
			match(T__7);
			setState(244);
			expr(0);
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

	public static class ForLoopContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ValDeclContext valDecl() {
			return getRuleContext(ValDeclContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__20);
			setState(247);
			match(T__5);
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VTYPE:
				{
				setState(248);
				valDecl();
				}
				break;
			case T__5:
			case T__22:
			case T__24:
			case T__33:
			case T__34:
			case T__35:
			case CHAR:
			case INT:
			case STRING:
			case BOOL:
			case ID:
				{
				setState(249);
				assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(252);
			match(T__3);
			setState(253);
			expr(0);
			setState(254);
			match(T__3);
			setState(255);
			expr(0);
			setState(256);
			match(T__6);
			setState(257);
			stat();
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

	public static class WhileLoopContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__21);
			setState(260);
			match(T__5);
			setState(261);
			expr(0);
			setState(262);
			match(T__6);
			setState(263);
			stat();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesesContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(LabeledExprParser.BOOL, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseAndContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BitwiseAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitBitwiseAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulAndDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulAndDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitMulAndDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Logical_cpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Logical_cpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitLogical_cp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegativeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConsoleIntContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConsoleIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConsoleInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncreaseAndDecreaseBeforeContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncreaseAndDecreaseBeforeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitIncreaseAndDecreaseBefore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ByteShiftContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ByteShiftContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitByteShift(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends ExprContext {
		public TerminalNode CHAR() { return getToken(LabeledExprParser.CHAR, 0); }
		public CharContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelfPlusAndSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SelfPlusAndSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSelfPlusAndSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConsoleOutContext extends ExprContext {
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ConsoleOutContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConsoleOut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusAndSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PlusAndSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPlusAndSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncreaseAndDecreaseAfterContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncreaseAndDecreaseAfterContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitIncreaseAndDecreaseAfter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ConsoleOutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(266);
				match(T__22);
				setState(267);
				match(T__5);
				setState(268);
				match(STRING);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(269);
					match(T__12);
					setState(270);
					exprList();
					}
				}

				setState(273);
				match(T__6);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(ID);
				setState(275);
				match(T__5);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__22) | (1L << T__24) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					setState(276);
					exprList();
					}
				}

				setState(279);
				match(T__6);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280);
				match(T__5);
				setState(281);
				expr(0);
				setState(282);
				match(T__6);
				}
				break;
			case 4:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(T__24);
				setState(285);
				expr(15);
				}
				break;
			case 5:
				{
				_localctx = new NegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(T__33);
				setState(287);
				expr(10);
				}
				break;
			case 6:
				{
				_localctx = new IncreaseAndDecreaseBeforeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				((IncreaseAndDecreaseBeforeContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__34 || _la==T__35) ) {
					((IncreaseAndDecreaseBeforeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(289);
				expr(8);
				}
				break;
			case 7:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				match(BOOL);
				}
				break;
			case 11:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				match(CHAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ByteShiftContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(298);
						((ByteShiftContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((ByteShiftContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(299);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new BitwiseAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(301);
						((BitwiseAndContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
							((BitwiseAndContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(302);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new MulAndDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(304);
						((MulAndDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((MulAndDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(305);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new PlusAndSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(306);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(307);
						((PlusAndSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
							((PlusAndSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(308);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new SelfPlusAndSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(309);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(310);
						((SelfPlusAndSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__37) ) {
							((SelfPlusAndSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(311);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new Logical_cpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(313);
						((Logical_cpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
							((Logical_cpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(314);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ConsoleIntContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(316);
						match(T__7);
						setState(317);
						match(T__23);
						}
						break;
					case 8:
						{
						_localctx = new ArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(319);
						match(T__8);
						setState(320);
						expr(0);
						setState(321);
						match(T__9);
						}
						break;
					case 9:
						{
						_localctx = new IncreaseAndDecreaseAfterContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(323);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(324);
						((IncreaseAndDecreaseAfterContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
							((IncreaseAndDecreaseAfterContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			expr(0);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(331);
				match(T__12);
				setState(332);
				expr(0);
				}
				}
				setState(337);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode VTYPE() { return getToken(LabeledExprParser.VTYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(VTYPE);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(339);
				match(T__30);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 19);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0159\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\7\2=\n\2\f\2\16\2"+
		"@\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3H\n\3\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\5\5W\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6`\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\5\6r\n"+
		"\6\3\7\3\7\3\7\3\7\5\7x\n\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\b\7\b\u0082"+
		"\n\b\f\b\16\b\u0085\13\b\3\t\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t"+
		"\3\n\3\n\3\n\7\n\u0092\n\n\f\n\16\n\u0095\13\n\3\13\3\13\3\13\7\13\u009a"+
		"\n\13\f\13\16\13\u009d\13\13\3\f\3\f\3\f\3\r\3\r\7\r\u00a4\n\r\f\r\16"+
		"\r\u00a7\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00b5\n\16\f\16\16\16\u00b8\13\16\3\16\3\16\5\16\u00bc\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00c4\n\16\f\16\16\16\u00c7\13\16\3\16"+
		"\5\16\u00ca\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d2\n\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00db\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00e8\n\20\f\20\16\20\u00eb\13\20"+
		"\3\21\3\21\3\21\7\21\u00f0\n\21\f\21\16\21\u00f3\13\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\5\23\u00fd\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0112\n\25\3\25\3\25\3\25\3\25\5\25\u0118\n\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u012a"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0148\n\25\f\25\16\25\u014b\13\25\3\26\3\26\3\26\7\26\u0150"+
		"\n\26\f\26\16\26\u0153\13\26\3\27\3\27\5\27\u0157\n\27\3\27\2\3(\30\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\n\4\2\64\64\66\66\3\2"+
		"%&\3\2\34\35\3\2\36 \3\2!\"\3\2#$\3\2\'(\3\2)\60\2\u017b\2\61\3\2\2\2"+
		"\4G\3\2\2\2\6I\3\2\2\2\bR\3\2\2\2\nq\3\2\2\2\f|\3\2\2\2\16~\3\2\2\2\20"+
		"\u0086\3\2\2\2\22\u008e\3\2\2\2\24\u0096\3\2\2\2\26\u009e\3\2\2\2\30\u00a1"+
		"\3\2\2\2\32\u00da\3\2\2\2\34\u00dc\3\2\2\2\36\u00e3\3\2\2\2 \u00ec\3\2"+
		"\2\2\"\u00f4\3\2\2\2$\u00f8\3\2\2\2&\u0105\3\2\2\2(\u0129\3\2\2\2*\u014c"+
		"\3\2\2\2,\u0154\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2"+
		"\2\61\62\3\2\2\2\62\67\3\2\2\2\63\61\3\2\2\2\64\66\5\b\5\2\65\64\3\2\2"+
		"\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:>\5\6\4"+
		"\2;=\5\b\5\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\3\3\2\2\2@>\3\2"+
		"\2\2AB\7\3\2\2BH\7\65\2\2CD\7\4\2\2DE\7\5\2\2EF\78\2\2FH\7\6\2\2GA\3\2"+
		"\2\2GC\3\2\2\2H\5\3\2\2\2IJ\5,\27\2JK\7\7\2\2KM\7\b\2\2LN\5\24\13\2ML"+
		"\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\t\2\2PQ\5\30\r\2Q\7\3\2\2\2RS\5,\27\2"+
		"ST\78\2\2TV\7\b\2\2UW\5\24\13\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\t\2"+
		"\2YZ\5\30\r\2Z\t\3\2\2\2[\\\5,\27\2\\_\78\2\2]^\7\n\2\2^`\5(\25\2_]\3"+
		"\2\2\2_`\3\2\2\2`r\3\2\2\2ab\5,\27\2bc\78\2\2cd\7\13\2\2de\7\64\2\2ef"+
		"\7\f\2\2fr\3\2\2\2gh\5,\27\2hi\78\2\2ik\7\13\2\2jl\7\64\2\2kj\3\2\2\2"+
		"kl\3\2\2\2lm\3\2\2\2mn\7\f\2\2no\7\n\2\2op\5\f\7\2pr\3\2\2\2q[\3\2\2\2"+
		"qa\3\2\2\2qg\3\2\2\2r\13\3\2\2\2sw\7\r\2\2tx\5\16\b\2ux\5\20\t\2vx\5\22"+
		"\n\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2xy\3\2\2\2yz\7\16\2\2z}\3\2\2\2{}\5"+
		"(\25\2|s\3\2\2\2|{\3\2\2\2}\r\3\2\2\2~\u0083\7\61\2\2\177\u0080\7\17\2"+
		"\2\u0080\u0082\7\61\2\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\17\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u008b\7\64\2\2\u0087\u0088\7\17\2\2\u0088\u008a\7\64\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\21\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0093\7\67\2\2\u008f\u0090\7\17"+
		"\2\2\u0090\u0092\7\67\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\23\3\2\2\2\u0095\u0093\3\2\2"+
		"\2\u0096\u009b\5\26\f\2\u0097\u0098\7\17\2\2\u0098\u009a\5\26\f\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\25\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\5,\27\2\u009f\u00a0"+
		"\78\2\2\u00a0\27\3\2\2\2\u00a1\u00a5\7\r\2\2\u00a2\u00a4\5\32\16\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\16\2\2\u00a9"+
		"\31\3\2\2\2\u00aa\u00db\5\30\r\2\u00ab\u00ac\5\n\6\2\u00ac\u00ad\7\6\2"+
		"\2\u00ad\u00db\3\2\2\2\u00ae\u00af\7\20\2\2\u00af\u00b0\7\b\2\2\u00b0"+
		"\u00b1\5(\25\2\u00b1\u00b2\7\t\2\2\u00b2\u00b6\5\32\16\2\u00b3\u00b5\5"+
		"\34\17\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\21"+
		"\2\2\u00ba\u00bc\5\32\16\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00db\3\2\2\2\u00bd\u00be\7\22\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c0\5"+
		"(\25\2\u00c0\u00c1\7\t\2\2\u00c1\u00c5\7\r\2\2\u00c2\u00c4\5\36\20\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\5 \21\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\16"+
		"\2\2\u00cc\u00db\3\2\2\2\u00cd\u00db\5$\23\2\u00ce\u00db\5&\24\2\u00cf"+
		"\u00d1\7\23\2\2\u00d0\u00d2\5(\25\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00db\7\6\2\2\u00d4\u00d5\5\"\22\2\u00d5"+
		"\u00d6\7\6\2\2\u00d6\u00db\3\2\2\2\u00d7\u00d8\5(\25\2\u00d8\u00d9\7\6"+
		"\2\2\u00d9\u00db\3\2\2\2\u00da\u00aa\3\2\2\2\u00da\u00ab\3\2\2\2\u00da"+
		"\u00ae\3\2\2\2\u00da\u00bd\3\2\2\2\u00da\u00cd\3\2\2\2\u00da\u00ce\3\2"+
		"\2\2\u00da\u00cf\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d7\3\2\2\2\u00db"+
		"\33\3\2\2\2\u00dc\u00dd\7\21\2\2\u00dd\u00de\7\20\2\2\u00de\u00df\7\b"+
		"\2\2\u00df\u00e0\5(\25\2\u00e0\u00e1\7\t\2\2\u00e1\u00e2\5\32\16\2\u00e2"+
		"\35\3\2\2\2\u00e3\u00e4\7\24\2\2\u00e4\u00e5\t\2\2\2\u00e5\u00e9\7\25"+
		"\2\2\u00e6\u00e8\5\32\16\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\37\3\2\2\2\u00eb\u00e9\3\2\2"+
		"\2\u00ec\u00ed\7\26\2\2\u00ed\u00f1\7\25\2\2\u00ee\u00f0\5\32\16\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2!\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\5(\25\2\u00f5\u00f6"+
		"\7\n\2\2\u00f6\u00f7\5(\25\2\u00f7#\3\2\2\2\u00f8\u00f9\7\27\2\2\u00f9"+
		"\u00fc\7\b\2\2\u00fa\u00fd\5\n\6\2\u00fb\u00fd\5\"\22\2\u00fc\u00fa\3"+
		"\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\6\2\2\u00ff"+
		"\u0100\5(\25\2\u0100\u0101\7\6\2\2\u0101\u0102\5(\25\2\u0102\u0103\7\t"+
		"\2\2\u0103\u0104\5\32\16\2\u0104%\3\2\2\2\u0105\u0106\7\30\2\2\u0106\u0107"+
		"\7\b\2\2\u0107\u0108\5(\25\2\u0108\u0109\7\t\2\2\u0109\u010a\5\32\16\2"+
		"\u010a\'\3\2\2\2\u010b\u010c\b\25\1\2\u010c\u010d\7\31\2\2\u010d\u010e"+
		"\7\b\2\2\u010e\u0111\7\66\2\2\u010f\u0110\7\17\2\2\u0110\u0112\5*\26\2"+
		"\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u012a"+
		"\7\t\2\2\u0114\u0115\78\2\2\u0115\u0117\7\b\2\2\u0116\u0118\5*\26\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u012a\7\t"+
		"\2\2\u011a\u011b\7\b\2\2\u011b\u011c\5(\25\2\u011c\u011d\7\t\2\2\u011d"+
		"\u012a\3\2\2\2\u011e\u011f\7\33\2\2\u011f\u012a\5(\25\21\u0120\u0121\7"+
		"$\2\2\u0121\u012a\5(\25\f\u0122\u0123\t\3\2\2\u0123\u012a\5(\25\n\u0124"+
		"\u012a\78\2\2\u0125\u012a\7\64\2\2\u0126\u012a\7\66\2\2\u0127\u012a\7"+
		"\67\2\2\u0128\u012a\7\61\2\2\u0129\u010b\3\2\2\2\u0129\u0114\3\2\2\2\u0129"+
		"\u011a\3\2\2\2\u0129\u011e\3\2\2\2\u0129\u0120\3\2\2\2\u0129\u0122\3\2"+
		"\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2\2\2\u0129\u0126\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\u0149\3\2\2\2\u012b\u012c\f\20"+
		"\2\2\u012c\u012d\t\4\2\2\u012d\u0148\5(\25\21\u012e\u012f\f\17\2\2\u012f"+
		"\u0130\t\5\2\2\u0130\u0148\5(\25\20\u0131\u0132\f\16\2\2\u0132\u0133\t"+
		"\6\2\2\u0133\u0148\5(\25\17\u0134\u0135\f\r\2\2\u0135\u0136\t\7\2\2\u0136"+
		"\u0148\5(\25\16\u0137\u0138\f\t\2\2\u0138\u0139\t\b\2\2\u0139\u0148\5"+
		"(\25\n\u013a\u013b\f\b\2\2\u013b\u013c\t\t\2\2\u013c\u0148\5(\25\t\u013d"+
		"\u013e\f\25\2\2\u013e\u013f\7\n\2\2\u013f\u0148\7\32\2\2\u0140\u0141\f"+
		"\22\2\2\u0141\u0142\7\13\2\2\u0142\u0143\5(\25\2\u0143\u0144\7\f\2\2\u0144"+
		"\u0148\3\2\2\2\u0145\u0146\f\13\2\2\u0146\u0148\t\3\2\2\u0147\u012b\3"+
		"\2\2\2\u0147\u012e\3\2\2\2\u0147\u0131\3\2\2\2\u0147\u0134\3\2\2\2\u0147"+
		"\u0137\3\2\2\2\u0147\u013a\3\2\2\2\u0147\u013d\3\2\2\2\u0147\u0140\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a)\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u0151\5(\25\2"+
		"\u014d\u014e\7\17\2\2\u014e\u0150\5(\25\2\u014f\u014d\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152+\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0156\7\63\2\2\u0155\u0157\7!\2\2\u0156\u0155\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157-\3\2\2\2\"\61\67>GMV_kqw|\u0083\u008b\u0093"+
		"\u009b\u00a5\u00b6\u00bb\u00c5\u00c9\u00d1\u00da\u00e9\u00f1\u00fc\u0111"+
		"\u0117\u0129\u0147\u0149\u0151\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}