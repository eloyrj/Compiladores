// Generated from /home/corte/Documentos/Repositorios/Compiladores/Practicas/Practica2/miniB/miniBParser.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
			null, "'/*'", "'//'", "' '", "'='", "'>'", "'<'", "'+'", "'-'", "'*'", 
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
		public TerminalNode E() { return getToken(miniBParser.E, 0); }
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
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(PRINT);
			setState(95);
			match(E);
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(96);
				funciones();
				}
				break;
			case 2:
				{
				setState(97);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(98);
				operacion();
				}
				break;
			case 4:
				{
				setState(99);
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
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(LET);
			setState(103);
			match(E);
			setState(104);
			match(STRING);
			setState(105);
			match(E);
			setState(106);
			match(IGUAL);
			setState(107);
			match(E);
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(108);
				match(STRINGCOM);
				}
				break;
			case 2:
				{
				setState(109);
				match(INT);
				}
				break;
			case 3:
				{
				setState(110);
				funciones();
				}
				break;
			case 4:
				{
				setState(111);
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
		public List<TerminalNode> E() { return getTokens(miniBParser.E); }
		public TerminalNode E(int i) {
			return getToken(miniBParser.E, i);
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
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(STRING);
			setState(115);
			match(E);
			setState(116);
			match(IGUAL);
			setState(117);
			match(E);
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(118);
				funciones();
				}
				break;
			case 2:
				{
				setState(119);
				operacion();
				}
				break;
			case 3:
				{
				{
				setState(120);
				match(STRING);
				setState(121);
				match(E);
				setState(122);
				match(MOD);
				setState(123);
				match(E);
				setState(124);
				match(STRING);
				}
				}
				break;
			case 4:
				{
				setState(125);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(126);
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
		public List<TerminalNode> E() { return getTokens(miniBParser.E); }
		public TerminalNode E(int i) {
			return getToken(miniBParser.E, i);
		}
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
	}

	public final BucleforContext buclefor() throws RecognitionException {
		BucleforContext _localctx = new BucleforContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_buclefor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(FOR);
			setState(130);
			match(E);
			setState(131);
			match(STRING);
			setState(132);
			match(E);
			setState(133);
			match(IGUAL);
			setState(134);
			match(E);
			setState(135);
			match(INT);
			setState(136);
			match(E);
			setState(137);
			match(TO);
			setState(138);
			match(E);
			setState(139);
			match(INT);
			setState(140);
			match(INTROTAB);
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(141);
					condicionalif();
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(142);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(145);
				match(INTROTAB);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << IF) | (1L << STRING))) != 0) );
			setState(151);
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
	}

	public final CondicionalifContext condicionalif() throws RecognitionException {
		CondicionalifContext _localctx = new CondicionalifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicionalif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IF);
			setState(154);
			match(E);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				{
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				match(E);
				setState(157);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYORQUE) | (1L << MENORQUE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				match(E);
				setState(159);
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
				setState(160);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(161);
				match(INT);
				}
				break;
			}
			setState(164);
			match(E);
			setState(165);
			match(THEN);
			setState(166);
			match(INTROTAB);
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					setState(167);
					match(CONTINUE);
					}
					break;
				case EXIT:
					{
					setState(168);
					match(EXIT);
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(169);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(172);
				match(INTROTAB);
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << CONTINUE) | (1L << EXIT) | (1L << STRING))) != 0) );
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(177);
				match(ELSE);
				setState(178);
				match(INTROTAB);
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(179);
					instruccion();
					setState(180);
					match(INTROTAB);
					}
					}
					setState(184); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
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
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(INPUT);
			setState(194);
			match(E);
			setState(195);
			match(STRINGCOM);
			setState(196);
			match(E);
			setState(197);
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
		public TerminalNode E() { return getToken(miniBParser.E, 0); }
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
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(REPEAT);
			setState(200);
			match(INTROTAB);
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				instruccion();
				setState(202);
				match(INTROTAB);
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(208);
			match(UNTIL);
			setState(209);
			match(E);
			setState(210);
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
	}

	public final BuclewhileContext buclewhile() throws RecognitionException {
		BuclewhileContext _localctx = new BuclewhileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_buclewhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(WHILE);
			setState(213);
			match(E);
			setState(214);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(215);
			match(E);
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYORQUE) | (1L << MENORQUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(217);
			match(E);
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(219);
			match(INTROTAB);
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(220);
					instruccion();
					}
					break;
				case 2:
					{
					setState(221);
					let();
					}
					break;
				}
				setState(224);
				match(INTROTAB);
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(230);
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
		public List<TerminalNode> E() { return getTokens(miniBParser.E); }
		public TerminalNode E(int i) {
			return getToken(miniBParser.E, i);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << STRINGCOM) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(233);
				match(E);
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR) | (1L << ENTRE) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(240);
				match(E);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
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
	}

	public final ErrorsintacticoContext errorsintactico() throws RecognitionException {
		ErrorsintacticoContext _localctx = new ErrorsintacticoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_errorsintactico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(LET);
			setState(249);
			match(E);
			setState(250);
			match(IGUAL);
			setState(251);
			match(E);
			setState(252);
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
	}

	public final ErrortipoContext errortipo() throws RecognitionException {
		ErrortipoContext _localctx = new ErrortipoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_errortipo);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(254);
				match(LET);
				setState(255);
				match(E);
				setState(256);
				match(STRING);
				setState(257);
				match(E);
				setState(258);
				match(IGUAL);
				setState(259);
				match(E);
				setState(260);
				match(COMILLAS);
				setState(261);
				match(INT);
				setState(262);
				match(COMILLAS);
				}
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(263);
				match(PRINT);
				setState(264);
				match(E);
				setState(265);
				match(STRING);
				setState(266);
				match(E);
				setState(267);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR) | (1L << ENTRE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(268);
				match(E);
				setState(269);
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
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funciones);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(272);
				match(STRING);
				setState(273);
				match(PARENTESISA);
				setState(274);
				match(COMILLAS);
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(275);
					match(INT);
					}
					}
					setState(278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(280);
				match(COMILLAS);
				setState(281);
				match(PARENTESISC);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(282);
				match(STRING);
				setState(283);
				match(PARENTESISA);
				setState(284);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==STRINGCOM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(285);
				match(PARENTESISC);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(286);
				match(STRING);
				setState(287);
				match(PARENTESISA);
				setState(288);
				funciones();
				setState(289);
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
	}

	public final RemContext rem() throws RecognitionException {
		RemContext _localctx = new RemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(REM);
			setState(294);
			match(E);
			setState(302); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(295);
					match(STRING);
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==E) {
						{
						{
						setState(296);
						match(E);
						}
						}
						setState(301);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(304); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0135\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\3\7\3\62\n\3"+
		"\f\3\16\3\65\13\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\5\3@\n\3\3\4"+
		"\6\4C\n\4\r\4\16\4D\3\4\6\4H\n\4\r\4\16\4I\5\4L\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7g\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bs\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0092\n\n\3"+
		"\n\3\n\6\n\u0096\n\n\r\n\16\n\u0097\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00a5\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00ad\n\13\3\13\6\13\u00b0\n\13\r\13\16\13\u00b1\3\13\3\13\3\13\3\13"+
		"\3\13\6\13\u00b9\n\13\r\13\16\13\u00ba\7\13\u00bd\n\13\f\13\16\13\u00c0"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\6\r\u00cf"+
		"\n\r\r\r\16\r\u00d0\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00e1\n\16\3\16\3\16\6\16\u00e5\n\16\r\16\16\16\u00e6"+
		"\3\16\3\16\3\17\3\17\7\17\u00ed\n\17\f\17\16\17\u00f0\13\17\3\17\3\17"+
		"\7\17\u00f4\n\17\f\17\16\17\u00f7\13\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0111\n\21\3\22\3\22\3\22\3\22\6\22\u0117\n"+
		"\22\r\22\16\22\u0118\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0126\n\22\3\23\3\23\3\23\3\23\7\23\u012c\n\23\f\23\16\23\u012f"+
		"\13\23\6\23\u0131\n\23\r\23\16\23\u0132\3\23\2\2\24\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$\2\b\4\2\"\"\'\'\3\2\6\b\4\2\"#\'\'\3\2\t\r\3"+
		"\2\t\f\3\2\"#\2\u0157\2+\3\2\2\2\4?\3\2\2\2\6K\3\2\2\2\bY\3\2\2\2\n^\3"+
		"\2\2\2\f`\3\2\2\2\16h\3\2\2\2\20t\3\2\2\2\22\u0083\3\2\2\2\24\u009b\3"+
		"\2\2\2\26\u00c3\3\2\2\2\30\u00c9\3\2\2\2\32\u00d6\3\2\2\2\34\u00ea\3\2"+
		"\2\2\36\u00fa\3\2\2\2 \u0110\3\2\2\2\"\u0125\3\2\2\2$\u0127\3\2\2\2&*"+
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
		"\\\3\2\2\2^]\3\2\2\2_\13\3\2\2\2`a\7\23\2\2af\7\5\2\2bg\5\"\22\2cg\7\""+
		"\2\2dg\5\34\17\2eg\7#\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\r\3"+
		"\2\2\2hi\7\24\2\2ij\7\5\2\2jk\7\"\2\2kl\7\5\2\2lm\7\6\2\2mr\7\5\2\2ns"+
		"\7#\2\2os\7\'\2\2ps\5\"\22\2qs\5\34\17\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2"+
		"rq\3\2\2\2s\17\3\2\2\2tu\7\"\2\2uv\7\5\2\2vw\7\6\2\2w\u0081\7\5\2\2x\u0082"+
		"\5\"\22\2y\u0082\5\34\17\2z{\7\"\2\2{|\7\5\2\2|}\7\r\2\2}~\7\5\2\2~\u0082"+
		"\7\"\2\2\177\u0082\7\"\2\2\u0080\u0082\7\'\2\2\u0081x\3\2\2\2\u0081y\3"+
		"\2\2\2\u0081z\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\21\3"+
		"\2\2\2\u0083\u0084\7\26\2\2\u0084\u0085\7\5\2\2\u0085\u0086\7\"\2\2\u0086"+
		"\u0087\7\5\2\2\u0087\u0088\7\6\2\2\u0088\u0089\7\5\2\2\u0089\u008a\7\'"+
		"\2\2\u008a\u008b\7\5\2\2\u008b\u008c\7\27\2\2\u008c\u008d\7\5\2\2\u008d"+
		"\u008e\7\'\2\2\u008e\u0095\7%\2\2\u008f\u0092\5\24\13\2\u0090\u0092\5"+
		"\n\6\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\7%\2\2\u0094\u0096\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\7\17\2\2\u009a\23\3\2\2\2\u009b\u009c\7\33\2\2\u009c\u00a4\7\5"+
		"\2\2\u009d\u009e\t\2\2\2\u009e\u009f\7\5\2\2\u009f\u00a0\t\3\2\2\u00a0"+
		"\u00a1\7\5\2\2\u00a1\u00a5\t\2\2\2\u00a2\u00a5\7\"\2\2\u00a3\u00a5\7\'"+
		"\2\2\u00a4\u009d\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\7\5\2\2\u00a7\u00a8\7\34\2\2\u00a8\u00af\7"+
		"%\2\2\u00a9\u00ad\7\30\2\2\u00aa\u00ad\7\31\2\2\u00ab\u00ad\5\n\6\2\u00ac"+
		"\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b0\7%\2\2\u00af\u00ac\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00be\3\2\2\2\u00b3\u00b4\7\32"+
		"\2\2\u00b4\u00b8\7%\2\2\u00b5\u00b6\5\n\6\2\u00b6\u00b7\7%\2\2\u00b7\u00b9"+
		"\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b3\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\7\16\2\2\u00c2\25\3\2\2\2\u00c3\u00c4\7\35"+
		"\2\2\u00c4\u00c5\7\5\2\2\u00c5\u00c6\7#\2\2\u00c6\u00c7\7\5\2\2\u00c7"+
		"\u00c8\7\"\2\2\u00c8\27\3\2\2\2\u00c9\u00ca\7\36\2\2\u00ca\u00ce\7%\2"+
		"\2\u00cb\u00cc\5\n\6\2\u00cc\u00cd\7%\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cb"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\7\37\2\2\u00d3\u00d4\7\5\2\2\u00d4\u00d5\5"+
		"\n\6\2\u00d5\31\3\2\2\2\u00d6\u00d7\7 \2\2\u00d7\u00d8\7\5\2\2\u00d8\u00d9"+
		"\t\2\2\2\u00d9\u00da\7\5\2\2\u00da\u00db\t\3\2\2\u00db\u00dc\7\5\2\2\u00dc"+
		"\u00dd\t\2\2\2\u00dd\u00e4\7%\2\2\u00de\u00e1\5\n\6\2\u00df\u00e1\5\16"+
		"\b\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7%\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\7\16\2\2\u00e9\33\3\2\2\2\u00ea\u00ee\t\4\2\2\u00eb\u00ed\7\5\2"+
		"\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f5\t\5\2\2\u00f2"+
		"\u00f4\7\5\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\t\4\2\2\u00f9\35\3\2\2\2\u00fa\u00fb\7\24\2\2\u00fb\u00fc\7\5\2"+
		"\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\7\5\2\2\u00fe\u00ff\7\'\2\2\u00ff\37"+
		"\3\2\2\2\u0100\u0101\7\24\2\2\u0101\u0102\7\5\2\2\u0102\u0103\7\"\2\2"+
		"\u0103\u0104\7\5\2\2\u0104\u0105\7\6\2\2\u0105\u0106\7\5\2\2\u0106\u0107"+
		"\7\22\2\2\u0107\u0108\7\'\2\2\u0108\u0111\7\22\2\2\u0109\u010a\7\23\2"+
		"\2\u010a\u010b\7\5\2\2\u010b\u010c\7\"\2\2\u010c\u010d\7\5\2\2\u010d\u010e"+
		"\t\6\2\2\u010e\u010f\7\5\2\2\u010f\u0111\7\'\2\2\u0110\u0100\3\2\2\2\u0110"+
		"\u0109\3\2\2\2\u0111!\3\2\2\2\u0112\u0113\7\"\2\2\u0113\u0114\7\20\2\2"+
		"\u0114\u0116\7\22\2\2\u0115\u0117\7\'\2\2\u0116\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\7\22\2\2\u011b\u0126\7\21\2\2\u011c\u011d\7\"\2\2\u011d\u011e\7"+
		"\20\2\2\u011e\u011f\t\7\2\2\u011f\u0126\7\21\2\2\u0120\u0121\7\"\2\2\u0121"+
		"\u0122\7\20\2\2\u0122\u0123\5\"\22\2\u0123\u0124\7\21\2\2\u0124\u0126"+
		"\3\2\2\2\u0125\u0112\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u0120\3\2\2\2\u0126"+
		"#\3\2\2\2\u0127\u0128\7!\2\2\u0128\u0130\7\5\2\2\u0129\u012d\7\"\2\2\u012a"+
		"\u012c\7\5\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0129\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133%\3\2\2\2!)+\61\63;?DIKY^fr\u0081\u0091\u0097\u00a4\u00ac\u00b1"+
		"\u00ba\u00be\u00d0\u00e0\u00e6\u00ee\u00f5\u0110\u0118\u0125\u012d\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}