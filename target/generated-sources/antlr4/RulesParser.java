// Generated from Rules.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, SqString=36, RectString=37, CircleString=38, 
		ElString=39, LineString=40, PolyString=41, StarString=42, PolygonString=43, 
		TextString=44, DrawString=45, RotateString=46, ScaleString=47, CmtString=48, 
		LinkString=49, RegString=50, AddPtString=51, AddCurveString=52, AddQuadrString=53, 
		CloseString=54, GroupString=55, ClipString=56, PathString=57, MoveString=58, 
		SetClipString=59, TEXT=60, ID=61, INT=62, NEWLINE=63, WS=64;
	public static final String[] tokenNames = {
		"<INVALID>", "'height'", "'+='", "'s'", "'by'", "'inner'", "'w'", "'y'", 
		"';'", "'='", "'sw'", "'nSides'", "'h'", "'('", "'innerRadius'", "'-='", 
		"','", "'bx2'", "'by2'", "'n'", "'r'", "'t'", "'color'", "'bx'", "'x'", 
		"'width'", "'nTips'", "'stroke'", "'a'", "'angle'", "'c'", "'stroke-width'", 
		"')'", "'+'", "'radius'", "'-'", "SqString", "RectString", "CircleString", 
		"ElString", "'line'", "PolyString", "'star'", "PolygonString", "'text'", 
		"'draw'", "'rotate'", "'scale'", "CmtString", "'link'", "RegString", "AddPtString", 
		"AddCurveString", "AddQuadrString", "'close'", "'group'", "ClipString", 
		"'path'", "'move'", "'setClip'", "TEXT", "ID", "INT", "NEWLINE", "WS"
	};
	public static final int
		RULE_main = 0, RULE_command = 1, RULE_transform = 2, RULE_setvar = 3, 
		RULE_addpt = 4, RULE_addcurve = 5, RULE_addq = 6, RULE_close = 7, RULE_draw = 8, 
		RULE_scale = 9, RULE_rotate = 10, RULE_setClip = 11, RULE_move = 12, RULE_hyperlink = 13, 
		RULE_shape = 14, RULE_comment = 15, RULE_circle = 16, RULE_rect = 17, 
		RULE_sq = 18, RULE_ellipse = 19, RULE_line = 20, RULE_polyline = 21, RULE_star = 22, 
		RULE_polygon = 23, RULE_regular = 24, RULE_path = 25, RULE_attr = 26;
	public static final String[] ruleNames = {
		"main", "command", "transform", "setvar", "addpt", "addcurve", "addq", 
		"close", "draw", "scale", "rotate", "setClip", "move", "hyperlink", "shape", 
		"comment", "circle", "rect", "sq", "ellipse", "line", "polyline", "star", 
		"polygon", "regular", "path", "attr"
	};

	@Override
	public String getGrammarFileName() { return "Rules.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public TerminalNode EOF() { return getToken(RulesParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RulesParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RulesParser.NEWLINE, i);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << DrawString) | (1L << RotateString) | (1L << ScaleString) | (1L << LinkString) | (1L << AddPtString) | (1L << AddCurveString) | (1L << AddQuadrString) | (1L << CloseString) | (1L << MoveString) | (1L << SetClipString) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				setState(58);
				switch (_input.LA(1)) {
				case T__27:
				case DrawString:
				case RotateString:
				case ScaleString:
				case LinkString:
				case AddPtString:
				case AddCurveString:
				case AddQuadrString:
				case CloseString:
				case MoveString:
				case SetClipString:
				case ID:
					{
					setState(54); command();
					setState(55); match(T__27);
					}
					break;
				case NEWLINE:
					{
					setState(57); match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(EOF);
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

	public static class CommandContext extends ParserRuleContext {
		public DrawContext draw() {
			return getRuleContext(DrawContext.class,0);
		}
		public SetvarContext setvar() {
			return getRuleContext(SetvarContext.class,0);
		}
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case DrawString:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); draw();
				}
				break;
			case T__27:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); setvar();
				}
				break;
			case RotateString:
			case ScaleString:
			case LinkString:
			case AddPtString:
			case AddCurveString:
			case AddQuadrString:
			case CloseString:
			case MoveString:
			case SetClipString:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); transform();
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

	public static class TransformContext extends ParserRuleContext {
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public AddqContext addq() {
			return getRuleContext(AddqContext.class,0);
		}
		public HyperlinkContext hyperlink() {
			return getRuleContext(HyperlinkContext.class,0);
		}
		public AddptContext addpt() {
			return getRuleContext(AddptContext.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public RotateContext rotate() {
			return getRuleContext(RotateContext.class,0);
		}
		public AddcurveContext addcurve() {
			return getRuleContext(AddcurveContext.class,0);
		}
		public SetClipContext setClip() {
			return getRuleContext(SetClipContext.class,0);
		}
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitTransform(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_transform);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case RotateString:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); rotate();
				}
				break;
			case ScaleString:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); scale();
				}
				break;
			case LinkString:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); hyperlink();
				}
				break;
			case AddPtString:
				enterOuterAlt(_localctx, 4);
				{
				setState(73); addpt();
				}
				break;
			case AddCurveString:
				enterOuterAlt(_localctx, 5);
				{
				setState(74); addcurve();
				}
				break;
			case AddQuadrString:
				enterOuterAlt(_localctx, 6);
				{
				setState(75); addq();
				}
				break;
			case SetClipString:
				enterOuterAlt(_localctx, 7);
				{
				setState(76); setClip();
				}
				break;
			case MoveString:
				enterOuterAlt(_localctx, 8);
				{
				setState(77); move();
				}
				break;
			case CloseString:
				enterOuterAlt(_localctx, 9);
				{
				setState(78); close();
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

	public static class SetvarContext extends ParserRuleContext {
		public Token a;
		public Token x;
		public Token ar;
		public ShapeContext s;
		public Token d;
		public Token r;
		public Token g;
		public List<TerminalNode> ID() { return getTokens(RulesParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RulesParser.ID, i);
		}
		public TerminalNode ClipString() { return getToken(RulesParser.ClipString, 0); }
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public TerminalNode GroupString() { return getToken(RulesParser.GroupString, 0); }
		public SetvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterSetvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitSetvar(this);
		}
	}

	public final SetvarContext setvar() throws RecognitionException {
		SetvarContext _localctx = new SetvarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_setvar);
		int _la;
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); ((SetvarContext)_localctx).a = match(ID);
				setState(82); match(T__26);
				setState(83); ((SetvarContext)_localctx).x = match(ID);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(84); match(T__2);
					setState(85); match(ID);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); ((SetvarContext)_localctx).a = match(ID);
				setState(92); match(T__26);
				setState(93); ((SetvarContext)_localctx).ar = match(GroupString);
				setState(94); match(T__22);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(95); match(ID);
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__19) {
						{
						{
						setState(96); match(T__19);
						setState(97); match(ID);
						}
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108); match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109); ((SetvarContext)_localctx).a = match(ID);
				setState(110); match(T__26);
				setState(111); ((SetvarContext)_localctx).s = shape();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112); ((SetvarContext)_localctx).a = match(ID);
				setState(113); match(T__33);
				setState(114); ((SetvarContext)_localctx).d = match(ID);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(115); match(T__2);
					setState(116); match(ID);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122); ((SetvarContext)_localctx).a = match(ID);
				setState(123); match(T__20);
				setState(124); ((SetvarContext)_localctx).r = match(ID);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(125); match(T__0);
					setState(126); match(ID);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132); ((SetvarContext)_localctx).a = match(ID);
				setState(133); match(T__26);
				setState(134); ((SetvarContext)_localctx).g = match(ClipString);
				setState(135); match(T__22);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(136); match(ID);
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__19) {
						{
						{
						setState(137); match(T__19);
						setState(138); match(ID);
						}
						}
						setState(143);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149); match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
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

	public static class AddptContext extends ParserRuleContext {
		public Token a;
		public Token x;
		public Token y;
		public AttrContext a1;
		public AttrContext a2;
		public TerminalNode INT(int i) {
			return getToken(RulesParser.INT, i);
		}
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode AddPtString() { return getToken(RulesParser.AddPtString, 0); }
		public List<TerminalNode> INT() { return getTokens(RulesParser.INT); }
		public AddptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterAddpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitAddpt(this);
		}
	}

	public final AddptContext addpt() throws RecognitionException {
		AddptContext _localctx = new AddptContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addpt);
		try {
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(AddPtString);
				setState(154); match(T__22);
				setState(155); ((AddptContext)_localctx).a = match(ID);
				setState(156); match(T__19);
				setState(157); ((AddptContext)_localctx).x = match(INT);
				setState(158); match(T__19);
				setState(159); ((AddptContext)_localctx).y = match(INT);
				setState(160); match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(AddPtString);
				setState(162); match(T__22);
				setState(163); ((AddptContext)_localctx).a = match(ID);
				setState(164); match(T__19);
				setState(165); ((AddptContext)_localctx).a1 = attr();
				setState(166); match(T__19);
				setState(167); ((AddptContext)_localctx).a2 = attr();
				setState(168); match(T__3);
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

	public static class AddcurveContext extends ParserRuleContext {
		public Token a;
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public AttrContext a4;
		public AttrContext a5;
		public AttrContext a6;
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode AddCurveString() { return getToken(RulesParser.AddCurveString, 0); }
		public AddcurveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addcurve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterAddcurve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitAddcurve(this);
		}
	}

	public final AddcurveContext addcurve() throws RecognitionException {
		AddcurveContext _localctx = new AddcurveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_addcurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(AddCurveString);
			setState(173); match(T__22);
			setState(174); ((AddcurveContext)_localctx).a = match(ID);
			setState(175); match(T__19);
			setState(176); ((AddcurveContext)_localctx).a1 = attr();
			setState(177); match(T__19);
			setState(178); ((AddcurveContext)_localctx).a2 = attr();
			setState(179); match(T__19);
			setState(180); ((AddcurveContext)_localctx).a3 = attr();
			setState(181); match(T__19);
			setState(182); ((AddcurveContext)_localctx).a4 = attr();
			setState(188);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(183); match(T__19);
				setState(184); ((AddcurveContext)_localctx).a5 = attr();
				setState(185); match(T__19);
				setState(186); ((AddcurveContext)_localctx).a6 = attr();
				}
			}

			setState(190); match(T__3);
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

	public static class AddqContext extends ParserRuleContext {
		public Token a;
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public AttrContext a4;
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode AddQuadrString() { return getToken(RulesParser.AddQuadrString, 0); }
		public AddqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterAddq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitAddq(this);
		}
	}

	public final AddqContext addq() throws RecognitionException {
		AddqContext _localctx = new AddqContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(AddQuadrString);
			setState(193); match(T__22);
			setState(194); ((AddqContext)_localctx).a = match(ID);
			setState(195); match(T__19);
			setState(196); ((AddqContext)_localctx).a1 = attr();
			setState(197); match(T__19);
			setState(198); ((AddqContext)_localctx).a2 = attr();
			setState(199); match(T__19);
			setState(200); ((AddqContext)_localctx).a3 = attr();
			setState(201); match(T__19);
			setState(202); ((AddqContext)_localctx).a4 = attr();
			setState(203); match(T__3);
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

	public static class CloseContext extends ParserRuleContext {
		public Token a;
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public TerminalNode CloseString() { return getToken(RulesParser.CloseString, 0); }
		public CloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitClose(this);
		}
	}

	public final CloseContext close() throws RecognitionException {
		CloseContext _localctx = new CloseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(CloseString);
			setState(206); match(T__22);
			setState(207); ((CloseContext)_localctx).a = match(ID);
			setState(208); match(T__3);
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

	public static class DrawContext extends ParserRuleContext {
		public ShapeContext s;
		public Token a;
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public TerminalNode DrawString() { return getToken(RulesParser.DrawString, 0); }
		public DrawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterDraw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitDraw(this);
		}
	}

	public final DrawContext draw() throws RecognitionException {
		DrawContext _localctx = new DrawContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_draw);
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); match(DrawString);
				setState(211); ((DrawContext)_localctx).s = shape();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); match(DrawString);
				setState(213); ((DrawContext)_localctx).a = match(ID);
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

	public static class ScaleContext extends ParserRuleContext {
		public Token a;
		public Token i;
		public AttrContext a1;
		public AttrContext a2;
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode ScaleString() { return getToken(RulesParser.ScaleString, 0); }
		public TerminalNode INT() { return getToken(RulesParser.INT, 0); }
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitScale(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scale);
		try {
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); match(ScaleString);
				setState(217); match(T__22);
				setState(218); ((ScaleContext)_localctx).a = match(ID);
				setState(219); match(T__19);
				setState(220); ((ScaleContext)_localctx).i = match(INT);
				setState(221); match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); match(ScaleString);
				setState(223); match(T__22);
				setState(224); ((ScaleContext)_localctx).a = match(ID);
				setState(225); match(T__19);
				setState(226); ((ScaleContext)_localctx).a1 = attr();
				setState(227); match(T__19);
				setState(228); ((ScaleContext)_localctx).a2 = attr();
				setState(229); match(T__3);
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

	public static class RotateContext extends ParserRuleContext {
		public Token a;
		public Token i;
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public TerminalNode RotateString() { return getToken(RulesParser.RotateString, 0); }
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode INT() { return getToken(RulesParser.INT, 0); }
		public RotateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterRotate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitRotate(this);
		}
	}

	public final RotateContext rotate() throws RecognitionException {
		RotateContext _localctx = new RotateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rotate);
		int _la;
		try {
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); match(RotateString);
				setState(234); match(T__22);
				setState(235); ((RotateContext)_localctx).a = match(ID);
				setState(236); match(T__19);
				setState(237); ((RotateContext)_localctx).i = match(INT);
				setState(238); match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); match(RotateString);
				setState(240); match(T__22);
				setState(241); ((RotateContext)_localctx).a = match(ID);
				setState(242); match(T__19);
				setState(243); ((RotateContext)_localctx).a1 = attr();
				setState(249);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(244); match(T__19);
					setState(245); ((RotateContext)_localctx).a2 = attr();
					setState(246); match(T__19);
					setState(247); ((RotateContext)_localctx).a3 = attr();
					}
				}

				setState(251); match(T__3);
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

	public static class SetClipContext extends ParserRuleContext {
		public Token a;
		public Token i;
		public List<TerminalNode> ID() { return getTokens(RulesParser.ID); }
		public TerminalNode SetClipString() { return getToken(RulesParser.SetClipString, 0); }
		public TerminalNode ID(int i) {
			return getToken(RulesParser.ID, i);
		}
		public SetClipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterSetClip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitSetClip(this);
		}
	}

	public final SetClipContext setClip() throws RecognitionException {
		SetClipContext _localctx = new SetClipContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setClip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); match(SetClipString);
			setState(256); match(T__22);
			setState(257); ((SetClipContext)_localctx).a = match(ID);
			setState(258); match(T__19);
			setState(259); ((SetClipContext)_localctx).i = match(ID);
			setState(260); match(T__3);
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

	public static class MoveContext extends ParserRuleContext {
		public Token a;
		public AttrContext a1;
		public AttrContext a2;
		public TerminalNode MoveString() { return getToken(RulesParser.MoveString, 0); }
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitMove(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(MoveString);
			setState(263); match(T__22);
			setState(264); ((MoveContext)_localctx).a = match(ID);
			setState(265); match(T__19);
			setState(266); ((MoveContext)_localctx).a1 = attr();
			setState(269);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(267); match(T__19);
				setState(268); ((MoveContext)_localctx).a2 = attr();
				}
			}

			setState(271); match(T__3);
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

	public static class HyperlinkContext extends ParserRuleContext {
		public Token a;
		public Token t;
		public TerminalNode ID() { return getToken(RulesParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(RulesParser.TEXT, 0); }
		public TerminalNode LinkString() { return getToken(RulesParser.LinkString, 0); }
		public HyperlinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyperlink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterHyperlink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitHyperlink(this);
		}
	}

	public final HyperlinkContext hyperlink() throws RecognitionException {
		HyperlinkContext _localctx = new HyperlinkContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_hyperlink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(LinkString);
			setState(274); match(T__22);
			setState(275); ((HyperlinkContext)_localctx).a = match(ID);
			setState(276); match(T__19);
			setState(277); ((HyperlinkContext)_localctx).t = match(TEXT);
			setState(278); match(T__3);
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

	public static class ShapeContext extends ParserRuleContext {
		public RectContext rect() {
			return getRuleContext(RectContext.class,0);
		}
		public SqContext sq() {
			return getRuleContext(SqContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public PolylineContext polyline() {
			return getRuleContext(PolylineContext.class,0);
		}
		public PolygonContext polygon() {
			return getRuleContext(PolygonContext.class,0);
		}
		public EllipseContext ellipse() {
			return getRuleContext(EllipseContext.class,0);
		}
		public CircleContext circle() {
			return getRuleContext(CircleContext.class,0);
		}
		public RegularContext regular() {
			return getRuleContext(RegularContext.class,0);
		}
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitShape(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_shape);
		try {
			setState(291);
			switch (_input.LA(1)) {
			case CircleString:
				enterOuterAlt(_localctx, 1);
				{
				setState(280); circle();
				}
				break;
			case RectString:
				enterOuterAlt(_localctx, 2);
				{
				setState(281); rect();
				}
				break;
			case SqString:
				enterOuterAlt(_localctx, 3);
				{
				setState(282); sq();
				}
				break;
			case ElString:
				enterOuterAlt(_localctx, 4);
				{
				setState(283); ellipse();
				}
				break;
			case LineString:
				enterOuterAlt(_localctx, 5);
				{
				setState(284); line();
				}
				break;
			case PolyString:
				enterOuterAlt(_localctx, 6);
				{
				setState(285); polyline();
				}
				break;
			case StarString:
				enterOuterAlt(_localctx, 7);
				{
				setState(286); star();
				}
				break;
			case PolygonString:
				enterOuterAlt(_localctx, 8);
				{
				setState(287); polygon();
				}
				break;
			case CmtString:
				enterOuterAlt(_localctx, 9);
				{
				setState(288); comment();
				}
				break;
			case RegString:
				enterOuterAlt(_localctx, 10);
				{
				setState(289); regular();
				}
				break;
			case PathString:
				enterOuterAlt(_localctx, 11);
				{
				setState(290); path();
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

	public static class CommentContext extends ParserRuleContext {
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public AttrContext a4;
		public AttrContext a5;
		public List<TerminalNode> TEXT() { return getTokens(RulesParser.TEXT); }
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode CmtString() { return getToken(RulesParser.CmtString, 0); }
		public TerminalNode TEXT(int i) {
			return getToken(RulesParser.TEXT, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293); match(CmtString);
			setState(294); match(T__22);
			setState(295); match(TEXT);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296); match(T__19);
					setState(297); match(TEXT);
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(303); match(T__19);
			setState(304); ((CommentContext)_localctx).a1 = attr();
			setState(305); match(T__19);
			setState(306); ((CommentContext)_localctx).a2 = attr();
			setState(309);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(307); match(T__19);
				setState(308); ((CommentContext)_localctx).a3 = attr();
				}
				break;
			}
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(311); match(T__19);
				setState(312); ((CommentContext)_localctx).a4 = attr();
				}
				break;
			}
			setState(317);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(315); match(T__19);
				setState(316); ((CommentContext)_localctx).a5 = attr();
				}
			}

			setState(319); match(T__3);
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

	public static class CircleContext extends ParserRuleContext {
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public AttrContext a4;
		public AttrContext a5;
		public AttrContext a6;
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode CircleString() { return getToken(RulesParser.CircleString, 0); }
		public CircleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterCircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitCircle(this);
		}
	}

	public final CircleContext circle() throws RecognitionException {
		CircleContext _localctx = new CircleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_circle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(CircleString);
			setState(322); match(T__22);
			setState(323); ((CircleContext)_localctx).a1 = attr();
			setState(324); match(T__19);
			setState(325); ((CircleContext)_localctx).a2 = attr();
			setState(326); match(T__19);
			setState(327); ((CircleContext)_localctx).a3 = attr();
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(328); match(T__19);
				setState(329); ((CircleContext)_localctx).a4 = attr();
				}
				break;
			}
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(332); match(T__19);
				setState(333); ((CircleContext)_localctx).a5 = attr();
				}
				break;
			}
			setState(338);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(336); match(T__19);
				setState(337); ((CircleContext)_localctx).a6 = attr();
				}
			}

			setState(340); match(T__3);
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

	public static class RectContext extends ParserRuleContext {
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public AttrContext a4;
		public AttrContext a5;
		public AttrContext a6;
		public AttrContext a7;
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode RectString() { return getToken(RulesParser.RectString, 0); }
		public RectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterRect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitRect(this);
		}
	}

	public final RectContext rect() throws RecognitionException {
		RectContext _localctx = new RectContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); match(RectString);
			setState(343); match(T__22);
			setState(344); ((RectContext)_localctx).a1 = attr();
			setState(345); match(T__19);
			setState(346); ((RectContext)_localctx).a2 = attr();
			setState(347); match(T__19);
			setState(348); ((RectContext)_localctx).a3 = attr();
			setState(349); match(T__19);
			setState(350); ((RectContext)_localctx).a4 = attr();
			setState(353);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(351); match(T__19);
				setState(352); ((RectContext)_localctx).a5 = attr();
				}
				break;
			}
			setState(357);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(355); match(T__19);
				setState(356); ((RectContext)_localctx).a6 = attr();
				}
				break;
			}
			setState(361);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(359); match(T__19);
				setState(360); ((RectContext)_localctx).a7 = attr();
				}
			}

			setState(363); match(T__3);
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

	public static class SqContext extends ParserRuleContext {
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public AttrContext a4;
		public AttrContext a5;
		public AttrContext a6;
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode SqString() { return getToken(RulesParser.SqString, 0); }
		public SqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterSq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitSq(this);
		}
	}

	public final SqContext sq() throws RecognitionException {
		SqContext _localctx = new SqContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); match(SqString);
			setState(366); match(T__22);
			setState(367); ((SqContext)_localctx).a1 = attr();
			setState(368); match(T__19);
			setState(369); ((SqContext)_localctx).a2 = attr();
			setState(370); match(T__19);
			setState(371); ((SqContext)_localctx).a3 = attr();
			setState(374);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(372); match(T__19);
				setState(373); ((SqContext)_localctx).a4 = attr();
				}
				break;
			}
			setState(378);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(376); match(T__19);
				setState(377); ((SqContext)_localctx).a5 = attr();
				}
				break;
			}
			setState(382);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(380); match(T__19);
				setState(381); ((SqContext)_localctx).a6 = attr();
				}
			}

			setState(384); match(T__3);
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

	public static class EllipseContext extends ParserRuleContext {
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public AttrContext a4;
		public AttrContext a5;
		public AttrContext a6;
		public AttrContext a7;
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode ElString() { return getToken(RulesParser.ElString, 0); }
		public EllipseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ellipse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterEllipse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitEllipse(this);
		}
	}

	public final EllipseContext ellipse() throws RecognitionException {
		EllipseContext _localctx = new EllipseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ellipse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); match(ElString);
			setState(387); match(T__22);
			setState(388); ((EllipseContext)_localctx).a1 = attr();
			setState(389); match(T__19);
			setState(390); ((EllipseContext)_localctx).a2 = attr();
			setState(391); match(T__19);
			setState(392); ((EllipseContext)_localctx).a3 = attr();
			setState(393); match(T__19);
			setState(394); ((EllipseContext)_localctx).a4 = attr();
			setState(397);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(395); match(T__19);
				setState(396); ((EllipseContext)_localctx).a5 = attr();
				}
				break;
			}
			setState(401);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(399); match(T__19);
				setState(400); ((EllipseContext)_localctx).a6 = attr();
				}
				break;
			}
			setState(405);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(403); match(T__19);
				setState(404); ((EllipseContext)_localctx).a7 = attr();
				}
			}

			setState(407); match(T__3);
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

	public static class LineContext extends ParserRuleContext {
		public Token i1;
		public Token i2;
		public Token i3;
		public Token i4;
		public AttrContext a5;
		public AttrContext a6;
		public TerminalNode INT(int i) {
			return getToken(RulesParser.INT, i);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode LineString() { return getToken(RulesParser.LineString, 0); }
		public List<TerminalNode> INT() { return getTokens(RulesParser.INT); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(LineString);
			setState(410); match(T__22);
			setState(411); match(T__22);
			setState(412); ((LineContext)_localctx).i1 = match(INT);
			setState(413); match(T__19);
			setState(414); ((LineContext)_localctx).i2 = match(INT);
			setState(415); match(T__3);
			setState(416); match(T__22);
			setState(417); ((LineContext)_localctx).i3 = match(INT);
			setState(418); match(T__19);
			setState(419); ((LineContext)_localctx).i4 = match(INT);
			setState(420); match(T__3);
			setState(423);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(421); match(T__19);
				setState(422); ((LineContext)_localctx).a5 = attr();
				}
				break;
			}
			setState(427);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(425); match(T__19);
				setState(426); ((LineContext)_localctx).a6 = attr();
				}
			}

			setState(429); match(T__3);
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

	public static class PolylineContext extends ParserRuleContext {
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public TerminalNode INT(int i) {
			return getToken(RulesParser.INT, i);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public List<TerminalNode> INT() { return getTokens(RulesParser.INT); }
		public TerminalNode PolyString() { return getToken(RulesParser.PolyString, 0); }
		public PolylineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polyline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterPolyline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitPolyline(this);
		}
	}

	public final PolylineContext polyline() throws RecognitionException {
		PolylineContext _localctx = new PolylineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_polyline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431); match(PolyString);
			setState(432); match(T__22);
			setState(433); match(T__22);
			setState(434); match(INT);
			setState(435); match(T__19);
			setState(436); match(INT);
			setState(437); match(T__3);
			setState(443); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(438); match(T__22);
				setState(439); match(INT);
				setState(440); match(T__19);
				setState(441); match(INT);
				setState(442); match(T__3);
				}
				}
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 );
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(447); match(T__19);
				setState(448); ((PolylineContext)_localctx).a1 = attr();
				}
				break;
			}
			setState(453);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(451); match(T__19);
				setState(452); ((PolylineContext)_localctx).a2 = attr();
				}
				break;
			}
			setState(457);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(455); match(T__19);
				setState(456); ((PolylineContext)_localctx).a3 = attr();
				}
			}

			setState(459); match(T__3);
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

	public static class StarContext extends ParserRuleContext {
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public AttrContext a4;
		public AttrContext a5;
		public AttrContext a6;
		public AttrContext a7;
		public AttrContext a8;
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode StarString() { return getToken(RulesParser.StarString, 0); }
		public StarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitStar(this);
		}
	}

	public final StarContext star() throws RecognitionException {
		StarContext _localctx = new StarContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_star);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); match(StarString);
			setState(462); match(T__22);
			setState(463); ((StarContext)_localctx).a1 = attr();
			setState(464); match(T__19);
			setState(465); ((StarContext)_localctx).a2 = attr();
			setState(466); match(T__19);
			setState(467); ((StarContext)_localctx).a3 = attr();
			setState(468); match(T__19);
			setState(469); ((StarContext)_localctx).a4 = attr();
			setState(470); match(T__19);
			setState(471); ((StarContext)_localctx).a5 = attr();
			setState(474);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(472); match(T__19);
				setState(473); ((StarContext)_localctx).a6 = attr();
				}
				break;
			}
			setState(478);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(476); match(T__19);
				setState(477); ((StarContext)_localctx).a7 = attr();
				}
				break;
			}
			setState(482);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(480); match(T__19);
				setState(481); ((StarContext)_localctx).a8 = attr();
				}
			}

			setState(484); match(T__3);
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

	public static class PolygonContext extends ParserRuleContext {
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public TerminalNode INT(int i) {
			return getToken(RulesParser.INT, i);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode PolygonString() { return getToken(RulesParser.PolygonString, 0); }
		public List<TerminalNode> INT() { return getTokens(RulesParser.INT); }
		public PolygonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polygon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterPolygon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitPolygon(this);
		}
	}

	public final PolygonContext polygon() throws RecognitionException {
		PolygonContext _localctx = new PolygonContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_polygon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); match(PolygonString);
			setState(487); match(T__22);
			setState(488); match(T__22);
			setState(489); match(INT);
			setState(490); match(T__19);
			setState(491); match(INT);
			setState(492); match(T__3);
			setState(498); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(493); match(T__22);
				setState(494); match(INT);
				setState(495); match(T__19);
				setState(496); match(INT);
				setState(497); match(T__3);
				}
				}
				setState(500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 );
			setState(504);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(502); match(T__19);
				setState(503); ((PolygonContext)_localctx).a1 = attr();
				}
				break;
			}
			setState(508);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(506); match(T__19);
				setState(507); ((PolygonContext)_localctx).a2 = attr();
				}
				break;
			}
			setState(512);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(510); match(T__19);
				setState(511); ((PolygonContext)_localctx).a3 = attr();
				}
			}

			setState(514); match(T__3);
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

	public static class RegularContext extends ParserRuleContext {
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public AttrContext a4;
		public AttrContext a5;
		public AttrContext a6;
		public AttrContext a7;
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode RegString() { return getToken(RulesParser.RegString, 0); }
		public RegularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regular; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterRegular(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitRegular(this);
		}
	}

	public final RegularContext regular() throws RecognitionException {
		RegularContext _localctx = new RegularContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_regular);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516); match(RegString);
			setState(517); match(T__22);
			setState(518); ((RegularContext)_localctx).a1 = attr();
			setState(519); match(T__19);
			setState(520); ((RegularContext)_localctx).a2 = attr();
			setState(521); match(T__19);
			setState(522); ((RegularContext)_localctx).a3 = attr();
			setState(523); match(T__19);
			setState(524); ((RegularContext)_localctx).a4 = attr();
			setState(527);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(525); match(T__19);
				setState(526); ((RegularContext)_localctx).a5 = attr();
				}
				break;
			}
			setState(531);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(529); match(T__19);
				setState(530); ((RegularContext)_localctx).a6 = attr();
				}
				break;
			}
			setState(535);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(533); match(T__19);
				setState(534); ((RegularContext)_localctx).a7 = attr();
				}
			}

			setState(537); match(T__3);
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

	public static class PathContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public AttrContext a1;
		public AttrContext a2;
		public AttrContext a3;
		public TerminalNode INT(int i) {
			return getToken(RulesParser.INT, i);
		}
		public AttrContext attr(int i) {
			return getRuleContext(AttrContext.class,i);
		}
		public List<AttrContext> attr() {
			return getRuleContexts(AttrContext.class);
		}
		public TerminalNode PathString() { return getToken(RulesParser.PathString, 0); }
		public List<TerminalNode> INT() { return getTokens(RulesParser.INT); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539); match(PathString);
			setState(540); match(T__22);
			setState(541); ((PathContext)_localctx).x = match(INT);
			setState(542); match(T__19);
			setState(543); ((PathContext)_localctx).y = match(INT);
			setState(546);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(544); match(T__19);
				setState(545); ((PathContext)_localctx).a1 = attr();
				}
				break;
			}
			setState(550);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(548); match(T__19);
				setState(549); ((PathContext)_localctx).a2 = attr();
				}
				break;
			}
			setState(554);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(552); match(T__19);
				setState(553); ((PathContext)_localctx).a3 = attr();
				}
			}

			setState(556); match(T__3);
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

	public static class AttrContext extends ParserRuleContext {
		public Token id;
		public Token value;
		public TerminalNode TEXT() { return getToken(RulesParser.TEXT, 0); }
		public TerminalNode INT() { return getToken(RulesParser.INT, 0); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesListener ) ((RulesListener)listener).exitAttr(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_attr);
		try {
			setState(640);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(558); ((AttrContext)_localctx).id = match(T__15);
				setState(559); match(T__26);
				setState(560); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(561); ((AttrContext)_localctx).id = match(T__1);
				setState(562); match(T__26);
				setState(563); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(564); ((AttrContext)_localctx).id = match(T__29);
				setState(565); match(T__26);
				setState(566); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(567); ((AttrContext)_localctx).id = match(T__10);
				setState(568); match(T__26);
				setState(569); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(570); ((AttrContext)_localctx).id = match(T__23);
				setState(571); match(T__26);
				setState(572); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 6);
				{
				setState(573); ((AttrContext)_localctx).id = match(T__34);
				setState(574); match(T__26);
				setState(575); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(576); ((AttrContext)_localctx).id = match(T__5);
				setState(577); match(T__26);
				setState(578); ((AttrContext)_localctx).value = match(TEXT);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(579); ((AttrContext)_localctx).id = match(T__13);
				setState(580); match(T__26);
				setState(581); ((AttrContext)_localctx).value = match(TEXT);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 9);
				{
				setState(582); ((AttrContext)_localctx).id = match(T__11);
				setState(583); match(T__26);
				setState(584); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 10);
				{
				setState(585); ((AttrContext)_localctx).id = match(T__28);
				setState(586); match(T__26);
				setState(587); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 11);
				{
				setState(588); ((AttrContext)_localctx).id = match(T__14);
				setState(589); match(T__26);
				setState(590); ((AttrContext)_localctx).value = match(TEXT);
				}
				break;
			case TextString:
				enterOuterAlt(_localctx, 12);
				{
				setState(591); ((AttrContext)_localctx).id = match(TextString);
				setState(592); match(T__26);
				setState(593); ((AttrContext)_localctx).value = match(TEXT);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 13);
				{
				setState(594); ((AttrContext)_localctx).id = match(T__32);
				setState(595); match(T__26);
				setState(596); ((AttrContext)_localctx).value = match(TEXT);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 14);
				{
				setState(597); ((AttrContext)_localctx).id = match(T__8);
				setState(598); match(T__26);
				setState(599); ((AttrContext)_localctx).value = match(TEXT);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 15);
				{
				setState(600); ((AttrContext)_localctx).id = match(T__25);
				setState(601); match(T__26);
				setState(602); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 16);
				{
				setState(603); ((AttrContext)_localctx).id = match(T__4);
				setState(604); match(T__26);
				setState(605); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 17);
				{
				setState(606); ((AttrContext)_localctx).id = match(T__7);
				setState(607); match(T__26);
				setState(608); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 18);
				{
				setState(609); ((AttrContext)_localctx).id = match(T__6);
				setState(610); match(T__26);
				setState(611); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 19);
				{
				setState(612); ((AttrContext)_localctx).id = match(T__30);
				setState(613); match(T__26);
				setState(614); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 20);
				{
				setState(615); ((AttrContext)_localctx).id = match(T__21);
				setState(616); match(T__26);
				setState(617); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 21);
				{
				setState(618); ((AttrContext)_localctx).id = match(T__16);
				setState(619); match(T__26);
				setState(620); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 22);
				{
				setState(621); ((AttrContext)_localctx).id = match(T__9);
				setState(622); match(T__26);
				setState(623); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 23);
				{
				setState(624); ((AttrContext)_localctx).id = match(T__24);
				setState(625); match(T__26);
				setState(626); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 24);
				{
				setState(627); ((AttrContext)_localctx).id = match(T__12);
				setState(628); match(T__26);
				setState(629); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 25);
				{
				setState(630); ((AttrContext)_localctx).id = match(T__31);
				setState(631); match(T__26);
				setState(632); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 26);
				{
				setState(633); ((AttrContext)_localctx).id = match(T__18);
				setState(634); match(T__26);
				setState(635); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 27);
				{
				setState(636); ((AttrContext)_localctx).id = match(T__17);
				setState(637); match(T__26);
				setState(638); ((AttrContext)_localctx).value = match(INT);
				}
				break;
			case T__19:
			case T__3:
				enterOuterAlt(_localctx, 28);
				{
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\u0285\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"R\n\4\3\5\3\5\3\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5x\n\5\f\5\16\5{\13\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"\u0082\n\5\f\5\16\5\u0085\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008e\n"+
		"\5\f\5\16\5\u0091\13\5\7\5\u0093\n\5\f\5\16\5\u0096\13\5\3\5\3\5\5\5\u009a"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00ad\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00bf\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00d9\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00ea\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00fc\n\f\3\f\3\f\5\f\u0100\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0110\n\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0126\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u012d\n"+
		"\21\f\21\16\21\u0130\13\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0138\n"+
		"\21\3\21\3\21\5\21\u013c\n\21\3\21\3\21\5\21\u0140\n\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014d\n\22\3\22\3\22\5\22"+
		"\u0151\n\22\3\22\3\22\5\22\u0155\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0164\n\23\3\23\3\23\5\23\u0168"+
		"\n\23\3\23\3\23\5\23\u016c\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0179\n\24\3\24\3\24\5\24\u017d\n\24\3\24\3\24\5"+
		"\24\u0181\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0190\n\25\3\25\3\25\5\25\u0194\n\25\3\25\3\25\5\25\u0198"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u01aa\n\26\3\26\3\26\5\26\u01ae\n\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u01be"+
		"\n\27\r\27\16\27\u01bf\3\27\3\27\5\27\u01c4\n\27\3\27\3\27\5\27\u01c8"+
		"\n\27\3\27\3\27\5\27\u01cc\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01dd\n\30\3\30\3\30\5\30\u01e1"+
		"\n\30\3\30\3\30\5\30\u01e5\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u01f5\n\31\r\31\16\31\u01f6\3\31\3"+
		"\31\5\31\u01fb\n\31\3\31\3\31\5\31\u01ff\n\31\3\31\3\31\5\31\u0203\n\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0212\n\32\3\32\3\32\5\32\u0216\n\32\3\32\3\32\5\32\u021a\n\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0225\n\33\3\33\3\33\5\33"+
		"\u0229\n\33\3\33\3\33\5\33\u022d\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0283\n\34\3\34\2\2\35\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\2\u02d1\2>"+
		"\3\2\2\2\4F\3\2\2\2\6Q\3\2\2\2\b\u0099\3\2\2\2\n\u00ac\3\2\2\2\f\u00ae"+
		"\3\2\2\2\16\u00c2\3\2\2\2\20\u00cf\3\2\2\2\22\u00d8\3\2\2\2\24\u00e9\3"+
		"\2\2\2\26\u00ff\3\2\2\2\30\u0101\3\2\2\2\32\u0108\3\2\2\2\34\u0113\3\2"+
		"\2\2\36\u0125\3\2\2\2 \u0127\3\2\2\2\"\u0143\3\2\2\2$\u0158\3\2\2\2&\u016f"+
		"\3\2\2\2(\u0184\3\2\2\2*\u019b\3\2\2\2,\u01b1\3\2\2\2.\u01cf\3\2\2\2\60"+
		"\u01e8\3\2\2\2\62\u0206\3\2\2\2\64\u021d\3\2\2\2\66\u0282\3\2\2\289\5"+
		"\4\3\29:\7\n\2\2:=\3\2\2\2;=\7A\2\2<8\3\2\2\2<;\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\2\2\3B\3\3\2\2\2CG\5\22\n\2D"+
		"G\5\b\5\2EG\5\6\4\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\5\3\2\2\2HR\5\26\f"+
		"\2IR\5\24\13\2JR\5\34\17\2KR\5\n\6\2LR\5\f\7\2MR\5\16\b\2NR\5\30\r\2O"+
		"R\5\32\16\2PR\5\20\t\2QH\3\2\2\2QI\3\2\2\2QJ\3\2\2\2QK\3\2\2\2QL\3\2\2"+
		"\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2R\7\3\2\2\2ST\7?\2\2TU\7\13"+
		"\2\2UZ\7?\2\2VW\7#\2\2WY\7?\2\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[\u009a\3\2\2\2\\Z\3\2\2\2]^\7?\2\2^_\7\13\2\2_`\79\2\2`k\7\17\2\2a"+
		"f\7?\2\2bc\7\22\2\2ce\7?\2\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g"+
		"j\3\2\2\2hf\3\2\2\2ia\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2"+
		"mk\3\2\2\2n\u009a\7\"\2\2op\7?\2\2pq\7\13\2\2q\u009a\5\36\20\2rs\7?\2"+
		"\2st\7\4\2\2ty\7?\2\2uv\7#\2\2vx\7?\2\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2"+
		"yz\3\2\2\2z\u009a\3\2\2\2{y\3\2\2\2|}\7?\2\2}~\7\21\2\2~\u0083\7?\2\2"+
		"\177\u0080\7%\2\2\u0080\u0082\7?\2\2\u0081\177\3\2\2\2\u0082\u0085\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u009a\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\7?\2\2\u0087\u0088\7\13\2\2\u0088\u0089\7:"+
		"\2\2\u0089\u0094\7\17\2\2\u008a\u008f\7?\2\2\u008b\u008c\7\22\2\2\u008c"+
		"\u008e\7?\2\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u008a\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009a\7\"\2\2\u0098"+
		"\u009a\3\2\2\2\u0099S\3\2\2\2\u0099]\3\2\2\2\u0099o\3\2\2\2\u0099r\3\2"+
		"\2\2\u0099|\3\2\2\2\u0099\u0086\3\2\2\2\u0099\u0098\3\2\2\2\u009a\t\3"+
		"\2\2\2\u009b\u009c\7\65\2\2\u009c\u009d\7\17\2\2\u009d\u009e\7?\2\2\u009e"+
		"\u009f\7\22\2\2\u009f\u00a0\7@\2\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\7"+
		"@\2\2\u00a2\u00ad\7\"\2\2\u00a3\u00a4\7\65\2\2\u00a4\u00a5\7\17\2\2\u00a5"+
		"\u00a6\7?\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8\5\66\34\2\u00a8\u00a9\7"+
		"\22\2\2\u00a9\u00aa\5\66\34\2\u00aa\u00ab\7\"\2\2\u00ab\u00ad\3\2\2\2"+
		"\u00ac\u009b\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ad\13\3\2\2\2\u00ae\u00af"+
		"\7\66\2\2\u00af\u00b0\7\17\2\2\u00b0\u00b1\7?\2\2\u00b1\u00b2\7\22\2\2"+
		"\u00b2\u00b3\5\66\34\2\u00b3\u00b4\7\22\2\2\u00b4\u00b5\5\66\34\2\u00b5"+
		"\u00b6\7\22\2\2\u00b6\u00b7\5\66\34\2\u00b7\u00b8\7\22\2\2\u00b8\u00be"+
		"\5\66\34\2\u00b9\u00ba\7\22\2\2\u00ba\u00bb\5\66\34\2\u00bb\u00bc\7\22"+
		"\2\2\u00bc\u00bd\5\66\34\2\u00bd\u00bf\3\2\2\2\u00be\u00b9\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\"\2\2\u00c1\r\3\2\2\2"+
		"\u00c2\u00c3\7\67\2\2\u00c3\u00c4\7\17\2\2\u00c4\u00c5\7?\2\2\u00c5\u00c6"+
		"\7\22\2\2\u00c6\u00c7\5\66\34\2\u00c7\u00c8\7\22\2\2\u00c8\u00c9\5\66"+
		"\34\2\u00c9\u00ca\7\22\2\2\u00ca\u00cb\5\66\34\2\u00cb\u00cc\7\22\2\2"+
		"\u00cc\u00cd\5\66\34\2\u00cd\u00ce\7\"\2\2\u00ce\17\3\2\2\2\u00cf\u00d0"+
		"\78\2\2\u00d0\u00d1\7\17\2\2\u00d1\u00d2\7?\2\2\u00d2\u00d3\7\"\2\2\u00d3"+
		"\21\3\2\2\2\u00d4\u00d5\7/\2\2\u00d5\u00d9\5\36\20\2\u00d6\u00d7\7/\2"+
		"\2\u00d7\u00d9\7?\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\23"+
		"\3\2\2\2\u00da\u00db\7\61\2\2\u00db\u00dc\7\17\2\2\u00dc\u00dd\7?\2\2"+
		"\u00dd\u00de\7\22\2\2\u00de\u00df\7@\2\2\u00df\u00ea\7\"\2\2\u00e0\u00e1"+
		"\7\61\2\2\u00e1\u00e2\7\17\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4\7\22\2\2"+
		"\u00e4\u00e5\5\66\34\2\u00e5\u00e6\7\22\2\2\u00e6\u00e7\5\66\34\2\u00e7"+
		"\u00e8\7\"\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00da\3\2\2\2\u00e9\u00e0\3\2"+
		"\2\2\u00ea\25\3\2\2\2\u00eb\u00ec\7\60\2\2\u00ec\u00ed\7\17\2\2\u00ed"+
		"\u00ee\7?\2\2\u00ee\u00ef\7\22\2\2\u00ef\u00f0\7@\2\2\u00f0\u0100\7\""+
		"\2\2\u00f1\u00f2\7\60\2\2\u00f2\u00f3\7\17\2\2\u00f3\u00f4\7?\2\2\u00f4"+
		"\u00f5\7\22\2\2\u00f5\u00fb\5\66\34\2\u00f6\u00f7\7\22\2\2\u00f7\u00f8"+
		"\5\66\34\2\u00f8\u00f9\7\22\2\2\u00f9\u00fa\5\66\34\2\u00fa\u00fc\3\2"+
		"\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\7\"\2\2\u00fe\u0100\3\2\2\2\u00ff\u00eb\3\2\2\2\u00ff\u00f1\3\2"+
		"\2\2\u0100\27\3\2\2\2\u0101\u0102\7=\2\2\u0102\u0103\7\17\2\2\u0103\u0104"+
		"\7?\2\2\u0104\u0105\7\22\2\2\u0105\u0106\7?\2\2\u0106\u0107\7\"\2\2\u0107"+
		"\31\3\2\2\2\u0108\u0109\7<\2\2\u0109\u010a\7\17\2\2\u010a\u010b\7?\2\2"+
		"\u010b\u010c\7\22\2\2\u010c\u010f\5\66\34\2\u010d\u010e\7\22\2\2\u010e"+
		"\u0110\5\66\34\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3"+
		"\2\2\2\u0111\u0112\7\"\2\2\u0112\33\3\2\2\2\u0113\u0114\7\63\2\2\u0114"+
		"\u0115\7\17\2\2\u0115\u0116\7?\2\2\u0116\u0117\7\22\2\2\u0117\u0118\7"+
		">\2\2\u0118\u0119\7\"\2\2\u0119\35\3\2\2\2\u011a\u0126\5\"\22\2\u011b"+
		"\u0126\5$\23\2\u011c\u0126\5&\24\2\u011d\u0126\5(\25\2\u011e\u0126\5*"+
		"\26\2\u011f\u0126\5,\27\2\u0120\u0126\5.\30\2\u0121\u0126\5\60\31\2\u0122"+
		"\u0126\5 \21\2\u0123\u0126\5\62\32\2\u0124\u0126\5\64\33\2\u0125\u011a"+
		"\3\2\2\2\u0125\u011b\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u011d\3\2\2\2\u0125"+
		"\u011e\3\2\2\2\u0125\u011f\3\2\2\2\u0125\u0120\3\2\2\2\u0125\u0121\3\2"+
		"\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\37\3\2\2\2\u0127\u0128\7\62\2\2\u0128\u0129\7\17\2\2\u0129\u012e\7>\2"+
		"\2\u012a\u012b\7\22\2\2\u012b\u012d\7>\2\2\u012c\u012a\3\2\2\2\u012d\u0130"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0132\7\22\2\2\u0132\u0133\5\66\34\2\u0133\u0134"+
		"\7\22\2\2\u0134\u0137\5\66\34\2\u0135\u0136\7\22\2\2\u0136\u0138\5\66"+
		"\34\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u013a\7\22\2\2\u013a\u013c\5\66\34\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013e\7\22\2\2\u013e\u0140\5\66\34"+
		"\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142"+
		"\7\"\2\2\u0142!\3\2\2\2\u0143\u0144\7(\2\2\u0144\u0145\7\17\2\2\u0145"+
		"\u0146\5\66\34\2\u0146\u0147\7\22\2\2\u0147\u0148\5\66\34\2\u0148\u0149"+
		"\7\22\2\2\u0149\u014c\5\66\34\2\u014a\u014b\7\22\2\2\u014b\u014d\5\66"+
		"\34\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014f\7\22\2\2\u014f\u0151\5\66\34\2\u0150\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0153\7\22\2\2\u0153\u0155\5\66\34"+
		"\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157"+
		"\7\"\2\2\u0157#\3\2\2\2\u0158\u0159\7\'\2\2\u0159\u015a\7\17\2\2\u015a"+
		"\u015b\5\66\34\2\u015b\u015c\7\22\2\2\u015c\u015d\5\66\34\2\u015d\u015e"+
		"\7\22\2\2\u015e\u015f\5\66\34\2\u015f\u0160\7\22\2\2\u0160\u0163\5\66"+
		"\34\2\u0161\u0162\7\22\2\2\u0162\u0164\5\66\34\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0166\7\22\2\2\u0166\u0168\5"+
		"\66\34\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u016a\7\22\2\2\u016a\u016c\5\66\34\2\u016b\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7\"\2\2\u016e%\3\2\2\2\u016f"+
		"\u0170\7&\2\2\u0170\u0171\7\17\2\2\u0171\u0172\5\66\34\2\u0172\u0173\7"+
		"\22\2\2\u0173\u0174\5\66\34\2\u0174\u0175\7\22\2\2\u0175\u0178\5\66\34"+
		"\2\u0176\u0177\7\22\2\2\u0177\u0179\5\66\34\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u017b\7\22\2\2\u017b\u017d\5"+
		"\66\34\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017f\7\22\2\2\u017f\u0181\5\66\34\2\u0180\u017e\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7\"\2\2\u0183\'\3\2\2\2\u0184"+
		"\u0185\7)\2\2\u0185\u0186\7\17\2\2\u0186\u0187\5\66\34\2\u0187\u0188\7"+
		"\22\2\2\u0188\u0189\5\66\34\2\u0189\u018a\7\22\2\2\u018a\u018b\5\66\34"+
		"\2\u018b\u018c\7\22\2\2\u018c\u018f\5\66\34\2\u018d\u018e\7\22\2\2\u018e"+
		"\u0190\5\66\34\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0193\3"+
		"\2\2\2\u0191\u0192\7\22\2\2\u0192\u0194\5\66\34\2\u0193\u0191\3\2\2\2"+
		"\u0193\u0194\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0196\7\22\2\2\u0196\u0198"+
		"\5\66\34\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2"+
		"\u0199\u019a\7\"\2\2\u019a)\3\2\2\2\u019b\u019c\7*\2\2\u019c\u019d\7\17"+
		"\2\2\u019d\u019e\7\17\2\2\u019e\u019f\7@\2\2\u019f\u01a0\7\22\2\2\u01a0"+
		"\u01a1\7@\2\2\u01a1\u01a2\7\"\2\2\u01a2\u01a3\7\17\2\2\u01a3\u01a4\7@"+
		"\2\2\u01a4\u01a5\7\22\2\2\u01a5\u01a6\7@\2\2\u01a6\u01a9\7\"\2\2\u01a7"+
		"\u01a8\7\22\2\2\u01a8\u01aa\5\66\34\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01ac\7\22\2\2\u01ac\u01ae\5\66\34"+
		"\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0"+
		"\7\"\2\2\u01b0+\3\2\2\2\u01b1\u01b2\7+\2\2\u01b2\u01b3\7\17\2\2\u01b3"+
		"\u01b4\7\17\2\2\u01b4\u01b5\7@\2\2\u01b5\u01b6\7\22\2\2\u01b6\u01b7\7"+
		"@\2\2\u01b7\u01bd\7\"\2\2\u01b8\u01b9\7\17\2\2\u01b9\u01ba\7@\2\2\u01ba"+
		"\u01bb\7\22\2\2\u01bb\u01bc\7@\2\2\u01bc\u01be\7\"\2\2\u01bd\u01b8\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c3\3\2\2\2\u01c1\u01c2\7\22\2\2\u01c2\u01c4\5\66\34\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c6\7\22\2\2"+
		"\u01c6\u01c8\5\66\34\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb"+
		"\3\2\2\2\u01c9\u01ca\7\22\2\2\u01ca\u01cc\5\66\34\2\u01cb\u01c9\3\2\2"+
		"\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\7\"\2\2\u01ce-"+
		"\3\2\2\2\u01cf\u01d0\7,\2\2\u01d0\u01d1\7\17\2\2\u01d1\u01d2\5\66\34\2"+
		"\u01d2\u01d3\7\22\2\2\u01d3\u01d4\5\66\34\2\u01d4\u01d5\7\22\2\2\u01d5"+
		"\u01d6\5\66\34\2\u01d6\u01d7\7\22\2\2\u01d7\u01d8\5\66\34\2\u01d8\u01d9"+
		"\7\22\2\2\u01d9\u01dc\5\66\34\2\u01da\u01db\7\22\2\2\u01db\u01dd\5\66"+
		"\34\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de"+
		"\u01df\7\22\2\2\u01df\u01e1\5\66\34\2\u01e0\u01de\3\2\2\2\u01e0\u01e1"+
		"\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e3\7\22\2\2\u01e3\u01e5\5\66\34"+
		"\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7"+
		"\7\"\2\2\u01e7/\3\2\2\2\u01e8\u01e9\7-\2\2\u01e9\u01ea\7\17\2\2\u01ea"+
		"\u01eb\7\17\2\2\u01eb\u01ec\7@\2\2\u01ec\u01ed\7\22\2\2\u01ed\u01ee\7"+
		"@\2\2\u01ee\u01f4\7\"\2\2\u01ef\u01f0\7\17\2\2\u01f0\u01f1\7@\2\2\u01f1"+
		"\u01f2\7\22\2\2\u01f2\u01f3\7@\2\2\u01f3\u01f5\7\"\2\2\u01f4\u01ef\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01fa\3\2\2\2\u01f8\u01f9\7\22\2\2\u01f9\u01fb\5\66\34\2\u01fa\u01f8"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fd\7\22\2\2"+
		"\u01fd\u01ff\5\66\34\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0202"+
		"\3\2\2\2\u0200\u0201\7\22\2\2\u0201\u0203\5\66\34\2\u0202\u0200\3\2\2"+
		"\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\7\"\2\2\u0205\61"+
		"\3\2\2\2\u0206\u0207\7\64\2\2\u0207\u0208\7\17\2\2\u0208\u0209\5\66\34"+
		"\2\u0209\u020a\7\22\2\2\u020a\u020b\5\66\34\2\u020b\u020c\7\22\2\2\u020c"+
		"\u020d\5\66\34\2\u020d\u020e\7\22\2\2\u020e\u0211\5\66\34\2\u020f\u0210"+
		"\7\22\2\2\u0210\u0212\5\66\34\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2"+
		"\2\u0212\u0215\3\2\2\2\u0213\u0214\7\22\2\2\u0214\u0216\5\66\34\2\u0215"+
		"\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0218\7\22"+
		"\2\2\u0218\u021a\5\66\34\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021c\7\"\2\2\u021c\63\3\2\2\2\u021d\u021e\7;\2\2"+
		"\u021e\u021f\7\17\2\2\u021f\u0220\7@\2\2\u0220\u0221\7\22\2\2\u0221\u0224"+
		"\7@\2\2\u0222\u0223\7\22\2\2\u0223\u0225\5\66\34\2\u0224\u0222\3\2\2\2"+
		"\u0224\u0225\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0227\7\22\2\2\u0227\u0229"+
		"\5\66\34\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022c\3\2\2\2"+
		"\u022a\u022b\7\22\2\2\u022b\u022d\5\66\34\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\7\"\2\2\u022f\65\3\2\2"+
		"\2\u0230\u0231\7\26\2\2\u0231\u0232\7\13\2\2\u0232\u0283\7@\2\2\u0233"+
		"\u0234\7$\2\2\u0234\u0235\7\13\2\2\u0235\u0283\7@\2\2\u0236\u0237\7\b"+
		"\2\2\u0237\u0238\7\13\2\2\u0238\u0283\7@\2\2\u0239\u023a\7\33\2\2\u023a"+
		"\u023b\7\13\2\2\u023b\u0283\7@\2\2\u023c\u023d\7\16\2\2\u023d\u023e\7"+
		"\13\2\2\u023e\u0283\7@\2\2\u023f\u0240\7\3\2\2\u0240\u0241\7\13\2\2\u0241"+
		"\u0283\7@\2\2\u0242\u0243\7 \2\2\u0243\u0244\7\13\2\2\u0244\u0283\7>\2"+
		"\2\u0245\u0246\7\30\2\2\u0246\u0247\7\13\2\2\u0247\u0283\7>\2\2\u0248"+
		"\u0249\7\32\2\2\u0249\u024a\7\13\2\2\u024a\u0283\7@\2\2\u024b\u024c\7"+
		"\t\2\2\u024c\u024d\7\13\2\2\u024d\u0283\7@\2\2\u024e\u024f\7\27\2\2\u024f"+
		"\u0250\7\13\2\2\u0250\u0283\7>\2\2\u0251\u0252\7.\2\2\u0252\u0253\7\13"+
		"\2\2\u0253\u0283\7>\2\2\u0254\u0255\7\5\2\2\u0255\u0256\7\13\2\2\u0256"+
		"\u0283\7>\2\2\u0257\u0258\7\35\2\2\u0258\u0259\7\13\2\2\u0259\u0283\7"+
		">\2\2\u025a\u025b\7\f\2\2\u025b\u025c\7\13\2\2\u025c\u0283\7@\2\2\u025d"+
		"\u025e\7!\2\2\u025e\u025f\7\13\2\2\u025f\u0283\7@\2\2\u0260\u0261\7\36"+
		"\2\2\u0261\u0262\7\13\2\2\u0262\u0283\7@\2\2\u0263\u0264\7\37\2\2\u0264"+
		"\u0265\7\13\2\2\u0265\u0283\7@\2\2\u0266\u0267\7\7\2\2\u0267\u0268\7\13"+
		"\2\2\u0268\u0283\7@\2\2\u0269\u026a\7\20\2\2\u026a\u026b\7\13\2\2\u026b"+
		"\u0283\7@\2\2\u026c\u026d\7\25\2\2\u026d\u026e\7\13\2\2\u026e\u0283\7"+
		"@\2\2\u026f\u0270\7\34\2\2\u0270\u0271\7\13\2\2\u0271\u0283\7@\2\2\u0272"+
		"\u0273\7\r\2\2\u0273\u0274\7\13\2\2\u0274\u0283\7@\2\2\u0275\u0276\7\31"+
		"\2\2\u0276\u0277\7\13\2\2\u0277\u0283\7@\2\2\u0278\u0279\7\6\2\2\u0279"+
		"\u027a\7\13\2\2\u027a\u0283\7@\2\2\u027b\u027c\7\23\2\2\u027c\u027d\7"+
		"\13\2\2\u027d\u0283\7@\2\2\u027e\u027f\7\24\2\2\u027f\u0280\7\13\2\2\u0280"+
		"\u0283\7@\2\2\u0281\u0283\3\2\2\2\u0282\u0230\3\2\2\2\u0282\u0233\3\2"+
		"\2\2\u0282\u0236\3\2\2\2\u0282\u0239\3\2\2\2\u0282\u023c\3\2\2\2\u0282"+
		"\u023f\3\2\2\2\u0282\u0242\3\2\2\2\u0282\u0245\3\2\2\2\u0282\u0248\3\2"+
		"\2\2\u0282\u024b\3\2\2\2\u0282\u024e\3\2\2\2\u0282\u0251\3\2\2\2\u0282"+
		"\u0254\3\2\2\2\u0282\u0257\3\2\2\2\u0282\u025a\3\2\2\2\u0282\u025d\3\2"+
		"\2\2\u0282\u0260\3\2\2\2\u0282\u0263\3\2\2\2\u0282\u0266\3\2\2\2\u0282"+
		"\u0269\3\2\2\2\u0282\u026c\3\2\2\2\u0282\u026f\3\2\2\2\u0282\u0272\3\2"+
		"\2\2\u0282\u0275\3\2\2\2\u0282\u0278\3\2\2\2\u0282\u027b\3\2\2\2\u0282"+
		"\u027e\3\2\2\2\u0282\u0281\3\2\2\2\u0283\67\3\2\2\2:<>FQZfky\u0083\u008f"+
		"\u0094\u0099\u00ac\u00be\u00d8\u00e9\u00fb\u00ff\u010f\u0125\u012e\u0137"+
		"\u013b\u013f\u014c\u0150\u0154\u0163\u0167\u016b\u0178\u017c\u0180\u018f"+
		"\u0193\u0197\u01a9\u01ad\u01bf\u01c3\u01c7\u01cb\u01dc\u01e0\u01e4\u01f6"+
		"\u01fa\u01fe\u0202\u0211\u0215\u0219\u0224\u0228\u022c\u0282";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}