// Generated from RhombusQL.g4 by ANTLR 4.13.1
package com.github.cluelessskywatcher.rhombostore.generated;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RhombusQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, STRING=5, INTEGER=6, BOOLEAN=7, ID=8, 
		SEMICOLON=9, WS=10;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_functionCall = 2, RULE_argumentsList = 3, 
		RULE_argument = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "functionCall", "argumentsList", "argument"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'='", null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "STRING", "INTEGER", "BOOLEAN", "ID", "SEMICOLON", 
			"WS"
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
	public String getGrammarFileName() { return "RhombusQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RhombusQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RhombusQLListener ) ((RhombusQLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RhombusQLListener ) ((RhombusQLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RhombusQLVisitor ) return ((RhombusQLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				statement();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RhombusQLParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RhombusQLListener ) ((RhombusQLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RhombusQLListener ) ((RhombusQLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RhombusQLVisitor ) return ((RhombusQLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			functionCall();
			setState(16);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public Map<String, Object> fcArgs;
		public Token ID;
		public ArgumentsListContext arguments;
		public TerminalNode ID() { return getToken(RhombusQLParser.ID, 0); }
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RhombusQLListener ) ((RhombusQLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RhombusQLListener ) ((RhombusQLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RhombusQLVisitor ) return ((RhombusQLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionCall);

		        ((FunctionCallContext)_localctx).fcArgs =  new HashMap<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((FunctionCallContext)_localctx).ID = match(ID);
			 _localctx.fcArgs.put("_fcName", (((FunctionCallContext)_localctx).ID!=null?((FunctionCallContext)_localctx).ID.getText():null)); 
			setState(20);
			match(T__0);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(21);
				((FunctionCallContext)_localctx).arguments = argumentsList();
				}
			}

			setState(24);
			match(T__1);
			 _localctx.fcArgs.put("args", ((FunctionCallContext)_localctx).arguments.args); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsListContext extends ParserRuleContext {
		public Map<String, Object> args;
		public ArgumentContext argumentList;
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RhombusQLListener ) ((RhombusQLListener)listener).enterArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RhombusQLListener ) ((RhombusQLListener)listener).exitArgumentsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RhombusQLVisitor ) return ((RhombusQLVisitor<? extends T>)visitor).visitArgumentsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsListContext argumentsList() throws RecognitionException {
		ArgumentsListContext _localctx = new ArgumentsListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumentsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(27);
			((ArgumentsListContext)_localctx).argumentList = argument();
			 ((ArgumentsListContext)_localctx).args =  new HashMap<>(); _localctx.args.put(((ArgumentsListContext)_localctx).argumentList.name, ((ArgumentsListContext)_localctx).argumentList.value); 
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(30);
				match(T__2);
				setState(31);
				((ArgumentsListContext)_localctx).argumentList = argument();
				 _localctx.args.put(((ArgumentsListContext)_localctx).argumentList.name, ((ArgumentsListContext)_localctx).argumentList.value); 
				}
				}
				setState(38);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public String name;
		public Object value;
		public Token ID;
		public Token val;
		public FunctionCallContext functionCall;
		public TerminalNode ID() { return getToken(RhombusQLParser.ID, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode STRING() { return getToken(RhombusQLParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(RhombusQLParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(RhombusQLParser.BOOLEAN, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RhombusQLListener ) ((RhombusQLListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RhombusQLListener ) ((RhombusQLListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RhombusQLVisitor ) return ((RhombusQLVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			((ArgumentContext)_localctx).ID = match(ID);
			setState(40);
			match(T__3);
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(41);
				((ArgumentContext)_localctx).val = match(STRING);
				 ((ArgumentContext)_localctx).value =  (((ArgumentContext)_localctx).val!=null?((ArgumentContext)_localctx).val.getText():null); 
				}
				break;
			case INTEGER:
				{
				setState(43);
				((ArgumentContext)_localctx).val = match(INTEGER);
				 ((ArgumentContext)_localctx).value =  Integer.parseInt((((ArgumentContext)_localctx).val!=null?((ArgumentContext)_localctx).val.getText():null)); 
				}
				break;
			case BOOLEAN:
				{
				setState(45);
				((ArgumentContext)_localctx).val = match(BOOLEAN);
				 ((ArgumentContext)_localctx).value =  Boolean.parseBoolean((((ArgumentContext)_localctx).val!=null?((ArgumentContext)_localctx).val.getText():null)); 
				}
				break;
			case ID:
				{
				setState(47);
				((ArgumentContext)_localctx).functionCall = functionCall();
				 ((ArgumentContext)_localctx).value =  ((ArgumentContext)_localctx).functionCall.fcArgs; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((ArgumentContext)_localctx).name =  (((ArgumentContext)_localctx).ID!=null?((ArgumentContext)_localctx).ID.getText():null); 
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

	public static final String _serializedATN =
		"\u0004\u0001\n7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0017\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"#\b\u0003\n\u0003\f\u0003&\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u00043\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u00007"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000\u0000"+
		"\u0004\u0012\u0001\u0000\u0000\u0000\u0006\u001b\u0001\u0000\u0000\u0000"+
		"\b\'\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001"+
		"\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0003\u0004\u0002\u0000\u0010\u0011\u0005\t\u0000\u0000\u0011"+
		"\u0003\u0001\u0000\u0000\u0000\u0012\u0013\u0005\b\u0000\u0000\u0013\u0014"+
		"\u0006\u0002\uffff\uffff\u0000\u0014\u0016\u0005\u0001\u0000\u0000\u0015"+
		"\u0017\u0003\u0006\u0003\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0005\u0002\u0000\u0000\u0019\u001a\u0006\u0002\uffff\uffff\u0000"+
		"\u001a\u0005\u0001\u0000\u0000\u0000\u001b\u001c\u0003\b\u0004\u0000\u001c"+
		"\u001d\u0006\u0003\uffff\uffff\u0000\u001d$\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0005\u0003\u0000\u0000\u001f \u0003\b\u0004\u0000 !\u0006\u0003"+
		"\uffff\uffff\u0000!#\u0001\u0000\u0000\u0000\"\u001e\u0001\u0000\u0000"+
		"\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%\u0007\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"\'(\u0005\b\u0000\u0000(2\u0005\u0004\u0000\u0000)*\u0005\u0005\u0000"+
		"\u0000*3\u0006\u0004\uffff\uffff\u0000+,\u0005\u0006\u0000\u0000,3\u0006"+
		"\u0004\uffff\uffff\u0000-.\u0005\u0007\u0000\u0000.3\u0006\u0004\uffff"+
		"\uffff\u0000/0\u0003\u0004\u0002\u000001\u0006\u0004\uffff\uffff\u0000"+
		"13\u0001\u0000\u0000\u00002)\u0001\u0000\u0000\u00002+\u0001\u0000\u0000"+
		"\u00002-\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000045\u0006\u0004\uffff\uffff\u00005\t\u0001\u0000\u0000\u0000"+
		"\u0004\r\u0016$2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}