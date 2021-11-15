// Generated from LaBusquedaDelTesoroParser.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIOABRIR=1, COMENTARIOLIEA=2, IDENTIFICADOR=3, INTRO=4, INT=5, 
		COODENADA=6, Objeto=7, TEDA=8, PUNTOS=9, TIENE=10, ENTERRADO=11, COMENTARIOCERRAR=12, 
		TEXTOCOMENTARIOML=13, FINAL_COMENTARIO_UL=14, TEXTOCOMENTARIOUL=15;
	public static final int
		RULE_fichero = 0, RULE_comentario = 1, RULE_textos = 2, RULE_prog = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"fichero", "comentario", "textos", "prog", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/*'", "'//'", null, null, null, null, null, "' te da '", "' puntos'", 
			"'El jugador tiene '", "' esta enterrado en '", "'*/'", null, "'\r\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIOABRIR", "COMENTARIOLIEA", "IDENTIFICADOR", "INTRO", 
			"INT", "COODENADA", "Objeto", "TEDA", "PUNTOS", "TIENE", "ENTERRADO", 
			"COMENTARIOCERRAR", "TEXTOCOMENTARIOML", "FINAL_COMENTARIO_UL", "TEXTOCOMENTARIOUL"
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
	public String getGrammarFileName() { return "LaBusquedaDelTesoroParser.g4"; }

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

	public static class FicheroContext extends ParserRuleContext {
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public List<TerminalNode> INTRO() { return getTokens(LaBusquedaDelTesoroParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(LaBusquedaDelTesoroParser.INTRO, i);
		}
		public FicheroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fichero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroParserListener ) ((LaBusquedaDelTesoroParserListener)listener).enterFichero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroParserListener ) ((LaBusquedaDelTesoroParserListener)listener).exitFichero(this);
		}
	}

	public final FicheroContext fichero() throws RecognitionException {
		FicheroContext _localctx = new FicheroContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fichero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLIEA) | (1L << INTRO) | (1L << Objeto) | (1L << TIENE))) != 0)) {
				{
				setState(13);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Objeto:
				case TIENE:
					{
					setState(10);
					prog();
					}
					break;
				case COMENTARIOABRIR:
				case COMENTARIOLIEA:
					{
					setState(11);
					comentario();
					}
					break;
				case INTRO:
					{
					setState(12);
					match(INTRO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(17);
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

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIOABRIR() { return getToken(LaBusquedaDelTesoroParser.COMENTARIOABRIR, 0); }
		public TerminalNode COMENTARIOCERRAR() { return getToken(LaBusquedaDelTesoroParser.COMENTARIOCERRAR, 0); }
		public List<TextosContext> textos() {
			return getRuleContexts(TextosContext.class);
		}
		public TextosContext textos(int i) {
			return getRuleContext(TextosContext.class,i);
		}
		public List<TerminalNode> INTRO() { return getTokens(LaBusquedaDelTesoroParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(LaBusquedaDelTesoroParser.INTRO, i);
		}
		public TerminalNode COMENTARIOLIEA() { return getToken(LaBusquedaDelTesoroParser.COMENTARIOLIEA, 0); }
		public TerminalNode FINAL_COMENTARIO_UL() { return getToken(LaBusquedaDelTesoroParser.FINAL_COMENTARIO_UL, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroParserListener ) ((LaBusquedaDelTesoroParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroParserListener ) ((LaBusquedaDelTesoroParserListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comentario);
		int _la;
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(COMENTARIOABRIR);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTRO) | (1L << TEXTOCOMENTARIOML) | (1L << TEXTOCOMENTARIOUL))) != 0)) {
					{
					setState(21);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTOCOMENTARIOML:
					case TEXTOCOMENTARIOUL:
						{
						setState(19);
						textos();
						}
						break;
					case INTRO:
						{
						setState(20);
						match(INTRO);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(26);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLIEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(COMENTARIOLIEA);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTOCOMENTARIOML || _la==TEXTOCOMENTARIOUL) {
					{
					{
					setState(28);
					textos();
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
				match(FINAL_COMENTARIO_UL);
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

	public static class TextosContext extends ParserRuleContext {
		public List<TerminalNode> TEXTOCOMENTARIOML() { return getTokens(LaBusquedaDelTesoroParser.TEXTOCOMENTARIOML); }
		public TerminalNode TEXTOCOMENTARIOML(int i) {
			return getToken(LaBusquedaDelTesoroParser.TEXTOCOMENTARIOML, i);
		}
		public List<TerminalNode> TEXTOCOMENTARIOUL() { return getTokens(LaBusquedaDelTesoroParser.TEXTOCOMENTARIOUL); }
		public TerminalNode TEXTOCOMENTARIOUL(int i) {
			return getToken(LaBusquedaDelTesoroParser.TEXTOCOMENTARIOUL, i);
		}
		public TextosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroParserListener ) ((LaBusquedaDelTesoroParserListener)listener).enterTextos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroParserListener ) ((LaBusquedaDelTesoroParserListener)listener).exitTextos(this);
		}
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_textos);
		try {
			int _alt;
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTOCOMENTARIOML:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(37);
						match(TEXTOCOMENTARIOML);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(40); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXTOCOMENTARIOUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(43); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(42);
						match(TEXTOCOMENTARIOUL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(45); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ProgContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INTRO() { return getToken(LaBusquedaDelTesoroParser.INTRO, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroParserListener ) ((LaBusquedaDelTesoroParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroParserListener ) ((LaBusquedaDelTesoroParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(49);
			expr();
			setState(50);
			match(INTRO);
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
		public TerminalNode TEDA() { return getToken(LaBusquedaDelTesoroParser.TEDA, 0); }
		public TerminalNode INT() { return getToken(LaBusquedaDelTesoroParser.INT, 0); }
		public TerminalNode PUNTOS() { return getToken(LaBusquedaDelTesoroParser.PUNTOS, 0); }
		public TerminalNode ENTERRADO() { return getToken(LaBusquedaDelTesoroParser.ENTERRADO, 0); }
		public TerminalNode COODENADA() { return getToken(LaBusquedaDelTesoroParser.COODENADA, 0); }
		public TerminalNode TIENE() { return getToken(LaBusquedaDelTesoroParser.TIENE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroParserListener ) ((LaBusquedaDelTesoroParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaBusquedaDelTesoroParserListener ) ((LaBusquedaDelTesoroParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(Objeto);
				setState(53);
				match(TEDA);
				setState(54);
				match(INT);
				setState(55);
				match(PUNTOS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(Objeto);
				setState(57);
				match(ENTERRADO);
				setState(58);
				match(COODENADA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(TIENE);
				setState(60);
				match(INT);
				setState(61);
				match(PUNTOS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21D\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\3"+
		"\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13"+
		"\3\3\3\5\3&\n\3\3\4\6\4)\n\4\r\4\16\4*\3\4\6\4.\n\4\r\4\16\4/\5\4\62\n"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3"+
		"\6\2\2\7\2\4\6\b\n\2\2\2K\2\21\3\2\2\2\4%\3\2\2\2\6\61\3\2\2\2\b\63\3"+
		"\2\2\2\nA\3\2\2\2\f\20\5\b\5\2\r\20\5\4\3\2\16\20\7\6\2\2\17\f\3\2\2\2"+
		"\17\r\3\2\2\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2"+
		"\22\3\3\2\2\2\23\21\3\2\2\2\24\31\7\3\2\2\25\30\5\6\4\2\26\30\7\6\2\2"+
		"\27\25\3\2\2\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2"+
		"\32\34\3\2\2\2\33\31\3\2\2\2\34&\7\16\2\2\35!\7\4\2\2\36 \5\6\4\2\37\36"+
		"\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$&\7\20"+
		"\2\2%\24\3\2\2\2%\35\3\2\2\2&\5\3\2\2\2\')\7\17\2\2(\'\3\2\2\2)*\3\2\2"+
		"\2*(\3\2\2\2*+\3\2\2\2+\62\3\2\2\2,.\7\21\2\2-,\3\2\2\2./\3\2\2\2/-\3"+
		"\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61(\3\2\2\2\61-\3\2\2\2\62\7\3\2\2\2"+
		"\63\64\5\n\6\2\64\65\7\6\2\2\65\t\3\2\2\2\66\67\7\t\2\2\678\7\n\2\289"+
		"\7\7\2\29B\7\13\2\2:;\7\t\2\2;<\7\r\2\2<B\7\b\2\2=>\7\f\2\2>?\7\7\2\2"+
		"?B\7\13\2\2@B\7\t\2\2A\66\3\2\2\2A:\3\2\2\2A=\3\2\2\2A@\3\2\2\2B\13\3"+
		"\2\2\2\f\17\21\27\31!%*/\61A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}