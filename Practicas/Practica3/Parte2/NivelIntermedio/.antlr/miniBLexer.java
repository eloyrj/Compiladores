// Generated from /home/corte/Documentos/Repositorios/Compiladores/Practicas/Practica3/Parte2/NivelIntermedio/miniB.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniBLexer extends Lexer {
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
		STRING=38, STRINGCOM=39, INTRO=40, INT=41, BOOLEANT=42, BOOLEANF=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"E", "PUNTOS", "IGUAL", "MAYORQUE", "MENORQUE", "MAS", "MENOS", "POR", 
			"ENTRE", "MOD", "PUNTOCOMA", "COMA", "END", "NEXT", "CORCHETEA", "CORCHETEC", 
			"PARENTESISA", "PARENTESISC", "COMILLAS", "PRINT", "LET", "NOTNUMBER", 
			"FOR", "TO", "CONTINUE", "EXIT", "ELSE", "IF", "THEN", "INPUT", "REPEAT", 
			"UNTIL", "WHILE", "REM", "DEF", "RETURN", "IN", "STRING", "STRINGCOM", 
			"INTRO", "INT", "BOOLEANT", "BOOLEANF"
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
			"INTRO", "INT", "BOOLEANT", "BOOLEANF"
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


	public miniBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miniB.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			E_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void E_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0178\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13s\n\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\177\n\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0089\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u009f"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a7\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00bc\n\30\3\31\3\31\3\31\3\31\5\31\u00c2\n\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u00d4\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00de\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00e8\n\34\3\35\3\35\3\35"+
		"\3\35\5\35\u00ee\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00f8"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0104\n\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0112\n \3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\5!\u011e\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u012a"+
		"\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u0136\n$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\5%\u0144\n%\3&\3&\3&\3&\5&\u014a\n&\3\'\6\'\u014d\n\'\r"+
		"\'\16\'\u014e\3(\3(\6(\u0153\n(\r(\16(\u0154\3(\3(\3)\6)\u015a\n)\r)\16"+
		")\u015b\3*\6*\u015f\n*\r*\16*\u0160\3+\3+\3+\3+\3+\3+\3+\3+\5+\u016b\n"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0177\n,\2\2-\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-\3\2\7\4\2\13\f\"\"\4\2C\\c|\t\2\"#))<<??C\\c|\u00a3\u00a3\4"+
		"\2\f\f\17\17\3\2\62;\2\u0190\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5\\\3\2\2"+
		"\2\7^\3\2\2\2\t`\3\2\2\2\13b\3\2\2\2\rd\3\2\2\2\17f\3\2\2\2\21h\3\2\2"+
		"\2\23j\3\2\2\2\25r\3\2\2\2\27t\3\2\2\2\31v\3\2\2\2\33~\3\2\2\2\35\u0088"+
		"\3\2\2\2\37\u008a\3\2\2\2!\u008c\3\2\2\2#\u008e\3\2\2\2%\u0090\3\2\2\2"+
		"\'\u0092\3\2\2\2)\u009e\3\2\2\2+\u00a6\3\2\2\2-\u00a8\3\2\2\2/\u00bb\3"+
		"\2\2\2\61\u00c1\3\2\2\2\63\u00d3\3\2\2\2\65\u00dd\3\2\2\2\67\u00e7\3\2"+
		"\2\29\u00ed\3\2\2\2;\u00f7\3\2\2\2=\u0103\3\2\2\2?\u0111\3\2\2\2A\u011d"+
		"\3\2\2\2C\u0129\3\2\2\2E\u012b\3\2\2\2G\u0135\3\2\2\2I\u0143\3\2\2\2K"+
		"\u0149\3\2\2\2M\u014c\3\2\2\2O\u0150\3\2\2\2Q\u0159\3\2\2\2S\u015e\3\2"+
		"\2\2U\u016a\3\2\2\2W\u0176\3\2\2\2YZ\t\2\2\2Z[\b\2\2\2[\4\3\2\2\2\\]\7"+
		"<\2\2]\6\3\2\2\2^_\7?\2\2_\b\3\2\2\2`a\7@\2\2a\n\3\2\2\2bc\7>\2\2c\f\3"+
		"\2\2\2de\7-\2\2e\16\3\2\2\2fg\7/\2\2g\20\3\2\2\2hi\7,\2\2i\22\3\2\2\2"+
		"jk\7\61\2\2k\24\3\2\2\2lm\7O\2\2mn\7Q\2\2ns\7F\2\2op\7o\2\2pq\7q\2\2q"+
		"s\7f\2\2rl\3\2\2\2ro\3\2\2\2s\26\3\2\2\2tu\7\60\2\2u\30\3\2\2\2vw\7.\2"+
		"\2w\32\3\2\2\2xy\7G\2\2yz\7P\2\2z\177\7F\2\2{|\7g\2\2|}\7p\2\2}\177\7"+
		"f\2\2~x\3\2\2\2~{\3\2\2\2\177\34\3\2\2\2\u0080\u0081\7P\2\2\u0081\u0082"+
		"\7G\2\2\u0082\u0083\7Z\2\2\u0083\u0089\7V\2\2\u0084\u0085\7p\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7z\2\2\u0087\u0089\7v\2\2\u0088\u0080\3\2\2"+
		"\2\u0088\u0084\3\2\2\2\u0089\36\3\2\2\2\u008a\u008b\7]\2\2\u008b \3\2"+
		"\2\2\u008c\u008d\7_\2\2\u008d\"\3\2\2\2\u008e\u008f\7*\2\2\u008f$\3\2"+
		"\2\2\u0090\u0091\7+\2\2\u0091&\3\2\2\2\u0092\u0093\7$\2\2\u0093(\3\2\2"+
		"\2\u0094\u0095\7R\2\2\u0095\u0096\7T\2\2\u0096\u0097\7K\2\2\u0097\u0098"+
		"\7P\2\2\u0098\u009f\7V\2\2\u0099\u009a\7r\2\2\u009a\u009b\7t\2\2\u009b"+
		"\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009f\7v\2\2\u009e\u0094\3\2\2"+
		"\2\u009e\u0099\3\2\2\2\u009f*\3\2\2\2\u00a0\u00a1\7N\2\2\u00a1\u00a2\7"+
		"G\2\2\u00a2\u00a7\7V\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a7"+
		"\7v\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7,\3\2\2\2\u00a8\u00a9"+
		"\7P\2\2\u00a9\u00aa\7Q\2\2\u00aa\u00ab\7V\2\2\u00ab\u00ac\7\"\2\2\u00ac"+
		"\u00ad\7C\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7P\2\2\u00af\u00b0\7W\2"+
		"\2\u00b0\u00b1\7O\2\2\u00b1\u00b2\7D\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4"+
		"\7T\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7H\2\2\u00b6\u00b7\7Q\2\2\u00b7\u00bc"+
		"\7T\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bc\7t\2\2\u00bb"+
		"\u00b5\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7V\2\2"+
		"\u00be\u00c2\7Q\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c2\7q\2\2\u00c1\u00bd"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7E\2\2\u00c4"+
		"\u00c5\7Q\2\2\u00c5\u00c6\7P\2\2\u00c6\u00c7\7V\2\2\u00c7\u00c8\7K\2\2"+
		"\u00c8\u00c9\7P\2\2\u00c9\u00ca\7W\2\2\u00ca\u00d4\7G\2\2\u00cb\u00cc"+
		"\7e\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d4\7g\2\2"+
		"\u00d3\u00c3\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d4\64\3\2\2\2\u00d5\u00d6"+
		"\7G\2\2\u00d6\u00d7\7Z\2\2\u00d7\u00d8\7K\2\2\u00d8\u00de\7V\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7z\2\2\u00db\u00dc\7k\2\2\u00dc\u00de\7v\2\2"+
		"\u00dd\u00d5\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de\66\3\2\2\2\u00df\u00e0"+
		"\7G\2\2\u00e0\u00e1\7N\2\2\u00e1\u00e2\7U\2\2\u00e2\u00e8\7G\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e8\7g\2\2"+
		"\u00e7\u00df\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e88\3\2\2\2\u00e9\u00ea\7"+
		"K\2\2\u00ea\u00ee\7H\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ee\7h\2\2\u00ed\u00e9"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee:\3\2\2\2\u00ef\u00f0\7V\2\2\u00f0\u00f1"+
		"\7J\2\2\u00f1\u00f2\7G\2\2\u00f2\u00f8\7P\2\2\u00f3\u00f4\7v\2\2\u00f4"+
		"\u00f5\7j\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f8\7p\2\2\u00f7\u00ef\3\2\2"+
		"\2\u00f7\u00f3\3\2\2\2\u00f8<\3\2\2\2\u00f9\u00fa\7K\2\2\u00fa\u00fb\7"+
		"P\2\2\u00fb\u00fc\7R\2\2\u00fc\u00fd\7W\2\2\u00fd\u0104\7V\2\2\u00fe\u00ff"+
		"\7k\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7r\2\2\u0101\u0102\7w\2\2\u0102"+
		"\u0104\7v\2\2\u0103\u00f9\3\2\2\2\u0103\u00fe\3\2\2\2\u0104>\3\2\2\2\u0105"+
		"\u0106\7T\2\2\u0106\u0107\7G\2\2\u0107\u0108\7R\2\2\u0108\u0109\7G\2\2"+
		"\u0109\u010a\7C\2\2\u010a\u0112\7V\2\2\u010b\u010c\7t\2\2\u010c\u010d"+
		"\7g\2\2\u010d\u010e\7r\2\2\u010e\u010f\7g\2\2\u010f\u0110\7c\2\2\u0110"+
		"\u0112\7v\2\2\u0111\u0105\3\2\2\2\u0111\u010b\3\2\2\2\u0112@\3\2\2\2\u0113"+
		"\u0114\7W\2\2\u0114\u0115\7P\2\2\u0115\u0116\7V\2\2\u0116\u0117\7K\2\2"+
		"\u0117\u011e\7N\2\2\u0118\u0119\7w\2\2\u0119\u011a\7p\2\2\u011a\u011b"+
		"\7v\2\2\u011b\u011c\7k\2\2\u011c\u011e\7n\2\2\u011d\u0113\3\2\2\2\u011d"+
		"\u0118\3\2\2\2\u011eB\3\2\2\2\u011f\u0120\7Y\2\2\u0120\u0121\7J\2\2\u0121"+
		"\u0122\7K\2\2\u0122\u0123\7N\2\2\u0123\u012a\7G\2\2\u0124\u0125\7y\2\2"+
		"\u0125\u0126\7j\2\2\u0126\u0127\7k\2\2\u0127\u0128\7n\2\2\u0128\u012a"+
		"\7g\2\2\u0129\u011f\3\2\2\2\u0129\u0124\3\2\2\2\u012aD\3\2\2\2\u012b\u012c"+
		"\7T\2\2\u012c\u012d\7G\2\2\u012d\u012e\7O\2\2\u012eF\3\2\2\2\u012f\u0130"+
		"\7F\2\2\u0130\u0131\7G\2\2\u0131\u0136\7H\2\2\u0132\u0133\7f\2\2\u0133"+
		"\u0134\7g\2\2\u0134\u0136\7h\2\2\u0135\u012f\3\2\2\2\u0135\u0132\3\2\2"+
		"\2\u0136H\3\2\2\2\u0137\u0138\7T\2\2\u0138\u0139\7G\2\2\u0139\u013a\7"+
		"V\2\2\u013a\u013b\7W\2\2\u013b\u013c\7T\2\2\u013c\u0144\7P\2\2\u013d\u013e"+
		"\7t\2\2\u013e\u013f\7g\2\2\u013f\u0140\7v\2\2\u0140\u0141\7w\2\2\u0141"+
		"\u0142\7t\2\2\u0142\u0144\7p\2\2\u0143\u0137\3\2\2\2\u0143\u013d\3\2\2"+
		"\2\u0144J\3\2\2\2\u0145\u0146\7K\2\2\u0146\u014a\7P\2\2\u0147\u0148\7"+
		"k\2\2\u0148\u014a\7p\2\2\u0149\u0145\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"L\3\2\2\2\u014b\u014d\t\3\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2"+
		"\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014fN\3\2\2\2\u0150\u0152\7"+
		"$\2\2\u0151\u0153\t\4\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\7$"+
		"\2\2\u0157P\3\2\2\2\u0158\u015a\t\5\2\2\u0159\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015cR\3\2\2\2\u015d"+
		"\u015f\t\6\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161T\3\2\2\2\u0162\u0163\7v\2\2\u0163\u0164"+
		"\7t\2\2\u0164\u0165\7w\2\2\u0165\u016b\7g\2\2\u0166\u0167\7V\2\2\u0167"+
		"\u0168\7T\2\2\u0168\u0169\7W\2\2\u0169\u016b\7G\2\2\u016a\u0162\3\2\2"+
		"\2\u016a\u0166\3\2\2\2\u016bV\3\2\2\2\u016c\u016d\7h\2\2\u016d\u016e\7"+
		"c\2\2\u016e\u016f\7n\2\2\u016f\u0170\7u\2\2\u0170\u0177\7g\2\2\u0171\u0172"+
		"\7H\2\2\u0172\u0173\7C\2\2\u0173\u0174\7N\2\2\u0174\u0175\7U\2\2\u0175"+
		"\u0177\7G\2\2\u0176\u016c\3\2\2\2\u0176\u0171\3\2\2\2\u0177X\3\2\2\2\34"+
		"\2r~\u0088\u009e\u00a6\u00bb\u00c1\u00d3\u00dd\u00e7\u00ed\u00f7\u0103"+
		"\u0111\u011d\u0129\u0135\u0143\u0149\u014e\u0154\u015b\u0160\u016a\u0176"+
		"\3\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}