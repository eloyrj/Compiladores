// Generated from miniB.g4 by ANTLR 4.9.2
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitFichero(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << REPEAT) | (1L << WHILE) | (1L << REM) | (1L << DEF) | (1L << STRING) | (1L << STRINGCOM) | (1L << INTRO) | (1L << INT))) != 0)) {
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
				case DEF:
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
		public DefFuncionContext defFuncion() {
			return getRuleContext(DefFuncionContext.class,0);
		}
		public SubrutinaContext subrutina() {
			return getRuleContext(SubrutinaContext.class,0);
		}
		public SumarcadenasContext sumarcadenas() {
			return getRuleContext(SumarcadenasContext.class,0);
		}
		public CopiarcadenasContext copiarcadenas() {
			return getRuleContext(CopiarcadenasContext.class,0);
		}
		public AccesoposicioncadenaContext accesoposicioncadena() {
			return getRuleContext(AccesoposicioncadenaContext.class,0);
		}
		public SegmentocadenaContext segmentocadena() {
			return getRuleContext(SegmentocadenaContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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
			case 14:
				{
				setState(76);
				defFuncion();
				}
				break;
			case 15:
				{
				setState(77);
				subrutina();
				}
				break;
			case 16:
				{
				setState(78);
				sumarcadenas(0);
				}
				break;
			case 17:
				{
				setState(79);
				copiarcadenas();
				}
				break;
			case 18:
				{
				setState(80);
				accesoposicioncadena();
				}
				break;
			case 19:
				{
				setState(81);
				segmentocadena();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			_localctx = new InstContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				{
				setState(84);
				print();
				}
				break;
			case LET:
				{
				setState(85);
				let();
				}
				break;
			case STRING:
				{
				setState(86);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			_localctx = new ImprimirContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(PRINT);
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(90);
				((ImprimirContext)_localctx).impComillas = match(STRINGCOM);
				}
				break;
			case 2:
				{
				setState(91);
				((ImprimirContext)_localctx).ps = match(STRING);
				}
				break;
			case 3:
				{
				setState(92);
				((ImprimirContext)_localctx).pf = funciones();
				}
				break;
			case 4:
				{
				setState(93);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitLETT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_let);
		try {
			_localctx = new LETTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(LET);
			setState(97);
			((LETTContext)_localctx).nombre = match(STRING);
			setState(98);
			match(IGUAL);
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGCOM:
				{
				setState(99);
				((LETTContext)_localctx).valors = match(STRINGCOM);
				}
				break;
			case INT:
				{
				setState(100);
				((LETTContext)_localctx).valori = match(INT);
				}
				break;
			case STRING:
				{
				setState(101);
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
		public AsignarContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitAsignar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			_localctx = new AsignarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(104);
			match(STRING);
			setState(105);
			match(IGUAL);
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(106);
				funciones();
				}
				break;
			case 2:
				{
				setState(107);
				operacion(0);
				}
				break;
			case 3:
				{
				{
				setState(108);
				match(STRING);
				setState(109);
				match(MOD);
				setState(110);
				match(STRING);
				}
				}
				break;
			case 4:
				{
				setState(111);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(112);
				match(INT);
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
		public TerminalNode FOR() { return getToken(miniBParser.FOR, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public List<TerminalNode> INT() { return getTokens(miniBParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(miniBParser.INT, i);
		}
		public TerminalNode TO() { return getToken(miniBParser.TO, 0); }
		public List<TerminalNode> INTRO() { return getTokens(miniBParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(miniBParser.INTRO, i);
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
		public ForContext(BucleforContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
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
			setState(115);
			match(FOR);
			setState(116);
			match(STRING);
			setState(117);
			match(IGUAL);
			setState(118);
			match(INT);
			setState(119);
			match(TO);
			setState(120);
			match(INT);
			setState(121);
			match(INTRO);
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(122);
					condicionalif();
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(123);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126);
				match(INTRO);
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << IF) | (1L << STRING))) != 0) );
			setState(132);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalifContext condicionalif() throws RecognitionException {
		CondicionalifContext _localctx = new CondicionalifContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicionalif);
		int _la;
		try {
			_localctx = new IfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IF);
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(135);
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
				setState(136);
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
				setState(137);
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
				setState(138);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(139);
				match(INT);
				}
				break;
			}
			setState(142);
			match(THEN);
			setState(143);
			match(INTRO);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					setState(144);
					((IfContext)_localctx).conti = match(CONTINUE);
					}
					break;
				case EXIT:
					{
					setState(145);
					((IfContext)_localctx).exit = match(EXIT);
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(146);
					((IfContext)_localctx).inst1 = instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149);
				match(INTRO);
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << CONTINUE) | (1L << EXIT) | (1L << STRING))) != 0) );
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(154);
				match(ELSE);
				setState(155);
				match(INTRO);
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156);
					((IfContext)_localctx).inst2 = instruccion();
					setState(157);
					match(INTRO);
					}
					}
					setState(161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
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
		public TerminalNode INPUT() { return getToken(miniBParser.INPUT, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public IntroducirContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitIntroducir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_input);
		try {
			_localctx = new IntroducirContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170);
			match(INPUT);
			setState(171);
			match(STRINGCOM);
			setState(172);
			match(STRING);
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
		public TerminalNode REPEAT() { return getToken(miniBParser.REPEAT, 0); }
		public List<TerminalNode> INTRO() { return getTokens(miniBParser.INTRO); }
		public TerminalNode INTRO(int i) {
			return getToken(miniBParser.INTRO, i);
		}
		public TerminalNode UNTIL() { return getToken(miniBParser.UNTIL, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public RepetirContext(RepeatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitRepetir(this);
			else return visitor.visitChildren(this);
		}
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
			setState(174);
			match(REPEAT);
			setState(175);
			match(INTRO);
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				instruccion();
				setState(177);
				match(INTRO);
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(183);
			match(UNTIL);
			setState(184);
			instruccion();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuclewhileContext buclewhile() throws RecognitionException {
		BuclewhileContext _localctx = new BuclewhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_buclewhile);
		int _la;
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WHILE);
			setState(187);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYORQUE) | (1L << MENORQUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(190);
			match(INTRO);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(191);
					instruccion();
					}
					break;
				case 2:
					{
					setState(192);
					let();
					}
					break;
				}
				setState(195);
				match(INTRO);
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(201);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitOPERACIONES(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberESContext extends OperacionContext {
		public SumandosContext number;
		public SumandosContext sumandos() {
			return getRuleContext(SumandosContext.class,0);
		}
		public NumberESContext(OperacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitNumberES(this);
			else return visitor.visitChildren(this);
		}
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

			setState(204);
			((NumberESContext)_localctx).number = sumandos();
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
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
					setState(206);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(207);
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
					setState(208);
					((OPERACIONESContext)_localctx).right = sumandos();
					}
					} 
				}
				setState(213);
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
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public SumandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumandos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitSumandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumandosContext sumandos() throws RecognitionException {
		SumandosContext _localctx = new SumandosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sumandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitESintactico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorsintacticoContext errorsintactico() throws RecognitionException {
		ErrorsintacticoContext _localctx = new ErrorsintacticoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_errorsintactico);
		int _la;
		try {
			_localctx = new ESintacticoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				setState(216);
				match(LET);
				setState(217);
				match(IGUAL);
				setState(218);
				match(INT);
				}
				break;
			case FOR:
				{
				setState(219);
				match(FOR);
				setState(220);
				match(STRING);
				setState(221);
				match(INTRO);
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
						{
						setState(222);
						condicionalif();
						}
						break;
					case PRINT:
					case LET:
					case STRING:
						{
						setState(223);
						instruccion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(226);
					match(INTRO);
					}
					}
					setState(230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << IF) | (1L << STRING))) != 0) );
				setState(232);
				match(NEXT);
				}
				break;
			case WHILE:
				{
				setState(234);
				match(WHILE);
				setState(235);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(236);
				match(INTRO);
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(237);
						instruccion();
						}
						break;
					case 2:
						{
						setState(238);
						let();
						}
						break;
					}
					setState(241);
					match(INTRO);
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
				setState(247);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitETipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrortipoContext errortipo() throws RecognitionException {
		ErrortipoContext _localctx = new ErrortipoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_errortipo);
		int _la;
		try {
			_localctx = new ETipoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				{
				setState(251);
				match(LET);
				setState(252);
				match(STRING);
				setState(253);
				match(IGUAL);
				setState(254);
				match(COMILLAS);
				setState(255);
				match(INT);
				setState(256);
				match(COMILLAS);
				}
				}
				break;
			case PRINT:
				{
				{
				setState(257);
				match(PRINT);
				setState(258);
				match(STRING);
				setState(259);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR) | (1L << ENTRE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(260);
				match(INT);
				}
				}
				break;
			case STRING:
				{
				{
				setState(261);
				match(STRING);
				setState(262);
				match(PARENTESISA);
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(263);
					match(INT);
					}
					}
					setState(266); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(268);
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
		public Token valorFun;
		public TerminalNode PARENTESISA() { return getToken(miniBParser.PARENTESISA, 0); }
		public TerminalNode PARENTESISC() { return getToken(miniBParser.PARENTESISC, 0); }
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public FuncionStringsContext(FuncionesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitFuncionStrings(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitFuncionInt(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitFuncionfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funciones);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new FuncionIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				((FuncionIntContext)_localctx).nFun = match(STRING);
				setState(272);
				match(PARENTESISA);
				setState(273);
				match(COMILLAS);
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(274);
					((FuncionIntContext)_localctx).valorFun = match(INT);
					}
					}
					setState(277); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(279);
				match(COMILLAS);
				setState(280);
				match(PARENTESISC);
				}
				break;
			case 2:
				_localctx = new FuncionStringsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				((FuncionStringsContext)_localctx).nFun = match(STRING);
				setState(282);
				match(PARENTESISA);
				setState(283);
				((FuncionStringsContext)_localctx).valorFun = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==STRINGCOM) ) {
					((FuncionStringsContext)_localctx).valorFun = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(284);
				match(PARENTESISC);
				}
				break;
			case 3:
				_localctx = new FuncionfuncionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				((FuncionfuncionContext)_localctx).nFun = match(STRING);
				setState(286);
				match(PARENTESISA);
				setState(287);
				((FuncionfuncionContext)_localctx).valorFun = funciones();
				setState(288);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitRm(this);
			else return visitor.visitChildren(this);
		}
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
			setState(292);
			match(REM);
			setState(294); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(293);
					match(STRING);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(296); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitPosiblesReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosiblesReturnContext posiblesReturn() throws RecognitionException {
		PosiblesReturnContext _localctx = new PosiblesReturnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_posiblesReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(298);
				match(STRINGCOM);
				}
				break;
			case 2:
				{
				setState(299);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(300);
				match(INT);
				}
				break;
			case 4:
				{
				setState(301);
				enteros();
				}
				break;
			case 5:
				{
				setState(302);
				array();
				}
				break;
			case 6:
				{
				setState(303);
				flotante();
				}
				break;
			case 7:
				{
				setState(304);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitDEFFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefFuncionContext defFuncion() throws RecognitionException {
		DefFuncionContext _localctx = new DefFuncionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_defFuncion);
		int _la;
		try {
			_localctx = new DEFFuncionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(DEF);
			setState(308);
			((DEFFuncionContext)_localctx).nomDef = match(STRING);
			setState(309);
			match(PARENTESISA);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMILLAS || _la==STRINGCOM) {
				{
				setState(318);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRINGCOM:
					{
					setState(310);
					((DEFFuncionContext)_localctx).paramSC = match(STRINGCOM);
					}
					break;
				case COMILLAS:
					{
					{
					setState(311);
					match(COMILLAS);
					setState(313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(312);
						((DEFFuncionContext)_localctx).paramI = match(INT);
						}
						}
						setState(315); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==INT );
					setState(317);
					match(COMILLAS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(PARENTESISC);
			setState(324);
			match(PUNTOS);
			setState(331); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(325);
					((DEFFuncionContext)_localctx).dop = operacion(0);
					}
					break;
				case 2:
					{
					setState(326);
					((DEFFuncionContext)_localctx).dif = condicionalif();
					}
					break;
				case 3:
					{
					setState(327);
					((DEFFuncionContext)_localctx).dfor = buclefor();
					}
					break;
				case 4:
					{
					setState(328);
					((DEFFuncionContext)_localctx).dw = buclewhile();
					}
					break;
				case 5:
					{
					setState(329);
					((DEFFuncionContext)_localctx).df = funciones();
					}
					break;
				case 6:
					{
					setState(330);
					((DEFFuncionContext)_localctx).dasi = asignacion();
					}
					break;
				}
				}
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << STRING) | (1L << INT))) != 0) );
			setState(335);
			match(RETURN);
			{
			setState(336);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitDEFsubrutina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrutinaContext subrutina() throws RecognitionException {
		SubrutinaContext _localctx = new SubrutinaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_subrutina);
		try {
			int _alt;
			_localctx = new DEFsubrutinaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(338);
			match(DEF);
			setState(339);
			((DEFsubrutinaContext)_localctx).nomSub = match(STRING);
			setState(340);
			match(PARENTESISA);
			setState(341);
			((DEFsubrutinaContext)_localctx).paramSub = match(STRING);
			setState(342);
			match(PARENTESISC);
			setState(343);
			match(PUNTOS);
			setState(351); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(351);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(344);
						((DEFsubrutinaContext)_localctx).so = operacion(0);
						}
						break;
					case 2:
						{
						setState(345);
						((DEFsubrutinaContext)_localctx).sif = condicionalif();
						}
						break;
					case 3:
						{
						setState(346);
						((DEFsubrutinaContext)_localctx).sfor = buclefor();
						}
						break;
					case 4:
						{
						setState(347);
						((DEFsubrutinaContext)_localctx).sw = buclewhile();
						}
						break;
					case 5:
						{
						setState(348);
						((DEFsubrutinaContext)_localctx).sf = funciones();
						}
						break;
					case 6:
						{
						setState(349);
						((DEFsubrutinaContext)_localctx).sasi = asignacion();
						}
						break;
					case 7:
						{
						setState(350);
						((DEFsubrutinaContext)_localctx).sp = print();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(353); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitSumaCadena(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NombreCadenaContext extends SumarcadenasContext {
		public Token sumnombre;
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public NombreCadenaContext(SumarcadenasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitNombreCadena(this);
			else return visitor.visitChildren(this);
		}
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

			setState(356);
			((NombreCadenaContext)_localctx).sumnombre = match(STRINGCOM);
			}
			_ctx.stop = _input.LT(-1);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumaCadenaContext(new SumarcadenasContext(_parentctx, _parentState));
					((SumaCadenaContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_sumarcadenas);
					setState(358);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(359);
					match(MAS);
					setState(360);
					((SumaCadenaContext)_localctx).sumnombre = match(STRINGCOM);
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitCopiaCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopiarcadenasContext copiarcadenas() throws RecognitionException {
		CopiarcadenasContext _localctx = new CopiarcadenasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_copiarcadenas);
		try {
			_localctx = new CopiaCadenaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			((CopiaCadenaContext)_localctx).copianombre = match(STRINGCOM);
			setState(367);
			match(POR);
			setState(368);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitAccesoCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesoposicioncadenaContext accesoposicioncadena() throws RecognitionException {
		AccesoposicioncadenaContext _localctx = new AccesoposicioncadenaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_accesoposicioncadena);
		try {
			_localctx = new AccesoCadenaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			((AccesoCadenaContext)_localctx).accesonombre = match(STRINGCOM);
			setState(371);
			match(CORCHETEA);
			setState(372);
			((AccesoCadenaContext)_localctx).accesovalor = match(INT);
			setState(373);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitSegCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentocadenaContext segmentocadena() throws RecognitionException {
		SegmentocadenaContext _localctx = new SegmentocadenaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_segmentocadena);
		try {
			_localctx = new SegCadenaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			((SegCadenaContext)_localctx).segmentonombre = match(STRINGCOM);
			setState(376);
			match(CORCHETEA);
			setState(377);
			((SegCadenaContext)_localctx).segmentovalorI = match(INT);
			setState(378);
			match(PUNTOS);
			setState(379);
			((SegCadenaContext)_localctx).segmentovalorF = match(INT);
			setState(380);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitFlotante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlotanteContext flotante() throws RecognitionException {
		FlotanteContext _localctx = new FlotanteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_flotante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(INT);
			setState(383);
			match(PUNTO);
			setState(384);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(CORCHETEA);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(389);
					match(STRINGCOM);
					setState(390);
					match(COMA);
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(396);
			match(STRINGCOM);
			setState(397);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniBVisitor ) return ((miniBVisitor<? extends T>)visitor).visitEnteros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnterosContext enteros() throws RecognitionException {
		EnterosContext _localctx = new EnterosContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enteros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MENOS) {
				{
				setState(399);
				match(MENOS);
				}
			}

			setState(402);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0197\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3U\n\3\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7t\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\b\3\b\6\b\u0083"+
		"\n\b\r\b\16\b\u0084\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0096\n\t\3\t\6\t\u0099\n\t\r\t\16\t\u009a\3\t\3"+
		"\t\3\t\3\t\3\t\6\t\u00a2\n\t\r\t\16\t\u00a3\7\t\u00a6\n\t\f\t\16\t\u00a9"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\6\13\u00b6\n\13"+
		"\r\13\16\13\u00b7\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c4"+
		"\n\f\3\f\3\f\6\f\u00c8\n\f\r\f\16\f\u00c9\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u00d4\n\r\f\r\16\r\u00d7\13\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00e3\n\17\3\17\3\17\6\17\u00e7\n\17\r\17\16\17"+
		"\u00e8\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f2\n\17\3\17\3\17\6"+
		"\17\u00f6\n\17\r\17\16\17\u00f7\3\17\3\17\5\17\u00fc\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u010b\n\20"+
		"\r\20\16\20\u010c\3\20\5\20\u0110\n\20\3\21\3\21\3\21\3\21\6\21\u0116"+
		"\n\21\r\21\16\21\u0117\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0125\n\21\3\22\3\22\6\22\u0129\n\22\r\22\16\22\u012a\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0134\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\6\24\u013c\n\24\r\24\16\24\u013d\3\24\7\24\u0141\n\24\f\24"+
		"\16\24\u0144\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u014e"+
		"\n\24\r\24\16\24\u014f\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u0162\n\25\r\25\16\25\u0163\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u016c\n\26\f\26\16\26\u016f\13\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\7\34\u018a\n\34\f\34"+
		"\16\34\u018d\13\34\3\34\3\34\3\34\3\35\5\35\u0193\n\35\3\35\3\35\3\35"+
		"\2\4\30*\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8\2\b\4\2((++\3\2\5\7\3\2\b\f\3\2\b\13\3\2()\3\2,-\2\u01cc\2>\3\2\2\2"+
		"\4T\3\2\2\2\6Y\3\2\2\2\b[\3\2\2\2\nb\3\2\2\2\fj\3\2\2\2\16u\3\2\2\2\20"+
		"\u0088\3\2\2\2\22\u00ac\3\2\2\2\24\u00b0\3\2\2\2\26\u00bc\3\2\2\2\30\u00cd"+
		"\3\2\2\2\32\u00d8\3\2\2\2\34\u00fb\3\2\2\2\36\u010f\3\2\2\2 \u0124\3\2"+
		"\2\2\"\u0126\3\2\2\2$\u0133\3\2\2\2&\u0135\3\2\2\2(\u0154\3\2\2\2*\u0165"+
		"\3\2\2\2,\u0170\3\2\2\2.\u0174\3\2\2\2\60\u0179\3\2\2\2\62\u0180\3\2\2"+
		"\2\64\u0184\3\2\2\2\66\u0186\3\2\2\28\u0192\3\2\2\2:=\5\4\3\2;=\7*\2\2"+
		"<:\3\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\3\3\2\2\2@>\3\2\2"+
		"\2AU\5\n\6\2BU\5\24\13\2CU\5\16\b\2DU\5\20\t\2EU\5\b\5\2FU\5\22\n\2GU"+
		"\5\26\f\2HU\5\34\17\2IU\5\36\20\2JU\5 \21\2KU\5\"\22\2LU\5\f\7\2MU\5\30"+
		"\r\2NU\5&\24\2OU\5(\25\2PU\5*\26\2QU\5,\27\2RU\5.\30\2SU\5\60\31\2TA\3"+
		"\2\2\2TB\3\2\2\2TC\3\2\2\2TD\3\2\2\2TE\3\2\2\2TF\3\2\2\2TG\3\2\2\2TH\3"+
		"\2\2\2TI\3\2\2\2TJ\3\2\2\2TK\3\2\2\2TL\3\2\2\2TM\3\2\2\2TN\3\2\2\2TO\3"+
		"\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\5\3\2\2\2VZ\5\b\5\2WZ"+
		"\5\n\6\2XZ\5\f\7\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\7\3\2\2\2[`\7\26\2\2"+
		"\\a\7)\2\2]a\7(\2\2^a\5 \21\2_a\5\30\r\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2"+
		"\2`_\3\2\2\2a\t\3\2\2\2bc\7\27\2\2cd\7(\2\2dh\7\5\2\2ei\7)\2\2fi\7+\2"+
		"\2gi\5 \21\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\13\3\2\2\2jk\7(\2\2ks\7\5"+
		"\2\2lt\5 \21\2mt\5\30\r\2no\7(\2\2op\7\f\2\2pt\7(\2\2qt\7(\2\2rt\7+\2"+
		"\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\r\3\2\2\2uv\7\31"+
		"\2\2vw\7(\2\2wx\7\5\2\2xy\7+\2\2yz\7\32\2\2z{\7+\2\2{\u0082\7*\2\2|\177"+
		"\5\20\t\2}\177\5\6\4\2~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\7*\2\2\u0081\u0083\3\2\2\2\u0082~\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\20\2\2"+
		"\u0087\17\3\2\2\2\u0088\u008e\7\36\2\2\u0089\u008a\t\2\2\2\u008a\u008b"+
		"\t\3\2\2\u008b\u008f\t\2\2\2\u008c\u008f\7(\2\2\u008d\u008f\7+\2\2\u008e"+
		"\u0089\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\7\37\2\2\u0091\u0098\7*\2\2\u0092\u0096\7\33\2\2\u0093"+
		"\u0096\7\34\2\2\u0094\u0096\5\6\4\2\u0095\u0092\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7*\2\2\u0098"+
		"\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u00a7\3\2\2\2\u009c\u009d\7\35\2\2\u009d\u00a1\7*\2\2\u009e"+
		"\u009f\5\6\4\2\u009f\u00a0\7*\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009e\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u009c\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7\17\2\2\u00ab\21\3\2\2\2\u00ac\u00ad\7 \2\2\u00ad\u00ae\7)\2\2"+
		"\u00ae\u00af\7(\2\2\u00af\23\3\2\2\2\u00b0\u00b1\7!\2\2\u00b1\u00b5\7"+
		"*\2\2\u00b2\u00b3\5\6\4\2\u00b3\u00b4\7*\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b2\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb\5\6\4\2\u00bb"+
		"\25\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd\u00be\t\2\2\2\u00be\u00bf\t\3\2\2"+
		"\u00bf\u00c0\t\2\2\2\u00c0\u00c7\7*\2\2\u00c1\u00c4\5\6\4\2\u00c2\u00c4"+
		"\5\n\6\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\7*\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\7\17\2\2\u00cc\27\3\2\2\2\u00cd\u00ce\b\r\1\2\u00ce\u00cf\5\32"+
		"\16\2\u00cf\u00d5\3\2\2\2\u00d0\u00d1\f\4\2\2\u00d1\u00d2\t\4\2\2\u00d2"+
		"\u00d4\5\32\16\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\31\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00d9\t\2\2\2\u00d9\33\3\2\2\2\u00da\u00db\7\27\2\2\u00db\u00dc\7\5\2"+
		"\2\u00dc\u00fc\7+\2\2\u00dd\u00de\7\31\2\2\u00de\u00df\7(\2\2\u00df\u00e6"+
		"\7*\2\2\u00e0\u00e3\5\20\t\2\u00e1\u00e3\5\6\4\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7*\2\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00e2\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\20\2\2\u00eb\u00fc\3"+
		"\2\2\2\u00ec\u00ed\7#\2\2\u00ed\u00ee\t\2\2\2\u00ee\u00f5\7*\2\2\u00ef"+
		"\u00f2\5\6\4\2\u00f0\u00f2\5\n\6\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7*\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f1\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\17\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00da\3\2\2\2\u00fb\u00dd\3\2\2\2\u00fb\u00ec\3\2\2\2\u00fc\35\3\2\2"+
		"\2\u00fd\u00fe\7\27\2\2\u00fe\u00ff\7(\2\2\u00ff\u0100\7\5\2\2\u0100\u0101"+
		"\7\25\2\2\u0101\u0102\7+\2\2\u0102\u0110\7\25\2\2\u0103\u0104\7\26\2\2"+
		"\u0104\u0105\7(\2\2\u0105\u0106\t\5\2\2\u0106\u0110\7+\2\2\u0107\u0108"+
		"\7(\2\2\u0108\u010a\7\23\2\2\u0109\u010b\7+\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0110\7\24\2\2\u010f\u00fd\3\2\2\2\u010f\u0103\3\2\2\2\u010f"+
		"\u0107\3\2\2\2\u0110\37\3\2\2\2\u0111\u0112\7(\2\2\u0112\u0113\7\23\2"+
		"\2\u0113\u0115\7\25\2\2\u0114\u0116\7+\2\2\u0115\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\7\25\2\2\u011a\u0125\7\24\2\2\u011b\u011c\7(\2\2\u011c\u011d\7"+
		"\23\2\2\u011d\u011e\t\6\2\2\u011e\u0125\7\24\2\2\u011f\u0120\7(\2\2\u0120"+
		"\u0121\7\23\2\2\u0121\u0122\5 \21\2\u0122\u0123\7\24\2\2\u0123\u0125\3"+
		"\2\2\2\u0124\u0111\3\2\2\2\u0124\u011b\3\2\2\2\u0124\u011f\3\2\2\2\u0125"+
		"!\3\2\2\2\u0126\u0128\7$\2\2\u0127\u0129\7(\2\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b#\3\2\2\2"+
		"\u012c\u0134\7)\2\2\u012d\u0134\7(\2\2\u012e\u0134\7+\2\2\u012f\u0134"+
		"\58\35\2\u0130\u0134\5\66\34\2\u0131\u0134\5\62\32\2\u0132\u0134\5\64"+
		"\33\2\u0133\u012c\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u012e\3\2\2\2\u0133"+
		"\u012f\3\2\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2"+
		"\2\2\u0134%\3\2\2\2\u0135\u0136\7%\2\2\u0136\u0137\7(\2\2\u0137\u0142"+
		"\7\23\2\2\u0138\u0141\7)\2\2\u0139\u013b\7\25\2\2\u013a\u013c\7+\2\2\u013b"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0141\7\25\2\2\u0140\u0138\3\2\2\2\u0140"+
		"\u0139\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\24\2\2\u0146"+
		"\u014d\7\4\2\2\u0147\u014e\5\30\r\2\u0148\u014e\5\20\t\2\u0149\u014e\5"+
		"\16\b\2\u014a\u014e\5\26\f\2\u014b\u014e\5 \21\2\u014c\u014e\5\f\7\2\u014d"+
		"\u0147\3\2\2\2\u014d\u0148\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014a\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7&"+
		"\2\2\u0152\u0153\5$\23\2\u0153\'\3\2\2\2\u0154\u0155\7%\2\2\u0155\u0156"+
		"\7(\2\2\u0156\u0157\7\23\2\2\u0157\u0158\7(\2\2\u0158\u0159\7\24\2\2\u0159"+
		"\u0161\7\4\2\2\u015a\u0162\5\30\r\2\u015b\u0162\5\20\t\2\u015c\u0162\5"+
		"\16\b\2\u015d\u0162\5\26\f\2\u015e\u0162\5 \21\2\u015f\u0162\5\f\7\2\u0160"+
		"\u0162\5\b\5\2\u0161\u015a\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u015c\3\2"+
		"\2\2\u0161\u015d\3\2\2\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164)\3\2\2\2\u0165\u0166\b\26\1\2\u0166\u0167\7)\2\2\u0167\u016d"+
		"\3\2\2\2\u0168\u0169\f\4\2\2\u0169\u016a\7\b\2\2\u016a\u016c\7)\2\2\u016b"+
		"\u0168\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e+\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7)\2\2\u0171\u0172"+
		"\7\n\2\2\u0172\u0173\7+\2\2\u0173-\3\2\2\2\u0174\u0175\7)\2\2\u0175\u0176"+
		"\7\21\2\2\u0176\u0177\7+\2\2\u0177\u0178\7\22\2\2\u0178/\3\2\2\2\u0179"+
		"\u017a\7)\2\2\u017a\u017b\7\21\2\2\u017b\u017c\7+\2\2\u017c\u017d\7\4"+
		"\2\2\u017d\u017e\7+\2\2\u017e\u017f\7\22\2\2\u017f\61\3\2\2\2\u0180\u0181"+
		"\7+\2\2\u0181\u0182\7.\2\2\u0182\u0183\7+\2\2\u0183\63\3\2\2\2\u0184\u0185"+
		"\t\7\2\2\u0185\65\3\2\2\2\u0186\u018b\7\21\2\2\u0187\u0188\7)\2\2\u0188"+
		"\u018a\7\16\2\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3"+
		"\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u018f\7)\2\2\u018f\u0190\7\22\2\2\u0190\67\3\2\2\2\u0191\u0193\7\t\2"+
		"\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195"+
		"\7+\2\2\u01959\3\2\2\2)<>TY`hs~\u0084\u008e\u0095\u009a\u00a3\u00a7\u00b7"+
		"\u00c3\u00c9\u00d5\u00e2\u00e8\u00f1\u00f7\u00fb\u010c\u010f\u0117\u0124"+
		"\u012a\u0133\u013d\u0140\u0142\u014d\u014f\u0161\u0163\u016d\u018b\u0192";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}