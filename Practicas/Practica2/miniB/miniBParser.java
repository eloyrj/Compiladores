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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMENTARIOABRIR) | (1L << COMENTARIOLIEA) | (1L << MAS) | (1L << POR) | (1L << ENTRE) | (1L << PRINT) | (1L << LET) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << REPEAT) | (1L << WHILE) | (1L << REM) | (1L << STRING) | (1L << INTRO))) != 0)) {
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
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
				let();
				}
				break;
			case 2:
				{
				setState(74);
				repeat();
				}
				break;
			case 3:
				{
				setState(75);
				buclefor();
				}
				break;
			case 4:
				{
				setState(76);
				condicionalif();
				}
				break;
			case 5:
				{
				setState(77);
				print();
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
			setState(99);
			match(LET);
			setState(100);
			match(E);
			setState(101);
			match(STRING);
			setState(102);
			match(E);
			setState(103);
			match(IGUAL);
			setState(104);
			match(E);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(105);
				match(STRINGCOM);
				}
				break;
			case 2:
				{
				setState(106);
				match(INT);
				}
				break;
			case 3:
				{
				setState(107);
				funciones();
				}
				break;
			case 4:
				{
				setState(108);
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
			setState(111);
			match(FOR);
			setState(112);
			match(E);
			setState(113);
			match(CONTADOR);
			setState(114);
			match(E);
			setState(115);
			match(IGUAL);
			setState(116);
			match(E);
			setState(117);
			match(INT);
			setState(118);
			match(E);
			setState(119);
			match(TO);
			setState(120);
			match(E);
			setState(121);
			match(INT);
			setState(122);
			match(INTROTAB);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(123);
					condicionalif();
					}
					break;
				case PRINT:
				case LET:
					{
					setState(124);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127);
				match(INTROTAB);
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << IF))) != 0) );
			setState(133);
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
			setState(135);
			match(IF);
			setState(136);
			match(E);
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==CONTADOR || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(138);
			match(E);
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYORQUE) | (1L << MENORQUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(140);
			match(E);
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==CONTADOR || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(142);
			match(E);
			setState(143);
			match(THEN);
			setState(144);
			match(INTROTAB);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					setState(145);
					match(CONTINUE);
					}
					break;
				case EXIT:
					{
					setState(146);
					match(EXIT);
					}
					break;
				case PRINT:
				case LET:
					{
					setState(147);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150);
				match(INTROTAB);
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << CONTINUE) | (1L << EXIT))) != 0) );
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(155);
				match(ELSE);
				setState(156);
				match(INTROTAB);
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					instruccion();
					setState(158);
					match(INTROTAB);
					}
					}
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PRINT || _la==LET );
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
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
			setState(171);
			match(INPUT);
			setState(172);
			match(E);
			setState(173);
			match(STRINGCOM);
			setState(174);
			match(E);
			setState(175);
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
			setState(177);
			match(REPEAT);
			setState(178);
			match(INTROTAB);
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(179);
				instruccion();
				}
				}
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRINT || _la==LET );
			setState(184);
			match(E);
			setState(185);
			match(UNTIL);
			setState(186);
			match(E);
			setState(187);
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
		public TerminalNode CONTADOR() { return getToken(miniBParser.CONTADOR, 0); }
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
			setState(189);
			match(WHILE);
			setState(190);
			match(E);
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTADOR) | (1L << STRING) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(192);
			match(E);
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYORQUE) | (1L << MENORQUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194);
			match(E);
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
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
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
			} while ( _la==PRINT || _la==LET );
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
			setState(209);
			match(INT);
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
			setState(213);
			match(LET);
			setState(214);
			match(E);
			setState(215);
			match(IGUAL);
			setState(216);
			match(E);
			setState(217);
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
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(219);
				match(LET);
				setState(220);
				match(E);
				setState(221);
				match(STRING);
				setState(222);
				match(E);
				setState(223);
				match(IGUAL);
				setState(224);
				match(E);
				setState(225);
				match(COMILLAS);
				setState(226);
				match(INT);
				setState(227);
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
				setState(235);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRINT:
					{
					setState(228);
					match(PRINT);
					setState(229);
					match(STRING);
					setState(230);
					match(MENOS);
					}
					break;
				case MAS:
					{
					setState(231);
					match(MAS);
					}
					break;
				case ENTRE:
					{
					setState(232);
					match(ENTRE);
					}
					break;
				case POR:
					{
					setState(233);
					match(POR);
					setState(234);
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
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(239);
				match(STRING);
				setState(240);
				match(PARENTESISA);
				setState(241);
				match(COMILLAS);
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					match(INT);
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(247);
				match(COMILLAS);
				setState(248);
				match(PARENTESISC);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(249);
				match(STRING);
				setState(250);
				match(PARENTESISA);
				setState(251);
				match(STRINGCOM);
				setState(252);
				match(PARENTESISC);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(253);
				match(STRING);
				setState(254);
				match(PARENTESISA);
				setState(255);
				funciones();
				setState(256);
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
			setState(260);
			match(REM);
			setState(261);
			match(E);
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(262);
				match(STRING);
				setState(263);
				match(E);
				}
				}
				setState(266); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\5\3>\n\3\3\4\6\4A\n\4\r"+
		"\4\16\4B\3\4\6\4F\n\4\r\4\16\4G\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\5"+
		"\7d\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t\3\t\3\t\6\t\u0084"+
		"\n\t\r\t\16\t\u0085\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u0097\n\n\3\n\6\n\u009a\n\n\r\n\16\n\u009b\3\n\3\n\3\n"+
		"\3\n\3\n\6\n\u00a3\n\n\r\n\16\n\u00a4\7\n\u00a7\n\n\f\n\16\n\u00aa\13"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\6\f\u00b7\n\f\r\f"+
		"\16\f\u00b8\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00ca\n\r\3\r\3\r\6\r\u00ce\n\r\r\r\16\r\u00cf\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ee\n\20\5\20"+
		"\u00f0\n\20\3\21\3\21\3\21\3\21\6\21\u00f6\n\21\r\21\16\21\u00f7\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0105\n\21\3\22"+
		"\3\22\3\22\3\22\6\22\u010b\n\22\r\22\16\22\u010c\3\22\2\2\23\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"\2\7\4\2\5\5((\3\2\6\b\5\2\5\5##((\4\2"+
		"##((\3\2\t\r\2\u0129\2)\3\2\2\2\4=\3\2\2\2\6I\3\2\2\2\bX\3\2\2\2\n\\\3"+
		"\2\2\2\f^\3\2\2\2\16e\3\2\2\2\20q\3\2\2\2\22\u0089\3\2\2\2\24\u00ad\3"+
		"\2\2\2\26\u00b3\3\2\2\2\30\u00bf\3\2\2\2\32\u00d3\3\2\2\2\34\u00d7\3\2"+
		"\2\2\36\u00ef\3\2\2\2 \u0104\3\2\2\2\"\u0106\3\2\2\2$(\5\b\5\2%(\5\4\3"+
		"\2&(\7\'\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*\3\3\2\2\2+)\3\2\2\2,\61\7\3\2\2-\60\5\6\4\2.\60\7\'\2\2/-\3\2"+
		"\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63"+
		"\61\3\2\2\2\64>\7)\2\2\659\7\4\2\2\668\5\6\4\2\67\66\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<>\7+\2\2=,\3\2\2\2=\65\3\2"+
		"\2\2>\5\3\2\2\2?A\7*\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CJ\3\2"+
		"\2\2DF\7,\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2I@\3\2"+
		"\2\2IE\3\2\2\2J\7\3\2\2\2KY\5\16\b\2LY\5\26\f\2MY\5\20\t\2NY\5\22\n\2"+
		"OY\5\f\7\2PY\5\24\13\2QY\5\30\r\2RY\5\34\17\2SY\5\36\20\2TY\5 \21\2UV"+
		"\5\"\22\2VW\7\'\2\2WY\3\2\2\2XK\3\2\2\2XL\3\2\2\2XM\3\2\2\2XN\3\2\2\2"+
		"XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2"+
		"Y\t\3\2\2\2Z]\5\f\7\2[]\5\16\b\2\\Z\3\2\2\2\\[\3\2\2\2]\13\3\2\2\2^_\7"+
		"\23\2\2_c\7\"\2\2`d\7\5\2\2ad\5\32\16\2bd\7$\2\2c`\3\2\2\2ca\3\2\2\2c"+
		"b\3\2\2\2d\r\3\2\2\2ef\7\24\2\2fg\7\"\2\2gh\7#\2\2hi\7\"\2\2ij\7\6\2\2"+
		"jo\7\"\2\2kp\7$\2\2lp\7(\2\2mp\5 \21\2np\5\32\16\2ok\3\2\2\2ol\3\2\2\2"+
		"om\3\2\2\2on\3\2\2\2p\17\3\2\2\2qr\7\26\2\2rs\7\"\2\2st\7\5\2\2tu\7\""+
		"\2\2uv\7\6\2\2vw\7\"\2\2wx\7(\2\2xy\7\"\2\2yz\7\27\2\2z{\7\"\2\2{|\7("+
		"\2\2|\u0083\7&\2\2}\u0080\5\22\n\2~\u0080\5\n\6\2\177}\3\2\2\2\177~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7&\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\177\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2"+
		"\2\u0086\u0087\3\2\2\2\u0087\u0088\7\17\2\2\u0088\21\3\2\2\2\u0089\u008a"+
		"\7\33\2\2\u008a\u008b\7\"\2\2\u008b\u008c\t\2\2\2\u008c\u008d\7\"\2\2"+
		"\u008d\u008e\t\3\2\2\u008e\u008f\7\"\2\2\u008f\u0090\t\2\2\2\u0090\u0091"+
		"\7\"\2\2\u0091\u0092\7\34\2\2\u0092\u0099\7&\2\2\u0093\u0097\7\30\2\2"+
		"\u0094\u0097\7\31\2\2\u0095\u0097\5\n\6\2\u0096\u0093\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\7&\2\2\u0099"+
		"\u0096\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u00a8\3\2\2\2\u009d\u009e\7\32\2\2\u009e\u00a2\7&\2\2\u009f"+
		"\u00a0\5\n\6\2\u00a0\u00a1\7&\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009f\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u009d\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ac\7\16\2\2\u00ac\23\3\2\2\2\u00ad\u00ae\7\35\2\2\u00ae\u00af\7\""+
		"\2\2\u00af\u00b0\7$\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\7#\2\2\u00b2\25"+
		"\3\2\2\2\u00b3\u00b4\7\36\2\2\u00b4\u00b6\7&\2\2\u00b5\u00b7\5\n\6\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\7\37\2\2\u00bc"+
		"\u00bd\7\"\2\2\u00bd\u00be\5\16\b\2\u00be\27\3\2\2\2\u00bf\u00c0\7 \2"+
		"\2\u00c0\u00c1\7\"\2\2\u00c1\u00c2\t\4\2\2\u00c2\u00c3\7\"\2\2\u00c3\u00c4"+
		"\t\3\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c6\t\5\2\2\u00c6\u00cd\7&\2\2\u00c7"+
		"\u00ca\5\n\6\2\u00c8\u00ca\5\16\b\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7&\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00c9\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\16\2\2\u00d2\31\3\2\2\2\u00d3\u00d4"+
		"\7(\2\2\u00d4\u00d5\t\6\2\2\u00d5\u00d6\7(\2\2\u00d6\33\3\2\2\2\u00d7"+
		"\u00d8\7\24\2\2\u00d8\u00d9\7\"\2\2\u00d9\u00da\7\6\2\2\u00da\u00db\7"+
		"\"\2\2\u00db\u00dc\7(\2\2\u00dc\35\3\2\2\2\u00dd\u00de\7\24\2\2\u00de"+
		"\u00df\7\"\2\2\u00df\u00e0\7#\2\2\u00e0\u00e1\7\"\2\2\u00e1\u00e2\7\6"+
		"\2\2\u00e2\u00e3\7\"\2\2\u00e3\u00e4\7\22\2\2\u00e4\u00e5\7(\2\2\u00e5"+
		"\u00f0\7\22\2\2\u00e6\u00e7\7\23\2\2\u00e7\u00e8\7#\2\2\u00e8\u00ee\7"+
		"\n\2\2\u00e9\u00ee\7\t\2\2\u00ea\u00ee\7\f\2\2\u00eb\u00ec\7\13\2\2\u00ec"+
		"\u00ee\7(\2\2\u00ed\u00e6\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00dd\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\37\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2\u00f3\7\20\2"+
		"\2\u00f3\u00f5\7\22\2\2\u00f4\u00f6\7(\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\7\22\2\2\u00fa\u0105\7\21\2\2\u00fb\u00fc\7#\2\2\u00fc\u00fd\7"+
		"\20\2\2\u00fd\u00fe\7$\2\2\u00fe\u0105\7\21\2\2\u00ff\u0100\7#\2\2\u0100"+
		"\u0101\7\20\2\2\u0101\u0102\5 \21\2\u0102\u0103\7\21\2\2\u0103\u0105\3"+
		"\2\2\2\u0104\u00f1\3\2\2\2\u0104\u00fb\3\2\2\2\u0104\u00ff\3\2\2\2\u0105"+
		"!\3\2\2\2\u0106\u0107\7!\2\2\u0107\u010a\7\"\2\2\u0108\u0109\7#\2\2\u0109"+
		"\u010b\7\"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d#\3\2\2\2\35\')/\619=BGIX\\co\177\u0085"+
		"\u0096\u009b\u00a4\u00a8\u00b8\u00c9\u00cf\u00ed\u00ef\u00f7\u0104\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}