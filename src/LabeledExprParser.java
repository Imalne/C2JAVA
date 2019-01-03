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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, CHAR=52, WS=53, 
		VTYPE=54, INT=55, HEAD=56, STRING=57, BOOL=58, ID=59;
	public static final int
		RULE_prog = 0, RULE_include = 1, RULE_define = 2, RULE_struct = 3, RULE_mainDecl = 4, 
		RULE_normalFunc = 5, RULE_valDecl = 6, RULE_arrayInitValues = 7, RULE_stringArrayInit = 8, 
		RULE_intArrayInit = 9, RULE_boolArrayInit = 10, RULE_parameters = 11, 
		RULE_parameter = 12, RULE_block = 13, RULE_stat = 14, RULE_elseif = 15, 
		RULE_switch_case = 16, RULE_switch_default = 17, RULE_assign = 18, RULE_forLoop = 19, 
		RULE_whileLoop = 20, RULE_expr = 21, RULE_exprList = 22, RULE_type = 23;
	public static final String[] ruleNames = {
		"prog", "include", "define", "struct", "mainDecl", "normalFunc", "valDecl", 
		"arrayInitValues", "stringArrayInit", "intArrayInit", "boolArrayInit", 
		"parameters", "parameter", "block", "stat", "elseif", "switch_case", "switch_default", 
		"assign", "forLoop", "whileLoop", "expr", "exprList", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#include'", "'using'", "'namespace'", "';'", "'#define'", "'struct'", 
		"'{'", "'}'", "'main'", "'('", "')'", "'='", "'['", "']'", "','", "'if'", 
		"'else'", "'switch'", "'return'", "'case'", "':'", "'default'", "'for'", 
		"'while'", "'printf'", "'getchar()'", "'!'", "'<<'", "'>>'", "'&'", "'|'", 
		"'^'", "'*'", "'/'", "'+'", "'-'", "'++'", "'--'", "'+='", "'-='", "'=='", 
		"'!='", "'<='", "'>='", "'<'", "'>'", "'&&'", "'||'", "'?'", "'.'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "CHAR", "WS", "VTYPE", "INT", "HEAD", "STRING", 
		"BOOL", "ID"
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
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(48);
				include();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(54);
				define();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					struct();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					normalFunc();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(72);
			mainDecl();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==VTYPE) {
				{
				{
				setState(73);
				normalFunc();
				}
				}
				setState(78);
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
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(79);
				match(T__0);
				setState(80);
				match(HEAD);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(81);
				match(T__1);
				setState(82);
				match(T__2);
				setState(83);
				match(ID);
				setState(84);
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

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__4);
			setState(88);
			match(ID);
			setState(89);
			match(INT);
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

	public static class StructContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__5);
			setState(92);
			match(ID);
			setState(93);
			match(T__6);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << CHAR) | (1L << VTYPE) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(94);
				stat();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(T__7);
			setState(101);
			match(T__3);
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
		enterRule(_localctx, 8, RULE_mainDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			type();
			setState(104);
			match(T__8);
			setState(105);
			match(T__9);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==VTYPE) {
				{
				setState(106);
				parameters();
				}
			}

			setState(109);
			match(T__10);
			setState(110);
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
		enterRule(_localctx, 10, RULE_normalFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			type();
			setState(113);
			match(ID);
			setState(114);
			match(T__9);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==VTYPE) {
				{
				setState(115);
				parameters();
				}
			}

			setState(118);
			match(T__10);
			setState(119);
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
		enterRule(_localctx, 12, RULE_valDecl);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new SingleVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				type();
				setState(122);
				match(ID);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(123);
					match(T__11);
					setState(124);
					expr(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new ArrayVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				type();
				setState(128);
				match(ID);
				setState(129);
				match(T__12);
				setState(130);
				match(INT);
				setState(131);
				match(T__13);
				}
				break;
			case 3:
				_localctx = new ArrayInitVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				type();
				setState(134);
				match(ID);
				setState(135);
				match(T__12);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(136);
					match(INT);
					}
				}

				setState(139);
				match(T__13);
				setState(140);
				match(T__11);
				setState(141);
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
		enterRule(_localctx, 14, RULE_arrayInitValues);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(145);
				match(T__6);
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
					{
					setState(146);
					stringArrayInit();
					}
					break;
				case INT:
					{
					setState(147);
					intArrayInit();
					}
					break;
				case BOOL:
					{
					setState(148);
					boolArrayInit();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(151);
				match(T__7);
				}
				}
				break;
			case T__9:
			case T__24:
			case T__26:
			case T__29:
			case T__35:
			case T__36:
			case T__37:
			case CHAR:
			case INT:
			case STRING:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
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
		enterRule(_localctx, 16, RULE_stringArrayInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(CHAR);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(157);
				match(T__14);
				setState(158);
				match(CHAR);
				}
				}
				setState(163);
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
		enterRule(_localctx, 18, RULE_intArrayInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(INT);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(165);
				match(T__14);
				setState(166);
				match(INT);
				}
				}
				setState(171);
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
		enterRule(_localctx, 20, RULE_boolArrayInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(BOOL);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(173);
				match(T__14);
				setState(174);
				match(BOOL);
				}
				}
				setState(179);
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
		enterRule(_localctx, 22, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			parameter();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(181);
				match(T__14);
				setState(182);
				parameter();
				}
				}
				setState(187);
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
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleparameterContext extends ParameterContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public SingleparameterContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSingleparameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayparameterContext extends ParameterContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public ArrayparameterContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitArrayparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new SingleparameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				type();
				setState(189);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ArrayparameterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				type();
				setState(192);
				match(ID);
				setState(193);
				match(T__12);
				setState(194);
				match(INT);
				setState(195);
				match(T__13);
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
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__6);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << CHAR) | (1L << VTYPE) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(200);
				stat();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(T__7);
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
		enterRule(_localctx, 28, RULE_stat);
		int _la;
		try {
			int _alt;
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new NewBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				block();
				}
				break;
			case 2:
				_localctx = new VariableDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				valDecl();
				setState(210);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(T__15);
				setState(213);
				match(T__9);
				setState(214);
				expr(0);
				setState(215);
				match(T__10);
				setState(216);
				stat();
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(217);
						elseif();
						}
						} 
					}
					setState(222);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(223);
					match(T__16);
					setState(224);
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
				setState(227);
				match(T__17);
				setState(228);
				match(T__9);
				setState(229);
				expr(0);
				setState(230);
				match(T__10);
				setState(231);
				match(T__6);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19) {
					{
					{
					setState(232);
					switch_case();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(238);
					switch_default();
					}
				}

				setState(241);
				match(T__7);
				}
				break;
			case 5:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				forLoop();
				}
				break;
			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				whileLoop();
				}
				break;
			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				match(T__18);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__24) | (1L << T__26) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					setState(246);
					expr(0);
					}
				}

				setState(249);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new VariableAssignContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(250);
				assign();
				setState(251);
				match(T__3);
				}
				break;
			case 9:
				_localctx = new StatExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(253);
				expr(0);
				setState(254);
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
		enterRule(_localctx, 30, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__16);
			setState(259);
			match(T__15);
			setState(260);
			match(T__9);
			setState(261);
			expr(0);
			setState(262);
			match(T__10);
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
		enterRule(_localctx, 32, RULE_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__19);
			setState(266);
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
			setState(267);
			match(T__20);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << CHAR) | (1L << VTYPE) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(268);
				stat();
				}
				}
				setState(273);
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
		enterRule(_localctx, 34, RULE_switch_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__21);
			setState(275);
			match(T__20);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << CHAR) | (1L << VTYPE) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
				{
				{
				setState(276);
				stat();
				}
				}
				setState(281);
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
		enterRule(_localctx, 36, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expr(0);
			setState(283);
			match(T__11);
			setState(284);
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ValDeclContext valDecl() {
			return getRuleContext(ValDeclContext.class,0);
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
		enterRule(_localctx, 38, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__22);
			setState(287);
			match(T__9);
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__24:
			case T__26:
			case T__29:
			case T__35:
			case T__36:
			case T__37:
			case CHAR:
			case INT:
			case STRING:
			case BOOL:
			case ID:
				{
				setState(288);
				assign();
				}
				break;
			case T__5:
			case VTYPE:
				{
				setState(289);
				valDecl();
				}
				break;
			case T__3:
				break;
			default:
				break;
			}
			setState(292);
			match(T__3);
			setState(293);
			expr(0);
			setState(294);
			match(T__3);
			setState(295);
			expr(0);
			setState(296);
			match(T__10);
			setState(297);
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
		enterRule(_localctx, 40, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__23);
			setState(300);
			match(T__9);
			setState(301);
			expr(0);
			setState(302);
			match(T__10);
			setState(303);
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
	public static class GetValueContext extends ExprContext {
		public List<TerminalNode> ID() { return getTokens(LabeledExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LabeledExprParser.ID, i);
		}
		public GetValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitGetValue(this);
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
	public static class GetAddressContext extends ExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public GetAddressContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitGetAddress(this);
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
	public static class TernaryContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TernaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTernary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Logical_opContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Logical_opContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitLogical_op(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new ConsoleOutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(306);
				match(T__24);
				setState(307);
				match(T__9);
				setState(308);
				match(STRING);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(309);
					match(T__14);
					setState(310);
					exprList();
					}
				}

				setState(313);
				match(T__10);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(ID);
				setState(315);
				match(T__9);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__24) | (1L << T__26) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << CHAR) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					setState(316);
					exprList();
					}
				}

				setState(319);
				match(T__10);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				match(T__9);
				setState(321);
				expr(0);
				setState(322);
				match(T__10);
				}
				break;
			case 4:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				match(T__26);
				setState(325);
				expr(19);
				}
				break;
			case 5:
				{
				_localctx = new NegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				match(T__35);
				setState(327);
				expr(14);
				}
				break;
			case 6:
				{
				_localctx = new IncreaseAndDecreaseBeforeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				((IncreaseAndDecreaseBeforeContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__37) ) {
					((IncreaseAndDecreaseBeforeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(329);
				expr(12);
				}
				break;
			case 7:
				{
				_localctx = new GetAddressContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330);
				match(T__29);
				setState(331);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new GetValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				match(ID);
				setState(334);
				_la = _input.LA(1);
				if ( !(_la==T__49 || _la==T__50) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(335);
				match(ID);
				}
				break;
			case 10:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				match(INT);
				}
				break;
			case 11:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				match(STRING);
				}
				break;
			case 12:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(338);
				match(BOOL);
				}
				break;
			case 13:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339);
				match(CHAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(379);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ByteShiftContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(342);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(343);
						((ByteShiftContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((ByteShiftContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(344);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new BitwiseAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(345);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(346);
						((BitwiseAndContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
							((BitwiseAndContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(347);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new MulAndDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(348);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(349);
						((MulAndDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
							((MulAndDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(350);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new PlusAndSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(351);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(352);
						((PlusAndSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
							((PlusAndSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(353);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new SelfPlusAndSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(354);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(355);
						((SelfPlusAndSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
							((SelfPlusAndSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(356);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new Logical_cpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(357);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(358);
						((Logical_cpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
							((Logical_cpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new Logical_opContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(360);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(361);
						((Logical_opContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__46 || _la==T__47) ) {
							((Logical_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(362);
						expr(10);
						}
						break;
					case 8:
						{
						_localctx = new TernaryContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(363);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(364);
						match(T__48);
						setState(365);
						expr(0);
						setState(366);
						match(T__20);
						setState(367);
						expr(9);
						}
						break;
					case 9:
						{
						_localctx = new ConsoleIntContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(369);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(370);
						match(T__11);
						setState(371);
						match(T__25);
						}
						break;
					case 10:
						{
						_localctx = new ArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(372);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(373);
						match(T__12);
						setState(374);
						expr(0);
						setState(375);
						match(T__13);
						}
						break;
					case 11:
						{
						_localctx = new IncreaseAndDecreaseAfterContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(377);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(378);
						((IncreaseAndDecreaseAfterContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__37) ) {
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
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 44, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			expr(0);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(385);
				match(T__14);
				setState(386);
				expr(0);
				}
				}
				setState(391);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructTypePointContext extends TypeContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public StructTypePointContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStructTypePoint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredefinedTypeContext extends TypeContext {
		public TerminalNode VTYPE() { return getToken(LabeledExprParser.VTYPE, 0); }
		public PredefinedTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPredefinedType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructTypeContext extends TypeContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public StructTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredefinedTypePointContext extends TypeContext {
		public TerminalNode VTYPE() { return getToken(LabeledExprParser.VTYPE, 0); }
		public PredefinedTypePointContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPredefinedTypePoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new PredefinedTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(VTYPE);
				}
				break;
			case 2:
				_localctx = new PredefinedTypePointContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(VTYPE);
				setState(394);
				match(T__32);
				}
				break;
			case 3:
				_localctx = new StructTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(T__5);
				setState(396);
				match(ID);
				}
				break;
			case 4:
				_localctx = new StructTypePointContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				match(T__5);
				setState(398);
				match(ID);
				setState(399);
				match(T__32);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 23);
		case 9:
			return precpred(_ctx, 20);
		case 10:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0195\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\7\2M\n\2\f\2\16"+
		"\2P\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3X\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\7\5b\n\5\f\5\16\5e\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6n\n\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\5\7w\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0080"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0092\n\b\3\t\3\t\3\t\3\t\5\t\u0098\n\t\3\t\3\t\3\t\5\t\u009d"+
		"\n\t\3\n\3\n\3\n\7\n\u00a2\n\n\f\n\16\n\u00a5\13\n\3\13\3\13\3\13\7\13"+
		"\u00aa\n\13\f\13\16\13\u00ad\13\13\3\f\3\f\3\f\7\f\u00b2\n\f\f\f\16\f"+
		"\u00b5\13\f\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c8\n\16\3\17\3\17\7\17\u00cc"+
		"\n\17\f\17\16\17\u00cf\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\7\20\u00dd\n\20\f\20\16\20\u00e0\13\20\3\20\3\20\5"+
		"\20\u00e4\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00ec\n\20\f\20\16\20"+
		"\u00ef\13\20\3\20\5\20\u00f2\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fa"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0103\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0110\n\22\f\22\16\22\u0113"+
		"\13\22\3\23\3\23\3\23\7\23\u0118\n\23\f\23\16\23\u011b\13\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0125\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u013a\n\27\3\27\3\27\3\27\3\27\5\27\u0140\n\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u0157\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u017e\n\27\f\27\16\27\u0181\13\27\3\30\3\30\3\30\7\30"+
		"\u0186\n\30\f\30\16\30\u0189\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0193\n\31\3\31\2\3,\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\f\4\299;;\3\2\'(\3\2\64\65\3\2\36\37\3\2 \"\3\2#$\3"+
		"\2%&\3\2)*\3\2+\60\3\2\61\62\2\u01c0\2\65\3\2\2\2\4W\3\2\2\2\6Y\3\2\2"+
		"\2\b]\3\2\2\2\ni\3\2\2\2\fr\3\2\2\2\16\u0091\3\2\2\2\20\u009c\3\2\2\2"+
		"\22\u009e\3\2\2\2\24\u00a6\3\2\2\2\26\u00ae\3\2\2\2\30\u00b6\3\2\2\2\32"+
		"\u00c7\3\2\2\2\34\u00c9\3\2\2\2\36\u0102\3\2\2\2 \u0104\3\2\2\2\"\u010b"+
		"\3\2\2\2$\u0114\3\2\2\2&\u011c\3\2\2\2(\u0120\3\2\2\2*\u012d\3\2\2\2,"+
		"\u0156\3\2\2\2.\u0182\3\2\2\2\60\u0192\3\2\2\2\62\64\5\4\3\2\63\62\3\2"+
		"\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66;\3\2\2\2\67\65\3\2\2"+
		"\28:\5\6\4\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2\2"+
		"\2>@\5\b\5\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2"+
		"\2DF\5\f\7\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2"+
		"\2JN\5\n\6\2KM\5\f\7\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\3\3\2"+
		"\2\2PN\3\2\2\2QR\7\3\2\2RX\7:\2\2ST\7\4\2\2TU\7\5\2\2UV\7=\2\2VX\7\6\2"+
		"\2WQ\3\2\2\2WS\3\2\2\2X\5\3\2\2\2YZ\7\7\2\2Z[\7=\2\2[\\\79\2\2\\\7\3\2"+
		"\2\2]^\7\b\2\2^_\7=\2\2_c\7\t\2\2`b\5\36\20\2a`\3\2\2\2be\3\2\2\2ca\3"+
		"\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\n\2\2gh\7\6\2\2h\t\3\2\2\2ij"+
		"\5\60\31\2jk\7\13\2\2km\7\f\2\2ln\5\30\r\2ml\3\2\2\2mn\3\2\2\2no\3\2\2"+
		"\2op\7\r\2\2pq\5\34\17\2q\13\3\2\2\2rs\5\60\31\2st\7=\2\2tv\7\f\2\2uw"+
		"\5\30\r\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\r\2\2yz\5\34\17\2z\r\3\2\2"+
		"\2{|\5\60\31\2|\177\7=\2\2}~\7\16\2\2~\u0080\5,\27\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0092\3\2\2\2\u0081\u0082\5\60\31\2\u0082\u0083\7"+
		"=\2\2\u0083\u0084\7\17\2\2\u0084\u0085\79\2\2\u0085\u0086\7\20\2\2\u0086"+
		"\u0092\3\2\2\2\u0087\u0088\5\60\31\2\u0088\u0089\7=\2\2\u0089\u008b\7"+
		"\17\2\2\u008a\u008c\79\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\7\20\2\2\u008e\u008f\7\16\2\2\u008f\u0090\5"+
		"\20\t\2\u0090\u0092\3\2\2\2\u0091{\3\2\2\2\u0091\u0081\3\2\2\2\u0091\u0087"+
		"\3\2\2\2\u0092\17\3\2\2\2\u0093\u0097\7\t\2\2\u0094\u0098\5\22\n\2\u0095"+
		"\u0098\5\24\13\2\u0096\u0098\5\26\f\2\u0097\u0094\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\n\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u009d\5,\27\2\u009c\u0093\3\2\2\2\u009c\u009b\3\2"+
		"\2\2\u009d\21\3\2\2\2\u009e\u00a3\7\66\2\2\u009f\u00a0\7\21\2\2\u00a0"+
		"\u00a2\7\66\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\23\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00ab\79\2\2\u00a7\u00a8\7\21\2\2\u00a8\u00aa\79\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\25\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b3\7<\2\2\u00af\u00b0\7\21\2"+
		"\2\u00b0\u00b2\7<\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\27\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00bb\5\32\16\2\u00b7\u00b8\7\21\2\2\u00b8\u00ba\5\32\16\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\31\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\5\60\31\2\u00bf\u00c0\7=\2"+
		"\2\u00c0\u00c8\3\2\2\2\u00c1\u00c2\5\60\31\2\u00c2\u00c3\7=\2\2\u00c3"+
		"\u00c4\7\17\2\2\u00c4\u00c5\79\2\2\u00c5\u00c6\7\20\2\2\u00c6\u00c8\3"+
		"\2\2\2\u00c7\u00be\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c8\33\3\2\2\2\u00c9"+
		"\u00cd\7\t\2\2\u00ca\u00cc\5\36\20\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\7\n\2\2\u00d1\35\3\2\2\2\u00d2\u0103\5\34\17"+
		"\2\u00d3\u00d4\5\16\b\2\u00d4\u00d5\7\6\2\2\u00d5\u0103\3\2\2\2\u00d6"+
		"\u00d7\7\22\2\2\u00d7\u00d8\7\f\2\2\u00d8\u00d9\5,\27\2\u00d9\u00da\7"+
		"\r\2\2\u00da\u00de\5\36\20\2\u00db\u00dd\5 \21\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\23\2\2\u00e2\u00e4\5\36\20\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u0103\3\2\2\2\u00e5\u00e6\7\24"+
		"\2\2\u00e6\u00e7\7\f\2\2\u00e7\u00e8\5,\27\2\u00e8\u00e9\7\r\2\2\u00e9"+
		"\u00ed\7\t\2\2\u00ea\u00ec\5\"\22\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3"+
		"\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f2\5$\23\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\n\2\2\u00f4\u0103\3\2\2\2\u00f5"+
		"\u0103\5(\25\2\u00f6\u0103\5*\26\2\u00f7\u00f9\7\25\2\2\u00f8\u00fa\5"+
		",\27\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u0103\7\6\2\2\u00fc\u00fd\5&\24\2\u00fd\u00fe\7\6\2\2\u00fe\u0103\3\2"+
		"\2\2\u00ff\u0100\5,\27\2\u0100\u0101\7\6\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00d2\3\2\2\2\u0102\u00d3\3\2\2\2\u0102\u00d6\3\2\2\2\u0102\u00e5\3\2"+
		"\2\2\u0102\u00f5\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00f7\3\2\2\2\u0102"+
		"\u00fc\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\37\3\2\2\2\u0104\u0105\7\23\2"+
		"\2\u0105\u0106\7\22\2\2\u0106\u0107\7\f\2\2\u0107\u0108\5,\27\2\u0108"+
		"\u0109\7\r\2\2\u0109\u010a\5\36\20\2\u010a!\3\2\2\2\u010b\u010c\7\26\2"+
		"\2\u010c\u010d\t\2\2\2\u010d\u0111\7\27\2\2\u010e\u0110\5\36\20\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112#\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\30\2\2\u0115\u0119"+
		"\7\27\2\2\u0116\u0118\5\36\20\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2"+
		"\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a%\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011c\u011d\5,\27\2\u011d\u011e\7\16\2\2\u011e\u011f\5,\27\2"+
		"\u011f\'\3\2\2\2\u0120\u0121\7\31\2\2\u0121\u0124\7\f\2\2\u0122\u0125"+
		"\5&\24\2\u0123\u0125\5\16\b\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2"+
		"\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\6\2\2\u0127\u0128"+
		"\5,\27\2\u0128\u0129\7\6\2\2\u0129\u012a\5,\27\2\u012a\u012b\7\r\2\2\u012b"+
		"\u012c\5\36\20\2\u012c)\3\2\2\2\u012d\u012e\7\32\2\2\u012e\u012f\7\f\2"+
		"\2\u012f\u0130\5,\27\2\u0130\u0131\7\r\2\2\u0131\u0132\5\36\20\2\u0132"+
		"+\3\2\2\2\u0133\u0134\b\27\1\2\u0134\u0135\7\33\2\2\u0135\u0136\7\f\2"+
		"\2\u0136\u0139\7;\2\2\u0137\u0138\7\21\2\2\u0138\u013a\5.\30\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0157\7\r\2\2\u013c"+
		"\u013d\7=\2\2\u013d\u013f\7\f\2\2\u013e\u0140\5.\30\2\u013f\u013e\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0157\7\r\2\2\u0142"+
		"\u0143\7\f\2\2\u0143\u0144\5,\27\2\u0144\u0145\7\r\2\2\u0145\u0157\3\2"+
		"\2\2\u0146\u0147\7\35\2\2\u0147\u0157\5,\27\25\u0148\u0149\7&\2\2\u0149"+
		"\u0157\5,\27\20\u014a\u014b\t\3\2\2\u014b\u0157\5,\27\16\u014c\u014d\7"+
		" \2\2\u014d\u0157\7=\2\2\u014e\u0157\7=\2\2\u014f\u0150\7=\2\2\u0150\u0151"+
		"\t\4\2\2\u0151\u0157\7=\2\2\u0152\u0157\79\2\2\u0153\u0157\7;\2\2\u0154"+
		"\u0157\7<\2\2\u0155\u0157\7\66\2\2\u0156\u0133\3\2\2\2\u0156\u013c\3\2"+
		"\2\2\u0156\u0142\3\2\2\2\u0156\u0146\3\2\2\2\u0156\u0148\3\2\2\2\u0156"+
		"\u014a\3\2\2\2\u0156\u014c\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u014f\3\2"+
		"\2\2\u0156\u0152\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0155\3\2\2\2\u0157\u017f\3\2\2\2\u0158\u0159\f\24\2\2\u0159\u015a\t"+
		"\5\2\2\u015a\u017e\5,\27\25\u015b\u015c\f\23\2\2\u015c\u015d\t\6\2\2\u015d"+
		"\u017e\5,\27\24\u015e\u015f\f\22\2\2\u015f\u0160\t\7\2\2\u0160\u017e\5"+
		",\27\23\u0161\u0162\f\21\2\2\u0162\u0163\t\b\2\2\u0163\u017e\5,\27\22"+
		"\u0164\u0165\f\r\2\2\u0165\u0166\t\t\2\2\u0166\u017e\5,\27\16\u0167\u0168"+
		"\f\f\2\2\u0168\u0169\t\n\2\2\u0169\u017e\5,\27\r\u016a\u016b\f\13\2\2"+
		"\u016b\u016c\t\13\2\2\u016c\u017e\5,\27\f\u016d\u016e\f\n\2\2\u016e\u016f"+
		"\7\63\2\2\u016f\u0170\5,\27\2\u0170\u0171\7\27\2\2\u0171\u0172\5,\27\13"+
		"\u0172\u017e\3\2\2\2\u0173\u0174\f\31\2\2\u0174\u0175\7\16\2\2\u0175\u017e"+
		"\7\34\2\2\u0176\u0177\f\26\2\2\u0177\u0178\7\17\2\2\u0178\u0179\5,\27"+
		"\2\u0179\u017a\7\20\2\2\u017a\u017e\3\2\2\2\u017b\u017c\f\17\2\2\u017c"+
		"\u017e\t\3\2\2\u017d\u0158\3\2\2\2\u017d\u015b\3\2\2\2\u017d\u015e\3\2"+
		"\2\2\u017d\u0161\3\2\2\2\u017d\u0164\3\2\2\2\u017d\u0167\3\2\2\2\u017d"+
		"\u016a\3\2\2\2\u017d\u016d\3\2\2\2\u017d\u0173\3\2\2\2\u017d\u0176\3\2"+
		"\2\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180-\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0187\5,\27\2"+
		"\u0183\u0184\7\21\2\2\u0184\u0186\5,\27\2\u0185\u0183\3\2\2\2\u0186\u0189"+
		"\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188/\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u018a\u0193\78\2\2\u018b\u018c\78\2\2\u018c\u0193\7#\2"+
		"\2\u018d\u018e\7\b\2\2\u018e\u0193\7=\2\2\u018f\u0190\7\b\2\2\u0190\u0191"+
		"\7=\2\2\u0191\u0193\7#\2\2\u0192\u018a\3\2\2\2\u0192\u018b\3\2\2\2\u0192"+
		"\u018d\3\2\2\2\u0192\u018f\3\2\2\2\u0193\61\3\2\2\2&\65;AGNWcmv\177\u008b"+
		"\u0091\u0097\u009c\u00a3\u00ab\u00b3\u00bb\u00c7\u00cd\u00de\u00e3\u00ed"+
		"\u00f1\u00f9\u0102\u0111\u0119\u0124\u0139\u013f\u0156\u017d\u017f\u0187"+
		"\u0192";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}