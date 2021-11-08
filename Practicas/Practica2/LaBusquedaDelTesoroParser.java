// Generated from LaBusquedaDelTesoro.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaBusquedaDelTesoroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NEWLINE=5, INT=6, Objeto=7;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_coordenada = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "coordenada"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' te da '", "' puntos'", "' esta enterrado en '", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NEWLINE", "INT", "Objeto"
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
	public String getGrammarFileName() { return "LaBusquedaDelTesoro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LaBusquedaDelTesoroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LaBusquedaDelTesoroParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LaBusquedaDelTesoroParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroListener ) ((LaBusquedaDelTesoroListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroListener ) ((LaBusquedaDelTesoroListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Objeto) {
				{
				{
				setState(6);
				expr();
				setState(7);
				match(NEWLINE);
				}
				}
				setState(13);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode Objeto() { return getToken(LaBusquedaDelTesoroParser.Objeto, 0); }
		public TerminalNode INT() { return getToken(LaBusquedaDelTesoroParser.INT, 0); }
		public CoordenadaContext coordenada() {
			return getRuleContext(CoordenadaContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroListener ) ((LaBusquedaDelTesoroListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroListener ) ((LaBusquedaDelTesoroListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(Objeto);
				{
				setState(15);
				match(T__0);
				setState(16);
				match(INT);
				setState(17);
				match(T__1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(Objeto);
				{
				setState(19);
				match(T__2);
				}
				setState(20);
				coordenada();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				match(Objeto);
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

	public static class CoordenadaContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(LaBusquedaDelTesoroParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LaBusquedaDelTesoroParser.INT, i);
		}
		public CoordenadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordenada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroListener ) ((LaBusquedaDelTesoroListener)listener).enterCoordenada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroListener ) ((LaBusquedaDelTesoroListener)listener).exitCoordenada(this);
		}
	}

	public final CoordenadaContext coordenada() throws RecognitionException {
		CoordenadaContext _localctx = new CoordenadaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_coordenada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(INT);
			setState(25);
			match(T__3);
			setState(26);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\37\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\36\2\r"+
		"\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b\t\5\4\3\2\t\n\7\7\2\2\n\f\3\2\2\2"+
		"\13\b\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\r"+
		"\3\2\2\2\20\21\7\t\2\2\21\22\7\3\2\2\22\23\7\b\2\2\23\31\7\4\2\2\24\25"+
		"\7\t\2\2\25\26\7\5\2\2\26\31\5\6\4\2\27\31\7\t\2\2\30\20\3\2\2\2\30\24"+
		"\3\2\2\2\30\27\3\2\2\2\31\5\3\2\2\2\32\33\7\b\2\2\33\34\7\6\2\2\34\35"+
		"\7\b\2\2\35\7\3\2\2\2\4\r\30";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}