// Generated from LaBusquedaDelTesoroLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaBusquedaDelTesoroLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIOABRIR=1, COMENTARIOLIEA=2, IDENTIFICADOR=3, INTRO=4, INT=5, 
		COODENADA=6, Objeto=7, TEDA=8, PUNTOS=9, TIENE=10, ENTERRADO=11, COMENTARIOCERRAR=12, 
		TEXTOCOMENTARIOML=13, FINAL_COMENTARIO_UL=14, TEXTOCOMENTARIOUL=15;
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
			"COMENTARIOABRIR", "COMENTARIOLIEA", "IDENTIFICADOR", "INTRO", "INT", 
			"COODENADA", "Objeto", "TEDA", "PUNTOS", "TIENE", "ENTERRADO", "COMENTARIOCERRAR", 
			"TEXTOCOMENTARIOML", "FINAL_COMENTARIO_UL", "TEXTOCOMENTARIOUL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/*'", "'//'", null, null, null, null, null, "' te da '", "' puntos'", 
			"'El jugador tiene '", "' esta enterrado en '", "'*/'", null, "'\r\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIOABRIR", "COMENTARIOLIEA", "IDENTIFICADOR", "INTRO", 
			"INT", "COODENADA", "Objeto", "TEDA", "PUNTOS", "TIENE", "ENTERRADO", 
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


	public LaBusquedaDelTesoroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LaBusquedaDelTesoroLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0094\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\6\4/\n\4\r\4\16\4\60\3\5\6\5\64\n"+
		"\5\r\5\16\5\65\3\6\6\69\n\6\r\6\16\6:\3\7\3\7\3\7\3\7\3\b\3\b\6\bC\n\b"+
		"\r\b\16\bD\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\7\16\u0085\n\16\f\16\16\16\u0088\13\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\7\20\u0090\n\20\f\20\16\20\u0093\13\20\4\u0086\u0091\2\21\5\3\7\4\t\5"+
		"\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21\5\2\3\4"+
		"\6\4\2C\\c|\4\2\f\f\17\17\3\2\62;\6\2\"\"))C\\c|\2\u0097\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2"+
		"\3\35\3\2\2\2\4\37\3\2\2\2\4!\3\2\2\2\5#\3\2\2\2\7(\3\2\2\2\t.\3\2\2\2"+
		"\13\63\3\2\2\2\r8\3\2\2\2\17<\3\2\2\2\21@\3\2\2\2\23H\3\2\2\2\25P\3\2"+
		"\2\2\27X\3\2\2\2\31j\3\2\2\2\33~\3\2\2\2\35\u0086\3\2\2\2\37\u0089\3\2"+
		"\2\2!\u0091\3\2\2\2#$\7\61\2\2$%\7,\2\2%&\3\2\2\2&\'\b\2\2\2\'\6\3\2\2"+
		"\2()\7\61\2\2)*\7\61\2\2*+\3\2\2\2+,\b\3\3\2,\b\3\2\2\2-/\t\2\2\2.-\3"+
		"\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\n\3\2\2\2\62\64\t\3\2"+
		"\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\f\3\2\2"+
		"\2\679\t\4\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\16\3\2\2\2<"+
		"=\5\r\6\2=>\7.\2\2>?\5\r\6\2?\20\3\2\2\2@B\7$\2\2AC\t\5\2\2BA\3\2\2\2"+
		"CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7$\2\2G\22\3\2\2\2HI\7\"\2"+
		"\2IJ\7v\2\2JK\7g\2\2KL\7\"\2\2LM\7f\2\2MN\7c\2\2NO\7\"\2\2O\24\3\2\2\2"+
		"PQ\7\"\2\2QR\7r\2\2RS\7w\2\2ST\7p\2\2TU\7v\2\2UV\7q\2\2VW\7u\2\2W\26\3"+
		"\2\2\2XY\7G\2\2YZ\7n\2\2Z[\7\"\2\2[\\\7l\2\2\\]\7w\2\2]^\7i\2\2^_\7c\2"+
		"\2_`\7f\2\2`a\7q\2\2ab\7t\2\2bc\7\"\2\2cd\7v\2\2de\7k\2\2ef\7g\2\2fg\7"+
		"p\2\2gh\7g\2\2hi\7\"\2\2i\30\3\2\2\2jk\7\"\2\2kl\7g\2\2lm\7u\2\2mn\7v"+
		"\2\2no\7c\2\2op\7\"\2\2pq\7g\2\2qr\7p\2\2rs\7v\2\2st\7g\2\2tu\7t\2\2u"+
		"v\7t\2\2vw\7c\2\2wx\7f\2\2xy\7q\2\2yz\7\"\2\2z{\7g\2\2{|\7p\2\2|}\7\""+
		"\2\2}\32\3\2\2\2~\177\7,\2\2\177\u0080\7\61\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\b\r\4\2\u0082\34\3\2\2\2\u0083\u0085\13\2\2\2\u0084\u0083\3\2\2"+
		"\2\u0085\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\36"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\17\2\2\u008a\u008b\7\f\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008d\b\17\4\2\u008d \3\2\2\2\u008e\u0090\13"+
		"\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\"\3\2\2\2\u0093\u0091\3\2\2\2\13\2\3\4\60\65:D\u0086"+
		"\u0091\5\7\3\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}