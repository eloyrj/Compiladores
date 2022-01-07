// Generated from /home/corte/Documentos/Repositorios/Compiladores/Practicas/Practica3/Parte2/miniB/miniB.g4 by ANTLR 4.8
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
		E=1, IGUAL=2, MAYORQUE=3, MENORQUE=4, MAS=5, MENOS=6, POR=7, ENTRE=8, 
		MOD=9, END=10, NEXT=11, PARENTESISA=12, PARENTESISC=13, COMILLAS=14, PRINT=15, 
		LET=16, NOTNUMBER=17, FOR=18, TO=19, CONTINUE=20, EXIT=21, ELSE=22, IF=23, 
		THEN=24, INPUT=25, REPEAT=26, UNTIL=27, WHILE=28, REM=29, STRING=30, STRINGCOM=31, 
		INTRO=32, INT=33;
	public static final int
		RULE_fichero = 0, RULE_prog = 1, RULE_instruccion = 2, RULE_print = 3, 
		RULE_let = 4, RULE_asignacion = 5, RULE_buclefor = 6, RULE_condicionalif = 7, 
		RULE_input = 8, RULE_repeat = 9, RULE_buclewhile = 10, RULE_operacion = 11, 
		RULE_sumandos = 12, RULE_errorsintactico = 13, RULE_errortipo = 14, RULE_funciones = 15, 
		RULE_rem = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"fichero", "prog", "instruccion", "print", "let", "asignacion", "buclefor", 
			"condicionalif", "input", "repeat", "buclewhile", "operacion", "sumandos", 
			"errorsintactico", "errortipo", "funciones", "rem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", null, null, 
			null, "'('", "')'", "'\"'", null, null, "'NOT A NUMBER'", null, null, 
			null, null, null, null, null, null, null, null, null, "'REM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "E", "IGUAL", "MAYORQUE", "MENORQUE", "MAS", "MENOS", "POR", "ENTRE", 
			"MOD", "END", "NEXT", "PARENTESISA", "PARENTESISC", "COMILLAS", "PRINT", 
			"LET", "NOTNUMBER", "FOR", "TO", "CONTINUE", "EXIT", "ELSE", "IF", "THEN", 
			"INPUT", "REPEAT", "UNTIL", "WHILE", "REM", "STRING", "STRINGCOM", "INTRO", 
			"INT"
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << FOR) | (1L << IF) | (1L << INPUT) | (1L << REPEAT) | (1L << WHILE) | (1L << REM) | (1L << STRING) | (1L << INTRO) | (1L << INT))) != 0)) {
				{
				setState(36);
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
				case INT:
					{
					setState(34);
					prog();
					}
					break;
				case INTRO:
					{
					setState(35);
					match(INTRO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(41);
				let();
				}
				break;
			case 2:
				{
				setState(42);
				repeat();
				}
				break;
			case 3:
				{
				setState(43);
				buclefor();
				}
				break;
			case 4:
				{
				setState(44);
				condicionalif();
				}
				break;
			case 5:
				{
				setState(45);
				print();
				}
				break;
			case 6:
				{
				setState(46);
				input();
				}
				break;
			case 7:
				{
				setState(47);
				buclewhile();
				}
				break;
			case 8:
				{
				setState(48);
				errorsintactico();
				}
				break;
			case 9:
				{
				setState(49);
				errortipo();
				}
				break;
			case 10:
				{
				setState(50);
				funciones();
				}
				break;
			case 11:
				{
				setState(51);
				rem();
				}
				break;
			case 12:
				{
				setState(52);
				asignacion();
				}
				break;
			case 13:
				{
				setState(53);
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				{
				setState(56);
				print();
				}
				break;
			case LET:
				{
				setState(57);
				let();
				}
				break;
			case STRING:
				{
				setState(58);
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
		public TerminalNode PRINT() { return getToken(miniBParser.PRINT, 0); }
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public ImprimirContext(PrintContext ctx) { copyFrom(ctx); }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			_localctx = new ImprimirContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(PRINT);
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(62);
				((ImprimirContext)_localctx).impComillas = match(STRINGCOM);
				}
				break;
			case 2:
				{
				setState(63);
				funciones();
				}
				break;
			case 3:
				{
				setState(64);
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
			setState(67);
			match(LET);
			setState(68);
			((LETTContext)_localctx).nombre = match(STRING);
			setState(69);
			match(IGUAL);
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGCOM:
				{
				setState(70);
				((LETTContext)_localctx).valors = match(STRINGCOM);
				}
				break;
			case INT:
				{
				setState(71);
				((LETTContext)_localctx).valori = match(INT);
				}
				break;
			case STRING:
				{
				setState(72);
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
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			_localctx = new AsignarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(75);
			match(STRING);
			setState(76);
			match(IGUAL);
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(77);
				funciones();
				}
				break;
			case 2:
				{
				setState(78);
				operacion(0);
				}
				break;
			case 3:
				{
				{
				setState(79);
				match(STRING);
				setState(80);
				match(MOD);
				setState(81);
				match(STRING);
				}
				}
				break;
			case 4:
				{
				setState(82);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(83);
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
			setState(86);
			match(FOR);
			setState(87);
			match(STRING);
			setState(88);
			match(IGUAL);
			setState(89);
			match(INT);
			setState(90);
			match(TO);
			setState(91);
			match(INT);
			setState(92);
			match(INTRO);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(93);
					condicionalif();
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(94);
					instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97);
				match(INTRO);
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << IF) | (1L << STRING))) != 0) );
			setState(103);
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
			setState(105);
			match(IF);
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(106);
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
				setState(107);
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
				setState(108);
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
				setState(109);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(110);
				match(INT);
				}
				break;
			}
			setState(113);
			match(THEN);
			setState(114);
			match(INTRO);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					setState(115);
					((IfContext)_localctx).conti = match(CONTINUE);
					}
					break;
				case EXIT:
					{
					setState(116);
					((IfContext)_localctx).exit = match(EXIT);
					}
					break;
				case PRINT:
				case LET:
				case STRING:
					{
					setState(117);
					((IfContext)_localctx).inst1 = instruccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120);
				match(INTRO);
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << CONTINUE) | (1L << EXIT) | (1L << STRING))) != 0) );
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(125);
				match(ELSE);
				setState(126);
				match(INTRO);
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127);
					((IfContext)_localctx).inst2 = instruccion();
					setState(128);
					match(INTRO);
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
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
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_input);
		try {
			_localctx = new IntroducirContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(141);
			match(INPUT);
			setState(142);
			match(STRINGCOM);
			setState(143);
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
			setState(145);
			match(REPEAT);
			setState(146);
			match(INTRO);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				instruccion();
				setState(148);
				match(INTRO);
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
			setState(154);
			match(UNTIL);
			setState(155);
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
	}

	public final BuclewhileContext buclewhile() throws RecognitionException {
		BuclewhileContext _localctx = new BuclewhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_buclewhile);
		int _la;
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(WHILE);
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYORQUE) | (1L << MENORQUE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(161);
			match(INTRO);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(162);
					instruccion();
					}
					break;
				case 2:
					{
					setState(163);
					let();
					}
					break;
				}
				setState(166);
				match(INTRO);
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
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

			setState(175);
			((NumberESContext)_localctx).number = sumandos();
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
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
					setState(177);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(178);
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
					setState(179);
					((OPERACIONESContext)_localctx).right = sumandos();
					}
					} 
				}
				setState(184);
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
	}

	public final SumandosContext sumandos() throws RecognitionException {
		SumandosContext _localctx = new SumandosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sumandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
	}

	public final ErrorsintacticoContext errorsintactico() throws RecognitionException {
		ErrorsintacticoContext _localctx = new ErrorsintacticoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_errorsintactico);
		int _la;
		try {
			_localctx = new ESintacticoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				setState(187);
				match(LET);
				setState(188);
				match(IGUAL);
				setState(189);
				match(INT);
				}
				break;
			case FOR:
				{
				setState(190);
				match(FOR);
				setState(191);
				match(STRING);
				setState(192);
				match(INTRO);
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(195);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
						{
						setState(193);
						condicionalif();
						}
						break;
					case PRINT:
					case LET:
					case STRING:
						{
						setState(194);
						instruccion();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(197);
					match(INTRO);
					}
					}
					setState(201); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << IF) | (1L << STRING))) != 0) );
				setState(203);
				match(NEXT);
				}
				break;
			case WHILE:
				{
				setState(205);
				match(WHILE);
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				match(INTRO);
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(208);
						instruccion();
						}
						break;
					case 2:
						{
						setState(209);
						let();
						}
						break;
					}
					setState(212);
					match(INTRO);
					}
					}
					setState(216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LET) | (1L << STRING))) != 0) );
				setState(218);
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
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				{
				setState(222);
				match(LET);
				setState(223);
				match(STRING);
				setState(224);
				match(IGUAL);
				setState(225);
				match(COMILLAS);
				setState(226);
				match(INT);
				setState(227);
				match(COMILLAS);
				}
				}
				break;
			case PRINT:
				{
				{
				setState(228);
				match(PRINT);
				setState(229);
				match(STRING);
				setState(230);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR) | (1L << ENTRE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(231);
				match(INT);
				}
				}
				break;
			case STRING:
				{
				{
				setState(232);
				match(STRING);
				setState(233);
				match(PARENTESISA);
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(234);
					match(INT);
					}
					}
					setState(237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(239);
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
		public List<TerminalNode> STRING() { return getTokens(miniBParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(miniBParser.STRING, i);
		}
		public TerminalNode PARENTESISA() { return getToken(miniBParser.PARENTESISA, 0); }
		public TerminalNode PARENTESISC() { return getToken(miniBParser.PARENTESISC, 0); }
		public TerminalNode STRINGCOM() { return getToken(miniBParser.STRINGCOM, 0); }
		public FuncionStringsContext(FuncionesContext ctx) { copyFrom(ctx); }
	}
	public static class FuncionIntContext extends FuncionesContext {
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
		public FuncionIntContext(FuncionesContext ctx) { copyFrom(ctx); }
	}
	public static class FuncionfuncionContext extends FuncionesContext {
		public TerminalNode STRING() { return getToken(miniBParser.STRING, 0); }
		public TerminalNode PARENTESISA() { return getToken(miniBParser.PARENTESISA, 0); }
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public TerminalNode PARENTESISC() { return getToken(miniBParser.PARENTESISC, 0); }
		public FuncionfuncionContext(FuncionesContext ctx) { copyFrom(ctx); }
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
				_localctx = new FuncionIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
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
				break;
			case 2:
				_localctx = new FuncionStringsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(STRING);
				setState(253);
				match(PARENTESISA);
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==STRINGCOM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				match(PARENTESISC);
				}
				break;
			case 3:
				_localctx = new FuncionfuncionContext(_localctx);
				enterOuterAlt(_localctx, 3);
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
			setState(263);
			match(REM);
			setState(265); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(264);
					match(STRING);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(267); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return operacion_sempred((OperacionContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0110\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\5\5D\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7W\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bb\n\b\3\b\3\b\6\bf"+
		"\n\b\r\b\16\bg\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\ty\n\t\3\t\6\t|\n\t\r\t\16\t}\3\t\3\t\3\t\3\t\3\t\6\t\u0085\n"+
		"\t\r\t\16\t\u0086\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\6\13\u0099\n\13\r\13\16\13\u009a\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a7\n\f\3\f\3\f\6\f\u00ab"+
		"\n\f\r\f\16\f\u00ac\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b7\n\r\f\r"+
		"\16\r\u00ba\13\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00c6\n\17\3\17\3\17\6\17\u00ca\n\17\r\17\16\17\u00cb\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00d5\n\17\3\17\3\17\6\17\u00d9\n\17\r\17\16"+
		"\17\u00da\3\17\3\17\5\17\u00df\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00ee\n\20\r\20\16\20\u00ef\3\20\5"+
		"\20\u00f3\n\20\3\21\3\21\3\21\3\21\6\21\u00f9\n\21\r\21\16\21\u00fa\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0108\n\21"+
		"\3\22\3\22\6\22\u010c\n\22\r\22\16\22\u010d\3\22\2\3\30\23\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"\2\7\4\2  ##\3\2\4\6\3\2\7\13\3\2\7\n\3"+
		"\2 !\2\u0130\2(\3\2\2\2\48\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nE\3\2\2\2\f"+
		"M\3\2\2\2\16X\3\2\2\2\20k\3\2\2\2\22\u008f\3\2\2\2\24\u0093\3\2\2\2\26"+
		"\u009f\3\2\2\2\30\u00b0\3\2\2\2\32\u00bb\3\2\2\2\34\u00de\3\2\2\2\36\u00f2"+
		"\3\2\2\2 \u0107\3\2\2\2\"\u0109\3\2\2\2$\'\5\4\3\2%\'\7\"\2\2&$\3\2\2"+
		"\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*(\3\2\2\2+9\5\n"+
		"\6\2,9\5\24\13\2-9\5\16\b\2.9\5\20\t\2/9\5\b\5\2\609\5\22\n\2\619\5\26"+
		"\f\2\629\5\34\17\2\639\5\36\20\2\649\5 \21\2\659\5\"\22\2\669\5\f\7\2"+
		"\679\5\30\r\28+\3\2\2\28,\3\2\2\28-\3\2\2\28.\3\2\2\28/\3\2\2\28\60\3"+
		"\2\2\28\61\3\2\2\28\62\3\2\2\28\63\3\2\2\28\64\3\2\2\28\65\3\2\2\28\66"+
		"\3\2\2\28\67\3\2\2\29\5\3\2\2\2:>\5\b\5\2;>\5\n\6\2<>\5\f\7\2=:\3\2\2"+
		"\2=;\3\2\2\2=<\3\2\2\2>\7\3\2\2\2?C\7\21\2\2@D\7!\2\2AD\5 \21\2BD\5\30"+
		"\r\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\t\3\2\2\2EF\7\22\2\2FG\7 \2\2GK\7"+
		"\4\2\2HL\7!\2\2IL\7#\2\2JL\5 \21\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\13\3"+
		"\2\2\2MN\7 \2\2NV\7\4\2\2OW\5 \21\2PW\5\30\r\2QR\7 \2\2RS\7\13\2\2SW\7"+
		" \2\2TW\7 \2\2UW\7#\2\2VO\3\2\2\2VP\3\2\2\2VQ\3\2\2\2VT\3\2\2\2VU\3\2"+
		"\2\2W\r\3\2\2\2XY\7\24\2\2YZ\7 \2\2Z[\7\4\2\2[\\\7#\2\2\\]\7\25\2\2]^"+
		"\7#\2\2^e\7\"\2\2_b\5\20\t\2`b\5\6\4\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2c"+
		"d\7\"\2\2df\3\2\2\2ea\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2"+
		"ij\7\r\2\2j\17\3\2\2\2kq\7\31\2\2lm\t\2\2\2mn\t\3\2\2nr\t\2\2\2or\7 \2"+
		"\2pr\7#\2\2ql\3\2\2\2qo\3\2\2\2qp\3\2\2\2rs\3\2\2\2st\7\32\2\2t{\7\"\2"+
		"\2uy\7\26\2\2vy\7\27\2\2wy\5\6\4\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2yz\3\2"+
		"\2\2z|\7\"\2\2{x\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u008a\3\2\2\2"+
		"\177\u0080\7\30\2\2\u0080\u0084\7\"\2\2\u0081\u0082\5\6\4\2\u0082\u0083"+
		"\7\"\2\2\u0083\u0085\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\177\3\2\2"+
		"\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\f\2\2\u008e\21\3\2\2\2\u008f"+
		"\u0090\7\33\2\2\u0090\u0091\7!\2\2\u0091\u0092\7 \2\2\u0092\23\3\2\2\2"+
		"\u0093\u0094\7\34\2\2\u0094\u0098\7\"\2\2\u0095\u0096\5\6\4\2\u0096\u0097"+
		"\7\"\2\2\u0097\u0099\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\35"+
		"\2\2\u009d\u009e\5\6\4\2\u009e\25\3\2\2\2\u009f\u00a0\7\36\2\2\u00a0\u00a1"+
		"\t\2\2\2\u00a1\u00a2\t\3\2\2\u00a2\u00a3\t\2\2\2\u00a3\u00aa\7\"\2\2\u00a4"+
		"\u00a7\5\6\4\2\u00a5\u00a7\5\n\6\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a6\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\f\2\2\u00af\27\3\2\2\2\u00b0\u00b1"+
		"\b\r\1\2\u00b1\u00b2\5\32\16\2\u00b2\u00b8\3\2\2\2\u00b3\u00b4\f\4\2\2"+
		"\u00b4\u00b5\t\4\2\2\u00b5\u00b7\5\32\16\2\u00b6\u00b3\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\31\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\t\2\2\2\u00bc\33\3\2\2\2\u00bd\u00be\7\22\2"+
		"\2\u00be\u00bf\7\4\2\2\u00bf\u00df\7#\2\2\u00c0\u00c1\7\24\2\2\u00c1\u00c2"+
		"\7 \2\2\u00c2\u00c9\7\"\2\2\u00c3\u00c6\5\20\t\2\u00c4\u00c6\5\6\4\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\""+
		"\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\r"+
		"\2\2\u00ce\u00df\3\2\2\2\u00cf\u00d0\7\36\2\2\u00d0\u00d1\t\2\2\2\u00d1"+
		"\u00d8\7\"\2\2\u00d2\u00d5\5\6\4\2\u00d3\u00d5\5\n\6\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\"\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\f\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00bd\3\2\2\2\u00de\u00c0\3\2\2\2\u00de\u00cf\3\2"+
		"\2\2\u00df\35\3\2\2\2\u00e0\u00e1\7\22\2\2\u00e1\u00e2\7 \2\2\u00e2\u00e3"+
		"\7\4\2\2\u00e3\u00e4\7\20\2\2\u00e4\u00e5\7#\2\2\u00e5\u00f3\7\20\2\2"+
		"\u00e6\u00e7\7\21\2\2\u00e7\u00e8\7 \2\2\u00e8\u00e9\t\5\2\2\u00e9\u00f3"+
		"\7#\2\2\u00ea\u00eb\7 \2\2\u00eb\u00ed\7\16\2\2\u00ec\u00ee\7#\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\7\17\2\2\u00f2\u00e0\3\2\2\2\u00f2"+
		"\u00e6\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f3\37\3\2\2\2\u00f4\u00f5\7 \2\2"+
		"\u00f5\u00f6\7\16\2\2\u00f6\u00f8\7\20\2\2\u00f7\u00f9\7#\2\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\7\20\2\2\u00fd\u0108\7\17\2\2\u00fe\u00ff\7"+
		" \2\2\u00ff\u0100\7\16\2\2\u0100\u0101\t\6\2\2\u0101\u0108\7\17\2\2\u0102"+
		"\u0103\7 \2\2\u0103\u0104\7\16\2\2\u0104\u0105\5 \21\2\u0105\u0106\7\17"+
		"\2\2\u0106\u0108\3\2\2\2\u0107\u00f4\3\2\2\2\u0107\u00fe\3\2\2\2\u0107"+
		"\u0102\3\2\2\2\u0108!\3\2\2\2\u0109\u010b\7\37\2\2\u010a\u010c\7 \2\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e#\3\2\2\2\36&(8=CKVagqx}\u0086\u008a\u009a\u00a6\u00ac\u00b8"+
		"\u00c5\u00cb\u00d4\u00da\u00de\u00ef\u00f2\u00fa\u0107\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}