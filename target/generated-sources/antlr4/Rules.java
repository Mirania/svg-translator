// Generated from Rules.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Rules extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, VAR=2, INT=3, NEWLINE=4, WS=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'"
	};
	public static final String[] ruleNames = {
		"ID", "VAR", "INT", "NEWLINE", "WS"
	};


	public Rules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rules.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7&\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\17\n\2\r\2\16\2\20\3\3\3\3\3\3"+
		"\3\4\6\4\27\n\4\r\4\16\4\30\3\5\5\5\34\n\5\3\5\3\5\3\6\6\6!\n\6\r\6\16"+
		"\6\"\3\6\3\6\3\30\2\7\3\3\5\4\7\5\t\6\13\7\3\2\7\3\2c|\4\2C\\c|\5\2\62"+
		";C\\c|\3\2\62;\5\2\13\f\17\17\"\")\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\3\16\3\2\2\2\5\22\3\2\2\2\7\26\3\2\2\2\t\33"+
		"\3\2\2\2\13 \3\2\2\2\r\17\t\2\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2"+
		"\2\2\20\21\3\2\2\2\21\4\3\2\2\2\22\23\t\3\2\2\23\24\t\4\2\2\24\6\3\2\2"+
		"\2\25\27\t\5\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\30\26\3\2\2"+
		"\2\31\b\3\2\2\2\32\34\7\17\2\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2"+
		"\2\35\36\7\f\2\2\36\n\3\2\2\2\37!\t\6\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3"+
		"\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\b\6\2\2%\f\3\2\2\2\7\2\20\30\33\"\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}