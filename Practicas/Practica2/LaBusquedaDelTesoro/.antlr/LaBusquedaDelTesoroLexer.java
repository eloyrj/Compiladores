// Generated from /home/corte/Documentos/Repositorios/Compiladores/Practicas/Practica2/LaBusquedaDelTesoro/LaBusquedaDelTesoro.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NEWLINE=6, INT=7, Objeto=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "NEWLINE", "INT", "Objeto"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' te da '", "' puntos'", "' esta enterrado en '", "'El jugador tiene '", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NEWLINE", "INT", "Objeto"
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
	public String getGrammarFileName() { return "LaBusquedaDelTesoro.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n]\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\6\7M\n\7\r\7\16\7N\3\b\6\bR\n\b\r\b\16\bS\3\t\3\t\6\tX\n\t\r\t\16\t"+
		"Y\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\5\4\2\f\f\17\17"+
		"\3\2\62;\6\2\"\"))C\\c|\2_\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5"+
		"\33\3\2\2\2\7#\3\2\2\2\t\67\3\2\2\2\13I\3\2\2\2\rL\3\2\2\2\17Q\3\2\2\2"+
		"\21U\3\2\2\2\23\24\7\"\2\2\24\25\7v\2\2\25\26\7g\2\2\26\27\7\"\2\2\27"+
		"\30\7f\2\2\30\31\7c\2\2\31\32\7\"\2\2\32\4\3\2\2\2\33\34\7\"\2\2\34\35"+
		"\7r\2\2\35\36\7w\2\2\36\37\7p\2\2\37 \7v\2\2 !\7q\2\2!\"\7u\2\2\"\6\3"+
		"\2\2\2#$\7\"\2\2$%\7g\2\2%&\7u\2\2&\'\7v\2\2\'(\7c\2\2()\7\"\2\2)*\7g"+
		"\2\2*+\7p\2\2+,\7v\2\2,-\7g\2\2-.\7t\2\2./\7t\2\2/\60\7c\2\2\60\61\7f"+
		"\2\2\61\62\7q\2\2\62\63\7\"\2\2\63\64\7g\2\2\64\65\7p\2\2\65\66\7\"\2"+
		"\2\66\b\3\2\2\2\678\7G\2\289\7n\2\29:\7\"\2\2:;\7l\2\2;<\7w\2\2<=\7i\2"+
		"\2=>\7c\2\2>?\7f\2\2?@\7q\2\2@A\7t\2\2AB\7\"\2\2BC\7v\2\2CD\7k\2\2DE\7"+
		"g\2\2EF\7p\2\2FG\7g\2\2GH\7\"\2\2H\n\3\2\2\2IJ\7.\2\2J\f\3\2\2\2KM\t\2"+
		"\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\16\3\2\2\2PR\t\3\2\2QP\3"+
		"\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\20\3\2\2\2UW\7$\2\2VX\t\4\2\2WV"+
		"\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7$\2\2\\\22\3\2\2"+
		"\2\6\2NSY\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}