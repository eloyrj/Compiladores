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
		COMENTARIOABRIR=1, COMENTARIOLIEA=2, E=3, IGUAL=4, MAYORQUE=5, MENORQUE=6, 
		MAS=7, MENOS=8, POR=9, ENTRE=10, MOD=11, END=12, NEXT=13, PARENTESISA=14, 
		PARENTESISC=15, COMILLAS=16, PRINT=17, LET=18, NOTNUMBER=19, FOR=20, TO=21, 
		CONTINUE=22, EXIT=23, ELSE=24, IF=25, THEN=26, INPUT=27, REPEAT=28, UNTIL=29, 
		WHILE=30, REM=31, STRING=32, STRINGCOM=33, TAB=34, INTROTAB=35, INTRO=36, 
		INT=37, COMENTARIOCERRAR=38, TEXTOCOMENTARIOML=39, FINAL_COMENTARIO_UL=40, 
		TEXTOCOMENTARIOUL=41;
	public static final int
		RULE_fichero = 0, RULE_comentario = 1, RULE_textos = 2, RULE_prog = 3, 
		RULE_instruccion = 4, RULE_print = 5, RULE_let = 6, RULE_asignacion = 7, 
		RULE_buclefor = 8, RULE_condicionalif = 9, RULE_input = 10, RULE_repeat = 11, 
		RULE_buclewhile = 12, RULE_operacion = 13, RULE_errorsintactico = 14, 
		RULE_errortipo = 15, RULE_funciones = 16, RULE_rem = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"fichero", "comentario", "textos", "prog", "instruccion", "print", "let", 
			"asignacion", "buclefor", "condicionalif", "input", "repeat", "buclewhile", 
			"operacion", "errorsintactico", "errortipo", "funciones", "rem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/*'", "'//'", null, "'='", "'>'", "'<'", "'+'", "'-'", "'*'", 
			"'/'", null, null, null, "'('", "')'", "'\"'", null, null, "'NOT A NUMBER'", 
			null, null, null, null, null, null, null, null, null, null, null, "'REM'", 
			null, null, null, null, null, null, "'*/'", null, "'\r\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIOABRIR", "COMENTARIOLIEA", "E", "IGUAL", "MAYORQUE", 
			"MENORQUE", "MAS", "MENOS", "POR", "ENTRE", "MOD", "END", "NEXT", "PARENTESISA", 
			"PARENTESISC", "COMILLAS", "PRINT", "LET", "NOTNUMBER", "FOR", "TO", 
			"CONTINUE", "EXIT", "ELSE", "IF", "THEN", "INPUT", "REPEAT", "UNTIL", 
			"WHILE", "REM", "STRING", "STRINGCOM", "TAB", "INTROTAB", "INTRO", "INT", 
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
		public List<TerminalNode> INTROTAB() { return getTokens(miniBParser.INTROTAB); }
		public TerminalNode INTROTAB(int i) {
			return getToken(miniBParser.INTROTAB, i);
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLIEA) | (1L << PRINT) | (1L << LET) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << REPEAT) | (1L << WHILE) | (1L << REM) | (1L << STRING) | (1L << INTROTAB))) != 0)) {
				{
				setState(39);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
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
					setState(36);
					prog();
					}
					break;
				case COMENTARIOABRIR:
				case COMENTARIOLIEA:
					{
					setState(37);
					comentario();
					}
					break;
				case INTROTAB:
					{
					setState(38);
					match(INTROTAB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(43);
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
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(COMENTARIOABRIR);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTRO) | (1L << TEXTOCOMENTARIOML) | (1L << TEXTOCOMENTARIOUL))) != 0)) {
					{
					setState(47);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTOCOMENTARIOML:
					case TEXTOCOMENTARIOUL:
						{
						setState(45);
						textos();
						}
						break;
					case INTRO:
						{
						setState(46);
						match(INTRO);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLIEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(COMENTARIOLIEA);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTOCOMENTARIOML || _la==TEXTOCOMENTARIOUL) {
					{
					{
					setState(54);
					textos();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTOCOMENTARIOML:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(63);
						match(TEXTOCOMENTARIOML);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(66); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXTOCOMENTARIOUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(68);
						match(TEXTOCOMENTARIOUL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(71); 
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
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public BucleforContext buclefor() {
			return getRuleContext(BucleforContext.class,0);
		}
		public CondicionalifContext condicionalif() {
			return getRuleContext(CondicionalifContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(75);
				let();
				}
				break;
			case 2:
				{
				setState(76);
				repeat();
				}
				break;
			case 3:
				{
				setState(77);
				buclefor();
				}
				break;
			case 4:
				{
				setState(78);
				condicionalif();
				}
				break;
			case 5:
				{
				setState(79);
				print();
				}
				break;
			case 6:
				{
				setState(80);
				input();
				}
				break;
			case 7:
				{
				setState(81);
				buclewhile();
				}
				break;
			case 8:
				{
				setState(82);
				errorsintactico();
				}
				break;
			case 9:
				{
				setState(83);
				errortipo();
				}
				break;
			case 10:
				{
				setState(84);
				funciones();
				}
				break;
			case 11:
				{
				setState(85);
				rem();
				}
				break;
			case 12:
				{
				setState(86);
				asignacion();
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				print();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				let();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				asignacion();
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
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
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
			setState(94);
			match(PRINT);
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(95);
				funciones();
				}
				break;
			case 2:
				{
				setState(96);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(97);
				operacion();
				}
				break;
			case 4:
				{
				setState(98);
				match(STRINGCOM);
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(miniBParser.LET, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LET);
			setState(102);
			match(STRING);
			setState(103);
			match(IGUAL);
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(104);
				match(STRINGCOM);
				}
				break;
			case 2:
				{
				setState(105);
				match(INT);
				}
				break;
			case 3:
				{
				setState(106);
				funciones();
				}
				break;
			case 4:
				{
				setState(107);
				operacion();
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

	public static class AsignacionContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public TerminalNode MOD() { return getToken(miniBParser.MOD, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniBParserListener ) ((miniBParserListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(STRING);
			setState(111);
			match(IGUAL);
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(112);
				funciones();
				}
				break;
			case 2:
				{
				setState(113);
				operacion();
				}
				break;
			case 3:
				{
				{
				setState(114);
				match(STRING);
				setState(115);
				match(MOD);
				setState(116);
				match(STRING);
				}
				}
				break;
			case 4:
				{
				setState(117);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(118);
				match(INT);
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

	public static class BucleforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(miniBParser.FOR, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
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
		enterRule(_localctx, 16, RULE_buclefor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(FOR);
			setState(122);
			match(STRING);
			setState(123);
			match(IGUAL);
			setState(124);
			match(INT);
			setState(125);
			match(TO);
			setState(126);
			match(INT);
			setState(127);
			match(INTROTAB);
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(128);
					condicionalif();
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(129);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132);
				match(INTROTAB);
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << IF) | (1L << STRING))) != 0) );
			setState(138);
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
		public TerminalNode THEN() { return getToken(miniBParser.THEN, 0); }
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
		public List<TerminalNode> ELSE() { return getTokens(miniBParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(miniBParser.ELSE, i);
		}
		public TerminalNode MAYORQUE() { return getToken(miniBParser.MAYORQUE, 0); }
		public TerminalNode MENORQUE() { return getToken(miniBParser.MENORQUE, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
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
		enterRule(_localctx, 18, RULE_condicionalif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IF);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				{
				setState(141);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 2:
				{
				setState(144);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(145);
				match(INT);
				}
				break;
			}
			setState(148);
			match(THEN);
			setState(149);
			match(INTROTAB);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					setState(150);
					match(CONTINUE);
					}
					break;
				case EXIT:
					{
					setState(151);
					match(EXIT);
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(152);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(155);
				match(INTROTAB);
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << CONTINUE) | (1L << EXIT) | (1L << STRING))) != 0) );
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(160);
				match(ELSE);
				setState(161);
				match(INTROTAB);
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162);
					instruccion();
					setState(163);
					match(INTROTAB);
					}
					}
					setState(167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
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
		enterRule(_localctx, 20, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(INPUT);
			setState(177);
			match(STRINGCOM);
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
		public List<TerminalNode> INTROTAB() { return getTokens(miniBParser.INTROTAB); }
		public TerminalNode INTROTAB(int i) {
			return getToken(miniBParser.INTROTAB, i);
		}
		public TerminalNode UNTIL() { return getToken(miniBParser.UNTIL, 0); }
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
		enterRule(_localctx, 22, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(REPEAT);
			setState(181);
			match(INTROTAB);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				instruccion();
				setState(183);
				match(INTROTAB);
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(189);
			match(UNTIL);
			setState(190);
			instruccion();
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
		enterRule(_localctx, 24, RULE_buclewhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(WHILE);
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYORQUE) | (1L << MENORQUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(196);
			match(INTROTAB);
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(197);
					instruccion();
					}
					break;
				case 2:
					{
					setState(198);
					let();
					}
					break;
				}
				setState(201);
				match(INTROTAB);
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(207);
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
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
		public List<TerminalNode> STRINGCOM() { return getTokens(miniBParser.STRINGCOM); }
		public TerminalNode STRINGCOM(int i) {
			return getToken(miniBParser.STRINGCOM, i);
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
		enterRule(_localctx, 26, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << STRINGCOM) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR) | (1L << ENTRE) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << STRINGCOM) | (1L << INT))) != 0)) ) {
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

	public static class ErrorsintacticoContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(miniBParser.LET, 0); }
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
		enterRule(_localctx, 28, RULE_errorsintactico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(LET);
			setState(214);
			match(IGUAL);
			setState(215);
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
		enterRule(_localctx, 30, RULE_errortipo);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(217);
				match(LET);
				setState(218);
				match(STRING);
				setState(219);
				match(IGUAL);
				setState(220);
				match(COMILLAS);
				setState(221);
				match(INT);
				setState(222);
				match(COMILLAS);
				}
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(223);
				match(PRINT);
				setState(224);
				match(STRING);
				setState(225);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR) | (1L << ENTRE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				match(INT);
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
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
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
		enterRule(_localctx, 32, RULE_funciones);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(229);
				match(STRING);
				setState(230);
				match(PARENTESISA);
				setState(231);
				match(COMILLAS);
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					match(INT);
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(237);
				match(COMILLAS);
				setState(238);
				match(PARENTESISC);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(239);
				match(STRING);
				setState(240);
				match(PARENTESISA);
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==STRINGCOM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				match(PARENTESISC);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(243);
				match(STRING);
				setState(244);
				match(PARENTESISA);
				setState(245);
				funciones();
				setState(246);
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
		enterRule(_localctx, 34, RULE_rem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(REM);
			setState(252); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(251);
					match(STRING);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0103\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\7\3\62\n\3"+
		"\f\3\16\3\65\13\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\5\3@\n\3\3\4"+
		"\6\4C\n\4\r\4\16\4D\3\4\6\4H\n\4\r\4\16\4I\5\4L\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\5\7f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\tz\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0085\n\n\3\n\3\n\6\n\u0089\n\n\r\n\16\n\u008a\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0095\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u009c"+
		"\n\13\3\13\6\13\u009f\n\13\r\13\16\13\u00a0\3\13\3\13\3\13\3\13\3\13\6"+
		"\13\u00a8\n\13\r\13\16\13\u00a9\7\13\u00ac\n\13\f\13\16\13\u00af\13\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\6\r\u00bc\n\r\r\r\16\r"+
		"\u00bd\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ca\n\16"+
		"\3\16\3\16\6\16\u00ce\n\16\r\16\16\16\u00cf\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u00e6\n\21\3\22\3\22\3\22\3\22\6\22\u00ec\n\22\r\22\16\22\u00ed"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fb\n\22"+
		"\3\23\3\23\6\23\u00ff\n\23\r\23\16\23\u0100\3\23\2\2\24\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$\2\b\4\2\"\"\'\'\3\2\6\b\4\2\"#\'\'\3\2\t"+
		"\r\3\2\t\f\3\2\"#\2\u0122\2+\3\2\2\2\4?\3\2\2\2\6K\3\2\2\2\bY\3\2\2\2"+
		"\n^\3\2\2\2\f`\3\2\2\2\16g\3\2\2\2\20p\3\2\2\2\22{\3\2\2\2\24\u008e\3"+
		"\2\2\2\26\u00b2\3\2\2\2\30\u00b6\3\2\2\2\32\u00c2\3\2\2\2\34\u00d3\3\2"+
		"\2\2\36\u00d7\3\2\2\2 \u00e5\3\2\2\2\"\u00fa\3\2\2\2$\u00fc\3\2\2\2&*"+
		"\5\b\5\2\'*\5\4\3\2(*\7%\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*-\3\2\2\2"+
		"+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-+\3\2\2\2.\63\7\3\2\2/\62\5\6\4\2\60\62"+
		"\7&\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3"+
		"\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66@\7(\2\2\67;\7\4\2\28:\5\6\4\298"+
		"\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>@\7*\2\2?."+
		"\3\2\2\2?\67\3\2\2\2@\5\3\2\2\2AC\7)\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2"+
		"DE\3\2\2\2EL\3\2\2\2FH\7+\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2"+
		"JL\3\2\2\2KB\3\2\2\2KG\3\2\2\2L\7\3\2\2\2MZ\5\16\b\2NZ\5\30\r\2OZ\5\22"+
		"\n\2PZ\5\24\13\2QZ\5\f\7\2RZ\5\26\f\2SZ\5\32\16\2TZ\5\36\20\2UZ\5 \21"+
		"\2VZ\5\"\22\2WZ\5$\23\2XZ\5\20\t\2YM\3\2\2\2YN\3\2\2\2YO\3\2\2\2YP\3\2"+
		"\2\2YQ\3\2\2\2YR\3\2\2\2YS\3\2\2\2YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2"+
		"\2\2YX\3\2\2\2Z\t\3\2\2\2[_\5\f\7\2\\_\5\16\b\2]_\5\20\t\2^[\3\2\2\2^"+
		"\\\3\2\2\2^]\3\2\2\2_\13\3\2\2\2`e\7\23\2\2af\5\"\22\2bf\7\"\2\2cf\5\34"+
		"\17\2df\7#\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\r\3\2\2\2gh\7"+
		"\24\2\2hi\7\"\2\2in\7\6\2\2jo\7#\2\2ko\7\'\2\2lo\5\"\22\2mo\5\34\17\2"+
		"nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\17\3\2\2\2pq\7\"\2\2qy\7\6\2"+
		"\2rz\5\"\22\2sz\5\34\17\2tu\7\"\2\2uv\7\r\2\2vz\7\"\2\2wz\7\"\2\2xz\7"+
		"\'\2\2yr\3\2\2\2ys\3\2\2\2yt\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\21\3\2\2\2{"+
		"|\7\26\2\2|}\7\"\2\2}~\7\6\2\2~\177\7\'\2\2\177\u0080\7\27\2\2\u0080\u0081"+
		"\7\'\2\2\u0081\u0088\7%\2\2\u0082\u0085\5\24\13\2\u0083\u0085\5\n\6\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\7%\2\2\u0087\u0089\3\2\2\2\u0088\u0084\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\17"+
		"\2\2\u008d\23\3\2\2\2\u008e\u0094\7\33\2\2\u008f\u0090\t\2\2\2\u0090\u0091"+
		"\t\3\2\2\u0091\u0095\t\2\2\2\u0092\u0095\7\"\2\2\u0093\u0095\7\'\2\2\u0094"+
		"\u008f\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\7\34\2\2\u0097\u009e\7%\2\2\u0098\u009c\7\30\2\2\u0099"+
		"\u009c\7\31\2\2\u009a\u009c\5\n\6\2\u009b\u0098\3\2\2\2\u009b\u0099\3"+
		"\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\7%\2\2\u009e"+
		"\u009b\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00ad\3\2\2\2\u00a2\u00a3\7\32\2\2\u00a3\u00a7\7%\2\2\u00a4"+
		"\u00a5\5\n\6\2\u00a5\u00a6\7%\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a4\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\7\16\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\7\35\2\2\u00b3\u00b4\7#\2"+
		"\2\u00b4\u00b5\7\"\2\2\u00b5\27\3\2\2\2\u00b6\u00b7\7\36\2\2\u00b7\u00bb"+
		"\7%\2\2\u00b8\u00b9\5\n\6\2\u00b9\u00ba\7%\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00b8\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\37\2\2\u00c0\u00c1\5\n\6\2\u00c1"+
		"\31\3\2\2\2\u00c2\u00c3\7 \2\2\u00c3\u00c4\t\2\2\2\u00c4\u00c5\t\3\2\2"+
		"\u00c5\u00c6\t\2\2\2\u00c6\u00cd\7%\2\2\u00c7\u00ca\5\n\6\2\u00c8\u00ca"+
		"\5\16\b\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2"+
		"\u00cb\u00cc\7%\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\7\16\2\2\u00d2\33\3\2\2\2\u00d3\u00d4\t\4\2\2\u00d4\u00d5\t\5\2"+
		"\2\u00d5\u00d6\t\4\2\2\u00d6\35\3\2\2\2\u00d7\u00d8\7\24\2\2\u00d8\u00d9"+
		"\7\6\2\2\u00d9\u00da\7\'\2\2\u00da\37\3\2\2\2\u00db\u00dc\7\24\2\2\u00dc"+
		"\u00dd\7\"\2\2\u00dd\u00de\7\6\2\2\u00de\u00df\7\22\2\2\u00df\u00e0\7"+
		"\'\2\2\u00e0\u00e6\7\22\2\2\u00e1\u00e2\7\23\2\2\u00e2\u00e3\7\"\2\2\u00e3"+
		"\u00e4\t\6\2\2\u00e4\u00e6\7\'\2\2\u00e5\u00db\3\2\2\2\u00e5\u00e1\3\2"+
		"\2\2\u00e6!\3\2\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9\7\20\2\2\u00e9\u00eb"+
		"\7\22\2\2\u00ea\u00ec\7\'\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0"+
		"\7\22\2\2\u00f0\u00fb\7\21\2\2\u00f1\u00f2\7\"\2\2\u00f2\u00f3\7\20\2"+
		"\2\u00f3\u00f4\t\7\2\2\u00f4\u00fb\7\21\2\2\u00f5\u00f6\7\"\2\2\u00f6"+
		"\u00f7\7\20\2\2\u00f7\u00f8\5\"\22\2\u00f8\u00f9\7\21\2\2\u00f9\u00fb"+
		"\3\2\2\2\u00fa\u00e7\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb"+
		"#\3\2\2\2\u00fc\u00fe\7!\2\2\u00fd\u00ff\7\"\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101%\3\2\2\2"+
		"\36)+\61\63;?DIKY^eny\u0084\u008a\u0094\u009b\u00a0\u00a9\u00ad\u00bd"+
		"\u00c9\u00cf\u00e5\u00ed\u00fa\u0100";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}