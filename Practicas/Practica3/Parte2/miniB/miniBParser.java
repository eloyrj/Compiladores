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
		ENTRE=9, MOD=10, PUNTO=11, COMA=12, END=13, NEXT=14, CORCHETEA=15, CORCHETEC=16, 
		PARENTESISA=17, PARENTESISC=18, COMILLAS=19, PRINT=20, LET=21, NOTNUMBER=22, 
		FOR=23, TO=24, CONTINUE=25, EXIT=26, ELSE=27, IF=28, THEN=29, INPUT=30, 
		REPEAT=31, UNTIL=32, WHILE=33, REM=34, DEF=35, RETURN=36, IN=37, STRING=38, 
		STRINGCOM=39, INTRO=40, INT=41, BOOLEANT=42, BOOLEANF=43, TIPOS=44;
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
			"POR", "ENTRE", "MOD", "PUNTO", "COMA", "END", "NEXT", "CORCHETEA", "CORCHETEC", 
			"PARENTESISA", "PARENTESISC", "COMILLAS", "PRINT", "LET", "NOTNUMBER", 
			"FOR", "TO", "CONTINUE", "EXIT", "ELSE", "IF", "THEN", "INPUT", "REPEAT", 
			"UNTIL", "WHILE", "REM", "DEF", "RETURN", "IN", "STRING", "STRINGCOM", 
			"INTRO", "INT", "BOOLEANT", "BOOLEANF", "TIPOS"
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << REPEAT) | (1L << WHILE) | (1L << REM) | (1L << DEF) | (1L << STRING) | (1L << STRINGCOM) | (1L << INT))) != 0)) {
				{
				{
				setState(56);
				prog();
				}
				}
				setState(61);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(62);
				let();
				}
				break;
			case 2:
				{
				setState(63);
				repeat();
				}
				break;
			case 3:
				{
				setState(64);
				buclefor();
				}
				break;
			case 4:
				{
				setState(65);
				condicionalif();
				}
				break;
			case 5:
				{
				setState(66);
				print();
				}
				break;
			case 6:
				{
				setState(67);
				input();
				}
				break;
			case 7:
				{
				setState(68);
				buclewhile();
				}
				break;
			case 8:
				{
				setState(69);
				errorsintactico();
				}
				break;
			case 9:
				{
				setState(70);
				errortipo();
				}
				break;
			case 10:
				{
				setState(71);
				funciones();
				}
				break;
			case 11:
				{
				setState(72);
				rem();
				}
				break;
			case 12:
				{
				setState(73);
				asignacion();
				}
				break;
			case 13:
				{
				setState(74);
				operacion(0);
				}
				break;
			case 14:
				{
				setState(75);
				defFuncion();
				}
				break;
			case 15:
				{
				setState(76);
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				{
				setState(79);
				print();
				}
				break;
			case LET:
				{
				setState(80);
				let();
				}
				break;
			case STRING:
				{
				setState(81);
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
			setState(84);
			match(PRINT);
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(85);
				((ImprimirContext)_localctx).impComillas = match(STRINGCOM);
				}
				break;
			case 2:
				{
				setState(86);
				((ImprimirContext)_localctx).ps = match(STRING);
				}
				break;
			case 3:
				{
				setState(87);
				((ImprimirContext)_localctx).pf = funciones();
				}
				break;
			case 4:
				{
				setState(88);
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
			setState(91);
			match(LET);
			setState(92);
			((LETTContext)_localctx).nombre = match(STRING);
			setState(93);
			match(IGUAL);
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGCOM:
				{
				setState(94);
				((LETTContext)_localctx).valors = match(STRINGCOM);
				}
				break;
			case INT:
				{
				setState(95);
				((LETTContext)_localctx).valori = match(INT);
				}
				break;
			case STRING:
				{
				setState(96);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(101);
				((AsignarContext)_localctx).str = match(STRING);
				}
				break;
			case 2:
				{
				setState(102);
				((AsignarContext)_localctx).numero = match(INT);
				}
				break;
			case 3:
				{
				setState(103);
				((AsignarContext)_localctx).f = funciones();
				}
				break;
			case 4:
				{
				setState(104);
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
			setState(107);
			match(FOR);
			setState(108);
			((ForContext)_localctx).variableFor = match(STRING);
			setState(109);
			match(IGUAL);
			setState(110);
			((ForContext)_localctx).valorFor = match(INT);
			setState(111);
			match(TO);
			setState(112);
			((ForContext)_localctx).igualacion = match(INT);
			setState(113);
			match(INTRO);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(114);
					condicionalif();
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(115);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118);
				match(INTRO);
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << IF) | (1L << STRING))) != 0) );
			setState(124);
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
			setState(126);
			match(IF);
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				{
				setState(127);
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
				setState(128);
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
				setState(129);
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
				setState(130);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(131);
				match(INT);
				}
				break;
			}
			setState(134);
			match(THEN);
			setState(135);
			match(INTRO);
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					setState(136);
					((IfContext)_localctx).conti = match(CONTINUE);
					}
					break;
				case EXIT:
					{
					setState(137);
					((IfContext)_localctx).exit = match(EXIT);
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(138);
					((IfContext)_localctx).inst1 = instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141);
				match(INTRO);
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << CONTINUE) | (1L << EXIT) | (1L << STRING))) != 0) );
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(146);
				match(ELSE);
				setState(147);
				match(INTRO);
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(148);
					((IfContext)_localctx).inst2 = instruccion();
					setState(149);
					match(INTRO);
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
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
			setState(162);
			match(INPUT);
			setState(163);
			((IntroducirContext)_localctx).paraImprimir = match(STRINGCOM);
			setState(164);
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
			setState(166);
			match(REPEAT);
			setState(167);
			match(INTRO);
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				instruccion();
				setState(169);
				match(INTRO);
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(175);
			match(UNTIL);
			setState(176);
			((RepetirContext)_localctx).var = match(STRING);
			setState(177);
			match(IGUAL);
			setState(178);
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
			setState(180);
			match(WHILE);
			setState(181);
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
			setState(182);
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
			setState(183);
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
			setState(184);
			match(INTRO);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(185);
					instruccion();
					}
					break;
				case 2:
					{
					setState(186);
					let();
					}
					break;
				}
				setState(189);
				match(INTRO);
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(195);
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

			setState(198);
			((NumberESContext)_localctx).number = sumandos();
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
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
					setState(200);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(201);
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
					setState(202);
					((OPERACIONESContext)_localctx).right = sumandos();
					}
					} 
				}
				setState(207);
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
		public Token strc;
		public TerminalNode INT() { return getToken(miniBParser.INT, 0); }
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
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
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(208);
				match(INT);
				}
				break;
			case STRINGCOM:
				{
				setState(209);
				((SumandosContext)_localctx).strc = match(STRINGCOM);
				}
				break;
			case STRING:
				{
				setState(210);
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
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				setState(213);
				match(LET);
				setState(214);
				match(IGUAL);
				setState(215);
				match(INT);
				}
				break;
			case FOR:
				{
				setState(216);
				match(FOR);
				setState(217);
				match(STRING);
				setState(218);
				match(INTRO);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(221);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
						{
						setState(219);
						condicionalif();
						}
						break;
					case PRINT:
					case LET:
					case STRING:
						{
						setState(220);
						instruccion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(223);
					match(INTRO);
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << IF) | (1L << STRING))) != 0) );
				setState(229);
				match(NEXT);
				}
				break;
			case WHILE:
				{
				setState(231);
				match(WHILE);
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				match(INTRO);
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(234);
						instruccion();
						}
						break;
					case 2:
						{
						setState(235);
						let();
						}
						break;
					}
					setState(238);
					match(INTRO);
					}
					}
					setState(242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
				setState(244);
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
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				{
				setState(248);
				match(LET);
				setState(249);
				match(STRING);
				setState(250);
				match(IGUAL);
				setState(251);
				match(COMILLAS);
				setState(252);
				match(INT);
				setState(253);
				match(COMILLAS);
				}
				}
				break;
			case PRINT:
				{
				{
				setState(254);
				match(PRINT);
				setState(255);
				match(STRING);
				setState(256);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR) | (1L << ENTRE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
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
		public List<TerminalNode> COMILLAS() { return getTokens(miniBParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(miniBParser.COMILLAS, i);
		}
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
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new FuncionIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((FuncionIntContext)_localctx).nFun = match(STRING);
				setState(261);
				match(PARENTESISA);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMILLAS) {
					{
					{
					setState(262);
					match(COMILLAS);
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(268);
					((FuncionIntContext)_localctx).valorFun = match(INT);
					}
					}
					setState(271); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMILLAS) {
					{
					{
					setState(273);
					match(COMILLAS);
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(279);
				match(PARENTESISC);
				}
				break;
			case 2:
				_localctx = new FuncionStringsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				((FuncionStringsContext)_localctx).nFun = match(STRING);
				setState(281);
				match(PARENTESISA);
				setState(284);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRINGCOM:
					{
					setState(282);
					((FuncionStringsContext)_localctx).vsc = match(STRINGCOM);
					}
					break;
				case STRING:
					{
					setState(283);
					((FuncionStringsContext)_localctx).vs = match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(286);
				match(PARENTESISC);
				}
				break;
			case 3:
				_localctx = new FuncionfuncionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				((FuncionfuncionContext)_localctx).nFun = match(STRING);
				setState(288);
				match(PARENTESISA);
				setState(289);
				((FuncionfuncionContext)_localctx).valorFun = funciones();
				setState(290);
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
			setState(294);
			match(REM);
			setState(296); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(295);
					match(STRING);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(298); 
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
			setState(300);
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
			setState(302);
			match(DEF);
			setState(303);
			((DEFFuncionContext)_localctx).tipoReturn = match(STRING);
			setState(304);
			((DEFFuncionContext)_localctx).nomDef = match(STRING);
			setState(305);
			match(PARENTESISA);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(306);
				((DEFFuncionContext)_localctx).tipo = match(STRING);
				setState(307);
				((DEFFuncionContext)_localctx).Variable = match(STRING);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(308);
					match(COMA);
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(PARENTESISC);
			setState(320);
			match(PUNTOS);
			setState(328); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(321);
					((DEFFuncionContext)_localctx).dop = operacion(0);
					}
					break;
				case 2:
					{
					setState(322);
					((DEFFuncionContext)_localctx).dif = condicionalif();
					}
					break;
				case 3:
					{
					setState(323);
					((DEFFuncionContext)_localctx).dfor = buclefor();
					}
					break;
				case 4:
					{
					setState(324);
					((DEFFuncionContext)_localctx).dw = buclewhile();
					}
					break;
				case 5:
					{
					setState(325);
					((DEFFuncionContext)_localctx).df = funciones();
					}
					break;
				case 6:
					{
					setState(326);
					((DEFFuncionContext)_localctx).dasi = asignacion();
					}
					break;
				case 7:
					{
					setState(327);
					instruccion();
					}
					break;
				}
				}
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << STRING) | (1L << STRINGCOM) | (1L << INT))) != 0) );
			setState(332);
			match(RETURN);
			setState(333);
			((DEFFuncionContext)_localctx).vret = posiblesReturn();
			setState(334);
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
			setState(336);
			match(DEF);
			setState(337);
			((DEFsubrutinaContext)_localctx).nomDef = match(STRING);
			setState(338);
			match(PARENTESISA);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(339);
				((DEFsubrutinaContext)_localctx).tipo = match(STRING);
				setState(340);
				((DEFsubrutinaContext)_localctx).Variable = match(STRING);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(341);
					match(COMA);
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(PARENTESISC);
			setState(353);
			match(PUNTOS);
			setState(361); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(354);
					((DEFsubrutinaContext)_localctx).so = operacion(0);
					}
					break;
				case 2:
					{
					setState(355);
					((DEFsubrutinaContext)_localctx).sif = condicionalif();
					}
					break;
				case 3:
					{
					setState(356);
					((DEFsubrutinaContext)_localctx).sfor = buclefor();
					}
					break;
				case 4:
					{
					setState(357);
					((DEFsubrutinaContext)_localctx).sw = buclewhile();
					}
					break;
				case 5:
					{
					setState(358);
					((DEFsubrutinaContext)_localctx).sf = funciones();
					}
					break;
				case 6:
					{
					setState(359);
					((DEFsubrutinaContext)_localctx).sasi = asignacion();
					}
					break;
				case 7:
					{
					setState(360);
					((DEFsubrutinaContext)_localctx).sp = print();
					}
					break;
				}
				}
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << STRING) | (1L << STRINGCOM) | (1L << INT))) != 0) );
			}
			setState(365);
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

			setState(368);
			((NombreCadenaContext)_localctx).sumnombre = match(STRINGCOM);
			}
			_ctx.stop = _input.LT(-1);
			setState(375);
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
					setState(370);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(371);
					match(MAS);
					setState(372);
					((SumaCadenaContext)_localctx).sumnombre = match(STRINGCOM);
					}
					} 
				}
				setState(377);
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
			setState(378);
			((CopiaCadenaContext)_localctx).copianombre = match(STRINGCOM);
			setState(379);
			match(POR);
			setState(380);
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
			setState(382);
			((AccesoCadenaContext)_localctx).accesonombre = match(STRINGCOM);
			setState(383);
			match(CORCHETEA);
			setState(384);
			((AccesoCadenaContext)_localctx).accesovalor = match(INT);
			setState(385);
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
			setState(387);
			((SegCadenaContext)_localctx).segmentonombre = match(STRINGCOM);
			setState(388);
			match(CORCHETEA);
			setState(389);
			((SegCadenaContext)_localctx).segmentovalorI = match(INT);
			setState(390);
			match(PUNTOS);
			setState(391);
			((SegCadenaContext)_localctx).segmentovalorF = match(INT);
			setState(392);
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
			setState(394);
			match(INT);
			setState(395);
			match(PUNTO);
			setState(396);
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
			setState(398);
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
			setState(400);
			match(CORCHETEA);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(401);
					match(STRINGCOM);
					setState(402);
					match(COMA);
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(408);
			match(STRINGCOM);
			setState(409);
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
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MENOS) {
				{
				setState(411);
				match(MENOS);
				}
			}

			setState(414);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3"+
		"\4\3\4\3\4\5\4U\n\4\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bw\n\b\3\b\3\b\6\b{\n\b\r\b\16\b|\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u0087\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\t\6\t\u0091"+
		"\n\t\r\t\16\t\u0092\3\t\3\t\3\t\3\t\3\t\6\t\u009a\n\t\r\t\16\t\u009b\7"+
		"\t\u009e\n\t\f\t\16\t\u00a1\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\6\13\u00ae\n\13\r\13\16\13\u00af\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00be\n\f\3\f\3\f\6\f\u00c2\n\f\r\f\16"+
		"\f\u00c3\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ce\n\r\f\r\16\r\u00d1"+
		"\13\r\3\16\3\16\3\16\5\16\u00d6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00e0\n\17\3\17\3\17\6\17\u00e4\n\17\r\17\16\17\u00e5\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ef\n\17\3\17\3\17\6\17\u00f3\n"+
		"\17\r\17\16\17\u00f4\3\17\3\17\5\17\u00f9\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0105\n\20\3\21\3\21\3\21\7\21\u010a\n"+
		"\21\f\21\16\21\u010d\13\21\3\21\6\21\u0110\n\21\r\21\16\21\u0111\3\21"+
		"\7\21\u0115\n\21\f\21\16\21\u0118\13\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u011f\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0127\n\21\3\22\3\22\6"+
		"\22\u012b\n\22\r\22\16\22\u012c\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u0138\n\24\f\24\16\24\u013b\13\24\7\24\u013d\n\24\f\24\16\24"+
		"\u0140\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u014b\n"+
		"\24\r\24\16\24\u014c\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u0159\n\25\f\25\16\25\u015c\13\25\7\25\u015e\n\25\f\25\16\25\u0161"+
		"\13\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u016c\n\25\r"+
		"\25\16\25\u016d\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0178\n\26"+
		"\f\26\16\26\u017b\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\34\7\34\u0196\n\34\f\34\16\34\u0199\13\34\3\34\3\34\3\34\3\35\5"+
		"\35\u019f\n\35\3\35\3\35\3\35\2\4\30*\36\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668\2\b\4\2((++\3\2\5\7\3\2\b\f\3\2\b\13\4"+
		"\2()++\3\2,-\2\u01d1\2=\3\2\2\2\4O\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2\n]\3"+
		"\2\2\2\fe\3\2\2\2\16m\3\2\2\2\20\u0080\3\2\2\2\22\u00a4\3\2\2\2\24\u00a8"+
		"\3\2\2\2\26\u00b6\3\2\2\2\30\u00c7\3\2\2\2\32\u00d5\3\2\2\2\34\u00f8\3"+
		"\2\2\2\36\u0104\3\2\2\2 \u0126\3\2\2\2\"\u0128\3\2\2\2$\u012e\3\2\2\2"+
		"&\u0130\3\2\2\2(\u0152\3\2\2\2*\u0171\3\2\2\2,\u017c\3\2\2\2.\u0180\3"+
		"\2\2\2\60\u0185\3\2\2\2\62\u018c\3\2\2\2\64\u0190\3\2\2\2\66\u0192\3\2"+
		"\2\28\u019e\3\2\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2"+
		">\3\3\2\2\2?=\3\2\2\2@P\5\n\6\2AP\5\24\13\2BP\5\16\b\2CP\5\20\t\2DP\5"+
		"\b\5\2EP\5\22\n\2FP\5\26\f\2GP\5\34\17\2HP\5\36\20\2IP\5 \21\2JP\5\"\22"+
		"\2KP\5\f\7\2LP\5\30\r\2MP\5&\24\2NP\5(\25\2O@\3\2\2\2OA\3\2\2\2OB\3\2"+
		"\2\2OC\3\2\2\2OD\3\2\2\2OE\3\2\2\2OF\3\2\2\2OG\3\2\2\2OH\3\2\2\2OI\3\2"+
		"\2\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\5\3\2\2\2QU\5"+
		"\b\5\2RU\5\n\6\2SU\5\f\7\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\7\3\2\2\2V["+
		"\7\26\2\2W\\\7)\2\2X\\\7(\2\2Y\\\5 \21\2Z\\\5\30\r\2[W\3\2\2\2[X\3\2\2"+
		"\2[Y\3\2\2\2[Z\3\2\2\2\\\t\3\2\2\2]^\7\27\2\2^_\7(\2\2_c\7\5\2\2`d\7)"+
		"\2\2ad\7+\2\2bd\5 \21\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\13\3\2\2\2ef\7"+
		"(\2\2fk\7\5\2\2gl\7(\2\2hl\7+\2\2il\5 \21\2jl\5\30\r\2kg\3\2\2\2kh\3\2"+
		"\2\2ki\3\2\2\2kj\3\2\2\2l\r\3\2\2\2mn\7\31\2\2no\7(\2\2op\7\5\2\2pq\7"+
		"+\2\2qr\7\32\2\2rs\7+\2\2sz\7*\2\2tw\5\20\t\2uw\5\6\4\2vt\3\2\2\2vu\3"+
		"\2\2\2wx\3\2\2\2xy\7*\2\2y{\3\2\2\2zv\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3"+
		"\2\2\2}~\3\2\2\2~\177\7\20\2\2\177\17\3\2\2\2\u0080\u0086\7\36\2\2\u0081"+
		"\u0082\t\2\2\2\u0082\u0083\t\3\2\2\u0083\u0087\t\2\2\2\u0084\u0087\7("+
		"\2\2\u0085\u0087\7+\2\2\u0086\u0081\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\37\2\2\u0089\u0090\7"+
		"*\2\2\u008a\u008e\7\33\2\2\u008b\u008e\7\34\2\2\u008c\u008e\5\6\4\2\u008d"+
		"\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0091\7*\2\2\u0090\u008d\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009f\3\2\2\2\u0094\u0095\7\35"+
		"\2\2\u0095\u0099\7*\2\2\u0096\u0097\5\6\4\2\u0097\u0098\7*\2\2\u0098\u009a"+
		"\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u0094\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7\17\2\2\u00a3\21\3\2\2\2\u00a4\u00a5\7 \2"+
		"\2\u00a5\u00a6\7)\2\2\u00a6\u00a7\7(\2\2\u00a7\23\3\2\2\2\u00a8\u00a9"+
		"\7!\2\2\u00a9\u00ad\7*\2\2\u00aa\u00ab\5\6\4\2\u00ab\u00ac\7*\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\"\2\2\u00b2"+
		"\u00b3\7(\2\2\u00b3\u00b4\7\5\2\2\u00b4\u00b5\7+\2\2\u00b5\25\3\2\2\2"+
		"\u00b6\u00b7\7#\2\2\u00b7\u00b8\t\2\2\2\u00b8\u00b9\t\3\2\2\u00b9\u00ba"+
		"\t\2\2\2\u00ba\u00c1\7*\2\2\u00bb\u00be\5\6\4\2\u00bc\u00be\5\n\6\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7*"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\17"+
		"\2\2\u00c6\27\3\2\2\2\u00c7\u00c8\b\r\1\2\u00c8\u00c9\5\32\16\2\u00c9"+
		"\u00cf\3\2\2\2\u00ca\u00cb\f\4\2\2\u00cb\u00cc\t\4\2\2\u00cc\u00ce\5\32"+
		"\16\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\31\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d6\7+\2\2"+
		"\u00d3\u00d6\7)\2\2\u00d4\u00d6\7(\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\33\3\2\2\2\u00d7\u00d8\7\27\2\2\u00d8"+
		"\u00d9\7\5\2\2\u00d9\u00f9\7+\2\2\u00da\u00db\7\31\2\2\u00db\u00dc\7("+
		"\2\2\u00dc\u00e3\7*\2\2\u00dd\u00e0\5\20\t\2\u00de\u00e0\5\6\4\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7*"+
		"\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\20"+
		"\2\2\u00e8\u00f9\3\2\2\2\u00e9\u00ea\7#\2\2\u00ea\u00eb\t\2\2\2\u00eb"+
		"\u00f2\7*\2\2\u00ec\u00ef\5\6\4\2\u00ed\u00ef\5\n\6\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\17\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00d7\3\2\2\2\u00f8\u00da\3\2\2\2\u00f8\u00e9\3\2"+
		"\2\2\u00f9\35\3\2\2\2\u00fa\u00fb\7\27\2\2\u00fb\u00fc\7(\2\2\u00fc\u00fd"+
		"\7\5\2\2\u00fd\u00fe\7\25\2\2\u00fe\u00ff\7+\2\2\u00ff\u0105\7\25\2\2"+
		"\u0100\u0101\7\26\2\2\u0101\u0102\7(\2\2\u0102\u0103\t\5\2\2\u0103\u0105"+
		"\7+\2\2\u0104\u00fa\3\2\2\2\u0104\u0100\3\2\2\2\u0105\37\3\2\2\2\u0106"+
		"\u0107\7(\2\2\u0107\u010b\7\23\2\2\u0108\u010a\7\25\2\2\u0109\u0108\3"+
		"\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\7+\2\2\u010f\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0116\3\2\2\2\u0113\u0115\7\25\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u0127\7\24\2\2\u011a\u011b\7(\2\2\u011b\u011e\7\23"+
		"\2\2\u011c\u011f\7)\2\2\u011d\u011f\7(\2\2\u011e\u011c\3\2\2\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0127\7\24\2\2\u0121\u0122\7(\2\2\u0122"+
		"\u0123\7\23\2\2\u0123\u0124\5 \21\2\u0124\u0125\7\24\2\2\u0125\u0127\3"+
		"\2\2\2\u0126\u0106\3\2\2\2\u0126\u011a\3\2\2\2\u0126\u0121\3\2\2\2\u0127"+
		"!\3\2\2\2\u0128\u012a\7$\2\2\u0129\u012b\7(\2\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d#\3\2\2\2"+
		"\u012e\u012f\t\6\2\2\u012f%\3\2\2\2\u0130\u0131\7%\2\2\u0131\u0132\7("+
		"\2\2\u0132\u0133\7(\2\2\u0133\u013e\7\23\2\2\u0134\u0135\7(\2\2\u0135"+
		"\u0139\7(\2\2\u0136\u0138\7\16\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u0134\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0142\7\24\2\2\u0142\u014a\7\4\2\2\u0143\u014b\5\30\r\2\u0144\u014b\5"+
		"\20\t\2\u0145\u014b\5\16\b\2\u0146\u014b\5\26\f\2\u0147\u014b\5 \21\2"+
		"\u0148\u014b\5\f\7\2\u0149\u014b\5\6\4\2\u014a\u0143\3\2\2\2\u014a\u0144"+
		"\3\2\2\2\u014a\u0145\3\2\2\2\u014a\u0146\3\2\2\2\u014a\u0147\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7&\2\2\u014f"+
		"\u0150\5$\23\2\u0150\u0151\7\17\2\2\u0151\'\3\2\2\2\u0152\u0153\7%\2\2"+
		"\u0153\u0154\7(\2\2\u0154\u015f\7\23\2\2\u0155\u0156\7(\2\2\u0156\u015a"+
		"\7(\2\2\u0157\u0159\7\16\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015d\u0155\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7\24"+
		"\2\2\u0163\u016b\7\4\2\2\u0164\u016c\5\30\r\2\u0165\u016c\5\20\t\2\u0166"+
		"\u016c\5\16\b\2\u0167\u016c\5\26\f\2\u0168\u016c\5 \21\2\u0169\u016c\5"+
		"\f\7\2\u016a\u016c\5\b\5\2\u016b\u0164\3\2\2\2\u016b\u0165\3\2\2\2\u016b"+
		"\u0166\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\17\2\2\u0170)\3\2\2\2"+
		"\u0171\u0172\b\26\1\2\u0172\u0173\7)\2\2\u0173\u0179\3\2\2\2\u0174\u0175"+
		"\f\4\2\2\u0175\u0176\7\b\2\2\u0176\u0178\7)\2\2\u0177\u0174\3\2\2\2\u0178"+
		"\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a+\3\2\2\2"+
		"\u017b\u0179\3\2\2\2\u017c\u017d\7)\2\2\u017d\u017e\7\n\2\2\u017e\u017f"+
		"\7+\2\2\u017f-\3\2\2\2\u0180\u0181\7)\2\2\u0181\u0182\7\21\2\2\u0182\u0183"+
		"\7+\2\2\u0183\u0184\7\22\2\2\u0184/\3\2\2\2\u0185\u0186\7)\2\2\u0186\u0187"+
		"\7\21\2\2\u0187\u0188\7+\2\2\u0188\u0189\7\4\2\2\u0189\u018a\7+\2\2\u018a"+
		"\u018b\7\22\2\2\u018b\61\3\2\2\2\u018c\u018d\7+\2\2\u018d\u018e\7\r\2"+
		"\2\u018e\u018f\7+\2\2\u018f\63\3\2\2\2\u0190\u0191\t\7\2\2\u0191\65\3"+
		"\2\2\2\u0192\u0197\7\21\2\2\u0193\u0194\7)\2\2\u0194\u0196\7\16\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7)\2\2\u019b"+
		"\u019c\7\22\2\2\u019c\67\3\2\2\2\u019d\u019f\7\t\2\2\u019e\u019d\3\2\2"+
		"\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\7+\2\2\u01a19\3"+
		"\2\2\2+=OT[ckv|\u0086\u008d\u0092\u009b\u009f\u00af\u00bd\u00c3\u00cf"+
		"\u00d5\u00df\u00e5\u00ee\u00f4\u00f8\u0104\u010b\u0111\u0116\u011e\u0126"+
		"\u012c\u0139\u013e\u014a\u014c\u015a\u015f\u016b\u016d\u0179\u0197\u019e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}