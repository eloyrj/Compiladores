// Generated from C:/Users/Usuario/Documents/GitHub/Compiladores/Practicas/Practica2/miniB\miniBLexer.g4 by ANTLR 4.9.2
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
		COMENTARIOABRIR=1, COMENTARIOLIEA=2, CONTADOR=3, IGUAL=4, MAYORQUE=5, 
		MENORQUE=6, MAS=7, MENOS=8, POR=9, ENTRE=10, MOD=11, END=12, NEXT=13, 
		PARENTESISA=14, PARENTESISC=15, COMILLAS=16, PRINT=17, LET=18, NOTNUMBER=19, 
		FOR=20, TO=21, CONTINUE=22, EXIT=23, ELSE=24, IF=25, THEN=26, INPUT=27, 
		REPEAT=28, UNTIL=29, WHILE=30, REM=31, E=32, STRING=33, STRINGCOM=34, 
		TAB=35, INTROTAB=36, INTRO=37, INT=38, COMENTARIOCERRAR=39, TEXTOCOMENTARIOML=40, 
		FINAL_COMENTARIO_UL=41, TEXTOCOMENTARIOUL=42;
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
			"COMENTARIOABRIR", "COMENTARIOLIEA", "CONTADOR", "IGUAL", "MAYORQUE", 
			"MENORQUE", "MAS", "MENOS", "POR", "ENTRE", "MOD", "END", "NEXT", "PARENTESISA", 
			"PARENTESISC", "COMILLAS", "PRINT", "LET", "NOTNUMBER", "FOR", "TO", 
			"CONTINUE", "EXIT", "ELSE", "IF", "THEN", "INPUT", "REPEAT", "UNTIL", 
			"WHILE", "REM", "E", "STRING", "STRINGCOM", "TAB", "INTROTAB", "INTRO", 
			"INT", "COMENTARIOCERRAR", "TEXTOCOMENTARIOML", "FINAL_COMENTARIO_UL", 
			"TEXTOCOMENTARIOUL"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0117\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3"+
		"\"\6\"\u00e0\n\"\r\"\16\"\u00e1\3#\3#\6#\u00e6\n#\r#\16#\u00e7\3#\3#\3"+
		"$\6$\u00ed\n$\r$\16$\u00ee\3%\3%\7%\u00f3\n%\f%\16%\u00f6\13%\3&\6&\u00f9"+
		"\n&\r&\16&\u00fa\3\'\6\'\u00fe\n\'\r\'\16\'\u00ff\3(\3(\3(\3(\3(\3)\7"+
		")\u0108\n)\f)\16)\u010b\13)\3*\3*\3*\3*\3*\3+\7+\u0113\n+\f+\16+\u0116"+
		"\13+\4\u0109\u0114\2,\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31"+
		"\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33"+
		"\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,\5\2\3\4\6\4\2C\\c|\t\2"+
		"\"#))<<C\\c|\u00a3\u00a3\u00c4\u00c4\4\2\f\f\17\17\3\2\62;\2\u011c\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\3S\3\2\2\2\4U\3\2\2\2\4W\3\2"+
		"\2\2\5Y\3\2\2\2\7^\3\2\2\2\tc\3\2\2\2\13e\3\2\2\2\rg\3\2\2\2\17i\3\2\2"+
		"\2\21k\3\2\2\2\23m\3\2\2\2\25o\3\2\2\2\27q\3\2\2\2\31s\3\2\2\2\33w\3\2"+
		"\2\2\35{\3\2\2\2\37\u0080\3\2\2\2!\u0082\3\2\2\2#\u0084\3\2\2\2%\u0086"+
		"\3\2\2\2\'\u008c\3\2\2\2)\u0090\3\2\2\2+\u009d\3\2\2\2-\u00a1\3\2\2\2"+
		"/\u00a4\3\2\2\2\61\u00ad\3\2\2\2\63\u00b2\3\2\2\2\65\u00b7\3\2\2\2\67"+
		"\u00ba\3\2\2\29\u00bf\3\2\2\2;\u00c5\3\2\2\2=\u00cc\3\2\2\2?\u00d2\3\2"+
		"\2\2A\u00d8\3\2\2\2C\u00dc\3\2\2\2E\u00df\3\2\2\2G\u00e3\3\2\2\2I\u00ec"+
		"\3\2\2\2K\u00f0\3\2\2\2M\u00f8\3\2\2\2O\u00fd\3\2\2\2Q\u0101\3\2\2\2S"+
		"\u0109\3\2\2\2U\u010c\3\2\2\2W\u0114\3\2\2\2YZ\7\61\2\2Z[\7,\2\2[\\\3"+
		"\2\2\2\\]\b\2\2\2]\6\3\2\2\2^_\7\61\2\2_`\7\61\2\2`a\3\2\2\2ab\b\3\3\2"+
		"b\b\3\2\2\2cd\7k\2\2d\n\3\2\2\2ef\7?\2\2f\f\3\2\2\2gh\7@\2\2h\16\3\2\2"+
		"\2ij\7>\2\2j\20\3\2\2\2kl\7-\2\2l\22\3\2\2\2mn\7/\2\2n\24\3\2\2\2op\7"+
		",\2\2p\26\3\2\2\2qr\7\61\2\2r\30\3\2\2\2st\7O\2\2tu\7Q\2\2uv\7F\2\2v\32"+
		"\3\2\2\2wx\7G\2\2xy\7P\2\2yz\7F\2\2z\34\3\2\2\2{|\7P\2\2|}\7G\2\2}~\7"+
		"Z\2\2~\177\7V\2\2\177\36\3\2\2\2\u0080\u0081\7*\2\2\u0081 \3\2\2\2\u0082"+
		"\u0083\7+\2\2\u0083\"\3\2\2\2\u0084\u0085\7$\2\2\u0085$\3\2\2\2\u0086"+
		"\u0087\7R\2\2\u0087\u0088\7T\2\2\u0088\u0089\7K\2\2\u0089\u008a\7P\2\2"+
		"\u008a\u008b\7V\2\2\u008b&\3\2\2\2\u008c\u008d\7N\2\2\u008d\u008e\7G\2"+
		"\2\u008e\u008f\7V\2\2\u008f(\3\2\2\2\u0090\u0091\7P\2\2\u0091\u0092\7"+
		"Q\2\2\u0092\u0093\7V\2\2\u0093\u0094\7\"\2\2\u0094\u0095\7C\2\2\u0095"+
		"\u0096\7\"\2\2\u0096\u0097\7P\2\2\u0097\u0098\7W\2\2\u0098\u0099\7O\2"+
		"\2\u0099\u009a\7D\2\2\u009a\u009b\7G\2\2\u009b\u009c\7T\2\2\u009c*\3\2"+
		"\2\2\u009d\u009e\7H\2\2\u009e\u009f\7Q\2\2\u009f\u00a0\7T\2\2\u00a0,\3"+
		"\2\2\2\u00a1\u00a2\7V\2\2\u00a2\u00a3\7Q\2\2\u00a3.\3\2\2\2\u00a4\u00a5"+
		"\7E\2\2\u00a5\u00a6\7Q\2\2\u00a6\u00a7\7P\2\2\u00a7\u00a8\7V\2\2\u00a8"+
		"\u00a9\7K\2\2\u00a9\u00aa\7P\2\2\u00aa\u00ab\7W\2\2\u00ab\u00ac\7G\2\2"+
		"\u00ac\60\3\2\2\2\u00ad\u00ae\7G\2\2\u00ae\u00af\7Z\2\2\u00af\u00b0\7"+
		"K\2\2\u00b0\u00b1\7V\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4"+
		"\7N\2\2\u00b4\u00b5\7U\2\2\u00b5\u00b6\7G\2\2\u00b6\64\3\2\2\2\u00b7\u00b8"+
		"\7K\2\2\u00b8\u00b9\7H\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bc"+
		"\7J\2\2\u00bc\u00bd\7G\2\2\u00bd\u00be\7P\2\2\u00be8\3\2\2\2\u00bf\u00c0"+
		"\7K\2\2\u00c0\u00c1\7P\2\2\u00c1\u00c2\7R\2\2\u00c2\u00c3\7W\2\2\u00c3"+
		"\u00c4\7V\2\2\u00c4:\3\2\2\2\u00c5\u00c6\7T\2\2\u00c6\u00c7\7G\2\2\u00c7"+
		"\u00c8\7R\2\2\u00c8\u00c9\7G\2\2\u00c9\u00ca\7C\2\2\u00ca\u00cb\7V\2\2"+
		"\u00cb<\3\2\2\2\u00cc\u00cd\7W\2\2\u00cd\u00ce\7P\2\2\u00ce\u00cf\7V\2"+
		"\2\u00cf\u00d0\7K\2\2\u00d0\u00d1\7N\2\2\u00d1>\3\2\2\2\u00d2\u00d3\7"+
		"Y\2\2\u00d3\u00d4\7J\2\2\u00d4\u00d5\7K\2\2\u00d5\u00d6\7N\2\2\u00d6\u00d7"+
		"\7G\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7T\2\2\u00d9\u00da\7G\2\2\u00da\u00db"+
		"\7O\2\2\u00dbB\3\2\2\2\u00dc\u00dd\7\"\2\2\u00ddD\3\2\2\2\u00de\u00e0"+
		"\t\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2F\3\2\2\2\u00e3\u00e5\7$\2\2\u00e4\u00e6\t\3\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7$\2\2\u00eaH\3\2\2\2\u00eb\u00ed"+
		"\5C!\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00efJ\3\2\2\2\u00f0\u00f4\5M&\2\u00f1\u00f3\5I$\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5L\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\t\4\2\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"N\3\2\2\2\u00fc\u00fe\t\5\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100P\3\2\2\2\u0101\u0102\7"+
		",\2\2\u0102\u0103\7\61\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b(\4\2\u0105"+
		"R\3\2\2\2\u0106\u0108\13\2\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2"+
		"\u0109\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010aT\3\2\2\2\u010b\u0109\3"+
		"\2\2\2\u010c\u010d\7\17\2\2\u010d\u010e\7\f\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\b*\4\2\u0110V\3\2\2\2\u0111\u0113\13\2\2\2\u0112\u0111\3\2\2\2"+
		"\u0113\u0116\3\2\2\2\u0114\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115X\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\r\2\3\4\u00e1\u00e7\u00ee\u00f4\u00fa\u00ff"+
		"\u0109\u0114\5\7\3\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}