// Generated from C:/Users/dongh/Desktop/Spring 2019/LS Proj/COS382 P02 (Goeman, Ha)/src\SurveyGenerator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SurveyGeneratorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, NL=19, TEXT=20, INTEGER=21, NUMBER=22, WS=23;
	public static final int
		RULE_s = 0, RULE_title = 1, RULE_page = 2, RULE_pagetitle = 3, RULE_qtype = 4, 
		RULE_question = 5, RULE_questiontitle = 6, RULE_subquestion = 7, RULE_multi = 8, 
		RULE_multiplechoiceoption = 9, RULE_single = 10, RULE_singlechoiceoption = 11, 
		RULE_textentry = 12, RULE_maxlength = 13, RULE_number = 14, RULE_minimum = 15, 
		RULE_maximum = 16, RULE_date = 17, RULE_upload = 18, RULE_scale = 19, 
		RULE_minlabel = 20, RULE_maxlabel = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "title", "page", "pagetitle", "qtype", "question", "questiontitle", 
			"subquestion", "multi", "multiplechoiceoption", "single", "singlechoiceoption", 
			"textentry", "maxlength", "number", "minimum", "maximum", "date", "upload", 
			"scale", "minlabel", "maxlabel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'~'", "'?'", "'\t?'", "'\t'", "'multi'", "'%'", "'['", 
			"','", "']'", "'>'", "'single'", "'textentry['", "'number['", "'|'", 
			"'date[]'", "'upload['", "'scale['"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NL", "TEXT", "INTEGER", "NUMBER", 
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
	public String getGrammarFileName() { return "SurveyGenerator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SurveyGeneratorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SurveyGeneratorParser.EOF, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<PageContext> page() {
			return getRuleContexts(PageContext.class);
		}
		public PageContext page(int i) {
			return getRuleContext(PageContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			match(T__0);
			setState(45);
			title();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(46);
				match(NL);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				page();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(57);
			match(EOF);
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(TEXT);
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

	public static class PageContext extends ParserRuleContext {
		public PagetitleContext pagetitle() {
			return getRuleContext(PagetitleContext.class,0);
		}
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(61);
			match(T__1);
			setState(62);
			pagetitle();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(63);
				match(NL);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				question();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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

	public static class PagetitleContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public PagetitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pagetitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterPagetitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitPagetitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitPagetitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PagetitleContext pagetitle() throws RecognitionException {
		PagetitleContext _localctx = new PagetitleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pagetitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(TEXT);
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

	public static class QtypeContext extends ParserRuleContext {
		public MultiContext multi() {
			return getRuleContext(MultiContext.class,0);
		}
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public TextentryContext textentry() {
			return getRuleContext(TextentryContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public UploadContext upload() {
			return getRuleContext(UploadContext.class,0);
		}
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public QtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterQtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitQtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitQtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QtypeContext qtype() throws RecognitionException {
		QtypeContext _localctx = new QtypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qtype);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				multi();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				single();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				textentry();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				number();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				date();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				upload();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				scale();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class QuestionContext extends ParserRuleContext {
		public QuestiontitleContext questiontitle() {
			return getRuleContext(QuestiontitleContext.class,0);
		}
		public QtypeContext qtype() {
			return getRuleContext(QtypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__2);
			setState(86);
			questiontitle();
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				match(NL);
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(92);
			qtype();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(93);
				match(NL);
				}
				}
				setState(98);
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

	public static class QuestiontitleContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public QuestiontitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questiontitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterQuestiontitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitQuestiontitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitQuestiontitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestiontitleContext questiontitle() throws RecognitionException {
		QuestiontitleContext _localctx = new QuestiontitleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_questiontitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(TEXT);
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

	public static class SubquestionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public QtypeContext qtype() {
			return getRuleContext(QtypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public SubquestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterSubquestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitSubquestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitSubquestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubquestionContext subquestion() throws RecognitionException {
		SubquestionContext _localctx = new SubquestionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subquestion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__3);
			setState(102);
			match(TEXT);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				match(NL);
				setState(104);
				match(T__4);
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NL );
			setState(109);
			qtype();
			setState(111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(110);
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class MultiContext extends ParserRuleContext {
		public List<MultiplechoiceoptionContext> multiplechoiceoption() {
			return getRuleContexts(MultiplechoiceoptionContext.class);
		}
		public MultiplechoiceoptionContext multiplechoiceoption(int i) {
			return getRuleContext(MultiplechoiceoptionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public List<SubquestionContext> subquestion() {
			return getRuleContexts(SubquestionContext.class);
		}
		public SubquestionContext subquestion(int i) {
			return getRuleContext(SubquestionContext.class,i);
		}
		public MultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitMulti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiContext multi() throws RecognitionException {
		MultiContext _localctx = new MultiContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__5);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(116);
				match(T__6);
				}
			}

			setState(119);
			match(T__7);
			setState(120);
			multiplechoiceoption();
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				match(T__8);
				setState(122);
				multiplechoiceoption();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(127);
			match(T__9);
			setState(128);
			match(NL);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(129);
				match(T__10);
				setState(130);
				match(TEXT);
				setState(131);
				match(NL);
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					subquestion();
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
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

	public static class MultiplechoiceoptionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public MultiplechoiceoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplechoiceoption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterMultiplechoiceoption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitMultiplechoiceoption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitMultiplechoiceoption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplechoiceoptionContext multiplechoiceoption() throws RecognitionException {
		MultiplechoiceoptionContext _localctx = new MultiplechoiceoptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplechoiceoption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(TEXT);
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

	public static class SingleContext extends ParserRuleContext {
		public List<SinglechoiceoptionContext> singlechoiceoption() {
			return getRuleContexts(SinglechoiceoptionContext.class);
		}
		public SinglechoiceoptionContext singlechoiceoption(int i) {
			return getRuleContext(SinglechoiceoptionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(SurveyGeneratorParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SurveyGeneratorParser.NL, i);
		}
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public List<SubquestionContext> subquestion() {
			return getRuleContexts(SubquestionContext.class);
		}
		public SubquestionContext subquestion(int i) {
			return getRuleContext(SubquestionContext.class,i);
		}
		public SingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleContext single() throws RecognitionException {
		SingleContext _localctx = new SingleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_single);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__11);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(142);
				match(T__6);
				}
			}

			setState(145);
			match(T__7);
			setState(146);
			singlechoiceoption();
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				match(T__8);
				setState(148);
				singlechoiceoption();
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(153);
			match(T__9);
			setState(154);
			match(NL);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(155);
				match(T__10);
				setState(156);
				match(TEXT);
				setState(157);
				match(NL);
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(158);
					subquestion();
					}
					}
					setState(161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
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

	public static class SinglechoiceoptionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public SinglechoiceoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlechoiceoption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterSinglechoiceoption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitSinglechoiceoption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitSinglechoiceoption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglechoiceoptionContext singlechoiceoption() throws RecognitionException {
		SinglechoiceoptionContext _localctx = new SinglechoiceoptionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_singlechoiceoption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(TEXT);
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

	public static class TextentryContext extends ParserRuleContext {
		public MaxlengthContext maxlength() {
			return getRuleContext(MaxlengthContext.class,0);
		}
		public TerminalNode NL() { return getToken(SurveyGeneratorParser.NL, 0); }
		public TextentryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textentry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterTextentry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitTextentry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitTextentry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextentryContext textentry() throws RecognitionException {
		TextentryContext _localctx = new TextentryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_textentry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__12);
			setState(168);
			maxlength();
			setState(169);
			match(T__9);
			setState(170);
			match(NL);
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

	public static class MaxlengthContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SurveyGeneratorParser.INTEGER, 0); }
		public MaxlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterMaxlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitMaxlength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitMaxlength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxlengthContext maxlength() throws RecognitionException {
		MaxlengthContext _localctx = new MaxlengthContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_maxlength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(INTEGER);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SurveyGeneratorParser.NL, 0); }
		public MinimumContext minimum() {
			return getRuleContext(MinimumContext.class,0);
		}
		public MaximumContext maximum() {
			return getRuleContext(MaximumContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__13);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(175);
				minimum();
				setState(176);
				match(T__14);
				setState(177);
				maximum();
				}
			}

			setState(181);
			match(T__9);
			setState(182);
			match(NL);
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

	public static class MinimumContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SurveyGeneratorParser.INTEGER, 0); }
		public MinimumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterMinimum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitMinimum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitMinimum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinimumContext minimum() throws RecognitionException {
		MinimumContext _localctx = new MinimumContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_minimum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(INTEGER);
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

	public static class MaximumContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SurveyGeneratorParser.INTEGER, 0); }
		public MaximumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maximum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterMaximum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitMaximum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitMaximum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaximumContext maximum() throws RecognitionException {
		MaximumContext _localctx = new MaximumContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_maximum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(INTEGER);
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SurveyGeneratorParser.NL, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__15);
			setState(189);
			match(NL);
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

	public static class UploadContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SurveyGeneratorParser.NL, 0); }
		public TerminalNode INTEGER() { return getToken(SurveyGeneratorParser.INTEGER, 0); }
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public UploadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upload; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterUpload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitUpload(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitUpload(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UploadContext upload() throws RecognitionException {
		UploadContext _localctx = new UploadContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_upload);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__16);
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(192);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(193);
				match(TEXT);
				}
				break;
			case 3:
				{
				setState(194);
				match(INTEGER);
				setState(195);
				match(T__14);
				setState(196);
				match(TEXT);
				}
				break;
			}
			setState(199);
			match(T__9);
			setState(200);
			match(NL);
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

	public static class ScaleContext extends ParserRuleContext {
		public MinlabelContext minlabel() {
			return getRuleContext(MinlabelContext.class,0);
		}
		public MaxlabelContext maxlabel() {
			return getRuleContext(MaxlabelContext.class,0);
		}
		public TerminalNode NL() { return getToken(SurveyGeneratorParser.NL, 0); }
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__17);
			setState(203);
			minlabel();
			setState(204);
			match(T__14);
			setState(205);
			maxlabel();
			setState(206);
			match(T__9);
			setState(207);
			match(NL);
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

	public static class MinlabelContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public MinlabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minlabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterMinlabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitMinlabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitMinlabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinlabelContext minlabel() throws RecognitionException {
		MinlabelContext _localctx = new MinlabelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_minlabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(TEXT);
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

	public static class MaxlabelContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SurveyGeneratorParser.TEXT, 0); }
		public MaxlabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxlabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).enterMaxlabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SurveyGeneratorListener ) ((SurveyGeneratorListener)listener).exitMaxlabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SurveyGeneratorVisitor ) return ((SurveyGeneratorVisitor<? extends T>)visitor).visitMaxlabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxlabelContext maxlabel() throws RecognitionException {
		MaxlabelContext _localctx = new MaxlabelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_maxlabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(TEXT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00d8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\6\28\n\2\r\2\16\29\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\7\4C\n\4\f\4\16\4F\13\4\3\4\6\4I\n\4\r\4\16\4J\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6V\n\6\3\7\3\7\3\7\6\7[\n\7\r\7\16\7\\\3\7\3\7\7\7"+
		"a\n\7\f\7\16\7d\13\7\3\b\3\b\3\t\3\t\3\t\3\t\6\tl\n\t\r\t\16\tm\3\t\3"+
		"\t\6\tr\n\t\r\t\16\ts\3\n\3\n\5\nx\n\n\3\n\3\n\3\n\3\n\6\n~\n\n\r\n\16"+
		"\n\177\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u0088\n\n\r\n\16\n\u0089\5\n\u008c"+
		"\n\n\3\13\3\13\3\f\3\f\5\f\u0092\n\f\3\f\3\f\3\f\3\f\6\f\u0098\n\f\r\f"+
		"\16\f\u0099\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00a2\n\f\r\f\16\f\u00a3\5\f\u00a6"+
		"\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00b6\n\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c8\n\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\2\u00db\2.\3\2\2\2\4=\3\2\2\2"+
		"\6?\3\2\2\2\bL\3\2\2\2\nU\3\2\2\2\fW\3\2\2\2\16e\3\2\2\2\20g\3\2\2\2\22"+
		"u\3\2\2\2\24\u008d\3\2\2\2\26\u008f\3\2\2\2\30\u00a7\3\2\2\2\32\u00a9"+
		"\3\2\2\2\34\u00ae\3\2\2\2\36\u00b0\3\2\2\2 \u00ba\3\2\2\2\"\u00bc\3\2"+
		"\2\2$\u00be\3\2\2\2&\u00c1\3\2\2\2(\u00cc\3\2\2\2*\u00d3\3\2\2\2,\u00d5"+
		"\3\2\2\2./\7\3\2\2/\63\5\4\3\2\60\62\7\25\2\2\61\60\3\2\2\2\62\65\3\2"+
		"\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\668\5\6\4"+
		"\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\2\2\3<"+
		"\3\3\2\2\2=>\7\26\2\2>\5\3\2\2\2?@\7\4\2\2@D\5\b\5\2AC\7\25\2\2BA\3\2"+
		"\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2GI\5\f\7\2HG\3\2"+
		"\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\7\3\2\2\2LM\7\26\2\2M\t\3\2\2\2NV"+
		"\5\22\n\2OV\5\26\f\2PV\5\32\16\2QV\5\36\20\2RV\5$\23\2SV\5&\24\2TV\5("+
		"\25\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3"+
		"\2\2\2V\13\3\2\2\2WX\7\5\2\2XZ\5\16\b\2Y[\7\25\2\2ZY\3\2\2\2[\\\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^b\5\n\6\2_a\7\25\2\2`_\3\2\2\2ad\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2c\r\3\2\2\2db\3\2\2\2ef\7\26\2\2f\17\3\2\2\2"+
		"gh\7\6\2\2hk\7\26\2\2ij\7\25\2\2jl\7\7\2\2ki\3\2\2\2lm\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2no\3\2\2\2oq\5\n\6\2pr\7\25\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2t\21\3\2\2\2uw\7\b\2\2vx\7\t\2\2wv\3\2\2\2wx\3\2\2\2xy\3"+
		"\2\2\2yz\7\n\2\2z}\5\24\13\2{|\7\13\2\2|~\5\24\13\2}{\3\2\2\2~\177\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7"+
		"\f\2\2\u0082\u008b\7\25\2\2\u0083\u0084\7\r\2\2\u0084\u0085\7\26\2\2\u0085"+
		"\u0087\7\25\2\2\u0086\u0088\5\20\t\2\u0087\u0086\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0083\3\2\2\2\u008b\u008c\3\2\2\2\u008c\23\3\2\2\2\u008d\u008e\7\26\2"+
		"\2\u008e\25\3\2\2\2\u008f\u0091\7\16\2\2\u0090\u0092\7\t\2\2\u0091\u0090"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\n\2\2\u0094"+
		"\u0097\5\30\r\2\u0095\u0096\7\13\2\2\u0096\u0098\5\30\r\2\u0097\u0095"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\7\f\2\2\u009c\u00a5\7\25\2\2\u009d\u009e\7"+
		"\r\2\2\u009e\u009f\7\26\2\2\u009f\u00a1\7\25\2\2\u00a0\u00a2\5\20\t\2"+
		"\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\27\3\2\2\2\u00a7\u00a8\7\26\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\7\17\2\2"+
		"\u00aa\u00ab\5\34\17\2\u00ab\u00ac\7\f\2\2\u00ac\u00ad\7\25\2\2\u00ad"+
		"\33\3\2\2\2\u00ae\u00af\7\27\2\2\u00af\35\3\2\2\2\u00b0\u00b5\7\20\2\2"+
		"\u00b1\u00b2\5 \21\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\7\f\2\2\u00b8\u00b9\7\25\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\7\27"+
		"\2\2\u00bb!\3\2\2\2\u00bc\u00bd\7\27\2\2\u00bd#\3\2\2\2\u00be\u00bf\7"+
		"\22\2\2\u00bf\u00c0\7\25\2\2\u00c0%\3\2\2\2\u00c1\u00c7\7\23\2\2\u00c2"+
		"\u00c8\7\27\2\2\u00c3\u00c8\7\26\2\2\u00c4\u00c5\7\27\2\2\u00c5\u00c6"+
		"\7\21\2\2\u00c6\u00c8\7\26\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2"+
		"\u00c7\u00c4\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca"+
		"\7\f\2\2\u00ca\u00cb\7\25\2\2\u00cb\'\3\2\2\2\u00cc\u00cd\7\24\2\2\u00cd"+
		"\u00ce\5*\26\2\u00ce\u00cf\7\21\2\2\u00cf\u00d0\5,\27\2\u00d0\u00d1\7"+
		"\f\2\2\u00d1\u00d2\7\25\2\2\u00d2)\3\2\2\2\u00d3\u00d4\7\26\2\2\u00d4"+
		"+\3\2\2\2\u00d5\u00d6\7\26\2\2\u00d6-\3\2\2\2\25\639DJU\\bmsw\177\u0089"+
		"\u008b\u0091\u0099\u00a3\u00a5\u00b5\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}