// Generated from miniBParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniBParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIOABRIR=1, COMENTARIOLIEA=2, CONTADOR=3, IGUAL=4, MAYORQUE=5, 
		MENORQUE=6, MAS=7, MENOS=8, POR=9, ENTRE=10, MOD=11, END=12, NEXT=13, 
		PARENTESISA=14, PARENTESISC=15, COMILLAS=16, PRINT=17, LET=18, NOTNUMBER=19, 
		FOR=20, TO=21, CONTINUE=22, EXIT=23, ELSE=24, IF=25, THEN=26, INPUT=27, 
		REPEAT=28, UNTIL=29, WHILE=30, REM=31, E=32, STRING=33, STRINGCOM=34, 
		TAB=35, INTROTAB=36, INTRO=37, INT=38, COMENTARIOCERRAR=39, TEXTOCOMENTARIOML=40, 
		FINAL_COMENTARIO_UL=41, TEXTOCOMENTARIOUL=42;
	public static final int
		RULE_fichero = 0, RULE_comentario = 1, RULE_textos = 2, RULE_prog = 3, 
		RULE_instruccion = 4, RULE_print = 5, RULE_let = 6, RULE_buclefor = 7, 
		RULE_condicionalif = 8, RULE_input = 9, RULE_repeat = 10, RULE_buclewhile = 11, 
		RULE_operacion = 12, RULE_errorsintactico = 13, RULE_errortipo = 14, RULE_funciones = 15, 
		RULE_rem = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"fichero", "comentario", "textos", "prog", "instruccion", "print", "let", 
			"buclefor", "condicionalif", "input", "repeat", "buclewhile", "operacion", 
			"errorsintactico", "errortipo", "funciones", "rem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/*'", "'//'", "'i'", "'='", "'>'", "'<'", "'+'", "'-'", "'*'", 
			"'/'", "'MOD'", "'END'", "'NEXT'", "'('", "')'", "'\"'", "'PRINT'", "'LET'", 
			"'NOT A NUMBER'", "'FOR'", "'TO'", "'CONTINUE'", "'EXIT'", "'ELSE'", 
			"'IF'", "'THEN'", "'INPUT'", "'REPEAT'", "'UNTIL'", "'WHILE'", "'REM'", 
			"' '", null, null, null, null, null, null, "'*/'", null, "'\r\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIOABRIR", "COMENTARIOLIEA", "CONTADOR", "IGUAL", "MAYORQUE", 
			"MENORQUE", "MAS", "MENOS", "POR", "ENTRE", "MOD", "END", "NEXT", "PARENTESISA", 
			"PARENTESISC", "COMILLAS", "PRINT", "LET", "NOTNUMBER", "FOR", "TO", 
			"CONTINUE", "EXIT", "ELSE", "IF", "THEN", "INPUT", "REPEAT", "UNTIL", 
			"WHILE", "REM", "E", "STRING", "STRINGCOM", "TAB", "INTROTAB", "INTRO", 
			"INT", "COMENTARIOCERRAR", "TEXTOCOMENTARIOML", "FINAL_COMENTARIO_UL", 
			"TEXTOCOMENTARIOUL"
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
	public String getGrammarFileName() { return "miniBParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniBParser(TokenStream input) {
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
		public List<TerminalNode> INTRO() { return getTokens(miniBParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(miniBParser.INTRO, i);
		}
		public FicheroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fichero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterFichero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitFichero(this);
		}
	}

	public final FicheroContext fichero() throws RecognitionException {
		FicheroContext _localctx = new FicheroContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fichero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLIEA) | (1L << CONTADOR) | (1L << MAS) | (1L << POR) | (1L << ENTRE) | (1L << PRINT) | (1L << LET) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << REPEAT) | (1L << WHILE) | (1L << REM) | (1L << STRING) | (1L << INTRO))) != 0)) {
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTADOR:
				case MAS:
				case POR:
				case ENTRE:
				case PRINT:
				case LET:
				case FOR:
				case IF:
				case INPUT:
				case REPEAT:
				case WHILE:
				case REM:
				case STRING:
					{
					setState(34);
					prog();
					}
					break;
				case COMENTARIOABRIR:
				case COMENTARIOLIEA:
					{
					setState(35);
					comentario();
					}
					break;
				case INTRO:
					{
					setState(36);
					match(INTRO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41);
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
		public TerminalNode COMENTARIOABRIR() { return getToken(miniBParser.COMENTARIOABRIR, 0); }
		public TerminalNode COMENTARIOCERRAR() { return getToken(miniBParser.COMENTARIOCERRAR, 0); }
		public List<TextosContext> textos() {
			return getRuleContexts(TextosContext.class);
		}
		public TextosContext textos(int i) {
			return getRuleContext(TextosContext.class,i);
		}
		public List<TerminalNode> INTRO() { return getTokens(miniBParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(miniBParser.INTRO, i);
		}
		public TerminalNode COMENTARIOLIEA() { return getToken(miniBParser.COMENTARIOLIEA, 0); }
		public TerminalNode FINAL_COMENTARIO_UL() { return getToken(miniBParser.FINAL_COMENTARIO_UL, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comentario);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(COMENTARIOABRIR);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTRO) | (1L << TEXTOCOMENTARIOML) | (1L << TEXTOCOMENTARIOUL))) != 0)) {
					{
					setState(45);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTOCOMENTARIOML:
					case TEXTOCOMENTARIOUL:
						{
						setState(43);
						textos();
						}
						break;
					case INTRO:
						{
						setState(44);
						match(INTRO);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLIEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(COMENTARIOLIEA);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTOCOMENTARIOML || _la==TEXTOCOMENTARIOUL) {
					{
					{
					setState(52);
					textos();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(58);
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
		public List<TerminalNode> TEXTOCOMENTARIOML() { return getTokens(miniBParser.TEXTOCOMENTARIOML); }
		public TerminalNode TEXTOCOMENTARIOML(int i) {
			return getToken(miniBParser.TEXTOCOMENTARIOML, i);
		}
		public List<TerminalNode> TEXTOCOMENTARIOUL() { return getTokens(miniBParser.TEXTOCOMENTARIOUL); }
		public TerminalNode TEXTOCOMENTARIOUL(int i) {
			return getToken(miniBParser.TEXTOCOMENTARIOUL, i);
		}
		public TextosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterTextos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitTextos(this);
		}
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_textos);
		try {
			int _alt;
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTOCOMENTARIOML:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(61);
						match(TEXTOCOMENTARIOML);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(64); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXTOCOMENTARIOUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(66);
						match(TEXTOCOMENTARIOUL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(69); 
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
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public BucleforContext buclefor() {
			return getRuleContext(BucleforContext.class,0);
		}
		public CondicionalifContext condicionalif() {
			return getRuleContext(CondicionalifContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public BuclewhileContext buclewhile() {
			return getRuleContext(BuclewhileContext.class,0);
		}
		public ErrorsintacticoContext errorsintactico() {
			return getRuleContext(ErrorsintacticoContext.class,0);
		}
		public ErrortipoContext errortipo() {
			return getRuleContext(ErrortipoContext.class,0);
		}
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public RemContext rem() {
			return getRuleContext(RemContext.class,0);
		}
		public TerminalNode INTRO() { return getToken(miniBParser.INTRO, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(73);
				repeat();
				}
				break;
			case 2:
				{
				setState(74);
				let();
				}
				break;
			case 3:
				{
				setState(75);
				print();
				}
				break;
			case 4:
				{
				setState(76);
				buclefor();
				}
				break;
			case 5:
				{
				setState(77);
				condicionalif();
				}
				break;
			case 6:
				{
				setState(78);
				input();
				}
				break;
			case 7:
				{
				setState(79);
				buclewhile();
				}
				break;
			case 8:
				{
				setState(80);
				errorsintactico();
				}
				break;
			case 9:
				{
				setState(81);
				errortipo();
				}
				break;
			case 10:
				{
				setState(82);
				funciones();
				}
				break;
			case 11:
				{
				setState(83);
				rem();
				setState(84);
				match(INTRO);
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

	public static class InstruccionContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruccion);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				print();
				}
				break;
			case CONTADOR:
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				let();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(miniBParser.PRINT, 0); }
		public TerminalNode E() { return getToken(miniBParser.E, 0); }
		public TerminalNode CONTADOR() { return getToken(miniBParser.CONTADOR, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(PRINT);
			setState(93);
			match(E);
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTADOR:
				{
				setState(94);
				match(CONTADOR);
				}
				break;
			case INT:
				{
				setState(95);
				operacion();
				}
				break;
			case STRINGCOM:
				{
				setState(96);
				match(STRINGCOM);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(miniBParser.LET, 0); }
		public List<TerminalNode> E() { return getTokens(miniBParser.E); }
		public TerminalNode E(int i) {
			return getToken(miniBParser.E, i);
		}
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode CONTADOR() { return getToken(miniBParser.CONTADOR, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitLet(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_let);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(LET);
				setState(100);
				match(E);
				setState(101);
				match(STRING);
				}
				break;
			case CONTADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(CONTADOR);
				setState(103);
				match(E);
				setState(104);
				match(IGUAL);
				setState(105);
				match(E);
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(106);
					match(STRINGCOM);
					}
					break;
				case 2:
					{
					setState(107);
					match(INT);
					}
					break;
				case 3:
					{
					setState(108);
					funciones();
					}
					break;
				case 4:
					{
					setState(109);
					operacion();
					}
					break;
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

	public static class BucleforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(miniBParser.FOR, 0); }
		public List<TerminalNode> E() { return getTokens(miniBParser.E); }
		public TerminalNode E(int i) {
			return getToken(miniBParser.E, i);
		}
		public TerminalNode CONTADOR() { return getToken(miniBParser.CONTADOR, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public List<TerminalNode> INT() { return getTokens(miniBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(miniBParser.INT, i);
		}
		public TerminalNode TO() { return getToken(miniBParser.TO, 0); }
		public List<TerminalNode> INTROTAB() { return getTokens(miniBParser.INTROTAB); }
		public TerminalNode INTROTAB(int i) {
			return getToken(miniBParser.INTROTAB, i);
		}
		public TerminalNode NEXT() { return getToken(miniBParser.NEXT, 0); }
		public List<CondicionalifContext> condicionalif() {
			return getRuleContexts(CondicionalifContext.class);
		}
		public CondicionalifContext condicionalif(int i) {
			return getRuleContext(CondicionalifContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BucleforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buclefor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterBuclefor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitBuclefor(this);
		}
	}

	public final BucleforContext buclefor() throws RecognitionException {
		BucleforContext _localctx = new BucleforContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_buclefor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(FOR);
			setState(115);
			match(E);
			setState(116);
			match(CONTADOR);
			setState(117);
			match(E);
			setState(118);
			match(IGUAL);
			setState(119);
			match(E);
			setState(120);
			match(INT);
			setState(121);
			match(E);
			setState(122);
			match(TO);
			setState(123);
			match(E);
			setState(124);
			match(INT);
			setState(125);
			match(INTROTAB);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(126);
					condicionalif();
					}
					break;
				case CONTADOR:
				case PRINT:
				case LET:
					{
					setState(127);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(130);
				match(INTROTAB);
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTADOR) | (1L << PRINT) | (1L << LET) | (1L << IF))) != 0) );
			setState(136);
			match(NEXT);
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

	public static class CondicionalifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(miniBParser.IF, 0); }
		public List<TerminalNode> E() { return getTokens(miniBParser.E); }
		public TerminalNode E(int i) {
			return getToken(miniBParser.E, i);
		}
		public TerminalNode THEN() { return getToken(miniBParser.THEN, 0); }
		public List<TerminalNode> INTROTAB() { return getTokens(miniBParser.INTROTAB); }
		public TerminalNode INTROTAB(int i) {
			return getToken(miniBParser.INTROTAB, i);
		}
		public TerminalNode END() { return getToken(miniBParser.END, 0); }
		public List<TerminalNode> CONTADOR() { return getTokens(miniBParser.CONTADOR); }
		public TerminalNode CONTADOR(int i) {
			return getToken(miniBParser.CONTADOR, i);
		}
		public List<TerminalNode> INT() { return getTokens(miniBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(miniBParser.INT, i);
		}
		public TerminalNode MAYORQUE() { return getToken(miniBParser.MAYORQUE, 0); }
		public TerminalNode MENORQUE() { return getToken(miniBParser.MENORQUE, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public List<TerminalNode> ELSE() { return getTokens(miniBParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(miniBParser.ELSE, i);
		}
		public List<TerminalNode> CONTINUE() { return getTokens(miniBParser.CONTINUE); }
		public TerminalNode CONTINUE(int i) {
			return getToken(miniBParser.CONTINUE, i);
		}
		public List<TerminalNode> EXIT() { return getTokens(miniBParser.EXIT); }
		public TerminalNode EXIT(int i) {
			return getToken(miniBParser.EXIT, i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public CondicionalifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterCondicionalif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitCondicionalif(this);
		}
	}

	public final CondicionalifContext condicionalif() throws RecognitionException {
		CondicionalifContext _localctx = new CondicionalifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicionalif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IF);
			setState(139);
			match(E);
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==CONTADOR || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(141);
			match(E);
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYORQUE) | (1L << MENORQUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(143);
			match(E);
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==CONTADOR || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(145);
			match(E);
			setState(146);
			match(THEN);
			setState(147);
			match(INTROTAB);
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					setState(148);
					match(CONTINUE);
					}
					break;
				case EXIT:
					{
					setState(149);
					match(EXIT);
					}
					break;
				case CONTADOR:
				case PRINT:
				case LET:
					{
					setState(150);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(153);
				match(INTROTAB);
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTADOR) | (1L << PRINT) | (1L << LET) | (1L << CONTINUE) | (1L << EXIT))) != 0) );
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(158);
				match(ELSE);
				setState(159);
				match(INTROTAB);
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(160);
					instruccion();
					setState(161);
					match(INTROTAB);
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTADOR) | (1L << PRINT) | (1L << LET))) != 0) );
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(END);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(miniBParser.INPUT, 0); }
		public List<TerminalNode> E() { return getTokens(miniBParser.E); }
		public TerminalNode E(int i) {
			return getToken(miniBParser.E, i);
		}
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(INPUT);
			setState(175);
			match(E);
			setState(176);
			match(STRINGCOM);
			setState(177);
			match(E);
			setState(178);
			match(STRING);
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(miniBParser.REPEAT, 0); }
		public TerminalNode INTROTAB() { return getToken(miniBParser.INTROTAB, 0); }
		public List<TerminalNode> E() { return getTokens(miniBParser.E); }
		public TerminalNode E(int i) {
			return getToken(miniBParser.E, i);
		}
		public TerminalNode UNTIL() { return getToken(miniBParser.UNTIL, 0); }
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitRepeat(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(REPEAT);
			setState(181);
			match(INTROTAB);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				instruccion();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTADOR) | (1L << PRINT) | (1L << LET))) != 0) );
			setState(187);
			match(E);
			setState(188);
			match(UNTIL);
			setState(189);
			match(E);
			setState(190);
			let();
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

	public static class BuclewhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(miniBParser.WHILE, 0); }
		public List<TerminalNode> E() { return getTokens(miniBParser.E); }
		public TerminalNode E(int i) {
			return getToken(miniBParser.E, i);
		}
		public List<TerminalNode> INTROTAB() { return getTokens(miniBParser.INTROTAB); }
		public TerminalNode INTROTAB(int i) {
			return getToken(miniBParser.INTROTAB, i);
		}
		public TerminalNode END() { return getToken(miniBParser.END, 0); }
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(miniBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(miniBParser.INT, i);
		}
		public TerminalNode MAYORQUE() { return getToken(miniBParser.MAYORQUE, 0); }
		public TerminalNode MENORQUE() { return getToken(miniBParser.MENORQUE, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<LetContext> let() {
			return getRuleContexts(LetContext.class);
		}
		public LetContext let(int i) {
			return getRuleContext(LetContext.class,i);
		}
		public BuclewhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buclewhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterBuclewhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitBuclewhile(this);
		}
	}

	public final BuclewhileContext buclewhile() throws RecognitionException {
		BuclewhileContext _localctx = new BuclewhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_buclewhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(WHILE);
			setState(193);
			match(E);
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(195);
			match(E);
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYORQUE) | (1L << MENORQUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(197);
			match(E);
			setState(198);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(199);
			match(INTROTAB);
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(200);
					instruccion();
					}
					break;
				case 2:
					{
					setState(201);
					let();
					}
					break;
				}
				setState(204);
				match(INTROTAB);
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTADOR) | (1L << PRINT) | (1L << LET))) != 0) );
			setState(210);
			match(END);
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

	public static class OperacionContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(miniBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(miniBParser.INT, i);
		}
		public TerminalNode MAS() { return getToken(miniBParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(miniBParser.MENOS, 0); }
		public TerminalNode POR() { return getToken(miniBParser.POR, 0); }
		public TerminalNode ENTRE() { return getToken(miniBParser.ENTRE, 0); }
		public TerminalNode MOD() { return getToken(miniBParser.MOD, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(INT);
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR) | (1L << ENTRE) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(214);
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

	public static class ErrorsintacticoContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(miniBParser.LET, 0); }
		public List<TerminalNode> E() { return getTokens(miniBParser.E); }
		public TerminalNode E(int i) {
			return getToken(miniBParser.E, i);
		}
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public ErrorsintacticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorsintactico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterErrorsintactico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitErrorsintactico(this);
		}
	}

	public final ErrorsintacticoContext errorsintactico() throws RecognitionException {
		ErrorsintacticoContext _localctx = new ErrorsintacticoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_errorsintactico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LET);
			setState(217);
			match(E);
			setState(218);
			match(IGUAL);
			setState(219);
			match(E);
			setState(220);
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

	public static class ErrortipoContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(miniBParser.LET, 0); }
		public List<TerminalNode> E() { return getTokens(miniBParser.E); }
		public TerminalNode E(int i) {
			return getToken(miniBParser.E, i);
		}
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public List<TerminalNode> COMILLAS() { return getTokens(miniBParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(miniBParser.COMILLAS, i);
		}
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public TerminalNode PRINT() { return getToken(miniBParser.PRINT, 0); }
		public TerminalNode MENOS() { return getToken(miniBParser.MENOS, 0); }
		public TerminalNode MAS() { return getToken(miniBParser.MAS, 0); }
		public TerminalNode ENTRE() { return getToken(miniBParser.ENTRE, 0); }
		public TerminalNode POR() { return getToken(miniBParser.POR, 0); }
		public ErrortipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errortipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterErrortipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitErrortipo(this);
		}
	}

	public final ErrortipoContext errortipo() throws RecognitionException {
		ErrortipoContext _localctx = new ErrortipoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_errortipo);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(222);
				match(LET);
				setState(223);
				match(E);
				setState(224);
				match(STRING);
				setState(225);
				match(E);
				setState(226);
				match(IGUAL);
				setState(227);
				match(E);
				setState(228);
				match(COMILLAS);
				setState(229);
				match(INT);
				setState(230);
				match(COMILLAS);
				}
				}
				break;
			case MAS:
			case POR:
			case ENTRE:
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRINT:
					{
					setState(231);
					match(PRINT);
					setState(232);
					match(STRING);
					setState(233);
					match(MENOS);
					}
					break;
				case MAS:
					{
					setState(234);
					match(MAS);
					}
					break;
				case ENTRE:
					{
					setState(235);
					match(ENTRE);
					}
					break;
				case POR:
					{
					setState(236);
					match(POR);
					setState(237);
					match(INT);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class FuncionesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode PARENTESISA() { return getToken(miniBParser.PARENTESISA, 0); }
		public List<TerminalNode> COMILLAS() { return getTokens(miniBParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(miniBParser.COMILLAS, i);
		}
		public TerminalNode PARENTESISC() { return getToken(miniBParser.PARENTESISC, 0); }
		public List<TerminalNode> INT() { return getTokens(miniBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(miniBParser.INT, i);
		}
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public FuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitFunciones(this);
		}
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funciones);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(242);
				match(STRING);
				setState(243);
				match(PARENTESISA);
				setState(244);
				match(COMILLAS);
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(245);
					match(INT);
					}
					}
					setState(248); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(250);
				match(COMILLAS);
				setState(251);
				match(PARENTESISC);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(252);
				match(STRING);
				setState(253);
				match(PARENTESISA);
				setState(254);
				match(STRINGCOM);
				setState(255);
				match(PARENTESISC);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(256);
				match(STRING);
				setState(257);
				match(PARENTESISA);
				setState(258);
				funciones();
				setState(259);
				match(PARENTESISC);
				}
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

	public static class RemContext extends ParserRuleContext {
		public TerminalNode REM() { return getToken(miniBParser.REM, 0); }
		public List<TerminalNode> E() { return getTokens(miniBParser.E); }
		public TerminalNode E(int i) {
			return getToken(miniBParser.E, i);
		}
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
		public RemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterRem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitRem(this);
		}
	}

	public final RemContext rem() throws RecognitionException {
		RemContext _localctx = new RemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(REM);
			setState(264);
			match(E);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				match(STRING);
				setState(266);
				match(E);
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0112\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\5\3>\n\3\3\4\6\4A\n\4\r"+
		"\4\16\4B\3\4\6\4F\n\4\r\4\16\4G\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\5"+
		"\7d\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\5\bs\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t"+
		"\3\t\3\t\6\t\u0087\n\t\r\t\16\t\u0088\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009a\n\n\3\n\6\n\u009d\n\n\r\n\16\n"+
		"\u009e\3\n\3\n\3\n\3\n\3\n\6\n\u00a6\n\n\r\n\16\n\u00a7\7\n\u00aa\n\n"+
		"\f\n\16\n\u00ad\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\6\f\u00ba\n\f\r\f\16\f\u00bb\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00cd\n\r\3\r\3\r\6\r\u00d1\n\r\r\r\16\r\u00d2"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00f1\n\20\5\20\u00f3\n\20\3\21\3\21\3\21\3\21\6\21\u00f9\n\21\r\21"+
		"\16\21\u00fa\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0108\n\21\3\22\3\22\3\22\3\22\6\22\u010e\n\22\r\22\16\22\u010f\3"+
		"\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\4\2\5\5((\3\2"+
		"\6\b\4\2##((\3\2\t\r\2\u012d\2)\3\2\2\2\4=\3\2\2\2\6I\3\2\2\2\bX\3\2\2"+
		"\2\n\\\3\2\2\2\f^\3\2\2\2\16r\3\2\2\2\20t\3\2\2\2\22\u008c\3\2\2\2\24"+
		"\u00b0\3\2\2\2\26\u00b6\3\2\2\2\30\u00c2\3\2\2\2\32\u00d6\3\2\2\2\34\u00da"+
		"\3\2\2\2\36\u00f2\3\2\2\2 \u0107\3\2\2\2\"\u0109\3\2\2\2$(\5\b\5\2%(\5"+
		"\4\3\2&(\7\'\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2"+
		")*\3\2\2\2*\3\3\2\2\2+)\3\2\2\2,\61\7\3\2\2-\60\5\6\4\2.\60\7\'\2\2/-"+
		"\3\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2"+
		"\2\63\61\3\2\2\2\64>\7)\2\2\659\7\4\2\2\668\5\6\4\2\67\66\3\2\2\28;\3"+
		"\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<>\7+\2\2=,\3\2\2\2=\65"+
		"\3\2\2\2>\5\3\2\2\2?A\7*\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C"+
		"J\3\2\2\2DF\7,\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2I"+
		"@\3\2\2\2IE\3\2\2\2J\7\3\2\2\2KY\5\26\f\2LY\5\16\b\2MY\5\f\7\2NY\5\20"+
		"\t\2OY\5\22\n\2PY\5\24\13\2QY\5\30\r\2RY\5\34\17\2SY\5\36\20\2TY\5 \21"+
		"\2UV\5\"\22\2VW\7\'\2\2WY\3\2\2\2XK\3\2\2\2XL\3\2\2\2XM\3\2\2\2XN\3\2"+
		"\2\2XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2"+
		"\2\2Y\t\3\2\2\2Z]\5\f\7\2[]\5\16\b\2\\Z\3\2\2\2\\[\3\2\2\2]\13\3\2\2\2"+
		"^_\7\23\2\2_c\7\"\2\2`d\7\5\2\2ad\5\32\16\2bd\7$\2\2c`\3\2\2\2ca\3\2\2"+
		"\2cb\3\2\2\2d\r\3\2\2\2ef\7\24\2\2fg\7\"\2\2gs\7#\2\2hi\7\5\2\2ij\7\""+
		"\2\2jk\7\6\2\2kp\7\"\2\2lq\7$\2\2mq\7(\2\2nq\5 \21\2oq\5\32\16\2pl\3\2"+
		"\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2qs\3\2\2\2re\3\2\2\2rh\3\2\2\2s\17\3"+
		"\2\2\2tu\7\26\2\2uv\7\"\2\2vw\7\5\2\2wx\7\"\2\2xy\7\6\2\2yz\7\"\2\2z{"+
		"\7(\2\2{|\7\"\2\2|}\7\27\2\2}~\7\"\2\2~\177\7(\2\2\177\u0086\7&\2\2\u0080"+
		"\u0083\5\22\n\2\u0081\u0083\5\n\6\2\u0082\u0080\3\2\2\2\u0082\u0081\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7&\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0082\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\17\2\2\u008b\21\3\2\2\2\u008c\u008d"+
		"\7\33\2\2\u008d\u008e\7\"\2\2\u008e\u008f\t\2\2\2\u008f\u0090\7\"\2\2"+
		"\u0090\u0091\t\3\2\2\u0091\u0092\7\"\2\2\u0092\u0093\t\2\2\2\u0093\u0094"+
		"\7\"\2\2\u0094\u0095\7\34\2\2\u0095\u009c\7&\2\2\u0096\u009a\7\30\2\2"+
		"\u0097\u009a\7\31\2\2\u0098\u009a\5\n\6\2\u0099\u0096\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7&\2\2\u009c"+
		"\u0099\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00ab\3\2\2\2\u00a0\u00a1\7\32\2\2\u00a1\u00a5\7&\2\2\u00a2"+
		"\u00a3\5\n\6\2\u00a3\u00a4\7&\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a0\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7\16\2\2\u00af\23\3\2\2\2\u00b0\u00b1\7\35\2\2\u00b1\u00b2\7\""+
		"\2\2\u00b2\u00b3\7$\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b5\7#\2\2\u00b5\25"+
		"\3\2\2\2\u00b6\u00b7\7\36\2\2\u00b7\u00b9\7&\2\2\u00b8\u00ba\5\n\6\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\"\2\2\u00be\u00bf\7\37\2\2\u00bf"+
		"\u00c0\7\"\2\2\u00c0\u00c1\5\16\b\2\u00c1\27\3\2\2\2\u00c2\u00c3\7 \2"+
		"\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\t\4\2\2\u00c5\u00c6\7\"\2\2\u00c6\u00c7"+
		"\t\3\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9\t\4\2\2\u00c9\u00d0\7&\2\2\u00ca"+
		"\u00cd\5\n\6\2\u00cb\u00cd\5\16\b\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7&\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00cc\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\16\2\2\u00d5\31\3\2\2\2\u00d6\u00d7"+
		"\7(\2\2\u00d7\u00d8\t\5\2\2\u00d8\u00d9\7(\2\2\u00d9\33\3\2\2\2\u00da"+
		"\u00db\7\24\2\2\u00db\u00dc\7\"\2\2\u00dc\u00dd\7\6\2\2\u00dd\u00de\7"+
		"\"\2\2\u00de\u00df\7(\2\2\u00df\35\3\2\2\2\u00e0\u00e1\7\24\2\2\u00e1"+
		"\u00e2\7\"\2\2\u00e2\u00e3\7#\2\2\u00e3\u00e4\7\"\2\2\u00e4\u00e5\7\6"+
		"\2\2\u00e5\u00e6\7\"\2\2\u00e6\u00e7\7\22\2\2\u00e7\u00e8\7(\2\2\u00e8"+
		"\u00f3\7\22\2\2\u00e9\u00ea\7\23\2\2\u00ea\u00eb\7#\2\2\u00eb\u00f1\7"+
		"\n\2\2\u00ec\u00f1\7\t\2\2\u00ed\u00f1\7\f\2\2\u00ee\u00ef\7\13\2\2\u00ef"+
		"\u00f1\7(\2\2\u00f0\u00e9\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ed\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00e0\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\37\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\7\20\2"+
		"\2\u00f6\u00f8\7\22\2\2\u00f7\u00f9\7(\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\7\22\2\2\u00fd\u0108\7\21\2\2\u00fe\u00ff\7#\2\2\u00ff\u0100\7"+
		"\20\2\2\u0100\u0101\7$\2\2\u0101\u0108\7\21\2\2\u0102\u0103\7#\2\2\u0103"+
		"\u0104\7\20\2\2\u0104\u0105\5 \21\2\u0105\u0106\7\21\2\2\u0106\u0108\3"+
		"\2\2\2\u0107\u00f4\3\2\2\2\u0107\u00fe\3\2\2\2\u0107\u0102\3\2\2\2\u0108"+
		"!\3\2\2\2\u0109\u010a\7!\2\2\u010a\u010d\7\"\2\2\u010b\u010c\7#\2\2\u010c"+
		"\u010e\7\"\2\2\u010d\u010b\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110#\3\2\2\2\36\')/\619=BGIX\\cpr\u0082\u0088"+
		"\u0099\u009e\u00a7\u00ab\u00bb\u00cc\u00d2\u00f0\u00f2\u00fa\u0107\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}