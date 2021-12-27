// Generated from miniBLexer.g4 by ANTLR 4.9.2
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
		COMENTARIOABRIR=1, COMENTARIOLIEA=2, E=3, IGUAL=4, MAYORQUE=5, MENORQUE=6, 
		MAS=7, MENOS=8, POR=9, ENTRE=10, MOD=11, END=12, NEXT=13, PARENTESISA=14, 
		PARENTESISC=15, COMILLAS=16, PRINT=17, LET=18, NOTNUMBER=19, FOR=20, TO=21, 
		CONTINUE=22, EXIT=23, ELSE=24, IF=25, THEN=26, INPUT=27, REPEAT=28, UNTIL=29, 
		WHILE=30, REM=31, STRING=32, STRINGCOM=33, TAB=34, INTROTAB=35, INTRO=36, 
		INT=37, COMENTARIOCERRAR=38, TEXTOCOMENTARIOML=39, FINAL_COMENTARIO_UL=40, 
		TEXTOCOMENTARIOUL=41;
	public static final int
		COMENTARIO_MULTILINEA_MODE=1, COMENTARIO_LINEA_MODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMENTARIO_MULTILINEA_MODE", "COMENTARIO_LINEA_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMENTARIOABRIR", "COMENTARIOLIEA", "E", "IGUAL", "MAYORQUE", "MENORQUE", 
			"MAS", "MENOS", "POR", "ENTRE", "MOD", "END", "NEXT", "PARENTESISA", 
			"PARENTESISC", "COMILLAS", "PRINT", "LET", "NOTNUMBER", "FOR", "TO", 
			"CONTINUE", "EXIT", "ELSE", "IF", "THEN", "INPUT", "REPEAT", "UNTIL", 
			"WHILE", "REM", "STRING", "STRINGCOM", "TAB", "INTROTAB", "INTRO", "INT", 
			"COMENTARIOCERRAR", "TEXTOCOMENTARIOML", "FINAL_COMENTARIO_UL", "TEXTOCOMENTARIOUL"
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


	public miniBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miniBLexer.g4"; }

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
		case 2:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0166\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"y\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0081\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u008b\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u009d\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00a5\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ba\n\25"+
		"\3\26\3\26\3\26\3\26\5\26\u00c0\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00d2\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00dc\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u00e6\n\31\3\32\3\32\3\32\3\32\5\32\u00ec\n\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00f6\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0102\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0110\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u011c\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0128\n\37\3 \3 \3 \3 \3!\6!\u012f"+
		"\n!\r!\16!\u0130\3\"\3\"\6\"\u0135\n\"\r\"\16\"\u0136\3\"\3\"\3#\6#\u013c"+
		"\n#\r#\16#\u013d\3$\3$\7$\u0142\n$\f$\16$\u0145\13$\3%\6%\u0148\n%\r%"+
		"\16%\u0149\3&\6&\u014d\n&\r&\16&\u014e\3\'\3\'\3\'\3\'\3\'\3(\7(\u0157"+
		"\n(\f(\16(\u015a\13(\3)\3)\3)\3)\3)\3*\7*\u0162\n*\f*\16*\u0165\13*\4"+
		"\u0158\u0163\2+\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33"+
		"\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67"+
		"\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+\5\2\3\4\7\4\2\13\13\"\"\4\2"+
		"C\\c|\t\2\"#))<<??C\\c|\u00a3\u00a3\4\2\f\f\17\17\3\2\62;\2\u017b\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\3Q\3\2\2\2\4S\3\2\2\2\4U\3\2\2\2\5W\3\2"+
		"\2\2\7\\\3\2\2\2\ta\3\2\2\2\13d\3\2\2\2\rf\3\2\2\2\17h\3\2\2\2\21j\3\2"+
		"\2\2\23l\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31x\3\2\2\2\33\u0080\3\2\2\2"+
		"\35\u008a\3\2\2\2\37\u008c\3\2\2\2!\u008e\3\2\2\2#\u0090\3\2\2\2%\u009c"+
		"\3\2\2\2\'\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00b9\3\2\2\2-\u00bf\3\2\2\2"+
		"/\u00d1\3\2\2\2\61\u00db\3\2\2\2\63\u00e5\3\2\2\2\65\u00eb\3\2\2\2\67"+
		"\u00f5\3\2\2\29\u0101\3\2\2\2;\u010f\3\2\2\2=\u011b\3\2\2\2?\u0127\3\2"+
		"\2\2A\u0129\3\2\2\2C\u012e\3\2\2\2E\u0132\3\2\2\2G\u013b\3\2\2\2I\u013f"+
		"\3\2\2\2K\u0147\3\2\2\2M\u014c\3\2\2\2O\u0150\3\2\2\2Q\u0158\3\2\2\2S"+
		"\u015b\3\2\2\2U\u0163\3\2\2\2WX\7\61\2\2XY\7,\2\2YZ\3\2\2\2Z[\b\2\2\2"+
		"[\6\3\2\2\2\\]\7\61\2\2]^\7\61\2\2^_\3\2\2\2_`\b\3\3\2`\b\3\2\2\2ab\t"+
		"\2\2\2bc\b\4\4\2c\n\3\2\2\2de\7?\2\2e\f\3\2\2\2fg\7@\2\2g\16\3\2\2\2h"+
		"i\7>\2\2i\20\3\2\2\2jk\7-\2\2k\22\3\2\2\2lm\7/\2\2m\24\3\2\2\2no\7,\2"+
		"\2o\26\3\2\2\2pq\7\61\2\2q\30\3\2\2\2rs\7O\2\2st\7Q\2\2ty\7F\2\2uv\7o"+
		"\2\2vw\7q\2\2wy\7f\2\2xr\3\2\2\2xu\3\2\2\2y\32\3\2\2\2z{\7G\2\2{|\7P\2"+
		"\2|\u0081\7F\2\2}~\7g\2\2~\177\7p\2\2\177\u0081\7f\2\2\u0080z\3\2\2\2"+
		"\u0080}\3\2\2\2\u0081\34\3\2\2\2\u0082\u0083\7P\2\2\u0083\u0084\7G\2\2"+
		"\u0084\u0085\7Z\2\2\u0085\u008b\7V\2\2\u0086\u0087\7p\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7z\2\2\u0089\u008b\7v\2\2\u008a\u0082\3\2\2\2\u008a"+
		"\u0086\3\2\2\2\u008b\36\3\2\2\2\u008c\u008d\7*\2\2\u008d \3\2\2\2\u008e"+
		"\u008f\7+\2\2\u008f\"\3\2\2\2\u0090\u0091\7$\2\2\u0091$\3\2\2\2\u0092"+
		"\u0093\7R\2\2\u0093\u0094\7T\2\2\u0094\u0095\7K\2\2\u0095\u0096\7P\2\2"+
		"\u0096\u009d\7V\2\2\u0097\u0098\7r\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7k\2\2\u009a\u009b\7p\2\2\u009b\u009d\7v\2\2\u009c\u0092\3\2\2\2\u009c"+
		"\u0097\3\2\2\2\u009d&\3\2\2\2\u009e\u009f\7N\2\2\u009f\u00a0\7G\2\2\u00a0"+
		"\u00a5\7V\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a5\7v\2\2"+
		"\u00a4\u009e\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7"+
		"P\2\2\u00a7\u00a8\7Q\2\2\u00a8\u00a9\7V\2\2\u00a9\u00aa\7\"\2\2\u00aa"+
		"\u00ab\7C\2\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\7P\2\2\u00ad\u00ae\7W\2"+
		"\2\u00ae\u00af\7O\2\2\u00af\u00b0\7D\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2"+
		"\7T\2\2\u00b2*\3\2\2\2\u00b3\u00b4\7H\2\2\u00b4\u00b5\7Q\2\2\u00b5\u00ba"+
		"\7T\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7q\2\2\u00b8\u00ba\7t\2\2\u00b9"+
		"\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7V\2\2\u00bc"+
		"\u00c0\7Q\2\2\u00bd\u00be\7v\2\2\u00be\u00c0\7q\2\2\u00bf\u00bb\3\2\2"+
		"\2\u00bf\u00bd\3\2\2\2\u00c0.\3\2\2\2\u00c1\u00c2\7E\2\2\u00c2\u00c3\7"+
		"Q\2\2\u00c3\u00c4\7P\2\2\u00c4\u00c5\7V\2\2\u00c5\u00c6\7K\2\2\u00c6\u00c7"+
		"\7P\2\2\u00c7\u00c8\7W\2\2\u00c8\u00d2\7G\2\2\u00c9\u00ca\7e\2\2\u00ca"+
		"\u00cb\7q\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7k\2\2"+
		"\u00ce\u00cf\7p\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d2\7g\2\2\u00d1\u00c1"+
		"\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d2\60\3\2\2\2\u00d3\u00d4\7G\2\2\u00d4"+
		"\u00d5\7Z\2\2\u00d5\u00d6\7K\2\2\u00d6\u00dc\7V\2\2\u00d7\u00d8\7g\2\2"+
		"\u00d8\u00d9\7z\2\2\u00d9\u00da\7k\2\2\u00da\u00dc\7v\2\2\u00db\u00d3"+
		"\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc\62\3\2\2\2\u00dd\u00de\7G\2\2\u00de"+
		"\u00df\7N\2\2\u00df\u00e0\7U\2\2\u00e0\u00e6\7G\2\2\u00e1\u00e2\7g\2\2"+
		"\u00e2\u00e3\7n\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e6\7g\2\2\u00e5\u00dd"+
		"\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\64\3\2\2\2\u00e7\u00e8\7K\2\2\u00e8"+
		"\u00ec\7H\2\2\u00e9\u00ea\7k\2\2\u00ea\u00ec\7h\2\2\u00eb\u00e7\3\2\2"+
		"\2\u00eb\u00e9\3\2\2\2\u00ec\66\3\2\2\2\u00ed\u00ee\7V\2\2\u00ee\u00ef"+
		"\7J\2\2\u00ef\u00f0\7G\2\2\u00f0\u00f6\7P\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\u00f3\7j\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f6\7p\2\2\u00f5\u00ed\3\2\2"+
		"\2\u00f5\u00f1\3\2\2\2\u00f68\3\2\2\2\u00f7\u00f8\7K\2\2\u00f8\u00f9\7"+
		"P\2\2\u00f9\u00fa\7R\2\2\u00fa\u00fb\7W\2\2\u00fb\u0102\7V\2\2\u00fc\u00fd"+
		"\7k\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100\7w\2\2\u0100"+
		"\u0102\7v\2\2\u0101\u00f7\3\2\2\2\u0101\u00fc\3\2\2\2\u0102:\3\2\2\2\u0103"+
		"\u0104\7T\2\2\u0104\u0105\7G\2\2\u0105\u0106\7R\2\2\u0106\u0107\7G\2\2"+
		"\u0107\u0108\7C\2\2\u0108\u0110\7V\2\2\u0109\u010a\7t\2\2\u010a\u010b"+
		"\7g\2\2\u010b\u010c\7r\2\2\u010c\u010d\7g\2\2\u010d\u010e\7c\2\2\u010e"+
		"\u0110\7v\2\2\u010f\u0103\3\2\2\2\u010f\u0109\3\2\2\2\u0110<\3\2\2\2\u0111"+
		"\u0112\7W\2\2\u0112\u0113\7P\2\2\u0113\u0114\7V\2\2\u0114\u0115\7K\2\2"+
		"\u0115\u011c\7N\2\2\u0116\u0117\7w\2\2\u0117\u0118\7p\2\2\u0118\u0119"+
		"\7v\2\2\u0119\u011a\7k\2\2\u011a\u011c\7n\2\2\u011b\u0111\3\2\2\2\u011b"+
		"\u0116\3\2\2\2\u011c>\3\2\2\2\u011d\u011e\7Y\2\2\u011e\u011f\7J\2\2\u011f"+
		"\u0120\7K\2\2\u0120\u0121\7N\2\2\u0121\u0128\7G\2\2\u0122\u0123\7y\2\2"+
		"\u0123\u0124\7j\2\2\u0124\u0125\7k\2\2\u0125\u0126\7n\2\2\u0126\u0128"+
		"\7g\2\2\u0127\u011d\3\2\2\2\u0127\u0122\3\2\2\2\u0128@\3\2\2\2\u0129\u012a"+
		"\7T\2\2\u012a\u012b\7G\2\2\u012b\u012c\7O\2\2\u012cB\3\2\2\2\u012d\u012f"+
		"\t\3\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131D\3\2\2\2\u0132\u0134\7$\2\2\u0133\u0135\t\4\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7$\2\2\u0139F\3\2\2\2\u013a\u013c"+
		"\5\t\4\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013eH\3\2\2\2\u013f\u0143\5K%\2\u0140\u0142\5G#\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144J\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\t\5\2\2\u0147\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"L\3\2\2\2\u014b\u014d\t\6\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2"+
		"\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014fN\3\2\2\2\u0150\u0151\7"+
		",\2\2\u0151\u0152\7\61\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b\'\5\2\u0154"+
		"P\3\2\2\2\u0155\u0157\13\2\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159R\3\2\2\2\u015a\u0158\3"+
		"\2\2\2\u015b\u015c\7\17\2\2\u015c\u015d\7\f\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\b)\5\2\u015fT\3\2\2\2\u0160\u0162\13\2\2\2\u0161\u0160\3\2\2\2"+
		"\u0162\u0165\3\2\2\2\u0163\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164V\3"+
		"\2\2\2\u0165\u0163\3\2\2\2\35\2\3\4x\u0080\u008a\u009c\u00a4\u00b9\u00bf"+
		"\u00d1\u00db\u00e5\u00eb\u00f5\u0101\u010f\u011b\u0127\u0130\u0136\u013d"+
		"\u0143\u0149\u014e\u0158\u0163\6\7\3\2\7\4\2\3\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}