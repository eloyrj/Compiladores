// Generated from miniB.g4 by ANTLR 4.9.2
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"E", "PUNTOS", "IGUAL", "MAYORQUE", "MENORQUE", "MAS", "MENOS", "POR", 
			"ENTRE", "MOD", "PUNTO", "COMA", "END", "NEXT", "CORCHETEA", "CORCHETEC", 
			"PARENTESISA", "PARENTESISC", "COMILLAS", "PRINT", "LET", "NOTNUMBER", 
			"FOR", "TO", "CONTINUE", "EXIT", "ELSE", "IF", "THEN", "INPUT", "REPEAT", 
			"UNTIL", "WHILE", "REM", "DEF", "RETURN", "IN", "STRING", "STRINGCOM", 
			"INTRO", "INT", "BOOLEANT", "BOOLEANF", "TIPOS"
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
		case 39:
			INTRO_action((RuleContext)_localctx, actionIndex);
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
	private void INTRO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0199\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13u\n\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0081\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u008b\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00a1\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a9\n\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u00be\n\30\3\31\3\31\3\31\3\31\5\31\u00c4\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u00d6\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00e0"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00ea\n\34\3\35\3\35"+
		"\3\35\3\35\5\35\u00f0\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u00fa\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0106"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0114\n \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\5!\u0120\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u012c\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u0138\n$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\5%\u0146\n%\3&\3&\3&\3&\5&\u014c\n&\3\'\6\'\u014f"+
		"\n\'\r\'\16\'\u0150\3(\3(\6(\u0155\n(\r(\16(\u0156\3(\3(\3)\6)\u015c\n"+
		")\r)\16)\u015d\3)\3)\3*\7*\u0163\n*\f*\16*\u0166\13*\3*\6*\u0169\n*\r"+
		"*\16*\u016a\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0175\n+\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\5,\u0181\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\5-\u0198\n-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\7\4"+
		"\2\13\13\"\"\4\2C\\c|\t\2\"#))<<??C\\c|\u00a3\u00a3\4\2\f\f\17\17\3\2"+
		"\62;\2\u01b5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5^\3\2\2\2\7`\3"+
		"\2\2\2\tb\3\2\2\2\13d\3\2\2\2\rf\3\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23l\3"+
		"\2\2\2\25t\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33\u0080\3\2\2\2\35\u008a\3"+
		"\2\2\2\37\u008c\3\2\2\2!\u008e\3\2\2\2#\u0090\3\2\2\2%\u0092\3\2\2\2\'"+
		"\u0094\3\2\2\2)\u00a0\3\2\2\2+\u00a8\3\2\2\2-\u00aa\3\2\2\2/\u00bd\3\2"+
		"\2\2\61\u00c3\3\2\2\2\63\u00d5\3\2\2\2\65\u00df\3\2\2\2\67\u00e9\3\2\2"+
		"\29\u00ef\3\2\2\2;\u00f9\3\2\2\2=\u0105\3\2\2\2?\u0113\3\2\2\2A\u011f"+
		"\3\2\2\2C\u012b\3\2\2\2E\u012d\3\2\2\2G\u0137\3\2\2\2I\u0145\3\2\2\2K"+
		"\u014b\3\2\2\2M\u014e\3\2\2\2O\u0152\3\2\2\2Q\u015b\3\2\2\2S\u0164\3\2"+
		"\2\2U\u0174\3\2\2\2W\u0180\3\2\2\2Y\u0197\3\2\2\2[\\\t\2\2\2\\]\b\2\2"+
		"\2]\4\3\2\2\2^_\7<\2\2_\6\3\2\2\2`a\7?\2\2a\b\3\2\2\2bc\7@\2\2c\n\3\2"+
		"\2\2de\7>\2\2e\f\3\2\2\2fg\7-\2\2g\16\3\2\2\2hi\7/\2\2i\20\3\2\2\2jk\7"+
		",\2\2k\22\3\2\2\2lm\7\61\2\2m\24\3\2\2\2no\7O\2\2op\7Q\2\2pu\7F\2\2qr"+
		"\7o\2\2rs\7q\2\2su\7f\2\2tn\3\2\2\2tq\3\2\2\2u\26\3\2\2\2vw\7\60\2\2w"+
		"\30\3\2\2\2xy\7.\2\2y\32\3\2\2\2z{\7G\2\2{|\7P\2\2|\u0081\7F\2\2}~\7g"+
		"\2\2~\177\7p\2\2\177\u0081\7f\2\2\u0080z\3\2\2\2\u0080}\3\2\2\2\u0081"+
		"\34\3\2\2\2\u0082\u0083\7P\2\2\u0083\u0084\7G\2\2\u0084\u0085\7Z\2\2\u0085"+
		"\u008b\7V\2\2\u0086\u0087\7p\2\2\u0087\u0088\7g\2\2\u0088\u0089\7z\2\2"+
		"\u0089\u008b\7v\2\2\u008a\u0082\3\2\2\2\u008a\u0086\3\2\2\2\u008b\36\3"+
		"\2\2\2\u008c\u008d\7]\2\2\u008d \3\2\2\2\u008e\u008f\7_\2\2\u008f\"\3"+
		"\2\2\2\u0090\u0091\7*\2\2\u0091$\3\2\2\2\u0092\u0093\7+\2\2\u0093&\3\2"+
		"\2\2\u0094\u0095\7$\2\2\u0095(\3\2\2\2\u0096\u0097\7R\2\2\u0097\u0098"+
		"\7T\2\2\u0098\u0099\7K\2\2\u0099\u009a\7P\2\2\u009a\u00a1\7V\2\2\u009b"+
		"\u009c\7r\2\2\u009c\u009d\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2"+
		"\u009f\u00a1\7v\2\2\u00a0\u0096\3\2\2\2\u00a0\u009b\3\2\2\2\u00a1*\3\2"+
		"\2\2\u00a2\u00a3\7N\2\2\u00a3\u00a4\7G\2\2\u00a4\u00a9\7V\2\2\u00a5\u00a6"+
		"\7n\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a9\7v\2\2\u00a8\u00a2\3\2\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7P\2\2\u00ab\u00ac\7Q\2\2\u00ac"+
		"\u00ad\7V\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\7C\2\2\u00af\u00b0\7\"\2"+
		"\2\u00b0\u00b1\7P\2\2\u00b1\u00b2\7W\2\2\u00b2\u00b3\7O\2\2\u00b3\u00b4"+
		"\7D\2\2\u00b4\u00b5\7G\2\2\u00b5\u00b6\7T\2\2\u00b6.\3\2\2\2\u00b7\u00b8"+
		"\7H\2\2\u00b8\u00b9\7Q\2\2\u00b9\u00be\7T\2\2\u00ba\u00bb\7h\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00be\7t\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00ba\3\2\2"+
		"\2\u00be\60\3\2\2\2\u00bf\u00c0\7V\2\2\u00c0\u00c4\7Q\2\2\u00c1\u00c2"+
		"\7v\2\2\u00c2\u00c4\7q\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\62\3\2\2\2\u00c5\u00c6\7E\2\2\u00c6\u00c7\7Q\2\2\u00c7\u00c8\7P\2\2\u00c8"+
		"\u00c9\7V\2\2\u00c9\u00ca\7K\2\2\u00ca\u00cb\7P\2\2\u00cb\u00cc\7W\2\2"+
		"\u00cc\u00d6\7G\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7w\2\2\u00d4\u00d6\7g\2\2\u00d5\u00c5\3\2\2\2\u00d5\u00cd\3\2\2"+
		"\2\u00d6\64\3\2\2\2\u00d7\u00d8\7G\2\2\u00d8\u00d9\7Z\2\2\u00d9\u00da"+
		"\7K\2\2\u00da\u00e0\7V\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7z\2\2\u00dd"+
		"\u00de\7k\2\2\u00de\u00e0\7v\2\2\u00df\u00d7\3\2\2\2\u00df\u00db\3\2\2"+
		"\2\u00e0\66\3\2\2\2\u00e1\u00e2\7G\2\2\u00e2\u00e3\7N\2\2\u00e3\u00e4"+
		"\7U\2\2\u00e4\u00ea\7G\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7n\2\2\u00e7"+
		"\u00e8\7u\2\2\u00e8\u00ea\7g\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e5\3\2\2"+
		"\2\u00ea8\3\2\2\2\u00eb\u00ec\7K\2\2\u00ec\u00f0\7H\2\2\u00ed\u00ee\7"+
		"k\2\2\u00ee\u00f0\7h\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		":\3\2\2\2\u00f1\u00f2\7V\2\2\u00f2\u00f3\7J\2\2\u00f3\u00f4\7G\2\2\u00f4"+
		"\u00fa\7P\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7j\2\2\u00f7\u00f8\7g\2\2"+
		"\u00f8\u00fa\7p\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa<\3\2"+
		"\2\2\u00fb\u00fc\7K\2\2\u00fc\u00fd\7P\2\2\u00fd\u00fe\7R\2\2\u00fe\u00ff"+
		"\7W\2\2\u00ff\u0106\7V\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102"+
		"\u0103\7r\2\2\u0103\u0104\7w\2\2\u0104\u0106\7v\2\2\u0105\u00fb\3\2\2"+
		"\2\u0105\u0100\3\2\2\2\u0106>\3\2\2\2\u0107\u0108\7T\2\2\u0108\u0109\7"+
		"G\2\2\u0109\u010a\7R\2\2\u010a\u010b\7G\2\2\u010b\u010c\7C\2\2\u010c\u0114"+
		"\7V\2\2\u010d\u010e\7t\2\2\u010e\u010f\7g\2\2\u010f\u0110\7r\2\2\u0110"+
		"\u0111\7g\2\2\u0111\u0112\7c\2\2\u0112\u0114\7v\2\2\u0113\u0107\3\2\2"+
		"\2\u0113\u010d\3\2\2\2\u0114@\3\2\2\2\u0115\u0116\7W\2\2\u0116\u0117\7"+
		"P\2\2\u0117\u0118\7V\2\2\u0118\u0119\7K\2\2\u0119\u0120\7N\2\2\u011a\u011b"+
		"\7w\2\2\u011b\u011c\7p\2\2\u011c\u011d\7v\2\2\u011d\u011e\7k\2\2\u011e"+
		"\u0120\7n\2\2\u011f\u0115\3\2\2\2\u011f\u011a\3\2\2\2\u0120B\3\2\2\2\u0121"+
		"\u0122\7Y\2\2\u0122\u0123\7J\2\2\u0123\u0124\7K\2\2\u0124\u0125\7N\2\2"+
		"\u0125\u012c\7G\2\2\u0126\u0127\7y\2\2\u0127\u0128\7j\2\2\u0128\u0129"+
		"\7k\2\2\u0129\u012a\7n\2\2\u012a\u012c\7g\2\2\u012b\u0121\3\2\2\2\u012b"+
		"\u0126\3\2\2\2\u012cD\3\2\2\2\u012d\u012e\7T\2\2\u012e\u012f\7G\2\2\u012f"+
		"\u0130\7O\2\2\u0130F\3\2\2\2\u0131\u0132\7F\2\2\u0132\u0133\7G\2\2\u0133"+
		"\u0138\7H\2\2\u0134\u0135\7f\2\2\u0135\u0136\7g\2\2\u0136\u0138\7h\2\2"+
		"\u0137\u0131\3\2\2\2\u0137\u0134\3\2\2\2\u0138H\3\2\2\2\u0139\u013a\7"+
		"T\2\2\u013a\u013b\7G\2\2\u013b\u013c\7V\2\2\u013c\u013d\7W\2\2\u013d\u013e"+
		"\7T\2\2\u013e\u0146\7P\2\2\u013f\u0140\7t\2\2\u0140\u0141\7g\2\2\u0141"+
		"\u0142\7v\2\2\u0142\u0143\7w\2\2\u0143\u0144\7t\2\2\u0144\u0146\7p\2\2"+
		"\u0145\u0139\3\2\2\2\u0145\u013f\3\2\2\2\u0146J\3\2\2\2\u0147\u0148\7"+
		"K\2\2\u0148\u014c\7P\2\2\u0149\u014a\7k\2\2\u014a\u014c\7p\2\2\u014b\u0147"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014cL\3\2\2\2\u014d\u014f\t\3\2\2\u014e"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151N\3\2\2\2\u0152\u0154\7$\2\2\u0153\u0155\t\4\2\2\u0154\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0159\7$\2\2\u0159P\3\2\2\2\u015a\u015c\t\5\2\2\u015b"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b)\3\2\u0160R\3\2\2\2\u0161\u0163"+
		"\7/\2\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\t\6"+
		"\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016bT\3\2\2\2\u016c\u016d\7v\2\2\u016d\u016e\7t\2\2\u016e"+
		"\u016f\7w\2\2\u016f\u0175\7g\2\2\u0170\u0171\7V\2\2\u0171\u0172\7T\2\2"+
		"\u0172\u0173\7W\2\2\u0173\u0175\7G\2\2\u0174\u016c\3\2\2\2\u0174\u0170"+
		"\3\2\2\2\u0175V\3\2\2\2\u0176\u0177\7h\2\2\u0177\u0178\7c\2\2\u0178\u0179"+
		"\7n\2\2\u0179\u017a\7u\2\2\u017a\u0181\7g\2\2\u017b\u017c\7H\2\2\u017c"+
		"\u017d\7C\2\2\u017d\u017e\7N\2\2\u017e\u017f\7U\2\2\u017f\u0181\7G\2\2"+
		"\u0180\u0176\3\2\2\2\u0180\u017b\3\2\2\2\u0181X\3\2\2\2\u0182\u0183\7"+
		"k\2\2\u0183\u0184\7p\2\2\u0184\u0198\7v\2\2\u0185\u0186\7u\2\2\u0186\u0187"+
		"\7v\2\2\u0187\u0188\7t\2\2\u0188\u0189\7k\2\2\u0189\u018a\7p\2\2\u018a"+
		"\u0198\7i\2\2\u018b\u018c\7d\2\2\u018c\u018d\7q\2\2\u018d\u018e\7q\2\2"+
		"\u018e\u018f\7n\2\2\u018f\u0190\7g\2\2\u0190\u0191\7c\2\2\u0191\u0198"+
		"\7p\2\2\u0192\u0193\7h\2\2\u0193\u0194\7n\2\2\u0194\u0195\7q\2\2\u0195"+
		"\u0196\7c\2\2\u0196\u0198\7v\2\2\u0197\u0182\3\2\2\2\u0197\u0185\3\2\2"+
		"\2\u0197\u018b\3\2\2\2\u0197\u0192\3\2\2\2\u0198Z\3\2\2\2\36\2t\u0080"+
		"\u008a\u00a0\u00a8\u00bd\u00c3\u00d5\u00df\u00e9\u00ef\u00f9\u0105\u0113"+
		"\u011f\u012b\u0137\u0145\u014b\u0150\u0156\u015d\u0164\u016a\u0174\u0180"+
		"\u0197\4\3\2\2\3)\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}