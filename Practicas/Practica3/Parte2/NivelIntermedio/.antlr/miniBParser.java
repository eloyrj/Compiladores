// Generated from /home/corte/Documentos/Repositorios/Compiladores/Practicas/Practica3/Parte2/NivelIntermedio/miniB.g4 by ANTLR 4.8
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
		E=1, PUNTOS=2, IGUAL=3, MAYORQUE=4, MENORQUE=5, MAS=6, MENOS=7, POR=8, 
		ENTRE=9, MOD=10, PUNTOCOMA=11, COMA=12, END=13, NEXT=14, CORCHETEA=15, 
		CORCHETEC=16, PARENTESISA=17, PARENTESISC=18, COMILLAS=19, PRINT=20, LET=21, 
		NOTNUMBER=22, FOR=23, TO=24, CONTINUE=25, EXIT=26, ELSE=27, IF=28, THEN=29, 
		INPUT=30, REPEAT=31, UNTIL=32, WHILE=33, REM=34, DEF=35, RETURN=36, IN=37, 
		STRING=38, STRINGCOM=39, INTRO=40, INT=41, BOOLEANT=42, BOOLEANF=43, PUNTO=44;
	public static final int
		RULE_fichero = 0, RULE_prog = 1, RULE_instruccion = 2, RULE_print = 3, 
		RULE_let = 4, RULE_asignacion = 5, RULE_buclefor = 6, RULE_condicionalif = 7, 
		RULE_input = 8, RULE_repeat = 9, RULE_buclewhile = 10, RULE_operacion = 11, 
		RULE_sumandos = 12, RULE_errorsintactico = 13, RULE_errortipo = 14, RULE_funciones = 15, 
		RULE_rem = 16, RULE_posiblesReturn = 17, RULE_defFuncion = 18, RULE_subrutina = 19, 
		RULE_sumarcadenas = 20, RULE_copiarcadenas = 21, RULE_accesoposicioncadena = 22, 
		RULE_segmentocadena = 23, RULE_flotante = 24, RULE_booleano = 25, RULE_array = 26, 
		RULE_enteros = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"fichero", "prog", "instruccion", "print", "let", "asignacion", "buclefor", 
			"condicionalif", "input", "repeat", "buclewhile", "operacion", "sumandos", 
			"errorsintactico", "errortipo", "funciones", "rem", "posiblesReturn", 
			"defFuncion", "subrutina", "sumarcadenas", "copiarcadenas", "accesoposicioncadena", 
			"segmentocadena", "flotante", "booleano", "array", "enteros"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "':'", "'='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", null, 
			"'.'", "','", null, null, "'['", "']'", "'('", "')'", "'\"'", null, null, 
			"'NOT A NUMBER'", null, null, null, null, null, null, null, null, null, 
			null, null, "'REM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "E", "PUNTOS", "IGUAL", "MAYORQUE", "MENORQUE", "MAS", "MENOS", 
			"POR", "ENTRE", "MOD", "PUNTOCOMA", "COMA", "END", "NEXT", "CORCHETEA", 
			"CORCHETEC", "PARENTESISA", "PARENTESISC", "COMILLAS", "PRINT", "LET", 
			"NOTNUMBER", "FOR", "TO", "CONTINUE", "EXIT", "ELSE", "IF", "THEN", "INPUT", 
			"REPEAT", "UNTIL", "WHILE", "REM", "DEF", "RETURN", "IN", "STRING", "STRINGCOM", 
			"INTRO", "INT", "BOOLEANT", "BOOLEANF", "PUNTO"
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
	public String getGrammarFileName() { return "miniB.g4"; }

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
		public List<TerminalNode> INTRO() { return getTokens(miniBParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(miniBParser.INTRO, i);
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
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << REPEAT) | (1L << WHILE) | (1L << REM) | (1L << STRING) | (1L << STRINGCOM) | (1L << INTRO) | (1L << INT))) != 0)) {
				{
				setState(58);
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
				case STRINGCOM:
				case INT:
					{
					setState(56);
					prog();
					}
					break;
				case INTRO:
					{
					setState(57);
					match(INTRO);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(63);
				let();
				}
				break;
			case 2:
				{
				setState(64);
				repeat();
				}
				break;
			case 3:
				{
				setState(65);
				buclefor();
				}
				break;
			case 4:
				{
				setState(66);
				condicionalif();
				}
				break;
			case 5:
				{
				setState(67);
				print();
				}
				break;
			case 6:
				{
				setState(68);
				input();
				}
				break;
			case 7:
				{
				setState(69);
				buclewhile();
				}
				break;
			case 8:
				{
				setState(70);
				errorsintactico();
				}
				break;
			case 9:
				{
				setState(71);
				errortipo();
				}
				break;
			case 10:
				{
				setState(72);
				funciones();
				}
				break;
			case 11:
				{
				setState(73);
				rem();
				}
				break;
			case 12:
				{
				setState(74);
				asignacion();
				}
				break;
			case 13:
				{
				setState(75);
				operacion(0);
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
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	 
		public InstruccionContext() { }
		public void copyFrom(InstruccionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InstContext extends InstruccionContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public InstContext(InstruccionContext ctx) { copyFrom(ctx); }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			_localctx = new InstContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				{
				setState(78);
				print();
				}
				break;
			case LET:
				{
				setState(79);
				let();
				}
				break;
			case STRING:
				{
				setState(80);
				asignacion();
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImprimirContext extends PrintContext {
		public Token impComillas;
		public Token ps;
		public FuncionesContext pf;
		public OperacionContext po;
		public TerminalNode PRINT() { return getToken(miniBParser.PRINT, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public ImprimirContext(PrintContext ctx) { copyFrom(ctx); }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			_localctx = new ImprimirContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(PRINT);
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(84);
				((ImprimirContext)_localctx).impComillas = match(STRINGCOM);
				}
				break;
			case 2:
				{
				setState(85);
				((ImprimirContext)_localctx).ps = match(STRING);
				}
				break;
			case 3:
				{
				setState(86);
				((ImprimirContext)_localctx).pf = funciones();
				}
				break;
			case 4:
				{
				setState(87);
				((ImprimirContext)_localctx).po = operacion(0);
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
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
	 
		public LetContext() { }
		public void copyFrom(LetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LETTContext extends LetContext {
		public Token nombre;
		public Token valors;
		public Token valori;
		public FuncionesContext valorf;
		public TerminalNode LET() { return getToken(miniBParser.LET, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public LETTContext(LetContext ctx) { copyFrom(ctx); }
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_let);
		try {
			_localctx = new LETTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(LET);
			setState(91);
			((LETTContext)_localctx).nombre = match(STRING);
			setState(92);
			match(IGUAL);
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGCOM:
				{
				setState(93);
				((LETTContext)_localctx).valors = match(STRINGCOM);
				}
				break;
			case INT:
				{
				setState(94);
				((LETTContext)_localctx).valori = match(INT);
				}
				break;
			case STRING:
				{
				setState(95);
				((LETTContext)_localctx).valorf = funciones();
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

	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	 
		public AsignacionContext() { }
		public void copyFrom(AsignacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignarContext extends AsignacionContext {
		public Token nombre;
		public Token str;
		public Token numero;
		public FuncionesContext f;
		public OperacionContext op;
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public AsignarContext(AsignacionContext ctx) { copyFrom(ctx); }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			_localctx = new AsignarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			((AsignarContext)_localctx).nombre = match(STRING);
			setState(99);
			match(IGUAL);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(100);
				((AsignarContext)_localctx).str = match(STRING);
				}
				break;
			case 2:
				{
				setState(101);
				((AsignarContext)_localctx).numero = match(INT);
				}
				break;
			case 3:
				{
				setState(102);
				((AsignarContext)_localctx).f = funciones();
				}
				break;
			case 4:
				{
				setState(103);
				((AsignarContext)_localctx).op = operacion(0);
				}
				break;
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

	public static class BucleforContext extends ParserRuleContext {
		public BucleforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buclefor; }
	 
		public BucleforContext() { }
		public void copyFrom(BucleforContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForContext extends BucleforContext {
		public Token variableFor;
		public Token valorFor;
		public Token igualacion;
		public TerminalNode FOR() { return getToken(miniBParser.FOR, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public TerminalNode TO() { return getToken(miniBParser.TO, 0); }
		public List<TerminalNode> INTRO() { return getTokens(miniBParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(miniBParser.INTRO, i);
		}
		public TerminalNode NEXT() { return getToken(miniBParser.NEXT, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public List<TerminalNode> INT() { return getTokens(miniBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(miniBParser.INT, i);
		}
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
		public ForContext(BucleforContext ctx) { copyFrom(ctx); }
	}

	public final BucleforContext buclefor() throws RecognitionException {
		BucleforContext _localctx = new BucleforContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_buclefor);
		int _la;
		try {
			_localctx = new ForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(106);
			match(FOR);
			setState(107);
			((ForContext)_localctx).variableFor = match(STRING);
			setState(108);
			match(IGUAL);
			setState(109);
			((ForContext)_localctx).valorFor = match(INT);
			setState(110);
			match(TO);
			setState(111);
			((ForContext)_localctx).igualacion = match(INT);
			setState(112);
			match(INTRO);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(113);
					condicionalif();
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(114);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(117);
				match(INTRO);
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << IF) | (1L << STRING))) != 0) );
			setState(123);
			match(NEXT);
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

	public static class CondicionalifContext extends ParserRuleContext {
		public CondicionalifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalif; }
	 
		public CondicionalifContext() { }
		public void copyFrom(CondicionalifContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfContext extends CondicionalifContext {
		public Token op1if;
		public Token comparador;
		public Token op2if;
		public Token conti;
		public Token exit;
		public InstruccionContext inst1;
		public InstruccionContext inst2;
		public TerminalNode IF() { return getToken(miniBParser.IF, 0); }
		public TerminalNode THEN() { return getToken(miniBParser.THEN, 0); }
		public List<TerminalNode> INTRO() { return getTokens(miniBParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(miniBParser.INTRO, i);
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
		public IfContext(CondicionalifContext ctx) { copyFrom(ctx); }
	}

	public final CondicionalifContext condicionalif() throws RecognitionException {
		CondicionalifContext _localctx = new CondicionalifContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicionalif);
		int _la;
		try {
			_localctx = new IfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IF);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(126);
				((IfContext)_localctx).op1if = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==INT) ) {
					((IfContext)_localctx).op1if = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				((IfContext)_localctx).comparador = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYORQUE) | (1L << MENORQUE))) != 0)) ) {
					((IfContext)_localctx).comparador = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				((IfContext)_localctx).op2if = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==INT) ) {
					((IfContext)_localctx).op2if = (Token)_errHandler.recoverInline(this);
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
				setState(129);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(130);
				match(INT);
				}
				break;
			}
			setState(133);
			match(THEN);
			setState(134);
			match(INTRO);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					setState(135);
					((IfContext)_localctx).conti = match(CONTINUE);
					}
					break;
				case EXIT:
					{
					setState(136);
					((IfContext)_localctx).exit = match(EXIT);
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(137);
					((IfContext)_localctx).inst1 = instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(140);
				match(INTRO);
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << CONTINUE) | (1L << EXIT) | (1L << STRING))) != 0) );
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(145);
				match(ELSE);
				setState(146);
				match(INTRO);
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					((IfContext)_localctx).inst2 = instruccion();
					setState(148);
					match(INTRO);
					}
					}
					setState(152); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntroducirContext extends InputContext {
		public Token paraImprimir;
		public Token variable;
		public TerminalNode INPUT() { return getToken(miniBParser.INPUT, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public IntroducirContext(InputContext ctx) { copyFrom(ctx); }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_input);
		try {
			_localctx = new IntroducirContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(161);
			match(INPUT);
			setState(162);
			((IntroducirContext)_localctx).paraImprimir = match(STRINGCOM);
			setState(163);
			((IntroducirContext)_localctx).variable = match(STRING);
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

	public static class RepeatContext extends ParserRuleContext {
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
	 
		public RepeatContext() { }
		public void copyFrom(RepeatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RepetirContext extends RepeatContext {
		public Token var;
		public Token Var2;
		public TerminalNode REPEAT() { return getToken(miniBParser.REPEAT, 0); }
		public List<TerminalNode> INTRO() { return getTokens(miniBParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(miniBParser.INTRO, i);
		}
		public TerminalNode UNTIL() { return getToken(miniBParser.UNTIL, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public RepetirContext(RepeatContext ctx) { copyFrom(ctx); }
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repeat);
		int _la;
		try {
			_localctx = new RepetirContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			match(REPEAT);
			setState(166);
			match(INTRO);
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				instruccion();
				setState(168);
				match(INTRO);
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(174);
			match(UNTIL);
			setState(175);
			((RepetirContext)_localctx).var = match(STRING);
			setState(176);
			match(IGUAL);
			setState(177);
			((RepetirContext)_localctx).Var2 = match(INT);
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

	public static class BuclewhileContext extends ParserRuleContext {
		public BuclewhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buclewhile; }
	 
		public BuclewhileContext() { }
		public void copyFrom(BuclewhileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileContext extends BuclewhileContext {
		public Token v1;
		public Token operador;
		public Token v2;
		public TerminalNode WHILE() { return getToken(miniBParser.WHILE, 0); }
		public List<TerminalNode> INTRO() { return getTokens(miniBParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(miniBParser.INTRO, i);
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
		public WhileContext(BuclewhileContext ctx) { copyFrom(ctx); }
	}

	public final BuclewhileContext buclewhile() throws RecognitionException {
		BuclewhileContext _localctx = new BuclewhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_buclewhile);
		int _la;
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(WHILE);
			setState(180);
			((WhileContext)_localctx).v1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
				((WhileContext)_localctx).v1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(181);
			((WhileContext)_localctx).operador = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYORQUE) | (1L << MENORQUE))) != 0)) ) {
				((WhileContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(182);
			((WhileContext)_localctx).v2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
				((WhileContext)_localctx).v2 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(183);
			match(INTRO);
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(184);
					instruccion();
					}
					break;
				case 2:
					{
					setState(185);
					let();
					}
					break;
				}
				setState(188);
				match(INTRO);
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(194);
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
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
	 
		public OperacionContext() { }
		public void copyFrom(OperacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OPERACIONESContext extends OperacionContext {
		public OperacionContext left;
		public Token operador;
		public SumandosContext right;
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public SumandosContext sumandos() {
			return getRuleContext(SumandosContext.class,0);
		}
		public TerminalNode MAS() { return getToken(miniBParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(miniBParser.MENOS, 0); }
		public TerminalNode POR() { return getToken(miniBParser.POR, 0); }
		public TerminalNode ENTRE() { return getToken(miniBParser.ENTRE, 0); }
		public TerminalNode MOD() { return getToken(miniBParser.MOD, 0); }
		public OPERACIONESContext(OperacionContext ctx) { copyFrom(ctx); }
	}
	public static class NumberESContext extends OperacionContext {
		public SumandosContext number;
		public SumandosContext sumandos() {
			return getRuleContext(SumandosContext.class,0);
		}
		public NumberESContext(OperacionContext ctx) { copyFrom(ctx); }
	}

	public final OperacionContext operacion() throws RecognitionException {
		return operacion(0);
	}

	private OperacionContext operacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacionContext _localctx = new OperacionContext(_ctx, _parentState);
		OperacionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_operacion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NumberESContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(197);
			((NumberESContext)_localctx).number = sumandos();
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OPERACIONESContext(new OperacionContext(_parentctx, _parentState));
					((OPERACIONESContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_operacion);
					setState(199);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(200);
					((OPERACIONESContext)_localctx).operador = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR) | (1L << ENTRE) | (1L << MOD))) != 0)) ) {
						((OPERACIONESContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(201);
					((OPERACIONESContext)_localctx).right = sumandos();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class SumandosContext extends ParserRuleContext {
		public Token strc;
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public SumandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumandos; }
	}

	public final SumandosContext sumandos() throws RecognitionException {
		SumandosContext _localctx = new SumandosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sumandos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(207);
				match(INT);
				}
				break;
			case STRINGCOM:
				{
				setState(208);
				((SumandosContext)_localctx).strc = match(STRINGCOM);
				}
				break;
			case STRING:
				{
				setState(209);
				match(STRING);
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

	public static class ErrorsintacticoContext extends ParserRuleContext {
		public ErrorsintacticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorsintactico; }
	 
		public ErrorsintacticoContext() { }
		public void copyFrom(ErrorsintacticoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ESintacticoContext extends ErrorsintacticoContext {
		public TerminalNode LET() { return getToken(miniBParser.LET, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public TerminalNode FOR() { return getToken(miniBParser.FOR, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public List<TerminalNode> INTRO() { return getTokens(miniBParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(miniBParser.INTRO, i);
		}
		public TerminalNode NEXT() { return getToken(miniBParser.NEXT, 0); }
		public TerminalNode WHILE() { return getToken(miniBParser.WHILE, 0); }
		public TerminalNode END() { return getToken(miniBParser.END, 0); }
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
		public List<LetContext> let() {
			return getRuleContexts(LetContext.class);
		}
		public LetContext let(int i) {
			return getRuleContext(LetContext.class,i);
		}
		public ESintacticoContext(ErrorsintacticoContext ctx) { copyFrom(ctx); }
	}

	public final ErrorsintacticoContext errorsintactico() throws RecognitionException {
		ErrorsintacticoContext _localctx = new ErrorsintacticoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_errorsintactico);
		int _la;
		try {
			_localctx = new ESintacticoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				setState(212);
				match(LET);
				setState(213);
				match(IGUAL);
				setState(214);
				match(INT);
				}
				break;
			case FOR:
				{
				setState(215);
				match(FOR);
				setState(216);
				match(STRING);
				setState(217);
				match(INTRO);
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(220);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
						{
						setState(218);
						condicionalif();
						}
						break;
					case PRINT:
					case LET:
					case STRING:
						{
						setState(219);
						instruccion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(222);
					match(INTRO);
					}
					}
					setState(226); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << IF) | (1L << STRING))) != 0) );
				setState(228);
				match(NEXT);
				}
				break;
			case WHILE:
				{
				setState(230);
				match(WHILE);
				setState(231);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				match(INTRO);
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(233);
						instruccion();
						}
						break;
					case 2:
						{
						setState(234);
						let();
						}
						break;
					}
					setState(237);
					match(INTRO);
					}
					}
					setState(241); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
				setState(243);
				match(END);
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

	public static class ErrortipoContext extends ParserRuleContext {
		public ErrortipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errortipo; }
	 
		public ErrortipoContext() { }
		public void copyFrom(ErrortipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ETipoContext extends ErrortipoContext {
		public TerminalNode LET() { return getToken(miniBParser.LET, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public List<TerminalNode> COMILLAS() { return getTokens(miniBParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(miniBParser.COMILLAS, i);
		}
		public List<TerminalNode> INT() { return getTokens(miniBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(miniBParser.INT, i);
		}
		public TerminalNode PRINT() { return getToken(miniBParser.PRINT, 0); }
		public TerminalNode PARENTESISA() { return getToken(miniBParser.PARENTESISA, 0); }
		public TerminalNode PARENTESISC() { return getToken(miniBParser.PARENTESISC, 0); }
		public TerminalNode MENOS() { return getToken(miniBParser.MENOS, 0); }
		public TerminalNode MAS() { return getToken(miniBParser.MAS, 0); }
		public TerminalNode ENTRE() { return getToken(miniBParser.ENTRE, 0); }
		public TerminalNode POR() { return getToken(miniBParser.POR, 0); }
		public ETipoContext(ErrortipoContext ctx) { copyFrom(ctx); }
	}

	public final ErrortipoContext errortipo() throws RecognitionException {
		ErrortipoContext _localctx = new ErrortipoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_errortipo);
		int _la;
		try {
			_localctx = new ETipoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				{
				setState(247);
				match(LET);
				setState(248);
				match(STRING);
				setState(249);
				match(IGUAL);
				setState(250);
				match(COMILLAS);
				setState(251);
				match(INT);
				setState(252);
				match(COMILLAS);
				}
				}
				break;
			case PRINT:
				{
				{
				setState(253);
				match(PRINT);
				setState(254);
				match(STRING);
				setState(255);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR) | (1L << ENTRE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				match(INT);
				}
				}
				break;
			case STRING:
				{
				{
				setState(257);
				match(STRING);
				setState(258);
				match(PARENTESISA);
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(259);
					match(INT);
					}
					}
					setState(262); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(264);
				match(PARENTESISC);
				}
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

	public static class FuncionesContext extends ParserRuleContext {
		public FuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones; }
	 
		public FuncionesContext() { }
		public void copyFrom(FuncionesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncionStringsContext extends FuncionesContext {
		public Token nFun;
		public Token vsc;
		public Token vs;
		public TerminalNode PARENTESISA() { return getToken(miniBParser.PARENTESISA, 0); }
		public TerminalNode PARENTESISC() { return getToken(miniBParser.PARENTESISC, 0); }
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public FuncionStringsContext(FuncionesContext ctx) { copyFrom(ctx); }
	}
	public static class FuncionIntContext extends FuncionesContext {
		public Token nFun;
		public Token valorFun;
		public TerminalNode PARENTESISA() { return getToken(miniBParser.PARENTESISA, 0); }
		public List<TerminalNode> COMILLAS() { return getTokens(miniBParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(miniBParser.COMILLAS, i);
		}
		public TerminalNode PARENTESISC() { return getToken(miniBParser.PARENTESISC, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public List<TerminalNode> INT() { return getTokens(miniBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(miniBParser.INT, i);
		}
		public FuncionIntContext(FuncionesContext ctx) { copyFrom(ctx); }
	}
	public static class FuncionfuncionContext extends FuncionesContext {
		public Token nFun;
		public FuncionesContext valorFun;
		public TerminalNode PARENTESISA() { return getToken(miniBParser.PARENTESISA, 0); }
		public TerminalNode PARENTESISC() { return getToken(miniBParser.PARENTESISC, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public FuncionfuncionContext(FuncionesContext ctx) { copyFrom(ctx); }
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funciones);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new FuncionIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				((FuncionIntContext)_localctx).nFun = match(STRING);
				setState(268);
				match(PARENTESISA);
				setState(269);
				match(COMILLAS);
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(270);
					((FuncionIntContext)_localctx).valorFun = match(INT);
					}
					}
					setState(273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(275);
				match(COMILLAS);
				setState(276);
				match(PARENTESISC);
				}
				break;
			case 2:
				_localctx = new FuncionStringsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				((FuncionStringsContext)_localctx).nFun = match(STRING);
				setState(278);
				match(PARENTESISA);
				setState(281);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRINGCOM:
					{
					setState(279);
					((FuncionStringsContext)_localctx).vsc = match(STRINGCOM);
					}
					break;
				case STRING:
					{
					setState(280);
					((FuncionStringsContext)_localctx).vs = match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(283);
				match(PARENTESISC);
				}
				break;
			case 3:
				_localctx = new FuncionfuncionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				((FuncionfuncionContext)_localctx).nFun = match(STRING);
				setState(285);
				match(PARENTESISA);
				setState(286);
				((FuncionfuncionContext)_localctx).valorFun = funciones();
				setState(287);
				match(PARENTESISC);
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
		public RemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rem; }
	 
		public RemContext() { }
		public void copyFrom(RemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RmContext extends RemContext {
		public TerminalNode REM() { return getToken(miniBParser.REM, 0); }
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
		public RmContext(RemContext ctx) { copyFrom(ctx); }
	}

	public final RemContext rem() throws RecognitionException {
		RemContext _localctx = new RemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rem);
		try {
			int _alt;
			_localctx = new RmContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(291);
			match(REM);
			setState(293); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(292);
					match(STRING);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(295); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PosiblesReturnContext extends ParserRuleContext {
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public EnterosContext enteros() {
			return getRuleContext(EnterosContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FlotanteContext flotante() {
			return getRuleContext(FlotanteContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public PosiblesReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posiblesReturn; }
	}

	public final PosiblesReturnContext posiblesReturn() throws RecognitionException {
		PosiblesReturnContext _localctx = new PosiblesReturnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_posiblesReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(297);
				match(STRINGCOM);
				}
				break;
			case 2:
				{
				setState(298);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(299);
				match(INT);
				}
				break;
			case 4:
				{
				setState(300);
				enteros();
				}
				break;
			case 5:
				{
				setState(301);
				array();
				}
				break;
			case 6:
				{
				setState(302);
				flotante();
				}
				break;
			case 7:
				{
				setState(303);
				booleano();
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

	public static class DefFuncionContext extends ParserRuleContext {
		public DefFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFuncion; }
	 
		public DefFuncionContext() { }
		public void copyFrom(DefFuncionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DEFFuncionContext extends DefFuncionContext {
		public Token nomDef;
		public Token paramSC;
		public Token paramI;
		public OperacionContext dop;
		public CondicionalifContext dif;
		public BucleforContext dfor;
		public BuclewhileContext dw;
		public FuncionesContext df;
		public AsignacionContext dasi;
		public TerminalNode DEF() { return getToken(miniBParser.DEF, 0); }
		public TerminalNode PARENTESISA() { return getToken(miniBParser.PARENTESISA, 0); }
		public TerminalNode PARENTESISC() { return getToken(miniBParser.PARENTESISC, 0); }
		public TerminalNode PUNTOS() { return getToken(miniBParser.PUNTOS, 0); }
		public TerminalNode RETURN() { return getToken(miniBParser.RETURN, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public PosiblesReturnContext posiblesReturn() {
			return getRuleContext(PosiblesReturnContext.class,0);
		}
		public List<TerminalNode> STRINGCOM() { return getTokens(miniBParser.STRINGCOM); }
		public TerminalNode STRINGCOM(int i) {
			return getToken(miniBParser.STRINGCOM, i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<CondicionalifContext> condicionalif() {
			return getRuleContexts(CondicionalifContext.class);
		}
		public CondicionalifContext condicionalif(int i) {
			return getRuleContext(CondicionalifContext.class,i);
		}
		public List<BucleforContext> buclefor() {
			return getRuleContexts(BucleforContext.class);
		}
		public BucleforContext buclefor(int i) {
			return getRuleContext(BucleforContext.class,i);
		}
		public List<BuclewhileContext> buclewhile() {
			return getRuleContexts(BuclewhileContext.class);
		}
		public BuclewhileContext buclewhile(int i) {
			return getRuleContext(BuclewhileContext.class,i);
		}
		public List<FuncionesContext> funciones() {
			return getRuleContexts(FuncionesContext.class);
		}
		public FuncionesContext funciones(int i) {
			return getRuleContext(FuncionesContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> COMILLAS() { return getTokens(miniBParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(miniBParser.COMILLAS, i);
		}
		public List<TerminalNode> INT() { return getTokens(miniBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(miniBParser.INT, i);
		}
		public DEFFuncionContext(DefFuncionContext ctx) { copyFrom(ctx); }
	}

	public final DefFuncionContext defFuncion() throws RecognitionException {
		DefFuncionContext _localctx = new DefFuncionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_defFuncion);
		int _la;
		try {
			_localctx = new DEFFuncionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(DEF);
			setState(307);
			((DEFFuncionContext)_localctx).nomDef = match(STRING);
			setState(308);
			match(PARENTESISA);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMILLAS || _la==STRINGCOM) {
				{
				setState(317);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRINGCOM:
					{
					setState(309);
					((DEFFuncionContext)_localctx).paramSC = match(STRINGCOM);
					}
					break;
				case COMILLAS:
					{
					{
					setState(310);
					match(COMILLAS);
					setState(312); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(311);
						((DEFFuncionContext)_localctx).paramI = match(INT);
						}
						}
						setState(314); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==INT );
					setState(316);
					match(COMILLAS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			match(PARENTESISC);
			setState(323);
			match(PUNTOS);
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(324);
					((DEFFuncionContext)_localctx).dop = operacion(0);
					}
					break;
				case 2:
					{
					setState(325);
					((DEFFuncionContext)_localctx).dif = condicionalif();
					}
					break;
				case 3:
					{
					setState(326);
					((DEFFuncionContext)_localctx).dfor = buclefor();
					}
					break;
				case 4:
					{
					setState(327);
					((DEFFuncionContext)_localctx).dw = buclewhile();
					}
					break;
				case 5:
					{
					setState(328);
					((DEFFuncionContext)_localctx).df = funciones();
					}
					break;
				case 6:
					{
					setState(329);
					((DEFFuncionContext)_localctx).dasi = asignacion();
					}
					break;
				}
				}
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << STRING) | (1L << STRINGCOM) | (1L << INT))) != 0) );
			setState(334);
			match(RETURN);
			{
			setState(335);
			posiblesReturn();
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

	public static class SubrutinaContext extends ParserRuleContext {
		public SubrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrutina; }
	 
		public SubrutinaContext() { }
		public void copyFrom(SubrutinaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DEFsubrutinaContext extends SubrutinaContext {
		public Token nomSub;
		public Token paramSub;
		public OperacionContext so;
		public CondicionalifContext sif;
		public BucleforContext sfor;
		public BuclewhileContext sw;
		public FuncionesContext sf;
		public AsignacionContext sasi;
		public PrintContext sp;
		public TerminalNode DEF() { return getToken(miniBParser.DEF, 0); }
		public TerminalNode PARENTESISA() { return getToken(miniBParser.PARENTESISA, 0); }
		public TerminalNode PARENTESISC() { return getToken(miniBParser.PARENTESISC, 0); }
		public TerminalNode PUNTOS() { return getToken(miniBParser.PUNTOS, 0); }
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<CondicionalifContext> condicionalif() {
			return getRuleContexts(CondicionalifContext.class);
		}
		public CondicionalifContext condicionalif(int i) {
			return getRuleContext(CondicionalifContext.class,i);
		}
		public List<BucleforContext> buclefor() {
			return getRuleContexts(BucleforContext.class);
		}
		public BucleforContext buclefor(int i) {
			return getRuleContext(BucleforContext.class,i);
		}
		public List<BuclewhileContext> buclewhile() {
			return getRuleContexts(BuclewhileContext.class);
		}
		public BuclewhileContext buclewhile(int i) {
			return getRuleContext(BuclewhileContext.class,i);
		}
		public List<FuncionesContext> funciones() {
			return getRuleContexts(FuncionesContext.class);
		}
		public FuncionesContext funciones(int i) {
			return getRuleContext(FuncionesContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public DEFsubrutinaContext(SubrutinaContext ctx) { copyFrom(ctx); }
	}

	public final SubrutinaContext subrutina() throws RecognitionException {
		SubrutinaContext _localctx = new SubrutinaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_subrutina);
		int _la;
		try {
			_localctx = new DEFsubrutinaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(337);
			match(DEF);
			setState(338);
			((DEFsubrutinaContext)_localctx).nomSub = match(STRING);
			setState(339);
			match(PARENTESISA);
			setState(340);
			((DEFsubrutinaContext)_localctx).paramSub = match(STRING);
			setState(341);
			match(PARENTESISC);
			setState(342);
			match(PUNTOS);
			setState(350); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(343);
					((DEFsubrutinaContext)_localctx).so = operacion(0);
					}
					break;
				case 2:
					{
					setState(344);
					((DEFsubrutinaContext)_localctx).sif = condicionalif();
					}
					break;
				case 3:
					{
					setState(345);
					((DEFsubrutinaContext)_localctx).sfor = buclefor();
					}
					break;
				case 4:
					{
					setState(346);
					((DEFsubrutinaContext)_localctx).sw = buclewhile();
					}
					break;
				case 5:
					{
					setState(347);
					((DEFsubrutinaContext)_localctx).sf = funciones();
					}
					break;
				case 6:
					{
					setState(348);
					((DEFsubrutinaContext)_localctx).sasi = asignacion();
					}
					break;
				case 7:
					{
					setState(349);
					((DEFsubrutinaContext)_localctx).sp = print();
					}
					break;
				}
				}
				setState(352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << STRING) | (1L << STRINGCOM) | (1L << INT))) != 0) );
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

	public static class SumarcadenasContext extends ParserRuleContext {
		public SumarcadenasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumarcadenas; }
	 
		public SumarcadenasContext() { }
		public void copyFrom(SumarcadenasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumaCadenaContext extends SumarcadenasContext {
		public SumarcadenasContext left;
		public Token sumnombre;
		public TerminalNode MAS() { return getToken(miniBParser.MAS, 0); }
		public SumarcadenasContext sumarcadenas() {
			return getRuleContext(SumarcadenasContext.class,0);
		}
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public SumaCadenaContext(SumarcadenasContext ctx) { copyFrom(ctx); }
	}
	public static class NombreCadenaContext extends SumarcadenasContext {
		public Token sumnombre;
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public NombreCadenaContext(SumarcadenasContext ctx) { copyFrom(ctx); }
	}

	public final SumarcadenasContext sumarcadenas() throws RecognitionException {
		return sumarcadenas(0);
	}

	private SumarcadenasContext sumarcadenas(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumarcadenasContext _localctx = new SumarcadenasContext(_ctx, _parentState);
		SumarcadenasContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_sumarcadenas, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NombreCadenaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(355);
			((NombreCadenaContext)_localctx).sumnombre = match(STRINGCOM);
			}
			_ctx.stop = _input.LT(-1);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumaCadenaContext(new SumarcadenasContext(_parentctx, _parentState));
					((SumaCadenaContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_sumarcadenas);
					setState(357);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(358);
					match(MAS);
					setState(359);
					((SumaCadenaContext)_localctx).sumnombre = match(STRINGCOM);
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class CopiarcadenasContext extends ParserRuleContext {
		public CopiarcadenasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copiarcadenas; }
	 
		public CopiarcadenasContext() { }
		public void copyFrom(CopiarcadenasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CopiaCadenaContext extends CopiarcadenasContext {
		public Token copianombre;
		public Token copiavalor;
		public TerminalNode POR() { return getToken(miniBParser.POR, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public CopiaCadenaContext(CopiarcadenasContext ctx) { copyFrom(ctx); }
	}

	public final CopiarcadenasContext copiarcadenas() throws RecognitionException {
		CopiarcadenasContext _localctx = new CopiarcadenasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_copiarcadenas);
		try {
			_localctx = new CopiaCadenaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			((CopiaCadenaContext)_localctx).copianombre = match(STRINGCOM);
			setState(366);
			match(POR);
			setState(367);
			((CopiaCadenaContext)_localctx).copiavalor = match(INT);
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

	public static class AccesoposicioncadenaContext extends ParserRuleContext {
		public AccesoposicioncadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesoposicioncadena; }
	 
		public AccesoposicioncadenaContext() { }
		public void copyFrom(AccesoposicioncadenaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AccesoCadenaContext extends AccesoposicioncadenaContext {
		public Token accesonombre;
		public Token accesovalor;
		public TerminalNode CORCHETEA() { return getToken(miniBParser.CORCHETEA, 0); }
		public TerminalNode CORCHETEC() { return getToken(miniBParser.CORCHETEC, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public AccesoCadenaContext(AccesoposicioncadenaContext ctx) { copyFrom(ctx); }
	}

	public final AccesoposicioncadenaContext accesoposicioncadena() throws RecognitionException {
		AccesoposicioncadenaContext _localctx = new AccesoposicioncadenaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_accesoposicioncadena);
		try {
			_localctx = new AccesoCadenaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((AccesoCadenaContext)_localctx).accesonombre = match(STRINGCOM);
			setState(370);
			match(CORCHETEA);
			setState(371);
			((AccesoCadenaContext)_localctx).accesovalor = match(INT);
			setState(372);
			match(CORCHETEC);
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

	public static class SegmentocadenaContext extends ParserRuleContext {
		public SegmentocadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segmentocadena; }
	 
		public SegmentocadenaContext() { }
		public void copyFrom(SegmentocadenaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SegCadenaContext extends SegmentocadenaContext {
		public Token segmentonombre;
		public Token segmentovalorI;
		public Token segmentovalorF;
		public TerminalNode CORCHETEA() { return getToken(miniBParser.CORCHETEA, 0); }
		public TerminalNode PUNTOS() { return getToken(miniBParser.PUNTOS, 0); }
		public TerminalNode CORCHETEC() { return getToken(miniBParser.CORCHETEC, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public List<TerminalNode> INT() { return getTokens(miniBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(miniBParser.INT, i);
		}
		public SegCadenaContext(SegmentocadenaContext ctx) { copyFrom(ctx); }
	}

	public final SegmentocadenaContext segmentocadena() throws RecognitionException {
		SegmentocadenaContext _localctx = new SegmentocadenaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_segmentocadena);
		try {
			_localctx = new SegCadenaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			((SegCadenaContext)_localctx).segmentonombre = match(STRINGCOM);
			setState(375);
			match(CORCHETEA);
			setState(376);
			((SegCadenaContext)_localctx).segmentovalorI = match(INT);
			setState(377);
			match(PUNTOS);
			setState(378);
			((SegCadenaContext)_localctx).segmentovalorF = match(INT);
			setState(379);
			match(CORCHETEC);
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

	public static class FlotanteContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(miniBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(miniBParser.INT, i);
		}
		public TerminalNode PUNTO() { return getToken(miniBParser.PUNTO, 0); }
		public FlotanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flotante; }
	}

	public final FlotanteContext flotante() throws RecognitionException {
		FlotanteContext _localctx = new FlotanteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_flotante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(INT);
			setState(382);
			match(PUNTO);
			setState(383);
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

	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode BOOLEANF() { return getToken(miniBParser.BOOLEANF, 0); }
		public TerminalNode BOOLEANT() { return getToken(miniBParser.BOOLEANT, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !(_la==BOOLEANT || _la==BOOLEANF) ) {
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode CORCHETEA() { return getToken(miniBParser.CORCHETEA, 0); }
		public List<TerminalNode> STRINGCOM() { return getTokens(miniBParser.STRINGCOM); }
		public TerminalNode STRINGCOM(int i) {
			return getToken(miniBParser.STRINGCOM, i);
		}
		public TerminalNode CORCHETEC() { return getToken(miniBParser.CORCHETEC, 0); }
		public List<TerminalNode> COMA() { return getTokens(miniBParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miniBParser.COMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(CORCHETEA);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					match(STRINGCOM);
					setState(389);
					match(COMA);
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(395);
			match(STRINGCOM);
			setState(396);
			match(CORCHETEC);
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

	public static class EnterosContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public TerminalNode MENOS() { return getToken(miniBParser.MENOS, 0); }
		public EnterosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enteros; }
	}

	public final EnterosContext enteros() throws RecognitionException {
		EnterosContext _localctx = new EnterosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enteros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MENOS) {
				{
				setState(398);
				match(MENOS);
				}
			}

			setState(401);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return operacion_sempred((OperacionContext)_localctx, predIndex);
		case 20:
			return sumarcadenas_sempred((SumarcadenasContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacion_sempred(OperacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sumarcadenas_sempred(SumarcadenasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0196\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3"+
		"\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6c\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bv\n\b\3\b\3\b\6\bz\n\b\r\b\16\b{\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0086\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\t\6\t\u0090\n\t"+
		"\r\t\16\t\u0091\3\t\3\t\3\t\3\t\3\t\6\t\u0099\n\t\r\t\16\t\u009a\7\t\u009d"+
		"\n\t\f\t\16\t\u00a0\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\6\13\u00ad\n\13\r\13\16\13\u00ae\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00bd\n\f\3\f\3\f\6\f\u00c1\n\f\r\f\16\f\u00c2"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\16"+
		"\3\16\3\16\5\16\u00d5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00df\n\17\3\17\3\17\6\17\u00e3\n\17\r\17\16\17\u00e4\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00ee\n\17\3\17\3\17\6\17\u00f2\n\17\r\17\16"+
		"\17\u00f3\3\17\3\17\5\17\u00f8\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u0107\n\20\r\20\16\20\u0108\3\20\5"+
		"\20\u010c\n\20\3\21\3\21\3\21\3\21\6\21\u0112\n\21\r\21\16\21\u0113\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u011c\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0124\n\21\3\22\3\22\6\22\u0128\n\22\r\22\16\22\u0129\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0133\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\6\24\u013b\n\24\r\24\16\24\u013c\3\24\7\24\u0140\n\24\f\24\16\24"+
		"\u0143\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u014d\n\24\r"+
		"\24\16\24\u014e\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\6\25\u0161\n\25\r\25\16\25\u0162\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\7\26\u016b\n\26\f\26\16\26\u016e\13\26\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\7\34\u0189\n\34\f\34\16\34"+
		"\u018c\13\34\3\34\3\34\3\34\3\35\5\35\u0192\n\35\3\35\3\35\3\35\2\4\30"+
		"*\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\7"+
		"\4\2((++\3\2\5\7\3\2\b\f\3\2\b\13\3\2,-\2\u01c7\2>\3\2\2\2\4N\3\2\2\2"+
		"\6S\3\2\2\2\bU\3\2\2\2\n\\\3\2\2\2\fd\3\2\2\2\16l\3\2\2\2\20\177\3\2\2"+
		"\2\22\u00a3\3\2\2\2\24\u00a7\3\2\2\2\26\u00b5\3\2\2\2\30\u00c6\3\2\2\2"+
		"\32\u00d4\3\2\2\2\34\u00f7\3\2\2\2\36\u010b\3\2\2\2 \u0123\3\2\2\2\"\u0125"+
		"\3\2\2\2$\u0132\3\2\2\2&\u0134\3\2\2\2(\u0153\3\2\2\2*\u0164\3\2\2\2,"+
		"\u016f\3\2\2\2.\u0173\3\2\2\2\60\u0178\3\2\2\2\62\u017f\3\2\2\2\64\u0183"+
		"\3\2\2\2\66\u0185\3\2\2\28\u0191\3\2\2\2:=\5\4\3\2;=\7*\2\2<:\3\2\2\2"+
		"<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\3\3\2\2\2@>\3\2\2\2AO\5\n\6"+
		"\2BO\5\24\13\2CO\5\16\b\2DO\5\20\t\2EO\5\b\5\2FO\5\22\n\2GO\5\26\f\2H"+
		"O\5\34\17\2IO\5\36\20\2JO\5 \21\2KO\5\"\22\2LO\5\f\7\2MO\5\30\r\2NA\3"+
		"\2\2\2NB\3\2\2\2NC\3\2\2\2ND\3\2\2\2NE\3\2\2\2NF\3\2\2\2NG\3\2\2\2NH\3"+
		"\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PT"+
		"\5\b\5\2QT\5\n\6\2RT\5\f\7\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\7\3\2\2\2"+
		"UZ\7\26\2\2V[\7)\2\2W[\7(\2\2X[\5 \21\2Y[\5\30\r\2ZV\3\2\2\2ZW\3\2\2\2"+
		"ZX\3\2\2\2ZY\3\2\2\2[\t\3\2\2\2\\]\7\27\2\2]^\7(\2\2^b\7\5\2\2_c\7)\2"+
		"\2`c\7+\2\2ac\5 \21\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\13\3\2\2\2de\7(\2"+
		"\2ej\7\5\2\2fk\7(\2\2gk\7+\2\2hk\5 \21\2ik\5\30\r\2jf\3\2\2\2jg\3\2\2"+
		"\2jh\3\2\2\2ji\3\2\2\2k\r\3\2\2\2lm\7\31\2\2mn\7(\2\2no\7\5\2\2op\7+\2"+
		"\2pq\7\32\2\2qr\7+\2\2ry\7*\2\2sv\5\20\t\2tv\5\6\4\2us\3\2\2\2ut\3\2\2"+
		"\2vw\3\2\2\2wx\7*\2\2xz\3\2\2\2yu\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|}\3\2\2\2}~\7\20\2\2~\17\3\2\2\2\177\u0085\7\36\2\2\u0080\u0081\t\2"+
		"\2\2\u0081\u0082\t\3\2\2\u0082\u0086\t\2\2\2\u0083\u0086\7(\2\2\u0084"+
		"\u0086\7+\2\2\u0085\u0080\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\37\2\2\u0088\u008f\7*\2\2\u0089"+
		"\u008d\7\33\2\2\u008a\u008d\7\34\2\2\u008b\u008d\5\6\4\2\u008c\u0089\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\7*\2\2\u008f\u008c\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u009e\3\2\2\2\u0093\u0094\7\35\2\2\u0094"+
		"\u0098\7*\2\2\u0095\u0096\5\6\4\2\u0096\u0097\7*\2\2\u0097\u0099\3\2\2"+
		"\2\u0098\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u0093\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a2\7\17\2\2\u00a2\21\3\2\2\2\u00a3\u00a4\7 \2\2\u00a4\u00a5"+
		"\7)\2\2\u00a5\u00a6\7(\2\2\u00a6\23\3\2\2\2\u00a7\u00a8\7!\2\2\u00a8\u00ac"+
		"\7*\2\2\u00a9\u00aa\5\6\4\2\u00aa\u00ab\7*\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\7(\2\2\u00b2"+
		"\u00b3\7\5\2\2\u00b3\u00b4\7+\2\2\u00b4\25\3\2\2\2\u00b5\u00b6\7#\2\2"+
		"\u00b6\u00b7\t\2\2\2\u00b7\u00b8\t\3\2\2\u00b8\u00b9\t\2\2\2\u00b9\u00c0"+
		"\7*\2\2\u00ba\u00bd\5\6\4\2\u00bb\u00bd\5\n\6\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7*\2\2\u00bf\u00c1\3\2"+
		"\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\17\2\2\u00c5\27\3\2\2"+
		"\2\u00c6\u00c7\b\r\1\2\u00c7\u00c8\5\32\16\2\u00c8\u00ce\3\2\2\2\u00c9"+
		"\u00ca\f\4\2\2\u00ca\u00cb\t\4\2\2\u00cb\u00cd\5\32\16\2\u00cc\u00c9\3"+
		"\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\31\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d5\7+\2\2\u00d2\u00d5\7)\2\2"+
		"\u00d3\u00d5\7(\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00d7\7\27\2\2\u00d7\u00d8\7\5\2\2\u00d8"+
		"\u00f8\7+\2\2\u00d9\u00da\7\31\2\2\u00da\u00db\7(\2\2\u00db\u00e2\7*\2"+
		"\2\u00dc\u00df\5\20\t\2\u00dd\u00df\5\6\4\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7*\2\2\u00e1\u00e3\3\2"+
		"\2\2\u00e2\u00de\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\20\2\2\u00e7\u00f8\3"+
		"\2\2\2\u00e8\u00e9\7#\2\2\u00e9\u00ea\t\2\2\2\u00ea\u00f1\7*\2\2\u00eb"+
		"\u00ee\5\6\4\2\u00ec\u00ee\5\n\6\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7*\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ed\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\17\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00d6\3\2\2\2\u00f7\u00d9\3\2\2\2\u00f7\u00e8\3\2\2\2\u00f8\35\3\2\2"+
		"\2\u00f9\u00fa\7\27\2\2\u00fa\u00fb\7(\2\2\u00fb\u00fc\7\5\2\2\u00fc\u00fd"+
		"\7\25\2\2\u00fd\u00fe\7+\2\2\u00fe\u010c\7\25\2\2\u00ff\u0100\7\26\2\2"+
		"\u0100\u0101\7(\2\2\u0101\u0102\t\5\2\2\u0102\u010c\7+\2\2\u0103\u0104"+
		"\7(\2\2\u0104\u0106\7\23\2\2\u0105\u0107\7+\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\7\24\2\2\u010b\u00f9\3\2\2\2\u010b\u00ff\3\2\2\2\u010b"+
		"\u0103\3\2\2\2\u010c\37\3\2\2\2\u010d\u010e\7(\2\2\u010e\u010f\7\23\2"+
		"\2\u010f\u0111\7\25\2\2\u0110\u0112\7+\2\2\u0111\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\7\25\2\2\u0116\u0124\7\24\2\2\u0117\u0118\7(\2\2\u0118\u011b\7"+
		"\23\2\2\u0119\u011c\7)\2\2\u011a\u011c\7(\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0124\7\24\2\2\u011e\u011f\7"+
		"(\2\2\u011f\u0120\7\23\2\2\u0120\u0121\5 \21\2\u0121\u0122\7\24\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u010d\3\2\2\2\u0123\u0117\3\2\2\2\u0123\u011e\3\2"+
		"\2\2\u0124!\3\2\2\2\u0125\u0127\7$\2\2\u0126\u0128\7(\2\2\u0127\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"#\3\2\2\2\u012b\u0133\7)\2\2\u012c\u0133\7(\2\2\u012d\u0133\7+\2\2\u012e"+
		"\u0133\58\35\2\u012f\u0133\5\66\34\2\u0130\u0133\5\62\32\2\u0131\u0133"+
		"\5\64\33\2\u0132\u012b\3\2\2\2\u0132\u012c\3\2\2\2\u0132\u012d\3\2\2\2"+
		"\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0131"+
		"\3\2\2\2\u0133%\3\2\2\2\u0134\u0135\7%\2\2\u0135\u0136\7(\2\2\u0136\u0141"+
		"\7\23\2\2\u0137\u0140\7)\2\2\u0138\u013a\7\25\2\2\u0139\u013b\7+\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u0140\7\25\2\2\u013f\u0137\3\2\2\2\u013f"+
		"\u0138\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7\24\2\2\u0145"+
		"\u014c\7\4\2\2\u0146\u014d\5\30\r\2\u0147\u014d\5\20\t\2\u0148\u014d\5"+
		"\16\b\2\u0149\u014d\5\26\f\2\u014a\u014d\5 \21\2\u014b\u014d\5\f\7\2\u014c"+
		"\u0146\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7&"+
		"\2\2\u0151\u0152\5$\23\2\u0152\'\3\2\2\2\u0153\u0154\7%\2\2\u0154\u0155"+
		"\7(\2\2\u0155\u0156\7\23\2\2\u0156\u0157\7(\2\2\u0157\u0158\7\24\2\2\u0158"+
		"\u0160\7\4\2\2\u0159\u0161\5\30\r\2\u015a\u0161\5\20\t\2\u015b\u0161\5"+
		"\16\b\2\u015c\u0161\5\26\f\2\u015d\u0161\5 \21\2\u015e\u0161\5\f\7\2\u015f"+
		"\u0161\5\b\5\2\u0160\u0159\3\2\2\2\u0160\u015a\3\2\2\2\u0160\u015b\3\2"+
		"\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163)\3\2\2\2\u0164\u0165\b\26\1\2\u0165\u0166\7)\2\2\u0166\u016c"+
		"\3\2\2\2\u0167\u0168\f\4\2\2\u0168\u0169\7\b\2\2\u0169\u016b\7)\2\2\u016a"+
		"\u0167\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d+\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7)\2\2\u0170\u0171"+
		"\7\n\2\2\u0171\u0172\7+\2\2\u0172-\3\2\2\2\u0173\u0174\7)\2\2\u0174\u0175"+
		"\7\21\2\2\u0175\u0176\7+\2\2\u0176\u0177\7\22\2\2\u0177/\3\2\2\2\u0178"+
		"\u0179\7)\2\2\u0179\u017a\7\21\2\2\u017a\u017b\7+\2\2\u017b\u017c\7\4"+
		"\2\2\u017c\u017d\7+\2\2\u017d\u017e\7\22\2\2\u017e\61\3\2\2\2\u017f\u0180"+
		"\7+\2\2\u0180\u0181\7.\2\2\u0181\u0182\7+\2\2\u0182\63\3\2\2\2\u0183\u0184"+
		"\t\6\2\2\u0184\65\3\2\2\2\u0185\u018a\7\21\2\2\u0186\u0187\7)\2\2\u0187"+
		"\u0189\7\16\2\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3"+
		"\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d"+
		"\u018e\7)\2\2\u018e\u018f\7\22\2\2\u018f\67\3\2\2\2\u0190\u0192\7\t\2"+
		"\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194"+
		"\7+\2\2\u01949\3\2\2\2+<>NSZbju{\u0085\u008c\u0091\u009a\u009e\u00ae\u00bc"+
		"\u00c2\u00ce\u00d4\u00de\u00e4\u00ed\u00f3\u00f7\u0108\u010b\u0113\u011b"+
		"\u0123\u0129\u0132\u013c\u013f\u0141\u014c\u014e\u0160\u0162\u016c\u018a"+
		"\u0191";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}