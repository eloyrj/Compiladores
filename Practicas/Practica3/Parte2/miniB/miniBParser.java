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
		ENTRE=9, MOD=10, COMA=11, END=12, NEXT=13, CORCHETEA=14, CORCHETEC=15, 
		PARENTESISA=16, PARENTESISC=17, COMILLAS=18, PRINT=19, LET=20, NOTNUMBER=21, 
		FOR=22, TO=23, CONTINUE=24, EXIT=25, ELSE=26, IF=27, THEN=28, INPUT=29, 
		REPEAT=30, UNTIL=31, WHILE=32, REM=33, DEF=34, RETURN=35, IN=36, STRING=37, 
		STRINGCOM=38, INTRO=39, INT=40, FLOTANTE=41, BOOLEANT=42, BOOLEANF=43, 
		TIPOS=44;
	public static final int
		RULE_fichero = 0, RULE_prog = 1, RULE_instruccion = 2, RULE_print = 3, 
		RULE_let = 4, RULE_asignacion = 5, RULE_buclefor = 6, RULE_condicionalif = 7, 
		RULE_input = 8, RULE_repeat = 9, RULE_buclewhile = 10, RULE_operacion = 11, 
		RULE_sumandos = 12, RULE_errorsintactico = 13, RULE_errortipo = 14, RULE_funciones = 15, 
		RULE_rem = 16, RULE_posiblesReturn = 17, RULE_defFuncion = 18, RULE_subrutina = 19, 
		RULE_sumarcadenas = 20, RULE_copiarcadenas = 21, RULE_accesoposicioncadena = 22, 
		RULE_segmentocadena = 23, RULE_booleano = 24, RULE_array = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"fichero", "prog", "instruccion", "print", "let", "asignacion", "buclefor", 
			"condicionalif", "input", "repeat", "buclewhile", "operacion", "sumandos", 
			"errorsintactico", "errortipo", "funciones", "rem", "posiblesReturn", 
			"defFuncion", "subrutina", "sumarcadenas", "copiarcadenas", "accesoposicioncadena", 
			"segmentocadena", "booleano", "array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "':'", "'='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", null, 
			"','", null, null, "'['", "']'", "'('", "')'", "'\"'", null, null, "'NOT A NUMBER'", 
			null, null, null, null, null, null, null, null, null, null, null, "'REM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "E", "PUNTOS", "IGUAL", "MAYORQUE", "MENORQUE", "MAS", "MENOS", 
			"POR", "ENTRE", "MOD", "COMA", "END", "NEXT", "CORCHETEA", "CORCHETEC", 
			"PARENTESISA", "PARENTESISC", "COMILLAS", "PRINT", "LET", "NOTNUMBER", 
			"FOR", "TO", "CONTINUE", "EXIT", "ELSE", "IF", "THEN", "INPUT", "REPEAT", 
			"UNTIL", "WHILE", "REM", "DEF", "RETURN", "IN", "STRING", "STRINGCOM", 
			"INTRO", "INT", "FLOTANTE", "BOOLEANT", "BOOLEANF", "TIPOS"
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
		public ProgContext p;
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CORCHETEA) | (1L << PRINT) | (1L << LET) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << REPEAT) | (1L << WHILE) | (1L << REM) | (1L << DEF) | (1L << STRING) | (1L << STRINGCOM) | (1L << INT) | (1L << FLOTANTE))) != 0)) {
				{
				{
				setState(52);
				((FicheroContext)_localctx).p = prog();
				}
				}
				setState(57);
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
		public FuncionesContext f;
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
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(58);
				let();
				}
				break;
			case 2:
				{
				setState(59);
				repeat();
				}
				break;
			case 3:
				{
				setState(60);
				buclefor();
				}
				break;
			case 4:
				{
				setState(61);
				condicionalif();
				}
				break;
			case 5:
				{
				setState(62);
				print();
				}
				break;
			case 6:
				{
				setState(63);
				input();
				}
				break;
			case 7:
				{
				setState(64);
				buclewhile();
				}
				break;
			case 8:
				{
				setState(65);
				errorsintactico();
				}
				break;
			case 9:
				{
				setState(66);
				errortipo();
				}
				break;
			case 10:
				{
				setState(67);
				((ProgContext)_localctx).f = funciones();
				}
				break;
			case 11:
				{
				setState(68);
				rem();
				}
				break;
			case 12:
				{
				setState(69);
				asignacion();
				}
				break;
			case 13:
				{
				setState(70);
				operacion(0);
				}
				break;
			case 14:
				{
				setState(71);
				defFuncion();
				}
				break;
			case 15:
				{
				setState(72);
				subrutina();
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				{
				setState(75);
				print();
				}
				break;
			case LET:
				{
				setState(76);
				let();
				}
				break;
			case STRING:
				{
				setState(77);
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
		public Token valorft;
		public Token valirInt;
		public Token impComillas;
		public Token ps;
		public FuncionesContext pf;
		public OperacionContext po;
		public TerminalNode PRINT() { return getToken(miniBParser.PRINT, 0); }
		public TerminalNode FLOTANTE() { return getToken(miniBParser.FLOTANTE, 0); }
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
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
			setState(80);
			match(PRINT);
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(81);
				((ImprimirContext)_localctx).valorft = match(FLOTANTE);
				}
				break;
			case 2:
				{
				setState(82);
				((ImprimirContext)_localctx).valirInt = match(INT);
				}
				break;
			case 3:
				{
				setState(83);
				((ImprimirContext)_localctx).impComillas = match(STRINGCOM);
				}
				break;
			case 4:
				{
				setState(84);
				((ImprimirContext)_localctx).ps = match(STRING);
				}
				break;
			case 5:
				{
				setState(85);
				((ImprimirContext)_localctx).pf = funciones();
				}
				break;
			case 6:
				{
				setState(86);
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
		public Token valorft;
		public Token valors;
		public Token valori;
		public FuncionesContext valorf;
		public ArrayContext valorarr;
		public TerminalNode LET() { return getToken(miniBParser.LET, 0); }
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode FLOTANTE() { return getToken(miniBParser.FLOTANTE, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
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
			setState(89);
			match(LET);
			setState(90);
			((LETTContext)_localctx).nombre = match(STRING);
			setState(91);
			match(IGUAL);
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOTANTE:
				{
				setState(92);
				((LETTContext)_localctx).valorft = match(FLOTANTE);
				}
				break;
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
			case CORCHETEA:
				{
				setState(96);
				((LETTContext)_localctx).valorarr = array();
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
		public Token ft;
		public Token str;
		public Token numero;
		public ArrayContext arr;
		public FuncionesContext f;
		public OperacionContext op;
		public TerminalNode IGUAL() { return getToken(miniBParser.IGUAL, 0); }
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
		public TerminalNode FLOTANTE() { return getToken(miniBParser.FLOTANTE, 0); }
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
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
			setState(99);
			((AsignarContext)_localctx).nombre = match(STRING);
			setState(100);
			match(IGUAL);
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(101);
				((AsignarContext)_localctx).ft = match(FLOTANTE);
				}
				break;
			case 2:
				{
				setState(102);
				((AsignarContext)_localctx).str = match(STRING);
				}
				break;
			case 3:
				{
				setState(103);
				((AsignarContext)_localctx).numero = match(INT);
				}
				break;
			case 4:
				{
				setState(104);
				((AsignarContext)_localctx).arr = array();
				}
				break;
			case 5:
				{
				setState(105);
				((AsignarContext)_localctx).f = funciones();
				}
				break;
			case 6:
				{
				setState(106);
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
			setState(109);
			match(FOR);
			setState(110);
			((ForContext)_localctx).variableFor = match(STRING);
			setState(111);
			match(IGUAL);
			setState(112);
			((ForContext)_localctx).valorFor = match(INT);
			setState(113);
			match(TO);
			setState(114);
			((ForContext)_localctx).igualacion = match(INT);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(115);
					condicionalif();
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(116);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
			setState(125);
			match(IF);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
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
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					setState(134);
					((IfContext)_localctx).conti = match(CONTINUE);
					}
					break;
				case EXIT:
					{
					setState(135);
					((IfContext)_localctx).exit = match(EXIT);
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(136);
					((IfContext)_localctx).inst1 = instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << CONTINUE) | (1L << EXIT) | (1L << STRING))) != 0) );
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(143);
				match(ELSE);
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(144);
					((IfContext)_localctx).inst2 = instruccion();
					}
					}
					setState(147); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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
			setState(156);
			match(INPUT);
			setState(157);
			((IntroducirContext)_localctx).paraImprimir = match(STRINGCOM);
			setState(158);
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
			setState(160);
			match(REPEAT);
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				instruccion();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(166);
			match(UNTIL);
			setState(167);
			((RepetirContext)_localctx).var = match(STRING);
			setState(168);
			match(IGUAL);
			setState(169);
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
			setState(171);
			match(WHILE);
			setState(172);
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
			setState(173);
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
			setState(174);
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
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(175);
					instruccion();
					}
					break;
				case 2:
					{
					setState(176);
					let();
					}
					break;
				}
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(183);
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

			setState(186);
			((NumberESContext)_localctx).number = sumandos();
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OPERACIONESContext(new OperacionContext(_parentctx, _parentState));
					((OPERACIONESContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_operacion);
					setState(188);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(189);
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
					setState(190);
					((OPERACIONESContext)_localctx).right = sumandos();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public Token flt;
		public Token strc;
		public ArrayContext arr;
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode FLOTANTE() { return getToken(miniBParser.FLOTANTE, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOTANTE:
				{
				setState(196);
				((SumandosContext)_localctx).flt = match(FLOTANTE);
				}
				break;
			case INT:
				{
				setState(197);
				match(INT);
				}
				break;
			case STRINGCOM:
				{
				setState(198);
				((SumandosContext)_localctx).strc = match(STRINGCOM);
				}
				break;
			case STRING:
				{
				setState(199);
				match(STRING);
				}
				break;
			case CORCHETEA:
				{
				setState(200);
				((SumandosContext)_localctx).arr = array();
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
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				setState(203);
				match(LET);
				setState(204);
				match(IGUAL);
				setState(205);
				match(INT);
				}
				break;
			case FOR:
				{
				setState(206);
				match(FOR);
				setState(207);
				match(STRING);
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(210);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
						{
						setState(208);
						condicionalif();
						}
						break;
					case PRINT:
					case LET:
					case STRING:
						{
						setState(209);
						instruccion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(214); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << IF) | (1L << STRING))) != 0) );
				setState(216);
				match(NEXT);
				}
				break;
			case WHILE:
				{
				setState(218);
				match(WHILE);
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
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
					}
					}
					setState(226); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
				setState(228);
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
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public TerminalNode PRINT() { return getToken(miniBParser.PRINT, 0); }
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
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				{
				setState(232);
				match(LET);
				setState(233);
				match(STRING);
				setState(234);
				match(IGUAL);
				setState(235);
				match(COMILLAS);
				setState(236);
				match(INT);
				setState(237);
				match(COMILLAS);
				}
				}
				break;
			case PRINT:
				{
				{
				setState(238);
				match(PRINT);
				setState(239);
				match(STRING);
				setState(240);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR) | (1L << ENTRE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(241);
				match(INT);
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
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new FuncionIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				((FuncionIntContext)_localctx).nFun = match(STRING);
				setState(245);
				match(PARENTESISA);
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(246);
					((FuncionIntContext)_localctx).valorFun = match(INT);
					}
					}
					setState(249); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(251);
				match(PARENTESISC);
				}
				break;
			case 2:
				_localctx = new FuncionStringsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				((FuncionStringsContext)_localctx).nFun = match(STRING);
				setState(253);
				match(PARENTESISA);
				setState(256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRINGCOM:
					{
					setState(254);
					((FuncionStringsContext)_localctx).vsc = match(STRINGCOM);
					}
					break;
				case STRING:
					{
					setState(255);
					((FuncionStringsContext)_localctx).vs = match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(258);
				match(PARENTESISC);
				}
				break;
			case 3:
				_localctx = new FuncionfuncionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				((FuncionfuncionContext)_localctx).nFun = match(STRING);
				setState(260);
				match(PARENTESISA);
				setState(261);
				((FuncionfuncionContext)_localctx).valorFun = funciones();
				setState(262);
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
			setState(266);
			match(REM);
			setState(268); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(267);
					match(STRING);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(270); 
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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
		public Token tipoReturn;
		public Token nomDef;
		public Token tipo;
		public Token Variable;
		public OperacionContext dop;
		public CondicionalifContext dif;
		public BucleforContext dfor;
		public BuclewhileContext dw;
		public FuncionesContext df;
		public AsignacionContext dasi;
		public PosiblesReturnContext vret;
		public TerminalNode DEF() { return getToken(miniBParser.DEF, 0); }
		public TerminalNode PARENTESISA() { return getToken(miniBParser.PARENTESISA, 0); }
		public TerminalNode PARENTESISC() { return getToken(miniBParser.PARENTESISC, 0); }
		public TerminalNode PUNTOS() { return getToken(miniBParser.PUNTOS, 0); }
		public TerminalNode RETURN() { return getToken(miniBParser.RETURN, 0); }
		public TerminalNode END() { return getToken(miniBParser.END, 0); }
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
		public PosiblesReturnContext posiblesReturn() {
			return getRuleContext(PosiblesReturnContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
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
		public List<TerminalNode> COMA() { return getTokens(miniBParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miniBParser.COMA, i);
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
			setState(274);
			match(DEF);
			setState(275);
			((DEFFuncionContext)_localctx).tipoReturn = match(STRING);
			setState(276);
			((DEFFuncionContext)_localctx).nomDef = match(STRING);
			setState(277);
			match(PARENTESISA);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(278);
				((DEFFuncionContext)_localctx).tipo = match(STRING);
				setState(279);
				((DEFFuncionContext)_localctx).Variable = match(STRING);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(280);
					match(COMA);
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(PARENTESISC);
			setState(292);
			match(PUNTOS);
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(293);
					((DEFFuncionContext)_localctx).dop = operacion(0);
					}
					break;
				case 2:
					{
					setState(294);
					((DEFFuncionContext)_localctx).dif = condicionalif();
					}
					break;
				case 3:
					{
					setState(295);
					((DEFFuncionContext)_localctx).dfor = buclefor();
					}
					break;
				case 4:
					{
					setState(296);
					((DEFFuncionContext)_localctx).dw = buclewhile();
					}
					break;
				case 5:
					{
					setState(297);
					((DEFFuncionContext)_localctx).df = funciones();
					}
					break;
				case 6:
					{
					setState(298);
					((DEFFuncionContext)_localctx).dasi = asignacion();
					}
					break;
				case 7:
					{
					setState(299);
					instruccion();
					}
					break;
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CORCHETEA) | (1L << PRINT) | (1L << LET) | (1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << STRING) | (1L << STRINGCOM) | (1L << INT) | (1L << FLOTANTE))) != 0) );
			setState(304);
			match(RETURN);
			setState(305);
			((DEFFuncionContext)_localctx).vret = posiblesReturn();
			setState(306);
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
		public Token nomDef;
		public Token tipo;
		public Token Variable;
		public OperacionContext so;
		public CondicionalifContext sif;
		public BucleforContext sfor;
		public BuclewhileContext sw;
		public FuncionesContext sf;
		public AsignacionContext sasi;
		public PrintContext sp;
		public TerminalNode END() { return getToken(miniBParser.END, 0); }
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
		public List<TerminalNode> COMA() { return getTokens(miniBParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miniBParser.COMA, i);
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
		int _la;
		try {
			_localctx = new DEFsubrutinaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			match(DEF);
			setState(309);
			((DEFsubrutinaContext)_localctx).nomDef = match(STRING);
			setState(310);
			match(PARENTESISA);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(311);
				((DEFsubrutinaContext)_localctx).tipo = match(STRING);
				setState(312);
				((DEFsubrutinaContext)_localctx).Variable = match(STRING);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(313);
					match(COMA);
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(PARENTESISC);
			setState(325);
			match(PUNTOS);
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(326);
					((DEFsubrutinaContext)_localctx).so = operacion(0);
					}
					break;
				case 2:
					{
					setState(327);
					((DEFsubrutinaContext)_localctx).sif = condicionalif();
					}
					break;
				case 3:
					{
					setState(328);
					((DEFsubrutinaContext)_localctx).sfor = buclefor();
					}
					break;
				case 4:
					{
					setState(329);
					((DEFsubrutinaContext)_localctx).sw = buclewhile();
					}
					break;
				case 5:
					{
					setState(330);
					((DEFsubrutinaContext)_localctx).sf = funciones();
					}
					break;
				case 6:
					{
					setState(331);
					((DEFsubrutinaContext)_localctx).sasi = asignacion();
					}
					break;
				case 7:
					{
					setState(332);
					((DEFsubrutinaContext)_localctx).sp = print();
					}
					break;
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CORCHETEA) | (1L << PRINT) | (1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << STRING) | (1L << STRINGCOM) | (1L << INT) | (1L << FLOTANTE))) != 0) );
			}
			setState(337);
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

			setState(340);
			((NombreCadenaContext)_localctx).sumnombre = match(STRINGCOM);
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
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
					setState(342);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(343);
					match(MAS);
					setState(344);
					((SumaCadenaContext)_localctx).sumnombre = match(STRINGCOM);
					}
					} 
				}
				setState(349);
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
			setState(350);
			((CopiaCadenaContext)_localctx).copianombre = match(STRINGCOM);
			setState(351);
			match(POR);
			setState(352);
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
			setState(354);
			((AccesoCadenaContext)_localctx).accesonombre = match(STRINGCOM);
			setState(355);
			match(CORCHETEA);
			setState(356);
			((AccesoCadenaContext)_localctx).accesovalor = match(INT);
			setState(357);
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
			setState(359);
			((SegCadenaContext)_localctx).segmentonombre = match(STRINGCOM);
			setState(360);
			match(CORCHETEA);
			setState(361);
			((SegCadenaContext)_localctx).segmentovalorI = match(INT);
			setState(362);
			match(PUNTOS);
			setState(363);
			((SegCadenaContext)_localctx).segmentovalorF = match(INT);
			setState(364);
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
		enterRule(_localctx, 48, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		enterRule(_localctx, 50, RULE_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(CORCHETEA);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(369);
					match(STRINGCOM);
					setState(370);
					match(COMA);
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(376);
			match(STRINGCOM);
			setState(377);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u017e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\5\4Q\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bx\n\b\6\bz\n\b\r\b\16\b{\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0086\n\t\3\t\3\t\3\t\3\t\5\t\u008c\n\t\6\t\u008e\n\t\r\t\16\t\u008f"+
		"\3\t\3\t\6\t\u0094\n\t\r\t\16\t\u0095\7\t\u0098\n\t\f\t\16\t\u009b\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\6\13\u00a5\n\13\r\13\16\13\u00a6"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b4\n\f\6\f\u00b6"+
		"\n\f\r\f\16\f\u00b7\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c2\n\r\f\r"+
		"\16\r\u00c5\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00cc\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00d5\n\17\6\17\u00d7\n\17\r\17\16\17\u00d8"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e1\n\17\6\17\u00e3\n\17\r\17\16"+
		"\17\u00e4\3\17\3\17\5\17\u00e9\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00f5\n\20\3\21\3\21\3\21\6\21\u00fa\n\21\r\21\16"+
		"\21\u00fb\3\21\3\21\3\21\3\21\3\21\5\21\u0103\n\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u010b\n\21\3\22\3\22\6\22\u010f\n\22\r\22\16\22\u0110"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u011c\n\24\f\24\16"+
		"\24\u011f\13\24\7\24\u0121\n\24\f\24\16\24\u0124\13\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u012f\n\24\r\24\16\24\u0130\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u013d\n\25\f\25\16\25"+
		"\u0140\13\25\7\25\u0142\n\25\f\25\16\25\u0145\13\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\6\25\u0150\n\25\r\25\16\25\u0151\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\7\26\u015c\n\26\f\26\16\26\u015f\13\26\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\33\7\33\u0176\n\33\f\33\16\33\u0179\13"+
		"\33\3\33\3\33\3\33\3\33\2\4\30*\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\2\b\4\2\'\'**\3\2\5\7\3\2\b\f\3\2\b\13\4\2\'(**"+
		"\3\2,-\2\u01b3\29\3\2\2\2\4K\3\2\2\2\6P\3\2\2\2\bR\3\2\2\2\n[\3\2\2\2"+
		"\fe\3\2\2\2\16o\3\2\2\2\20\177\3\2\2\2\22\u009e\3\2\2\2\24\u00a2\3\2\2"+
		"\2\26\u00ad\3\2\2\2\30\u00bb\3\2\2\2\32\u00cb\3\2\2\2\34\u00e8\3\2\2\2"+
		"\36\u00f4\3\2\2\2 \u010a\3\2\2\2\"\u010c\3\2\2\2$\u0112\3\2\2\2&\u0114"+
		"\3\2\2\2(\u0136\3\2\2\2*\u0155\3\2\2\2,\u0160\3\2\2\2.\u0164\3\2\2\2\60"+
		"\u0169\3\2\2\2\62\u0170\3\2\2\2\64\u0172\3\2\2\2\668\5\4\3\2\67\66\3\2"+
		"\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<L\5\n\6\2=L"+
		"\5\24\13\2>L\5\16\b\2?L\5\20\t\2@L\5\b\5\2AL\5\22\n\2BL\5\26\f\2CL\5\34"+
		"\17\2DL\5\36\20\2EL\5 \21\2FL\5\"\22\2GL\5\f\7\2HL\5\30\r\2IL\5&\24\2"+
		"JL\5(\25\2K<\3\2\2\2K=\3\2\2\2K>\3\2\2\2K?\3\2\2\2K@\3\2\2\2KA\3\2\2\2"+
		"KB\3\2\2\2KC\3\2\2\2KD\3\2\2\2KE\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2"+
		"KI\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MQ\5\b\5\2NQ\5\n\6\2OQ\5\f\7\2PM\3\2\2"+
		"\2PN\3\2\2\2PO\3\2\2\2Q\7\3\2\2\2RY\7\25\2\2SZ\7+\2\2TZ\7*\2\2UZ\7(\2"+
		"\2VZ\7\'\2\2WZ\5 \21\2XZ\5\30\r\2YS\3\2\2\2YT\3\2\2\2YU\3\2\2\2YV\3\2"+
		"\2\2YW\3\2\2\2YX\3\2\2\2Z\t\3\2\2\2[\\\7\26\2\2\\]\7\'\2\2]c\7\5\2\2^"+
		"d\7+\2\2_d\7(\2\2`d\7*\2\2ad\5 \21\2bd\5\64\33\2c^\3\2\2\2c_\3\2\2\2c"+
		"`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\13\3\2\2\2ef\7\'\2\2fm\7\5\2\2gn\7+\2\2"+
		"hn\7\'\2\2in\7*\2\2jn\5\64\33\2kn\5 \21\2ln\5\30\r\2mg\3\2\2\2mh\3\2\2"+
		"\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\r\3\2\2\2op\7\30\2\2pq\7\'"+
		"\2\2qr\7\5\2\2rs\7*\2\2st\7\31\2\2ty\7*\2\2ux\5\20\t\2vx\5\6\4\2wu\3\2"+
		"\2\2wv\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2"+
		"\2\2}~\7\17\2\2~\17\3\2\2\2\177\u0085\7\35\2\2\u0080\u0081\t\2\2\2\u0081"+
		"\u0082\t\3\2\2\u0082\u0086\t\2\2\2\u0083\u0086\7\'\2\2\u0084\u0086\7*"+
		"\2\2\u0085\u0080\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u008d\7\36\2\2\u0088\u008c\7\32\2\2\u0089\u008c\7"+
		"\33\2\2\u008a\u008c\5\6\4\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0099\3\2\2\2\u0091"+
		"\u0093\7\34\2\2\u0092\u0094\5\6\4\2\u0093\u0092\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0091\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\16\2\2\u009d"+
		"\21\3\2\2\2\u009e\u009f\7\37\2\2\u009f\u00a0\7(\2\2\u00a0\u00a1\7\'\2"+
		"\2\u00a1\23\3\2\2\2\u00a2\u00a4\7 \2\2\u00a3\u00a5\5\6\4\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\7!\2\2\u00a9\u00aa\7\'\2\2\u00aa\u00ab\7\5"+
		"\2\2\u00ab\u00ac\7*\2\2\u00ac\25\3\2\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af"+
		"\t\2\2\2\u00af\u00b0\t\3\2\2\u00b0\u00b5\t\2\2\2\u00b1\u00b4\5\6\4\2\u00b2"+
		"\u00b4\5\n\6\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\16\2\2\u00ba\27\3\2\2"+
		"\2\u00bb\u00bc\b\r\1\2\u00bc\u00bd\5\32\16\2\u00bd\u00c3\3\2\2\2\u00be"+
		"\u00bf\f\4\2\2\u00bf\u00c0\t\4\2\2\u00c0\u00c2\5\32\16\2\u00c1\u00be\3"+
		"\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\31\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cc\7+\2\2\u00c7\u00cc\7*\2\2"+
		"\u00c8\u00cc\7(\2\2\u00c9\u00cc\7\'\2\2\u00ca\u00cc\5\64\33\2\u00cb\u00c6"+
		"\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\33\3\2\2\2\u00cd\u00ce\7\26\2\2\u00ce\u00cf\7\5\2"+
		"\2\u00cf\u00e9\7*\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00d6\7\'\2\2\u00d2\u00d5"+
		"\5\20\t\2\u00d3\u00d5\5\6\4\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2"+
		"\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\17\2\2"+
		"\u00db\u00e9\3\2\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00e2\t\2\2\2\u00de\u00e1"+
		"\5\6\4\2\u00df\u00e1\5\n\6\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\16\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00cd\3\2\2\2\u00e8\u00d0\3\2\2\2\u00e8\u00dc\3\2"+
		"\2\2\u00e9\35\3\2\2\2\u00ea\u00eb\7\26\2\2\u00eb\u00ec\7\'\2\2\u00ec\u00ed"+
		"\7\5\2\2\u00ed\u00ee\7\24\2\2\u00ee\u00ef\7*\2\2\u00ef\u00f5\7\24\2\2"+
		"\u00f0\u00f1\7\25\2\2\u00f1\u00f2\7\'\2\2\u00f2\u00f3\t\5\2\2\u00f3\u00f5"+
		"\7*\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5\37\3\2\2\2\u00f6"+
		"\u00f7\7\'\2\2\u00f7\u00f9\7\22\2\2\u00f8\u00fa\7*\2\2\u00f9\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u010b\7\23\2\2\u00fe\u00ff\7\'\2\2\u00ff\u0102\7"+
		"\22\2\2\u0100\u0103\7(\2\2\u0101\u0103\7\'\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u010b\7\23\2\2\u0105\u0106\7"+
		"\'\2\2\u0106\u0107\7\22\2\2\u0107\u0108\5 \21\2\u0108\u0109\7\23\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u00f6\3\2\2\2\u010a\u00fe\3\2\2\2\u010a\u0105\3\2"+
		"\2\2\u010b!\3\2\2\2\u010c\u010e\7#\2\2\u010d\u010f\7\'\2\2\u010e\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"#\3\2\2\2\u0112\u0113\t\6\2\2\u0113%\3\2\2\2\u0114\u0115\7$\2\2\u0115"+
		"\u0116\7\'\2\2\u0116\u0117\7\'\2\2\u0117\u0122\7\22\2\2\u0118\u0119\7"+
		"\'\2\2\u0119\u011d\7\'\2\2\u011a\u011c\7\r\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u0120\u0118\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0125\u0126\7\23\2\2\u0126\u012e\7\4\2\2\u0127\u012f\5\30\r\2\u0128"+
		"\u012f\5\20\t\2\u0129\u012f\5\16\b\2\u012a\u012f\5\26\f\2\u012b\u012f"+
		"\5 \21\2\u012c\u012f\5\f\7\2\u012d\u012f\5\6\4\2\u012e\u0127\3\2\2\2\u012e"+
		"\u0128\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7%"+
		"\2\2\u0133\u0134\5$\23\2\u0134\u0135\7\16\2\2\u0135\'\3\2\2\2\u0136\u0137"+
		"\7$\2\2\u0137\u0138\7\'\2\2\u0138\u0143\7\22\2\2\u0139\u013a\7\'\2\2\u013a"+
		"\u013e\7\'\2\2\u013b\u013d\7\r\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0139\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0147\7\23\2\2\u0147\u014f\7\4\2\2\u0148\u0150\5\30\r\2\u0149\u0150\5"+
		"\20\t\2\u014a\u0150\5\16\b\2\u014b\u0150\5\26\f\2\u014c\u0150\5 \21\2"+
		"\u014d\u0150\5\f\7\2\u014e\u0150\5\b\5\2\u014f\u0148\3\2\2\2\u014f\u0149"+
		"\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2\2\2\u014f\u014c\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\16\2\2\u0154"+
		")\3\2\2\2\u0155\u0156\b\26\1\2\u0156\u0157\7(\2\2\u0157\u015d\3\2\2\2"+
		"\u0158\u0159\f\4\2\2\u0159\u015a\7\b\2\2\u015a\u015c\7(\2\2\u015b\u0158"+
		"\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"+\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7(\2\2\u0161\u0162\7\n\2\2\u0162"+
		"\u0163\7*\2\2\u0163-\3\2\2\2\u0164\u0165\7(\2\2\u0165\u0166\7\20\2\2\u0166"+
		"\u0167\7*\2\2\u0167\u0168\7\21\2\2\u0168/\3\2\2\2\u0169\u016a\7(\2\2\u016a"+
		"\u016b\7\20\2\2\u016b\u016c\7*\2\2\u016c\u016d\7\4\2\2\u016d\u016e\7*"+
		"\2\2\u016e\u016f\7\21\2\2\u016f\61\3\2\2\2\u0170\u0171\t\7\2\2\u0171\63"+
		"\3\2\2\2\u0172\u0177\7\20\2\2\u0173\u0174\7(\2\2\u0174\u0176\7\r\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7(\2\2\u017b"+
		"\u017c\7\21\2\2\u017c\65\3\2\2\2(9KPYcmw{\u0085\u008b\u008f\u0095\u0099"+
		"\u00a6\u00b3\u00b7\u00c3\u00cb\u00d4\u00d8\u00e0\u00e4\u00e8\u00f4\u00fb"+
		"\u0102\u010a\u0110\u011d\u0122\u012e\u0130\u013e\u0143\u014f\u0151\u015d"+
		"\u0177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}