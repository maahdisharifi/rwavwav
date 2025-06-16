// Generated from C:/Users/Mahdi/Desktop/plc/aslphas3/phase-2-ce-maahdisharifi-main/rwavwav/src/main/grammar/SimpleLang.g4 by ANTLR 4.13.2
package main.grammar;


    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.Stmt.*;
    import main.ast.nodes.expr.*;
    import main.ast.nodes.expr.primitives.*;

     import main.ast.nodes.externalDeclaration.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		End=1, Break=2, Char=3, Const=4, Continue=5, Do=6, Double=7, Else=8, Float=9, 
		For=10, If=11, Int=12, Long=13, Return=14, Short=15, Signed=16, Sizeof=17, 
		Switch=18, Typedef=19, Unsigned=20, Void=21, While=22, Bool=23, LeftParen=24, 
		RightParen=25, LeftBracket=26, RightBracket=27, LeftBrace=28, RightBrace=29, 
		Less=30, LessEqual=31, Greater=32, GreaterEqual=33, LeftShift=34, RightShift=35, 
		Plus=36, PlusPlus=37, Minus=38, MinusMinus=39, Star=40, Div=41, Mod=42, 
		And=43, Or=44, AndAnd=45, OrOr=46, Xor=47, Not=48, Tilde=49, Question=50, 
		Colon=51, Semi=52, Comma=53, Assign=54, StarAssign=55, DivAssign=56, ModAssign=57, 
		PlusAssign=58, MinusAssign=59, LeftShiftAssign=60, RightShiftAssign=61, 
		AndAssign=62, XorAssign=63, OrAssign=64, Equal=65, NotEqual=66, Arrow=67, 
		Dot=68, Identifier=69, Constant=70, DigitSequence=71, StringLiteral=72, 
		MultiLineMacro=73, Directive=74, INDENT=75, Whitespace=76, Newline=77, 
		BlockComment=78, LineComment=79;
	public static final int
		RULE_program = 0, RULE_translationUnit = 1, RULE_externalDeclaration = 2, 
		RULE_functionDefinition = 3, RULE_declarationList = 4, RULE_expression = 5, 
		RULE_argumentExpressionList = 6, RULE_unaryOperator = 7, RULE_castExpression = 8, 
		RULE_assignmentOperator = 9, RULE_declaration = 10, RULE_declarationSpecifiers = 11, 
		RULE_declarationSpecifier = 12, RULE_initDeclaratorList = 13, RULE_initDeclarator = 14, 
		RULE_typeSpecifier = 15, RULE_specifierQualifierList = 16, RULE_declarator = 17, 
		RULE_directDeclarator = 18, RULE_pointer = 19, RULE_parameterList = 20, 
		RULE_parameterDeclaration = 21, RULE_identifierList = 22, RULE_typeName = 23, 
		RULE_abstractDeclarator = 24, RULE_directAbstractDeclarator = 25, RULE_initializer = 26, 
		RULE_initializerList = 27, RULE_designation = 28, RULE_designator = 29, 
		RULE_statement = 30, RULE_compoundStatement = 31, RULE_blockItem = 32, 
		RULE_expressionStatement = 33, RULE_selectionStatement = 34, RULE_iterationStatement = 35, 
		RULE_forCondition = 36, RULE_forDeclaration = 37, RULE_forExpression = 38, 
		RULE_jumpStatement = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "translationUnit", "externalDeclaration", "functionDefinition", 
			"declarationList", "expression", "argumentExpressionList", "unaryOperator", 
			"castExpression", "assignmentOperator", "declaration", "declarationSpecifiers", 
			"declarationSpecifier", "initDeclaratorList", "initDeclarator", "typeSpecifier", 
			"specifierQualifierList", "declarator", "directDeclarator", "pointer", 
			"parameterList", "parameterDeclaration", "identifierList", "typeName", 
			"abstractDeclarator", "directAbstractDeclarator", "initializer", "initializerList", 
			"designation", "designator", "statement", "compoundStatement", "blockItem", 
			"expressionStatement", "selectionStatement", "iterationStatement", "forCondition", 
			"forDeclaration", "forExpression", "jumpStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'end'", "'break'", "'char'", "'const'", "'continue'", "'do'", 
			"'double'", "'else'", "'float'", "'for'", "'if'", "'int'", "'long'", 
			"'return'", "'short'", "'signed'", "'sizeof'", "'switch'", "'typedef'", 
			"'unsigned'", "'void'", "'while'", "'bool'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", 
			"'-'", "'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", 
			"'!'", "'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", 
			"'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", 
			"'->'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "End", "Break", "Char", "Const", "Continue", "Do", "Double", "Else", 
			"Float", "For", "If", "Int", "Long", "Return", "Short", "Signed", "Sizeof", 
			"Switch", "Typedef", "Unsigned", "Void", "While", "Bool", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
			"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
			"Or", "AndAnd", "OrOr", "Xor", "Not", "Tilde", "Question", "Colon", "Semi", 
			"Comma", "Assign", "StarAssign", "DivAssign", "ModAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", 
			"OrAssign", "Equal", "NotEqual", "Arrow", "Dot", "Identifier", "Constant", 
			"DigitSequence", "StringLiteral", "MultiLineMacro", "Directive", "INDENT", 
			"Whitespace", "Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public TranslationUnitContext t;
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public List<TerminalNode> Newline() { return getTokens(SimpleLangParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(SimpleLangParser.Newline, i);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProgram(this);
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
			 ((ProgramContext)_localctx).programRet =  new Program();
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(81);
				((ProgramContext)_localctx).t = translationUnit();
				_localctx.programRet.settranslationUnit(((ProgramContext)_localctx).t.translationUnitRet);
				}
				break;
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Newline) {
				{
				{
				setState(86);
				match(Newline);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public TranslationUnit translationUnitRet;
		public ExternalDeclarationContext ed;
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_translationUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((TranslationUnitContext)_localctx).translationUnitRet = new TranslationUnit();
			setState(98); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(95);
					((TranslationUnitContext)_localctx).ed = externalDeclaration();
					_localctx.translationUnitRet.addED(((TranslationUnitContext)_localctx).ed.externalDeclarationRet);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(100); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalDeclarationContext extends ParserRuleContext {
		public ExternalDeclaration externalDeclarationRet;
		public FunctionDefinitionContext f;
		public DeclarationContext d;
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public List<TerminalNode> Newline() { return getTokens(SimpleLangParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(SimpleLangParser.Newline, i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_externalDeclaration);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Newline) {
					{
					{
					setState(102);
					match(Newline);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				((ExternalDeclarationContext)_localctx).f = functionDefinition();
				 ((ExternalDeclarationContext)_localctx).externalDeclarationRet = ((ExternalDeclarationContext)_localctx).f.functionDefinitionRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Newline) {
					{
					{
					setState(111);
					match(Newline);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				((ExternalDeclarationContext)_localctx).d = declaration();
				((ExternalDeclarationContext)_localctx).externalDeclarationRet = ((ExternalDeclarationContext)_localctx).d.declarationRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(Semi);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinition functionDefinitionRet;
		public DeclarationSpecifiersContext d;
		public DeclaratorContext d2;
		public DeclarationListContext x;
		public Token o;
		public CompoundStatementContext c;
		public TerminalNode Newline() { return getToken(SimpleLangParser.Newline, 0); }
		public TerminalNode End() { return getToken(SimpleLangParser.End, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(SimpleLangParser.Colon, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(SimpleLangParser.INDENT, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FunctionDefinitionContext)_localctx).functionDefinitionRet =  new FunctionDefinition();
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(124);
				((FunctionDefinitionContext)_localctx).d = declarationSpecifiers();
				_localctx.functionDefinitionRet.setDeclarationSpecifiers(((FunctionDefinitionContext)_localctx).d.declarationSpecifiersRet);
				}
				break;
			}
			setState(129);
			((FunctionDefinitionContext)_localctx).d2 = declarator();
			_localctx.functionDefinitionRet.setDeclarator(((FunctionDefinitionContext)_localctx).d2.declaratorRet);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12169880L) != 0) || _la==Identifier) {
				{
				setState(131);
				((FunctionDefinitionContext)_localctx).x = declarationList();
				_localctx.functionDefinitionRet.setDeclarationList(((FunctionDefinitionContext)_localctx).x.declarationListRet);
				}
			}

			setState(136);
			((FunctionDefinitionContext)_localctx).o = match(Colon);
			setState(137);
			match(Newline);
			setState(138);
			((FunctionDefinitionContext)_localctx).c = compoundStatement();
			_localctx.functionDefinitionRet.setCompoundStatement(((FunctionDefinitionContext)_localctx).c.compoundStatementRet);_localctx.functionDefinitionRet.setLine((((FunctionDefinitionContext)_localctx).o!=null?((FunctionDefinitionContext)_localctx).o.getLine():0)); 
			setState(140);
			match(End);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDENT) {
				{
				setState(141);
				match(INDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationList declarationListRet;
		public DeclarationContext d;
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DeclarationListContext)_localctx).declarationListRet = new DeclarationList();
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				((DeclarationListContext)_localctx).d = declaration();
				_localctx.declarationListRet.add(((DeclarationListContext)_localctx).d.declarationRet);
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 12169880L) != 0) || _la==Identifier );
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
	public static class ExpressionContext extends ParserRuleContext {
		public Expr expressionRet;
		public ExpressionContext e1;
		public ExpressionContext e4;
		public ExpressionContext e;
		public ExpressionContext eaaa;
		public ExpressionContext lValue;
		public Token i;
		public Token c;
		public ExpressionContext e2;
		public TypeNameContext ttt;
		public InitializerListContext ill;
		public Token op;
		public Token s;
		public ExpressionContext q;
		public TypeNameContext tw;
		public InitializerListContext iw;
		public UnaryOperatorContext uno;
		public CastExpressionContext cen;
		public TypeNameContext nigga;
		public TypeNameContext t1;
		public CastExpressionContext c12;
		public ExpressionContext wf;
		public ExpressionContext fw;
		public AssignmentOperatorContext ao;
		public ExpressionContext rVal;
		public ExpressionContext e3;
		public Token l54;
		public ArgumentExpressionListContext ael;
		public Token pp;
		public Token mm;
		public Token cmm;
		public ExpressionContext x;
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(SimpleLangParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(SimpleLangParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(SimpleLangParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LeftBrace() { return getToken(SimpleLangParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SimpleLangParser.RightBrace, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public List<TerminalNode> Sizeof() { return getTokens(SimpleLangParser.Sizeof); }
		public TerminalNode Sizeof(int i) {
			return getToken(SimpleLangParser.Sizeof, i);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(SimpleLangParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(SimpleLangParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(SimpleLangParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(SimpleLangParser.MinusMinus, i);
		}
		public TerminalNode Star() { return getToken(SimpleLangParser.Star, 0); }
		public TerminalNode Div() { return getToken(SimpleLangParser.Div, 0); }
		public TerminalNode Mod() { return getToken(SimpleLangParser.Mod, 0); }
		public TerminalNode Plus() { return getToken(SimpleLangParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleLangParser.Minus, 0); }
		public TerminalNode LeftShift() { return getToken(SimpleLangParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(SimpleLangParser.RightShift, 0); }
		public TerminalNode Less() { return getToken(SimpleLangParser.Less, 0); }
		public TerminalNode Greater() { return getToken(SimpleLangParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(SimpleLangParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(SimpleLangParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(SimpleLangParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(SimpleLangParser.NotEqual, 0); }
		public TerminalNode And() { return getToken(SimpleLangParser.And, 0); }
		public TerminalNode Xor() { return getToken(SimpleLangParser.Xor, 0); }
		public TerminalNode Or() { return getToken(SimpleLangParser.Or, 0); }
		public TerminalNode AndAnd() { return getToken(SimpleLangParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(SimpleLangParser.OrOr, 0); }
		public TerminalNode Question() { return getToken(SimpleLangParser.Question, 0); }
		public TerminalNode Colon() { return getToken(SimpleLangParser.Colon, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(153);
				((ExpressionContext)_localctx).i = match(Identifier);
				((ExpressionContext)_localctx).expressionRet =  new Identifier((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null));_localctx.expressionRet.setLine((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getLine():0));
				}
				break;
			case 2:
				{
				setState(155);
				((ExpressionContext)_localctx).c = match(Constant);
				((ExpressionContext)_localctx).expressionRet = new Constant((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null));_localctx.expressionRet.setLine((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getLine():0));
				}
				break;
			case 3:
				{
				setState(158); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(157);
						((ExpressionContext)_localctx).i = match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(160); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				((ExpressionContext)_localctx).expressionRet =  new StringVal((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null));
				}
				break;
			case 4:
				{
				setState(163);
				match(LeftParen);
				setState(164);
				((ExpressionContext)_localctx).e2 = expression(0);
				((ExpressionContext)_localctx).expressionRet = ((ExpressionContext)_localctx).e2.expressionRet;
				setState(166);
				match(RightParen);
				}
				break;
			case 5:
				{
				setState(168);
				match(LeftParen);
				setState(169);
				((ExpressionContext)_localctx).ttt = typeName();
				setState(170);
				match(RightParen);
				setState(171);
				match(LeftBrace);
				setState(172);
				((ExpressionContext)_localctx).ill = initializerList();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(173);
					match(Comma);
					}
				}

				setState(176);
				match(RightBrace);
				((ExpressionContext)_localctx).expressionRet = new TypeName_initList(((ExpressionContext)_localctx).ttt.typeNameRet,((ExpressionContext)_localctx).ill.initializerListRet);
				}
				break;
			case 6:
				{
				 ArrayList<String> list = new ArrayList<>();
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(180);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 687194898432L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						list.add((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null));
						}
						} 
					}
					setState(186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(187);
					((ExpressionContext)_localctx).i = match(Identifier);
					 ((ExpressionContext)_localctx).expressionRet = new IDPrefixExpr((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null),list);
					}
					break;
				case 2:
					{
					setState(189);
					((ExpressionContext)_localctx).c = match(Constant);
					((ExpressionContext)_localctx).expressionRet = new ConstantPrefixExpr((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null),list);
					}
					break;
				case 3:
					{
					setState(192); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(191);
							((ExpressionContext)_localctx).s = match(StringLiteral);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(194); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					((ExpressionContext)_localctx).expressionRet = new StringPrefixExpr((((ExpressionContext)_localctx).s!=null?((ExpressionContext)_localctx).s.getText():null),list);
					}
					break;
				case 4:
					{
					setState(197);
					match(LeftParen);
					setState(198);
					((ExpressionContext)_localctx).q = expression(0);
					setState(199);
					match(RightParen);
					((ExpressionContext)_localctx).expressionRet = new ExprPrefixExpr(((ExpressionContext)_localctx).q.expressionRet,list);
					}
					break;
				case 5:
					{
					setState(202);
					match(LeftParen);
					setState(203);
					((ExpressionContext)_localctx).tw = typeName();
					setState(204);
					match(RightParen);
					setState(205);
					match(LeftBrace);
					setState(206);
					((ExpressionContext)_localctx).iw = initializerList();
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(207);
						match(Comma);
						}
					}

					setState(210);
					match(RightBrace);
					((ExpressionContext)_localctx).expressionRet = new TypeNamePrefixExpr(((ExpressionContext)_localctx).tw.typeNameRet,((ExpressionContext)_localctx).iw.initializerListRet, list);
					}
					break;
				case 6:
					{
					setState(213);
					((ExpressionContext)_localctx).uno = unaryOperator();
					setState(214);
					((ExpressionContext)_localctx).cen = castExpression();
					((ExpressionContext)_localctx).expressionRet = new UnaryCastPrefixExpr(((ExpressionContext)_localctx).uno.unaryOperatorRet, ((ExpressionContext)_localctx).cen.castExpressionRet,list);
					}
					break;
				case 7:
					{
					setState(217);
					match(Sizeof);
					setState(218);
					match(LeftParen);
					setState(219);
					((ExpressionContext)_localctx).nigga = typeName();
					setState(220);
					match(RightParen);
					((ExpressionContext)_localctx).expressionRet = new TypeOfPrefixExpr(((ExpressionContext)_localctx).nigga.typeNameRet,list);
					}
					break;
				}
				}
				break;
			case 7:
				{
				setState(225);
				match(LeftParen);
				setState(226);
				((ExpressionContext)_localctx).t1 = typeName();
				setState(227);
				match(RightParen);
				setState(228);
				((ExpressionContext)_localctx).c12 = castExpression();
				((ExpressionContext)_localctx).expressionRet = new CastExpression2(((ExpressionContext)_localctx).t1.typeNameRet,((ExpressionContext)_localctx).c12.castExpressionRet);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(234);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581394432L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						((ExpressionContext)_localctx).e2 = expression(14);
						((ExpressionContext)_localctx).expressionRet = new BinaryExpr(((ExpressionContext)_localctx).e1.expressionRet,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).e2.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(239);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(240);
						((ExpressionContext)_localctx).e2 = expression(13);
						((ExpressionContext)_localctx).expressionRet = new BinaryExpr(((ExpressionContext)_localctx).e1.expressionRet,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).e2.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));_localctx.expressionRet.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(244);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LeftShift || _la==RightShift) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(245);
						((ExpressionContext)_localctx).e2 = expression(12);
						((ExpressionContext)_localctx).expressionRet = new BinaryExpr(((ExpressionContext)_localctx).e1.expressionRet,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).e2.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(249);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(250);
						((ExpressionContext)_localctx).e2 = expression(11);
						((ExpressionContext)_localctx).expressionRet = new BinaryExpr(((ExpressionContext)_localctx).e1.expressionRet,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).e2.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(254);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(255);
						((ExpressionContext)_localctx).e2 = expression(10);
						((ExpressionContext)_localctx).expressionRet = new BinaryExpr(((ExpressionContext)_localctx).e1.expressionRet,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).e2.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(259);
						((ExpressionContext)_localctx).op = match(And);
						setState(260);
						((ExpressionContext)_localctx).e2 = expression(9);
						((ExpressionContext)_localctx).expressionRet = new BinaryExpr(((ExpressionContext)_localctx).e1.expressionRet,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).e2.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(264);
						((ExpressionContext)_localctx).op = match(Xor);
						setState(265);
						((ExpressionContext)_localctx).e2 = expression(8);
						((ExpressionContext)_localctx).expressionRet = new BinaryExpr(((ExpressionContext)_localctx).e1.expressionRet,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).e2.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(269);
						((ExpressionContext)_localctx).op = match(Or);
						setState(270);
						((ExpressionContext)_localctx).e2 = expression(7);
						((ExpressionContext)_localctx).expressionRet = new BinaryExpr(((ExpressionContext)_localctx).e1.expressionRet,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).e2.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(274);
						((ExpressionContext)_localctx).op = match(AndAnd);
						setState(275);
						((ExpressionContext)_localctx).e2 = expression(6);
						((ExpressionContext)_localctx).expressionRet = new BinaryExpr(((ExpressionContext)_localctx).e1.expressionRet,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).e2.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(279);
						((ExpressionContext)_localctx).op = match(OrOr);
						setState(280);
						((ExpressionContext)_localctx).e2 = expression(5);
						((ExpressionContext)_localctx).expressionRet = new BinaryExpr(((ExpressionContext)_localctx).e1.expressionRet,(((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null),((ExpressionContext)_localctx).e2.expressionRet);_localctx.expressionRet.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.eaaa = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(284);
						match(Question);
						setState(285);
						((ExpressionContext)_localctx).wf = expression(0);
						setState(286);
						match(Colon);
						setState(287);
						((ExpressionContext)_localctx).fw = expression(4);
						((ExpressionContext)_localctx).expressionRet = new ConditionalExpr(((ExpressionContext)_localctx).eaaa.expressionRet,((ExpressionContext)_localctx).wf.expressionRet,((ExpressionContext)_localctx).fw.expressionRet);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lValue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(291);
						((ExpressionContext)_localctx).ao = assignmentOperator();
						setState(292);
						((ExpressionContext)_localctx).rVal = expression(3);
						((ExpressionContext)_localctx).expressionRet = new AssignmentExpr(((ExpressionContext)_localctx).lValue.expressionRet,((ExpressionContext)_localctx).rVal.expressionRet,((ExpressionContext)_localctx).ao.assignmentRet);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(296);
						match(LeftBracket);
						setState(297);
						((ExpressionContext)_localctx).e3 = expression(0);
						setState(298);
						match(RightBracket);
						((ExpressionContext)_localctx).expressionRet = new ArrIndexing(((ExpressionContext)_localctx).e1.expressionRet,((ExpressionContext)_localctx).e3.expressionRet);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						FuncCallExpr x=new FuncCallExpr(((ExpressionContext)_localctx).e4.expressionRet);
						setState(303);
						((ExpressionContext)_localctx).l54 = match(LeftParen);
						x.setLine((((ExpressionContext)_localctx).l54!=null?((ExpressionContext)_localctx).l54.getLine():0));
						setState(308);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
							{
							setState(305);
							((ExpressionContext)_localctx).ael = argumentExpressionList();
							x.setArguments(((ExpressionContext)_localctx).ael.argumentExpressionListRet);
							}
						}

						setState(310);
						match(RightParen);
						((ExpressionContext)_localctx).expressionRet =  x;
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(312);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(313);
						((ExpressionContext)_localctx).pp = match(PlusPlus);
						((ExpressionContext)_localctx).expressionRet = new UnaryExpr(((ExpressionContext)_localctx).e.expressionRet,(((ExpressionContext)_localctx).pp!=null?((ExpressionContext)_localctx).pp.getText():null));_localctx.expressionRet.setLine((((ExpressionContext)_localctx).pp!=null?((ExpressionContext)_localctx).pp.getLine():0));
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(316);
						((ExpressionContext)_localctx).mm = match(MinusMinus);
						((ExpressionContext)_localctx).expressionRet = new UnaryExpr(((ExpressionContext)_localctx).e.expressionRet,(((ExpressionContext)_localctx).mm!=null?((ExpressionContext)_localctx).mm.getText():null));_localctx.expressionRet.setLine((((ExpressionContext)_localctx).mm!=null?((ExpressionContext)_localctx).mm.getLine():0));
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						commaExpr ce=new  commaExpr();
						ce.add(((ExpressionContext)_localctx).e.expressionRet);
						setState(325); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(321);
								((ExpressionContext)_localctx).cmm = match(Comma);
								setState(322);
								((ExpressionContext)_localctx).x = expression(0);
								ce.add(((ExpressionContext)_localctx).x.expressionRet);ce.setLine((((ExpressionContext)_localctx).cmm!=null?((ExpressionContext)_localctx).cmm.getLine():0));
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(327); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						((ExpressionContext)_localctx).expressionRet = ce;
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public ArgumentExpressionList argumentExpressionListRet;
		public ExpressionContext e;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArgumentExpressionListContext)_localctx).argumentExpressionListRet = new ArgumentExpressionList();
			setState(337);
			((ArgumentExpressionListContext)_localctx).e = expression(0);
			_localctx.argumentExpressionListRet.add(((ArgumentExpressionListContext)_localctx).e.expressionRet);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				{
				setState(339);
				match(Comma);
				setState(340);
				((ArgumentExpressionListContext)_localctx).e2 = expression(0);
				}
				_localctx.argumentExpressionListRet.add(((ArgumentExpressionListContext)_localctx).e2.expressionRet); 
				}
				}
				setState(348);
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
	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperator unaryOperatorRet;
		public Token s;
		public TerminalNode And() { return getToken(SimpleLangParser.And, 0); }
		public TerminalNode Star() { return getToken(SimpleLangParser.Star, 0); }
		public TerminalNode Plus() { return getToken(SimpleLangParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleLangParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(SimpleLangParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(SimpleLangParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			((UnaryOperatorContext)_localctx).s = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 854664132165632L) != 0)) ) {
				((UnaryOperatorContext)_localctx).s = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			((UnaryOperatorContext)_localctx).unaryOperatorRet = new UnaryOperator((((UnaryOperatorContext)_localctx).s!=null?((UnaryOperatorContext)_localctx).s.getText():null));
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
	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpression castExpressionRet;
		public TypeNameContext t;
		public CastExpressionContext c;
		public ExpressionContext e;
		public Token d;
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(SimpleLangParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_castExpression);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(LeftParen);
				setState(353);
				((CastExpressionContext)_localctx).t = typeName();
				setState(354);
				match(RightParen);
				setState(355);
				((CastExpressionContext)_localctx).c = castExpression();
				((CastExpressionContext)_localctx).castExpressionRet = new Type1CastExpression(((CastExpressionContext)_localctx).t.typeNameRet,((CastExpressionContext)_localctx).c.castExpressionRet);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				((CastExpressionContext)_localctx).e = expression(0);
				((CastExpressionContext)_localctx).castExpressionRet = new Type2CastExpression( ((CastExpressionContext)_localctx).e.expressionRet);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				((CastExpressionContext)_localctx).d = match(DigitSequence);
				((CastExpressionContext)_localctx).castExpressionRet = new Type3CastExpression((((CastExpressionContext)_localctx).d!=null?((CastExpressionContext)_localctx).d.getText():null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public Assignment assignmentRet;
		public Token a;
		public Token s;
		public Token d;
		public Token m;
		public Token p;
		public Token ma;
		public Token l;
		public Token r;
		public Token aa;
		public Token x;
		public Token o;
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(SimpleLangParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(SimpleLangParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(SimpleLangParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(SimpleLangParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(SimpleLangParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(SimpleLangParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(SimpleLangParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(SimpleLangParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(SimpleLangParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(SimpleLangParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentOperator);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				((AssignmentOperatorContext)_localctx).a = match(Assign);
				((AssignmentOperatorContext)_localctx).assignmentRet = new Assignment((((AssignmentOperatorContext)_localctx).a!=null?((AssignmentOperatorContext)_localctx).a.getText():null));_localctx.assignmentRet.setLine((((AssignmentOperatorContext)_localctx).a!=null?((AssignmentOperatorContext)_localctx).a.getLine():0));
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				((AssignmentOperatorContext)_localctx).s = match(StarAssign);
				((AssignmentOperatorContext)_localctx).assignmentRet = new Assignment((((AssignmentOperatorContext)_localctx).s!=null?((AssignmentOperatorContext)_localctx).s.getText():null));_localctx.assignmentRet.setLine((((AssignmentOperatorContext)_localctx).s!=null?((AssignmentOperatorContext)_localctx).s.getLine():0));
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				((AssignmentOperatorContext)_localctx).d = match(DivAssign);
				((AssignmentOperatorContext)_localctx).assignmentRet = new Assignment((((AssignmentOperatorContext)_localctx).d!=null?((AssignmentOperatorContext)_localctx).d.getText():null));_localctx.assignmentRet.setLine((((AssignmentOperatorContext)_localctx).d!=null?((AssignmentOperatorContext)_localctx).d.getLine():0));
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				((AssignmentOperatorContext)_localctx).m = match(ModAssign);
				((AssignmentOperatorContext)_localctx).assignmentRet = new Assignment((((AssignmentOperatorContext)_localctx).m!=null?((AssignmentOperatorContext)_localctx).m.getText():null));_localctx.assignmentRet.setLine((((AssignmentOperatorContext)_localctx).m!=null?((AssignmentOperatorContext)_localctx).m.getLine():0));
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				((AssignmentOperatorContext)_localctx).p = match(PlusAssign);
				((AssignmentOperatorContext)_localctx).assignmentRet = new Assignment((((AssignmentOperatorContext)_localctx).p!=null?((AssignmentOperatorContext)_localctx).p.getText():null));_localctx.assignmentRet.setLine((((AssignmentOperatorContext)_localctx).p!=null?((AssignmentOperatorContext)_localctx).p.getLine():0));
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(375);
				((AssignmentOperatorContext)_localctx).ma = match(MinusAssign);
				((AssignmentOperatorContext)_localctx).assignmentRet = new Assignment((((AssignmentOperatorContext)_localctx).ma!=null?((AssignmentOperatorContext)_localctx).ma.getText():null));_localctx.assignmentRet.setLine((((AssignmentOperatorContext)_localctx).ma!=null?((AssignmentOperatorContext)_localctx).ma.getLine():0));
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 7);
				{
				setState(377);
				((AssignmentOperatorContext)_localctx).l = match(LeftShiftAssign);
				((AssignmentOperatorContext)_localctx).assignmentRet = new Assignment((((AssignmentOperatorContext)_localctx).l!=null?((AssignmentOperatorContext)_localctx).l.getText():null));_localctx.assignmentRet.setLine((((AssignmentOperatorContext)_localctx).l!=null?((AssignmentOperatorContext)_localctx).l.getLine():0));
				}
				break;
			case RightShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(379);
				((AssignmentOperatorContext)_localctx).r = match(RightShiftAssign);
				((AssignmentOperatorContext)_localctx).assignmentRet = new Assignment((((AssignmentOperatorContext)_localctx).r!=null?((AssignmentOperatorContext)_localctx).r.getText():null));_localctx.assignmentRet.setLine((((AssignmentOperatorContext)_localctx).r!=null?((AssignmentOperatorContext)_localctx).r.getLine():0));
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(381);
				((AssignmentOperatorContext)_localctx).aa = match(AndAssign);
				((AssignmentOperatorContext)_localctx).assignmentRet = new Assignment((((AssignmentOperatorContext)_localctx).aa!=null?((AssignmentOperatorContext)_localctx).aa.getText():null));_localctx.assignmentRet.setLine((((AssignmentOperatorContext)_localctx).aa!=null?((AssignmentOperatorContext)_localctx).aa.getLine():0));
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(383);
				((AssignmentOperatorContext)_localctx).x = match(XorAssign);
				((AssignmentOperatorContext)_localctx).assignmentRet = new Assignment((((AssignmentOperatorContext)_localctx).x!=null?((AssignmentOperatorContext)_localctx).x.getText():null));_localctx.assignmentRet.setLine((((AssignmentOperatorContext)_localctx).x!=null?((AssignmentOperatorContext)_localctx).x.getLine():0));
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(385);
				((AssignmentOperatorContext)_localctx).o = match(OrAssign);
				((AssignmentOperatorContext)_localctx).assignmentRet = new Assignment((((AssignmentOperatorContext)_localctx).o!=null?((AssignmentOperatorContext)_localctx).o.getText():null));_localctx.assignmentRet.setLine((((AssignmentOperatorContext)_localctx).o!=null?((AssignmentOperatorContext)_localctx).o.getLine():0));
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Declaration declarationRet;
		public DeclarationSpecifiersContext d;
		public InitDeclaratorListContext i;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TerminalNode Newline() { return getToken(SimpleLangParser.Newline, 0); }
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DeclarationContext)_localctx).declarationRet = new Declaration();
			setState(390);
			((DeclarationContext)_localctx).d = declarationSpecifiers();
			_localctx.declarationRet.setDeclarationSpecifiers(((DeclarationContext)_localctx).d.declarationSpecifiersRet);_localctx.declarationRet.setLine(((DeclarationContext)_localctx).d.declarationSpecifiersRet.getLine());
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 35184372154369L) != 0)) {
				{
				setState(392);
				((DeclarationContext)_localctx).i = initDeclaratorList();
				_localctx.declarationRet.setInitDeclaratorList(((DeclarationContext)_localctx).i.initDeclaratorListRet);
				}
			}

			{
			setState(397);
			match(Newline);
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
	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public DeclarationSpecifiers declarationSpecifiersRet;
		public DeclarationSpecifierContext d;
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((DeclarationSpecifiersContext)_localctx).declarationSpecifiersRet = new DeclarationSpecifiers();
			setState(403); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(400);
					((DeclarationSpecifiersContext)_localctx).d = declarationSpecifier();
					_localctx.declarationSpecifiersRet.add(((DeclarationSpecifiersContext)_localctx).d.declarationSpecifierRet);_localctx.declarationSpecifiersRet.setLine(((DeclarationSpecifiersContext)_localctx).d.declarationSpecifierRet.getLine());
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(405); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public DeclarationSpecifier declarationSpecifierRet;
		public Token a;
		public TypeSpecifierContext t;
		public Token c;
		public TerminalNode Typedef() { return getToken(SimpleLangParser.Typedef, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Const() { return getToken(SimpleLangParser.Const, 0); }
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declarationSpecifier);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Typedef:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				((DeclarationSpecifierContext)_localctx).a = match(Typedef);
				((DeclarationSpecifierContext)_localctx).declarationSpecifierRet = new DeclarationSpecifier("typedef");_localctx.declarationSpecifierRet.setLine((((DeclarationSpecifierContext)_localctx).a!=null?((DeclarationSpecifierContext)_localctx).a.getLine():0)); 
				}
				break;
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				((DeclarationSpecifierContext)_localctx).t = typeSpecifier();
				((DeclarationSpecifierContext)_localctx).declarationSpecifierRet = ((DeclarationSpecifierContext)_localctx).t.declarationSpecifierRet2;_localctx.declarationSpecifierRet.setLine(((DeclarationSpecifierContext)_localctx).t.declarationSpecifierRet2.getLine());
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				((DeclarationSpecifierContext)_localctx).c = match(Const);
				((DeclarationSpecifierContext)_localctx).declarationSpecifierRet = new DeclarationSpecifier("const");_localctx.declarationSpecifierRet.setLine((((DeclarationSpecifierContext)_localctx).c!=null?((DeclarationSpecifierContext)_localctx).c.getLine():0));
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorList initDeclaratorListRet;
		public InitDeclaratorContext i1;
		public InitDeclaratorContext i2;
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InitDeclaratorListContext)_localctx).initDeclaratorListRet = new InitDeclaratorList();
			setState(417);
			((InitDeclaratorListContext)_localctx).i1 = initDeclarator();
			_localctx.initDeclaratorListRet.add(((InitDeclaratorListContext)_localctx).i1.initDeclaratorRet);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(419);
				match(Comma);
				setState(420);
				((InitDeclaratorListContext)_localctx).i2 = initDeclarator();
				_localctx.initDeclaratorListRet.add(((InitDeclaratorListContext)_localctx).i2.initDeclaratorRet);
				}
				}
				setState(427);
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
	public static class InitDeclaratorContext extends ParserRuleContext {
		public InitDeclarator initDeclaratorRet;
		public DeclaratorContext d;
		public InitializerContext i;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InitDeclaratorContext)_localctx).initDeclaratorRet = new InitDeclarator();
			setState(429);
			((InitDeclaratorContext)_localctx).d = declarator();
			_localctx.initDeclaratorRet.setDeclarator(((InitDeclaratorContext)_localctx).d.declaratorRet);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(431);
				match(Assign);
				setState(432);
				((InitDeclaratorContext)_localctx).i = initializer();
				_localctx.initDeclaratorRet.setInitializer(((InitDeclaratorContext)_localctx).i.initializerRet);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public DeclarationSpecifier declarationSpecifierRet2;
		public Token v;
		public Token c;
		public Token s;
		public Token iq;
		public Token l;
		public Token f;
		public Token d;
		public Token ss;
		public Token u;
		public Token b;
		public Token i;
		public TerminalNode Void() { return getToken(SimpleLangParser.Void, 0); }
		public TerminalNode Char() { return getToken(SimpleLangParser.Char, 0); }
		public TerminalNode Short() { return getToken(SimpleLangParser.Short, 0); }
		public TerminalNode Int() { return getToken(SimpleLangParser.Int, 0); }
		public TerminalNode Long() { return getToken(SimpleLangParser.Long, 0); }
		public TerminalNode Float() { return getToken(SimpleLangParser.Float, 0); }
		public TerminalNode Double() { return getToken(SimpleLangParser.Double, 0); }
		public TerminalNode Signed() { return getToken(SimpleLangParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(SimpleLangParser.Unsigned, 0); }
		public TerminalNode Bool() { return getToken(SimpleLangParser.Bool, 0); }
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeSpecifier);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				((TypeSpecifierContext)_localctx).v = match(Void);
				((TypeSpecifierContext)_localctx).declarationSpecifierRet2 = new DeclarationSpecifier("void"); _localctx.declarationSpecifierRet2.setLine((((TypeSpecifierContext)_localctx).v!=null?((TypeSpecifierContext)_localctx).v.getLine():0)); 
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				((TypeSpecifierContext)_localctx).c = match(Char);
				((TypeSpecifierContext)_localctx).declarationSpecifierRet2 = new DeclarationSpecifier("char");_localctx.declarationSpecifierRet2.setLine((((TypeSpecifierContext)_localctx).c!=null?((TypeSpecifierContext)_localctx).c.getLine():0)); 
				}
				break;
			case Short:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				((TypeSpecifierContext)_localctx).s = match(Short);
				((TypeSpecifierContext)_localctx).declarationSpecifierRet2 = new DeclarationSpecifier("short"); _localctx.declarationSpecifierRet2.setLine((((TypeSpecifierContext)_localctx).s!=null?((TypeSpecifierContext)_localctx).s.getLine():0)); 
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 4);
				{
				setState(443);
				((TypeSpecifierContext)_localctx).iq = match(Int);
				((TypeSpecifierContext)_localctx).declarationSpecifierRet2 = new DeclarationSpecifier("int");_localctx.declarationSpecifierRet2.setLine((((TypeSpecifierContext)_localctx).iq!=null?((TypeSpecifierContext)_localctx).iq.getLine():0)); 
				}
				break;
			case Long:
				enterOuterAlt(_localctx, 5);
				{
				setState(445);
				((TypeSpecifierContext)_localctx).l = match(Long);
				((TypeSpecifierContext)_localctx).declarationSpecifierRet2 = new DeclarationSpecifier("long");_localctx.declarationSpecifierRet2.setLine((((TypeSpecifierContext)_localctx).l!=null?((TypeSpecifierContext)_localctx).l.getLine():0)); 
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 6);
				{
				setState(447);
				((TypeSpecifierContext)_localctx).f = match(Float);
				((TypeSpecifierContext)_localctx).declarationSpecifierRet2 = new DeclarationSpecifier("float");_localctx.declarationSpecifierRet2.setLine((((TypeSpecifierContext)_localctx).f!=null?((TypeSpecifierContext)_localctx).f.getLine():0)); 
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 7);
				{
				setState(449);
				((TypeSpecifierContext)_localctx).d = match(Double);
				((TypeSpecifierContext)_localctx).declarationSpecifierRet2 = new DeclarationSpecifier("double");_localctx.declarationSpecifierRet2.setLine((((TypeSpecifierContext)_localctx).d!=null?((TypeSpecifierContext)_localctx).d.getLine():0)); 
				}
				break;
			case Signed:
				enterOuterAlt(_localctx, 8);
				{
				setState(451);
				((TypeSpecifierContext)_localctx).ss = match(Signed);
				((TypeSpecifierContext)_localctx).declarationSpecifierRet2 = new DeclarationSpecifier("signed");_localctx.declarationSpecifierRet2.setLine((((TypeSpecifierContext)_localctx).ss!=null?((TypeSpecifierContext)_localctx).ss.getLine():0)); 
				}
				break;
			case Unsigned:
				enterOuterAlt(_localctx, 9);
				{
				setState(453);
				((TypeSpecifierContext)_localctx).u = match(Unsigned);
				((TypeSpecifierContext)_localctx).declarationSpecifierRet2 = new DeclarationSpecifier("unsigned");_localctx.declarationSpecifierRet2.setLine((((TypeSpecifierContext)_localctx).u!=null?((TypeSpecifierContext)_localctx).u.getLine():0)); 
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 10);
				{
				setState(455);
				((TypeSpecifierContext)_localctx).b = match(Bool);
				((TypeSpecifierContext)_localctx).declarationSpecifierRet2 = new DeclarationSpecifier("bool");_localctx.declarationSpecifierRet2.setLine((((TypeSpecifierContext)_localctx).b!=null?((TypeSpecifierContext)_localctx).b.getLine():0)); 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 11);
				{
				setState(457);
				((TypeSpecifierContext)_localctx).i = match(Identifier);
				((TypeSpecifierContext)_localctx).declarationSpecifierRet2 = new DeclarationSpecifier("identifier",(((TypeSpecifierContext)_localctx).i!=null?((TypeSpecifierContext)_localctx).i.getText():null)); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public SpecifierQualifierList specifierQualifierListRet;
		public TypeSpecifierContext t;
		public SpecifierQualifierListContext q;
		public TerminalNode Const() { return getToken(SimpleLangParser.Const, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSpecifierQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_specifierQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SpecifierQualifierListContext)_localctx).specifierQualifierListRet = new SpecifierQualifierList();
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Identifier:
				{
				setState(462);
				((SpecifierQualifierListContext)_localctx).t = typeSpecifier();
				_localctx.specifierQualifierListRet.setDeclarationSpecifier(((SpecifierQualifierListContext)_localctx).t.declarationSpecifierRet2);
				}
				break;
			case Const:
				{
				_localctx.specifierQualifierListRet.setDeclarationSpecifier(new DeclarationSpecifier("const"));
				setState(466);
				match(Const);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11645592L) != 0) || _la==Identifier) {
				{
				setState(469);
				((SpecifierQualifierListContext)_localctx).q = specifierQualifierList();
				_localctx.specifierQualifierListRet.setSpecifierQualifierList(((SpecifierQualifierListContext)_localctx).q.specifierQualifierListRet);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorContext extends ParserRuleContext {
		public Declarator declaratorRet;
		public PointerContext p;
		public DirectDeclaratorContext d;
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DeclaratorContext)_localctx).declaratorRet = new Declarator();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(475);
				((DeclaratorContext)_localctx).p = pointer();
				_localctx.declaratorRet.setPointer(((DeclaratorContext)_localctx).p.pointerRet);
				}
			}

			setState(480);
			((DeclaratorContext)_localctx).d = directDeclarator(0);
			 _localctx.declaratorRet.setDirectDeclarator(((DeclaratorContext)_localctx).d.directDeclaratorRet); _localctx.declaratorRet.setLine(((DeclaratorContext)_localctx).d.directDeclaratorRet.getLine());
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
	public static class DirectDeclaratorContext extends ParserRuleContext {
		public DirectDeclarator directDeclaratorRet;
		public DirectDeclaratorContext d12;
		public DirectDeclaratorContext d32;
		public Token i;
		public Token l1;
		public DeclaratorContext d;
		public Token l2;
		public ExpressionContext e;
		public ParameterListContext p;
		public IdentifierListContext il;
		public Token r;
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDirectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(484);
				((DirectDeclaratorContext)_localctx).i = match(Identifier);
				((DirectDeclaratorContext)_localctx).directDeclaratorRet = new Type1DirectDeclarator((((DirectDeclaratorContext)_localctx).i!=null?((DirectDeclaratorContext)_localctx).i.getText():null));_localctx.directDeclaratorRet.setLine((((DirectDeclaratorContext)_localctx).i!=null?((DirectDeclaratorContext)_localctx).i.getLine():0)); 
				}
				break;
			case LeftParen:
				{
				setState(486);
				((DirectDeclaratorContext)_localctx).l1 = match(LeftParen);
				setState(487);
				((DirectDeclaratorContext)_localctx).d = declarator();
				((DirectDeclaratorContext)_localctx).directDeclaratorRet = new Type2DirectDeclarator(((DirectDeclaratorContext)_localctx).d.declaratorRet);_localctx.directDeclaratorRet.setLine((((DirectDeclaratorContext)_localctx).l1!=null?((DirectDeclaratorContext)_localctx).l1.getLine():0));
				setState(489);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(520);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						_localctx.d12 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(493);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						Type3DirectDeclarator x=new Type3DirectDeclarator();
						x.setDirectDeclarator(((DirectDeclaratorContext)_localctx).d12.directDeclaratorRet);
						setState(496);
						((DirectDeclaratorContext)_localctx).l2 = match(LeftBracket);
						setState(500);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
							{
							setState(497);
							((DirectDeclaratorContext)_localctx).e = expression(0);
							x.setExpr(((DirectDeclaratorContext)_localctx).e.expressionRet);
							}
						}

						setState(502);
						match(RightBracket);
						x.setLine((((DirectDeclaratorContext)_localctx).l2!=null?((DirectDeclaratorContext)_localctx).l2.getLine():0));((DirectDeclaratorContext)_localctx).directDeclaratorRet = x;
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						_localctx.d32 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(504);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						Type4DirectDeclarator x1=new Type4DirectDeclarator();
						x1.setDirectDeclarator(((DirectDeclaratorContext)_localctx).d32.directDeclaratorRet);
						setState(507);
						match(LeftParen);
						setState(516);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(508);
							((DirectDeclaratorContext)_localctx).p = parameterList();
							x1.setParameterList(((DirectDeclaratorContext)_localctx).p.parameterListRet);
							}
							break;
						case 2:
							{
							setState(514);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Identifier) {
								{
								setState(511);
								((DirectDeclaratorContext)_localctx).il = identifierList();
								x1.setIdentifierList(((DirectDeclaratorContext)_localctx).il.identifierListRet);
								}
							}

							}
							break;
						}
						setState(518);
						((DirectDeclaratorContext)_localctx).r = match(RightParen);
						x1.setLine((((DirectDeclaratorContext)_localctx).r!=null?((DirectDeclaratorContext)_localctx).r.getLine():0));((DirectDeclaratorContext)_localctx).directDeclaratorRet = x1;
						}
						break;
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointerContext extends ParserRuleContext {
		public Pointer pointerRet;
		public List<TerminalNode> Star() { return getTokens(SimpleLangParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(SimpleLangParser.Star, i);
		}
		public List<TerminalNode> Const() { return getTokens(SimpleLangParser.Const); }
		public TerminalNode Const(int i) {
			return getToken(SimpleLangParser.Const, i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int StarCount=0;
			setState(536); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(526);
				match(Star);
				StarCount+=1;
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(530); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(529);
						match(Const);
						}
						}
						setState(532); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Const );
					}
				}

				}
				}
				setState(538); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Star );
			((PointerContext)_localctx).pointerRet = new Pointer(StarCount);
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
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterList parameterListRet;
		public ParameterDeclarationContext p1;
		public ParameterDeclarationContext p2;
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ParameterListContext)_localctx).parameterListRet = new ParameterList(); 
			setState(543);
			((ParameterListContext)_localctx).p1 = parameterDeclaration();
			_localctx.parameterListRet.add(((ParameterListContext)_localctx).p1.parameterDeclarationRet);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(545);
				match(Comma);
				setState(546);
				((ParameterListContext)_localctx).p2 = parameterDeclaration();
				_localctx.parameterListRet.add(((ParameterListContext)_localctx).p2.parameterDeclarationRet);
				}
				}
				setState(553);
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
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public ParameterDeclaration parameterDeclarationRet;
		public DeclarationSpecifiersContext d;
		public DeclaratorContext d2;
		public AbstractDeclaratorContext a;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			((ParameterDeclarationContext)_localctx).d = declarationSpecifiers();
			((ParameterDeclarationContext)_localctx).parameterDeclarationRet = new ParameterDeclaration(((ParameterDeclarationContext)_localctx).d.declarationSpecifiersRet);
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(556);
				((ParameterDeclarationContext)_localctx).d2 = declarator();
				_localctx.parameterDeclarationRet.setDeclarator(((ParameterDeclarationContext)_localctx).d2.declaratorRet);
				}
				break;
			case 2:
				{
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099595513856L) != 0)) {
					{
					setState(559);
					((ParameterDeclarationContext)_localctx).a = abstractDeclarator();
					_localctx.parameterDeclarationRet.setAbstractDeclarator(((ParameterDeclarationContext)_localctx).a.abstractDeclaratorRet);
					}
				}

				}
				break;
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
	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierList identifierListRet;
		public Token i1;
		public Token i2;
		public List<TerminalNode> Identifier() { return getTokens(SimpleLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleLangParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			((IdentifierListContext)_localctx).i1 = match(Identifier);
			((IdentifierListContext)_localctx).identifierListRet = new IdentifierList((((IdentifierListContext)_localctx).i1!=null?((IdentifierListContext)_localctx).i1.getText():null));
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(568);
				match(Comma);
				setState(569);
				((IdentifierListContext)_localctx).i2 = match(Identifier);
				_localctx.identifierListRet.add((((IdentifierListContext)_localctx).i2!=null?((IdentifierListContext)_localctx).i2.getText():null));
				}
				}
				setState(575);
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
	public static class TypeNameContext extends ParserRuleContext {
		public TypeName typeNameRet;
		public SpecifierQualifierListContext s;
		public AbstractDeclaratorContext a;
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			((TypeNameContext)_localctx).s = specifierQualifierList();
			((TypeNameContext)_localctx).typeNameRet = new TypeName(((TypeNameContext)_localctx).s.specifierQualifierListRet);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099595513856L) != 0)) {
				{
				setState(578);
				((TypeNameContext)_localctx).a = abstractDeclarator();
				_localctx.typeNameRet.setAbstractDeclarator(((TypeNameContext)_localctx).a.abstractDeclaratorRet);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public AbstractDeclarator abstractDeclaratorRet;
		public PointerContext p;
		public PointerContext p2;
		public DirectAbstractDeclaratorContext d;
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_abstractDeclarator);
		int _la;
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((AbstractDeclaratorContext)_localctx).abstractDeclaratorRet = new AbstractDeclarator(); 
				setState(584);
				((AbstractDeclaratorContext)_localctx).p = pointer();
				_localctx.abstractDeclaratorRet.setPointer(((AbstractDeclaratorContext)_localctx).p.pointerRet);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((AbstractDeclaratorContext)_localctx).abstractDeclaratorRet = new AbstractDeclarator(); 
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star) {
					{
					setState(588);
					((AbstractDeclaratorContext)_localctx).p2 = pointer();
					_localctx.abstractDeclaratorRet.setPointer(((AbstractDeclaratorContext)_localctx).p2.pointerRet);
					}
				}

				setState(593);
				((AbstractDeclaratorContext)_localctx).d = directAbstractDeclarator(0);
				_localctx.abstractDeclaratorRet.setDirectAbstractDeclarator(((AbstractDeclaratorContext)_localctx).d.directAbstractDeclaratorRet);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public DirectAbstractDeclarator directAbstractDeclaratorRet;
		public DirectAbstractDeclaratorContext d;
		public ExpressionContext e;
		public AbstractDeclaratorContext a;
		public ParameterListContext p;
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDirectAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDirectAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				{
				((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet = new ExpressionDAD();
				setState(600);
				match(LeftBracket);
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
					{
					setState(601);
					((DirectAbstractDeclaratorContext)_localctx).e = expression(0);
					 ((ExpressionDAD) _localctx.directAbstractDeclaratorRet).setExpr(((DirectAbstractDeclaratorContext)_localctx).e.expressionRet);
					}
				}

				setState(606);
				match(RightBracket);
				}
				break;
			case LeftParen:
				{
				setState(607);
				match(LeftParen);
				setState(618);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
				case LeftBracket:
				case Star:
					{
					setState(608);
					((DirectAbstractDeclaratorContext)_localctx).a = abstractDeclarator();
					((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet = new Type2DAD(((DirectAbstractDeclaratorContext)_localctx).a.abstractDeclaratorRet);
					}
					break;
				case Char:
				case Const:
				case Double:
				case Float:
				case Int:
				case Long:
				case Short:
				case Signed:
				case Typedef:
				case Unsigned:
				case Void:
				case Bool:
				case RightParen:
				case Identifier:
					{
					Type2DAD temp=new Type2DAD();
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12169880L) != 0) || _la==Identifier) {
						{
						setState(612);
						((DirectAbstractDeclaratorContext)_localctx).p = parameterList();
						temp.setParameterList(((DirectAbstractDeclaratorContext)_localctx).p.parameterListRet);
						}
					}

					((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet = temp;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(620);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(644);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						_localctx.d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(623);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						Type3DAD temp1=new Type3DAD();
						temp1.setDirectAbstractDeclarator(((DirectAbstractDeclaratorContext)_localctx).d.directAbstractDeclaratorRet);
						setState(626);
						match(LeftBracket);
						setState(630);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
							{
							setState(627);
							((DirectAbstractDeclaratorContext)_localctx).e = expression(0);
							temp1.setExpr(((DirectAbstractDeclaratorContext)_localctx).e.expressionRet);
							}
						}

						((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet = temp1;
						setState(633);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						_localctx.d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(634);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						Type4DAD tmp= new Type4DAD();tmp.setDirectAbstractDeclarator(((DirectAbstractDeclaratorContext)_localctx).d.directAbstractDeclaratorRet);
						setState(636);
						match(LeftParen);
						setState(640);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12169880L) != 0) || _la==Identifier) {
							{
							setState(637);
							((DirectAbstractDeclaratorContext)_localctx).p = parameterList();
							tmp.setParameterList(((DirectAbstractDeclaratorContext)_localctx).p.parameterListRet);
							}
						}

						setState(642);
						match(RightParen);
						((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet = tmp;
						}
						break;
					}
					} 
				}
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public Initializer initializerRet;
		public ExpressionContext e1;
		public InitializerListContext i;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(SimpleLangParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SimpleLangParser.RightBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(SimpleLangParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_initializer);
		int _la;
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sizeof:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				((InitializerContext)_localctx).e1 = expression(0);
				((InitializerContext)_localctx).initializerRet = new Initializer(((InitializerContext)_localctx).e1.expressionRet);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				match(LeftBrace);
				setState(653);
				((InitializerContext)_localctx).i = initializerList();
				((InitializerContext)_localctx).initializerRet = new Initializer(((InitializerContext)_localctx).i.initializerListRet);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(655);
					match(Comma);
					}
				}

				setState(658);
				match(RightBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerListContext extends ParserRuleContext {
		public InitializerList initializerListRet;
		public DesignationContext d1;
		public InitializerContext i1;
		public DesignationContext d2;
		public InitializerContext i2;
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public List<DesignationContext> designation() {
			return getRuleContexts(DesignationContext.class);
		}
		public DesignationContext designation(int i) {
			return getRuleContext(DesignationContext.class,i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((InitializerListContext)_localctx).initializerListRet = new InitializerList();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(663);
				((InitializerListContext)_localctx).d1 = designation();
				_localctx.initializerListRet.addDesignation(((InitializerListContext)_localctx).d1.designationRet);
				}
			}

			setState(668);
			((InitializerListContext)_localctx).i1 = initializer();
			_localctx.initializerListRet.addInitializer(((InitializerListContext)_localctx).i1.initializerRet);
			setState(681);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(670);
					match(Comma);
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(671);
						((InitializerListContext)_localctx).d2 = designation();
						_localctx.initializerListRet.addDesignation(((InitializerListContext)_localctx).d2.designationRet);
						}
					}

					setState(676);
					((InitializerListContext)_localctx).i2 = initializer();
					_localctx.initializerListRet.addInitializer(((InitializerListContext)_localctx).i2.initializerRet);
					}
					} 
				}
				setState(683);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
	public static class DesignationContext extends ParserRuleContext {
		public Designation designationRet;
		public DesignatorContext d;
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}
		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class,i);
		}
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_designation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DesignationContext)_localctx).designationRet = new Designation();
			setState(688); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(685);
				((DesignationContext)_localctx).d = designator();
				_localctx.designationRet.add(((DesignationContext)_localctx).d.designatorRet);
				}
				}
				setState(690); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket || _la==Dot );
			setState(692);
			match(Assign);
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
	public static class DesignatorContext extends ParserRuleContext {
		public Designator designatorRet;
		public ExpressionContext e1;
		public Token i;
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(SimpleLangParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_designator);
		try {
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				match(LeftBracket);
				setState(695);
				((DesignatorContext)_localctx).e1 = expression(0);
				((DesignatorContext)_localctx).designatorRet = new Designator(((DesignatorContext)_localctx).e1.expressionRet);
				setState(697);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				match(Dot);
				setState(700);
				((DesignatorContext)_localctx).i = match(Identifier);
				((DesignatorContext)_localctx).designatorRet = new Designator((((DesignatorContext)_localctx).i!=null?((DesignatorContext)_localctx).i.getText():null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Stmt statementRet;
		public ExpressionStatementContext e;
		public SelectionStatementContext s;
		public IterationStatementContext i;
		public JumpStatementContext j;
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		try {
			setState(716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sizeof:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case StringLiteral:
			case Newline:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				((StatementContext)_localctx).e = expressionStatement();
				((StatementContext)_localctx).statementRet = ((StatementContext)_localctx).e.expressionStatementRet;
				}
				break;
			case Else:
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				((StatementContext)_localctx).s = selectionStatement();
				((StatementContext)_localctx).statementRet = ((StatementContext)_localctx).s.selectionStatementRet;
				}
				break;
			case Do:
			case For:
			case While:
				enterOuterAlt(_localctx, 3);
				{
				setState(710);
				((StatementContext)_localctx).i = iterationStatement();
				((StatementContext)_localctx).statementRet = ((StatementContext)_localctx).i.iterationStatementRet;
				}
				break;
			case Break:
			case Continue:
			case Return:
				enterOuterAlt(_localctx, 4);
				{
				setState(713);
				((StatementContext)_localctx).j = jumpStatement();
				((StatementContext)_localctx).statementRet = ((StatementContext)_localctx).j.jumpStatementRet;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public CompoundStatement compoundStatementRet;
		public Token k;
		public BlockItemContext b;
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public List<TerminalNode> INDENT() { return getTokens(SimpleLangParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(SimpleLangParser.INDENT, i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compoundStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			  ((CompoundStatementContext)_localctx).compoundStatementRet = new CompoundStatement();  
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(725); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(720);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==INDENT) {
							{
							setState(719);
							((CompoundStatementContext)_localctx).k = match(INDENT);
							}
						}

						setState(722);
						((CompoundStatementContext)_localctx).b = blockItem();
						_localctx.compoundStatementRet.addBlock(((CompoundStatementContext)_localctx).b.blockItemRet); ((CompoundStatementContext)_localctx).b.blockItemRet.addIndent((((CompoundStatementContext)_localctx).k!=null?((CompoundStatementContext)_localctx).k.getText():null));
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(727); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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
	public static class BlockItemContext extends ParserRuleContext {
		public BlockItem blockItemRet;
		public StatementContext s;
		public DeclarationContext d;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_blockItem);
		try {
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((BlockItemContext)_localctx).blockItemRet = new BlockItem();
				setState(732);
				((BlockItemContext)_localctx).s = statement();
				_localctx.blockItemRet.setStatement(((BlockItemContext)_localctx).s.statementRet);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((BlockItemContext)_localctx).blockItemRet = new BlockItem();
				setState(736);
				((BlockItemContext)_localctx).d = declaration();
				_localctx.blockItemRet.setDeclaration(((BlockItemContext)_localctx).d.declarationRet);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatement expressionStatementRet;
		public ExpressionContext e;
		public List<TerminalNode> Newline() { return getTokens(SimpleLangParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(SimpleLangParser.Newline, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionStatementContext)_localctx).expressionStatementRet = new ExpressionStatement();
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
				{
				{
				setState(742);
				((ExpressionStatementContext)_localctx).e = expression(0);
				_localctx.expressionStatementRet.setExpression(((ExpressionStatementContext)_localctx).e.expressionRet);
				}
				}
			}

			setState(748); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(747);
					match(Newline);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(750); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionStatementContext extends ParserRuleContext {
		public SelectionStatement selectionStatementRet;
		public Token i;
		public ExpressionContext e;
		public Token ef;
		public ExpressionContext e23;
		public Token e2222;
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(SimpleLangParser.Colon, 0); }
		public TerminalNode If() { return getToken(SimpleLangParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> Newline() { return getTokens(SimpleLangParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(SimpleLangParser.Newline, i);
		}
		public TerminalNode Else() { return getToken(SimpleLangParser.Else, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selectionStatement);
		try {
			int _alt;
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				If temp=new If(); 
				setState(753);
				((SelectionStatementContext)_localctx).i = match(If);
				setState(754);
				match(LeftParen);
				setState(755);
				((SelectionStatementContext)_localctx).e = expression(0);
				temp.setCondition(((SelectionStatementContext)_localctx).e.expressionRet); ((SelectionStatementContext)_localctx).selectionStatementRet = temp;_localctx.selectionStatementRet.setLine((((SelectionStatementContext)_localctx).i!=null?((SelectionStatementContext)_localctx).i.getLine():0));((SelectionStatementContext)_localctx).e.expressionRet.setLine((((SelectionStatementContext)_localctx).i!=null?((SelectionStatementContext)_localctx).i.getLine():0));
				setState(757);
				match(RightParen);
				setState(758);
				match(Colon);
				setState(762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(759);
						match(Newline);
						}
						} 
					}
					setState(764);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				((SelectionStatementContext)_localctx).ef = match(Else);
				setState(766);
				match(If);
				setState(767);
				match(LeftParen);
				setState(768);
				((SelectionStatementContext)_localctx).e23 = expression(0);
				setState(769);
				match(RightParen);
				setState(770);
				match(Colon);
				setState(774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(771);
						match(Newline);
						}
						} 
					}
					setState(776);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				((SelectionStatementContext)_localctx).selectionStatementRet = new ElseIf(((SelectionStatementContext)_localctx).e23.expressionRet);_localctx.selectionStatementRet.setLine((((SelectionStatementContext)_localctx).ef!=null?((SelectionStatementContext)_localctx).ef.getLine():0));((SelectionStatementContext)_localctx).e23.expressionRet.setLine((((SelectionStatementContext)_localctx).ef!=null?((SelectionStatementContext)_localctx).ef.getLine():0));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(779);
				((SelectionStatementContext)_localctx).e2222 = match(Else);
				setState(780);
				match(Colon);
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(781);
						match(Newline);
						}
						} 
					}
					setState(786);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				((SelectionStatementContext)_localctx).selectionStatementRet = new Else();_localctx.selectionStatementRet.setLine((((SelectionStatementContext)_localctx).e2222!=null?((SelectionStatementContext)_localctx).e2222.getLine():0));
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

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatement iterationStatementRet;
		public Token ww;
		public ExpressionContext e;
		public Token d;
		public CompoundStatementContext s;
		public Token fuc;
		public ForConditionContext fc;
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(SimpleLangParser.Colon, 0); }
		public TerminalNode While() { return getToken(SimpleLangParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Do() { return getToken(SimpleLangParser.Do, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Newline() { return getToken(SimpleLangParser.Newline, 0); }
		public TerminalNode For() { return getToken(SimpleLangParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_iterationStatement);
		try {
			setState(813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				((IterationStatementContext)_localctx).ww = match(While);
				setState(791);
				match(LeftParen);
				setState(792);
				((IterationStatementContext)_localctx).e = expression(0);
				setState(793);
				match(RightParen);
				setState(794);
				match(Colon);
				((IterationStatementContext)_localctx).iterationStatementRet = new WhileStmt(((IterationStatementContext)_localctx).e.expressionRet);_localctx.iterationStatementRet.setLine((((IterationStatementContext)_localctx).ww!=null?((IterationStatementContext)_localctx).ww.getLine():0));((IterationStatementContext)_localctx).e.expressionRet.setLine((((IterationStatementContext)_localctx).ww!=null?((IterationStatementContext)_localctx).ww.getLine():0));
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				((IterationStatementContext)_localctx).d = match(Do);
				setState(798);
				((IterationStatementContext)_localctx).s = compoundStatement();
				setState(799);
				match(While);
				setState(800);
				match(LeftParen);
				setState(801);
				((IterationStatementContext)_localctx).e = expression(0);
				setState(802);
				match(RightParen);
				{
				setState(803);
				match(Newline);
				}
				((IterationStatementContext)_localctx).iterationStatementRet = new DoWhile(((IterationStatementContext)_localctx).e.expressionRet);_localctx.iterationStatementRet.setLine((((IterationStatementContext)_localctx).d!=null?((IterationStatementContext)_localctx).d.getLine():0));
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
				((IterationStatementContext)_localctx).fuc = match(For);
				setState(807);
				match(LeftParen);
				setState(808);
				((IterationStatementContext)_localctx).fc = forCondition();
				setState(809);
				match(RightParen);
				setState(810);
				match(Colon);
				((IterationStatementContext)_localctx).iterationStatementRet =  new ForStmt(((IterationStatementContext)_localctx).fc.forConditionRet);_localctx.iterationStatementRet.setLine((((IterationStatementContext)_localctx).fuc!=null?((IterationStatementContext)_localctx).fuc.getLine():0));
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForConditionContext extends ParserRuleContext {
		public ForCondition forConditionRet;
		public ForDeclarationContext f;
		public ExpressionContext e;
		public ForExpressionContext f2;
		public ForExpressionContext f3;
		public List<TerminalNode> Semi() { return getTokens(SimpleLangParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(SimpleLangParser.Semi, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ForConditionContext)_localctx).forConditionRet = new ForCondition();
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(816);
				((ForConditionContext)_localctx).f = forDeclaration();
				_localctx.forConditionRet.setFd(((ForConditionContext)_localctx).f.forDeclarationRet);
				}
				break;
			case 2:
				{
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
					{
					setState(819);
					((ForConditionContext)_localctx).e = expression(0);
					_localctx.forConditionRet.setE(((ForConditionContext)_localctx).e.expressionRet);
					}
				}

				}
				break;
			}
			setState(826);
			match(Semi);
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
				{
				setState(827);
				((ForConditionContext)_localctx).f2 = forExpression();
				_localctx.forConditionRet.setFe1(((ForConditionContext)_localctx).f2.forExpressionRet);
				}
			}

			setState(832);
			match(Semi);
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
				{
				setState(833);
				((ForConditionContext)_localctx).f3 = forExpression();
				_localctx.forConditionRet.setFe2(((ForConditionContext)_localctx).f3.forExpressionRet);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForDeclarationContext extends ParserRuleContext {
		public ForDeclaration forDeclarationRet;
		public DeclarationSpecifiersContext d;
		public InitDeclaratorListContext i;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ForDeclarationContext)_localctx).forDeclarationRet = new ForDeclaration();
			setState(839);
			((ForDeclarationContext)_localctx).d = declarationSpecifiers();
			_localctx.forDeclarationRet.setDeclarationSpecifiers(((ForDeclarationContext)_localctx).d.declarationSpecifiersRet);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 35184372154369L) != 0)) {
				{
				setState(841);
				((ForDeclarationContext)_localctx).i = initDeclaratorList();
				_localctx.forDeclarationRet.setInitDeclaratorList(((ForDeclarationContext)_localctx).i.initDeclaratorListRet);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForExpressionContext extends ParserRuleContext {
		public ForExpression forExpressionRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ForExpressionContext)_localctx).forExpressionRet = new ForExpression();
			setState(847);
			((ForExpressionContext)_localctx).e1 = expression(0);
			_localctx.forExpressionRet.add(((ForExpressionContext)_localctx).e1.expressionRet);
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				{
				setState(849);
				match(Comma);
				setState(850);
				((ForExpressionContext)_localctx).e2 = expression(0);
				}
				_localctx.forExpressionRet.add(((ForExpressionContext)_localctx).e2.expressionRet);
				}
				}
				setState(858);
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
	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatement jumpStatementRet;
		public Token c;
		public Token b;
		public Token r;
		public ExpressionContext e;
		public TerminalNode Newline() { return getToken(SimpleLangParser.Newline, 0); }
		public TerminalNode Continue() { return getToken(SimpleLangParser.Continue, 0); }
		public TerminalNode Break() { return getToken(SimpleLangParser.Break, 0); }
		public TerminalNode Return() { return getToken(SimpleLangParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Continue:
				{
				setState(859);
				((JumpStatementContext)_localctx).c = match(Continue);
				((JumpStatementContext)_localctx).jumpStatementRet = new JumpStatement((((JumpStatementContext)_localctx).c!=null?((JumpStatementContext)_localctx).c.getText():null)); 
				}
				break;
			case Break:
				{
				setState(861);
				((JumpStatementContext)_localctx).b = match(Break);
				((JumpStatementContext)_localctx).jumpStatementRet = new JumpStatement((((JumpStatementContext)_localctx).b!=null?((JumpStatementContext)_localctx).b.getText():null)); 
				}
				break;
			case Return:
				{
				setState(863);
				((JumpStatementContext)_localctx).r = match(Return);
				((JumpStatementContext)_localctx).jumpStatementRet = new JumpStatement((((JumpStatementContext)_localctx).r!=null?((JumpStatementContext)_localctx).r.getText():null)); _localctx.jumpStatementRet.setLine((((JumpStatementContext)_localctx).r!=null?((JumpStatementContext)_localctx).r.getLine():0));
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 49539602426888321L) != 0)) {
					{
					setState(865);
					((JumpStatementContext)_localctx).e = expression(0);
					_localctx.jumpStatementRet.setExpr(((JumpStatementContext)_localctx).e.expressionRet);((JumpStatementContext)_localctx).e.expressionRet.setLine((((JumpStatementContext)_localctx).r!=null?((JumpStatementContext)_localctx).r.getLine():0));
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(872);
			match(Newline);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 18:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 25:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		case 15:
			return precpred(_ctx, 16);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001O\u036b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000U\b\u0000\u0001"+
		"\u0000\u0005\u0000X\b\u0000\n\u0000\f\u0000[\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001c\b"+
		"\u0001\u000b\u0001\f\u0001d\u0001\u0002\u0005\u0002h\b\u0002\n\u0002\f"+
		"\u0002k\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002q\b\u0002\n\u0002\f\u0002t\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002z\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0080\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0087\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008f"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0095"+
		"\b\u0004\u000b\u0004\f\u0004\u0096\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u009f\b\u0005\u000b\u0005"+
		"\f\u0005\u00a0\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00af\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b7\b\u0005\n\u0005"+
		"\f\u0005\u00ba\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005\u00c1\b\u0005\u000b\u0005\f\u0005\u00c2\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00d1\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00e0\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00e8"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0135\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0146\b\u0005\u000b\u0005\f"+
		"\u0005\u0147\u0001\u0005\u0001\u0005\u0005\u0005\u014c\b\u0005\n\u0005"+
		"\f\u0005\u014f\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0159\b\u0006"+
		"\n\u0006\f\u0006\u015c\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u016c\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0184"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u018c\b\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u0194\b\u000b\u000b\u000b\f\u000b\u0195\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u019f\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u01a8\b\r\n\r\f\r\u01ab\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u01b4\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u01cc\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01d4\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u01d9\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u01df\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01ec\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u01f5\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0203\b\u0012\u0003\u0012\u0205\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0209\b\u0012\n\u0012\f\u0012"+
		"\u020c\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0004\u0013\u0213\b\u0013\u000b\u0013\f\u0013\u0214\u0003\u0013\u0217"+
		"\b\u0013\u0004\u0013\u0219\b\u0013\u000b\u0013\f\u0013\u021a\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0226\b\u0014\n\u0014\f\u0014\u0229"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0233\b\u0015\u0003\u0015\u0235"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u023c\b\u0016\n\u0016\f\u0016\u023f\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0246\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0250\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0255\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u025d\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0268\b\u0019\u0001\u0019\u0003\u0019\u026b\b"+
		"\u0019\u0001\u0019\u0003\u0019\u026e\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0277"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0281\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0285\b\u0019\n\u0019\f\u0019\u0288\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0291\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0295\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u029b"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u02a3\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u02a8\b\u001b\n\u001b\f\u001b\u02ab\t\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0004\u001c\u02b1\b\u001c\u000b\u001c\f\u001c"+
		"\u02b2\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u02bf"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u02cd\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u02d1"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u02d6\b\u001f"+
		"\u000b\u001f\f\u001f\u02d7\u0003\u001f\u02da\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u02e4\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u02ea\b!\u0001!\u0004!\u02ed\b!\u000b!\f!\u02ee\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u02f9"+
		"\b\"\n\"\f\"\u02fc\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0005\"\u0305\b\"\n\"\f\"\u0308\t\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u030f\b\"\n\"\f\"\u0312\t\"\u0001\"\u0003\"\u0315\b"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u032e\b#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u0337\b$\u0003$\u0339\b$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u033f\b$\u0001$\u0001$\u0001$\u0001$\u0003$\u0345\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u034d\b%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0005&\u0357\b&\n&\f&\u035a\t&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0365"+
		"\b\'\u0003\'\u0367\b\'\u0001\'\u0001\'\u0001\'\u0000\u0003\n$2(\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0007\u0003\u0000\u0011\u0011%%"+
		"\'\'\u0001\u0000(*\u0002\u0000$$&&\u0001\u0000\"#\u0001\u0000\u001e!\u0001"+
		"\u0000AB\u0005\u0000$$&&((++01\u03c9\u0000P\u0001\u0000\u0000\u0000\u0002"+
		"^\u0001\u0000\u0000\u0000\u0004y\u0001\u0000\u0000\u0000\u0006{\u0001"+
		"\u0000\u0000\u0000\b\u0090\u0001\u0000\u0000\u0000\n\u00e7\u0001\u0000"+
		"\u0000\u0000\f\u0150\u0001\u0000\u0000\u0000\u000e\u015d\u0001\u0000\u0000"+
		"\u0000\u0010\u016b\u0001\u0000\u0000\u0000\u0012\u0183\u0001\u0000\u0000"+
		"\u0000\u0014\u0185\u0001\u0000\u0000\u0000\u0016\u018f\u0001\u0000\u0000"+
		"\u0000\u0018\u019e\u0001\u0000\u0000\u0000\u001a\u01a0\u0001\u0000\u0000"+
		"\u0000\u001c\u01ac\u0001\u0000\u0000\u0000\u001e\u01cb\u0001\u0000\u0000"+
		"\u0000 \u01cd\u0001\u0000\u0000\u0000\"\u01da\u0001\u0000\u0000\u0000"+
		"$\u01eb\u0001\u0000\u0000\u0000&\u020d\u0001\u0000\u0000\u0000(\u021e"+
		"\u0001\u0000\u0000\u0000*\u022a\u0001\u0000\u0000\u0000,\u0236\u0001\u0000"+
		"\u0000\u0000.\u0240\u0001\u0000\u0000\u00000\u0254\u0001\u0000\u0000\u0000"+
		"2\u026d\u0001\u0000\u0000\u00004\u0294\u0001\u0000\u0000\u00006\u0296"+
		"\u0001\u0000\u0000\u00008\u02ac\u0001\u0000\u0000\u0000:\u02be\u0001\u0000"+
		"\u0000\u0000<\u02cc\u0001\u0000\u0000\u0000>\u02ce\u0001\u0000\u0000\u0000"+
		"@\u02e3\u0001\u0000\u0000\u0000B\u02e5\u0001\u0000\u0000\u0000D\u0314"+
		"\u0001\u0000\u0000\u0000F\u032d\u0001\u0000\u0000\u0000H\u032f\u0001\u0000"+
		"\u0000\u0000J\u0346\u0001\u0000\u0000\u0000L\u034e\u0001\u0000\u0000\u0000"+
		"N\u0366\u0001\u0000\u0000\u0000PT\u0006\u0000\uffff\uffff\u0000QR\u0003"+
		"\u0002\u0001\u0000RS\u0006\u0000\uffff\uffff\u0000SU\u0001\u0000\u0000"+
		"\u0000TQ\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UY\u0001\u0000"+
		"\u0000\u0000VX\u0005M\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\u0000\u0000\u0001"+
		"]\u0001\u0001\u0000\u0000\u0000^b\u0006\u0001\uffff\uffff\u0000_`\u0003"+
		"\u0004\u0002\u0000`a\u0006\u0001\uffff\uffff\u0000ac\u0001\u0000\u0000"+
		"\u0000b_\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000e\u0003\u0001\u0000\u0000\u0000"+
		"fh\u0005M\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000lm\u0003\u0006\u0003\u0000mn\u0006\u0002"+
		"\uffff\uffff\u0000nz\u0001\u0000\u0000\u0000oq\u0005M\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000uv\u0003\u0014\n\u0000vw\u0006\u0002\uffff\uffff\u0000wz\u0001\u0000"+
		"\u0000\u0000xz\u00054\u0000\u0000yi\u0001\u0000\u0000\u0000yr\u0001\u0000"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0005\u0001\u0000\u0000\u0000"+
		"{\u007f\u0006\u0003\uffff\uffff\u0000|}\u0003\u0016\u000b\u0000}~\u0006"+
		"\u0003\uffff\uffff\u0000~\u0080\u0001\u0000\u0000\u0000\u007f|\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0003\"\u0011\u0000\u0082\u0086\u0006\u0003\uffff"+
		"\uffff\u0000\u0083\u0084\u0003\b\u0004\u0000\u0084\u0085\u0006\u0003\uffff"+
		"\uffff\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u00053\u0000\u0000\u0089\u008a\u0005M\u0000\u0000"+
		"\u008a\u008b\u0003>\u001f\u0000\u008b\u008c\u0006\u0003\uffff\uffff\u0000"+
		"\u008c\u008e\u0005\u0001\u0000\u0000\u008d\u008f\u0005K\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0007\u0001\u0000\u0000\u0000\u0090\u0094\u0006\u0004\uffff\uffff\u0000"+
		"\u0091\u0092\u0003\u0014\n\u0000\u0092\u0093\u0006\u0004\uffff\uffff\u0000"+
		"\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\t\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0006\u0005\uffff\uffff\u0000\u0099\u009a\u0005E\u0000\u0000\u009a"+
		"\u00e8\u0006\u0005\uffff\uffff\u0000\u009b\u009c\u0005F\u0000\u0000\u009c"+
		"\u00e8\u0006\u0005\uffff\uffff\u0000\u009d\u009f\u0005H\u0000\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00e8\u0006\u0005\uffff\uffff\u0000"+
		"\u00a3\u00a4\u0005\u0018\u0000\u0000\u00a4\u00a5\u0003\n\u0005\u0000\u00a5"+
		"\u00a6\u0006\u0005\uffff\uffff\u0000\u00a6\u00a7\u0005\u0019\u0000\u0000"+
		"\u00a7\u00e8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0018\u0000\u0000"+
		"\u00a9\u00aa\u0003.\u0017\u0000\u00aa\u00ab\u0005\u0019\u0000\u0000\u00ab"+
		"\u00ac\u0005\u001c\u0000\u0000\u00ac\u00ae\u00036\u001b\u0000\u00ad\u00af"+
		"\u00055\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"\u001d\u0000\u0000\u00b1\u00b2\u0006\u0005\uffff\uffff\u0000\u00b2\u00e8"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b8\u0006\u0005\uffff\uffff\u0000\u00b4"+
		"\u00b5\u0007\u0000\u0000\u0000\u00b5\u00b7\u0006\u0005\uffff\uffff\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00df\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005E\u0000\u0000\u00bc\u00e0\u0006\u0005\uffff\uffff\u0000"+
		"\u00bd\u00be\u0005F\u0000\u0000\u00be\u00e0\u0006\u0005\uffff\uffff\u0000"+
		"\u00bf\u00c1\u0005H\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4"+
		"\u00e0\u0006\u0005\uffff\uffff\u0000\u00c5\u00c6\u0005\u0018\u0000\u0000"+
		"\u00c6\u00c7\u0003\n\u0005\u0000\u00c7\u00c8\u0005\u0019\u0000\u0000\u00c8"+
		"\u00c9\u0006\u0005\uffff\uffff\u0000\u00c9\u00e0\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005\u0018\u0000\u0000\u00cb\u00cc\u0003.\u0017\u0000\u00cc"+
		"\u00cd\u0005\u0019\u0000\u0000\u00cd\u00ce\u0005\u001c\u0000\u0000\u00ce"+
		"\u00d0\u00036\u001b\u0000\u00cf\u00d1\u00055\u0000\u0000\u00d0\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\u001d\u0000\u0000\u00d3\u00d4\u0006"+
		"\u0005\uffff\uffff\u0000\u00d4\u00e0\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0003\u000e\u0007\u0000\u00d6\u00d7\u0003\u0010\b\u0000\u00d7\u00d8\u0006"+
		"\u0005\uffff\uffff\u0000\u00d8\u00e0\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0005\u0011\u0000\u0000\u00da\u00db\u0005\u0018\u0000\u0000\u00db\u00dc"+
		"\u0003.\u0017\u0000\u00dc\u00dd\u0005\u0019\u0000\u0000\u00dd\u00de\u0006"+
		"\u0005\uffff\uffff\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00bb"+
		"\u0001\u0000\u0000\u0000\u00df\u00bd\u0001\u0000\u0000\u0000\u00df\u00c0"+
		"\u0001\u0000\u0000\u0000\u00df\u00c5\u0001\u0000\u0000\u0000\u00df\u00ca"+
		"\u0001\u0000\u0000\u0000\u00df\u00d5\u0001\u0000\u0000\u0000\u00df\u00d9"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e8\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0005\u0018\u0000\u0000\u00e2\u00e3\u0003.\u0017\u0000\u00e3\u00e4\u0005"+
		"\u0019\u0000\u0000\u00e4\u00e5\u0003\u0010\b\u0000\u00e5\u00e6\u0006\u0005"+
		"\uffff\uffff\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u0098\u0001"+
		"\u0000\u0000\u0000\u00e7\u009b\u0001\u0000\u0000\u0000\u00e7\u009e\u0001"+
		"\u0000\u0000\u0000\u00e7\u00a3\u0001\u0000\u0000\u0000\u00e7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00e7\u00b3\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e8\u014d\u0001\u0000\u0000\u0000\u00e9\u00ea\n\r"+
		"\u0000\u0000\u00ea\u00eb\u0007\u0001\u0000\u0000\u00eb\u00ec\u0003\n\u0005"+
		"\u000e\u00ec\u00ed\u0006\u0005\uffff\uffff\u0000\u00ed\u014c\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\n\f\u0000\u0000\u00ef\u00f0\u0007\u0002\u0000"+
		"\u0000\u00f0\u00f1\u0003\n\u0005\r\u00f1\u00f2\u0006\u0005\uffff\uffff"+
		"\u0000\u00f2\u014c\u0001\u0000\u0000\u0000\u00f3\u00f4\n\u000b\u0000\u0000"+
		"\u00f4\u00f5\u0007\u0003\u0000\u0000\u00f5\u00f6\u0003\n\u0005\f\u00f6"+
		"\u00f7\u0006\u0005\uffff\uffff\u0000\u00f7\u014c\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\n\n\u0000\u0000\u00f9\u00fa\u0007\u0004\u0000\u0000\u00fa"+
		"\u00fb\u0003\n\u0005\u000b\u00fb\u00fc\u0006\u0005\uffff\uffff\u0000\u00fc"+
		"\u014c\u0001\u0000\u0000\u0000\u00fd\u00fe\n\t\u0000\u0000\u00fe\u00ff"+
		"\u0007\u0005\u0000\u0000\u00ff\u0100\u0003\n\u0005\n\u0100\u0101\u0006"+
		"\u0005\uffff\uffff\u0000\u0101\u014c\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\n\b\u0000\u0000\u0103\u0104\u0005+\u0000\u0000\u0104\u0105\u0003\n\u0005"+
		"\t\u0105\u0106\u0006\u0005\uffff\uffff\u0000\u0106\u014c\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\n\u0007\u0000\u0000\u0108\u0109\u0005/\u0000\u0000"+
		"\u0109\u010a\u0003\n\u0005\b\u010a\u010b\u0006\u0005\uffff\uffff\u0000"+
		"\u010b\u014c\u0001\u0000\u0000\u0000\u010c\u010d\n\u0006\u0000\u0000\u010d"+
		"\u010e\u0005,\u0000\u0000\u010e\u010f\u0003\n\u0005\u0007\u010f\u0110"+
		"\u0006\u0005\uffff\uffff\u0000\u0110\u014c\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\n\u0005\u0000\u0000\u0112\u0113\u0005-\u0000\u0000\u0113\u0114"+
		"\u0003\n\u0005\u0006\u0114\u0115\u0006\u0005\uffff\uffff\u0000\u0115\u014c"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\n\u0004\u0000\u0000\u0117\u0118\u0005"+
		".\u0000\u0000\u0118\u0119\u0003\n\u0005\u0005\u0119\u011a\u0006\u0005"+
		"\uffff\uffff\u0000\u011a\u014c\u0001\u0000\u0000\u0000\u011b\u011c\n\u0003"+
		"\u0000\u0000\u011c\u011d\u00052\u0000\u0000\u011d\u011e\u0003\n\u0005"+
		"\u0000\u011e\u011f\u00053\u0000\u0000\u011f\u0120\u0003\n\u0005\u0004"+
		"\u0120\u0121\u0006\u0005\uffff\uffff\u0000\u0121\u014c\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\n\u0002\u0000\u0000\u0123\u0124\u0003\u0012\t\u0000"+
		"\u0124\u0125\u0003\n\u0005\u0003\u0125\u0126\u0006\u0005\uffff\uffff\u0000"+
		"\u0126\u014c\u0001\u0000\u0000\u0000\u0127\u0128\n\u0013\u0000\u0000\u0128"+
		"\u0129\u0005\u001a\u0000\u0000\u0129\u012a\u0003\n\u0005\u0000\u012a\u012b"+
		"\u0005\u001b\u0000\u0000\u012b\u012c\u0006\u0005\uffff\uffff\u0000\u012c"+
		"\u014c\u0001\u0000\u0000\u0000\u012d\u012e\n\u0012\u0000\u0000\u012e\u012f"+
		"\u0006\u0005\uffff\uffff\u0000\u012f\u0130\u0005\u0018\u0000\u0000\u0130"+
		"\u0134\u0006\u0005\uffff\uffff\u0000\u0131\u0132\u0003\f\u0006\u0000\u0132"+
		"\u0133\u0006\u0005\uffff\uffff\u0000\u0133\u0135\u0001\u0000\u0000\u0000"+
		"\u0134\u0131\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u0019\u0000\u0000"+
		"\u0137\u014c\u0006\u0005\uffff\uffff\u0000\u0138\u0139\n\u0011\u0000\u0000"+
		"\u0139\u013a\u0005%\u0000\u0000\u013a\u014c\u0006\u0005\uffff\uffff\u0000"+
		"\u013b\u013c\n\u0010\u0000\u0000\u013c\u013d\u0005\'\u0000\u0000\u013d"+
		"\u014c\u0006\u0005\uffff\uffff\u0000\u013e\u013f\n\u0001\u0000\u0000\u013f"+
		"\u0140\u0006\u0005\uffff\uffff\u0000\u0140\u0145\u0006\u0005\uffff\uffff"+
		"\u0000\u0141\u0142\u00055\u0000\u0000\u0142\u0143\u0003\n\u0005\u0000"+
		"\u0143\u0144\u0006\u0005\uffff\uffff\u0000\u0144\u0146\u0001\u0000\u0000"+
		"\u0000\u0145\u0141\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0006\u0005\uffff"+
		"\uffff\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u00e9\u0001\u0000"+
		"\u0000\u0000\u014b\u00ee\u0001\u0000\u0000\u0000\u014b\u00f3\u0001\u0000"+
		"\u0000\u0000\u014b\u00f8\u0001\u0000\u0000\u0000\u014b\u00fd\u0001\u0000"+
		"\u0000\u0000\u014b\u0102\u0001\u0000\u0000\u0000\u014b\u0107\u0001\u0000"+
		"\u0000\u0000\u014b\u010c\u0001\u0000\u0000\u0000\u014b\u0111\u0001\u0000"+
		"\u0000\u0000\u014b\u0116\u0001\u0000\u0000\u0000\u014b\u011b\u0001\u0000"+
		"\u0000\u0000\u014b\u0122\u0001\u0000\u0000\u0000\u014b\u0127\u0001\u0000"+
		"\u0000\u0000\u014b\u012d\u0001\u0000\u0000\u0000\u014b\u0138\u0001\u0000"+
		"\u0000\u0000\u014b\u013b\u0001\u0000\u0000\u0000\u014b\u013e\u0001\u0000"+
		"\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u000b\u0001\u0000"+
		"\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0151\u0006\u0006"+
		"\uffff\uffff\u0000\u0151\u0152\u0003\n\u0005\u0000\u0152\u015a\u0006\u0006"+
		"\uffff\uffff\u0000\u0153\u0154\u00055\u0000\u0000\u0154\u0155\u0003\n"+
		"\u0005\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0006\u0006"+
		"\uffff\uffff\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0153\u0001"+
		"\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\r\u0001\u0000"+
		"\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0007\u0006"+
		"\u0000\u0000\u015e\u015f\u0006\u0007\uffff\uffff\u0000\u015f\u000f\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0005\u0018\u0000\u0000\u0161\u0162\u0003"+
		".\u0017\u0000\u0162\u0163\u0005\u0019\u0000\u0000\u0163\u0164\u0003\u0010"+
		"\b\u0000\u0164\u0165\u0006\b\uffff\uffff\u0000\u0165\u016c\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0003\n\u0005\u0000\u0167\u0168\u0006\b\uffff"+
		"\uffff\u0000\u0168\u016c\u0001\u0000\u0000\u0000\u0169\u016a\u0005G\u0000"+
		"\u0000\u016a\u016c\u0006\b\uffff\uffff\u0000\u016b\u0160\u0001\u0000\u0000"+
		"\u0000\u016b\u0166\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016c\u0011\u0001\u0000\u0000\u0000\u016d\u016e\u00056\u0000\u0000"+
		"\u016e\u0184\u0006\t\uffff\uffff\u0000\u016f\u0170\u00057\u0000\u0000"+
		"\u0170\u0184\u0006\t\uffff\uffff\u0000\u0171\u0172\u00058\u0000\u0000"+
		"\u0172\u0184\u0006\t\uffff\uffff\u0000\u0173\u0174\u00059\u0000\u0000"+
		"\u0174\u0184\u0006\t\uffff\uffff\u0000\u0175\u0176\u0005:\u0000\u0000"+
		"\u0176\u0184\u0006\t\uffff\uffff\u0000\u0177\u0178\u0005;\u0000\u0000"+
		"\u0178\u0184\u0006\t\uffff\uffff\u0000\u0179\u017a\u0005<\u0000\u0000"+
		"\u017a\u0184\u0006\t\uffff\uffff\u0000\u017b\u017c\u0005=\u0000\u0000"+
		"\u017c\u0184\u0006\t\uffff\uffff\u0000\u017d\u017e\u0005>\u0000\u0000"+
		"\u017e\u0184\u0006\t\uffff\uffff\u0000\u017f\u0180\u0005?\u0000\u0000"+
		"\u0180\u0184\u0006\t\uffff\uffff\u0000\u0181\u0182\u0005@\u0000\u0000"+
		"\u0182\u0184\u0006\t\uffff\uffff\u0000\u0183\u016d\u0001\u0000\u0000\u0000"+
		"\u0183\u016f\u0001\u0000\u0000\u0000\u0183\u0171\u0001\u0000\u0000\u0000"+
		"\u0183\u0173\u0001\u0000\u0000\u0000\u0183\u0175\u0001\u0000\u0000\u0000"+
		"\u0183\u0177\u0001\u0000\u0000\u0000\u0183\u0179\u0001\u0000\u0000\u0000"+
		"\u0183\u017b\u0001\u0000\u0000\u0000\u0183\u017d\u0001\u0000\u0000\u0000"+
		"\u0183\u017f\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000"+
		"\u0184\u0013\u0001\u0000\u0000\u0000\u0185\u0186\u0006\n\uffff\uffff\u0000"+
		"\u0186\u0187\u0003\u0016\u000b\u0000\u0187\u018b\u0006\n\uffff\uffff\u0000"+
		"\u0188\u0189\u0003\u001a\r\u0000\u0189\u018a\u0006\n\uffff\uffff\u0000"+
		"\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0188\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0005M\u0000\u0000\u018e\u0015\u0001\u0000\u0000\u0000\u018f"+
		"\u0193\u0006\u000b\uffff\uffff\u0000\u0190\u0191\u0003\u0018\f\u0000\u0191"+
		"\u0192\u0006\u000b\uffff\uffff\u0000\u0192\u0194\u0001\u0000\u0000\u0000"+
		"\u0193\u0190\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000"+
		"\u0196\u0017\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u0013\u0000\u0000"+
		"\u0198\u019f\u0006\f\uffff\uffff\u0000\u0199\u019a\u0003\u001e\u000f\u0000"+
		"\u019a\u019b\u0006\f\uffff\uffff\u0000\u019b\u019f\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0005\u0004\u0000\u0000\u019d\u019f\u0006\f\uffff\uffff\u0000"+
		"\u019e\u0197\u0001\u0000\u0000\u0000\u019e\u0199\u0001\u0000\u0000\u0000"+
		"\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u0019\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0006\r\uffff\uffff\u0000\u01a1\u01a2\u0003\u001c\u000e\u0000"+
		"\u01a2\u01a9\u0006\r\uffff\uffff\u0000\u01a3\u01a4\u00055\u0000\u0000"+
		"\u01a4\u01a5\u0003\u001c\u000e\u0000\u01a5\u01a6\u0006\r\uffff\uffff\u0000"+
		"\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u001b\u0001\u0000\u0000\u0000"+
		"\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad\u0006\u000e\uffff\uffff"+
		"\u0000\u01ad\u01ae\u0003\"\u0011\u0000\u01ae\u01b3\u0006\u000e\uffff\uffff"+
		"\u0000\u01af\u01b0\u00056\u0000\u0000\u01b0\u01b1\u00034\u001a\u0000\u01b1"+
		"\u01b2\u0006\u000e\uffff\uffff\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b3\u01af\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4\u001d\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005\u0015\u0000\u0000"+
		"\u01b6\u01cc\u0006\u000f\uffff\uffff\u0000\u01b7\u01b8\u0005\u0003\u0000"+
		"\u0000\u01b8\u01cc\u0006\u000f\uffff\uffff\u0000\u01b9\u01ba\u0005\u000f"+
		"\u0000\u0000\u01ba\u01cc\u0006\u000f\uffff\uffff\u0000\u01bb\u01bc\u0005"+
		"\f\u0000\u0000\u01bc\u01cc\u0006\u000f\uffff\uffff\u0000\u01bd\u01be\u0005"+
		"\r\u0000\u0000\u01be\u01cc\u0006\u000f\uffff\uffff\u0000\u01bf\u01c0\u0005"+
		"\t\u0000\u0000\u01c0\u01cc\u0006\u000f\uffff\uffff\u0000\u01c1\u01c2\u0005"+
		"\u0007\u0000\u0000\u01c2\u01cc\u0006\u000f\uffff\uffff\u0000\u01c3\u01c4"+
		"\u0005\u0010\u0000\u0000\u01c4\u01cc\u0006\u000f\uffff\uffff\u0000\u01c5"+
		"\u01c6\u0005\u0014\u0000\u0000\u01c6\u01cc\u0006\u000f\uffff\uffff\u0000"+
		"\u01c7\u01c8\u0005\u0017\u0000\u0000\u01c8\u01cc\u0006\u000f\uffff\uffff"+
		"\u0000\u01c9\u01ca\u0005E\u0000\u0000\u01ca\u01cc\u0006\u000f\uffff\uffff"+
		"\u0000\u01cb\u01b5\u0001\u0000\u0000\u0000\u01cb\u01b7\u0001\u0000\u0000"+
		"\u0000\u01cb\u01b9\u0001\u0000\u0000\u0000\u01cb\u01bb\u0001\u0000\u0000"+
		"\u0000\u01cb\u01bd\u0001\u0000\u0000\u0000\u01cb\u01bf\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c1\u0001\u0000\u0000\u0000\u01cb\u01c3\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c5\u0001\u0000\u0000\u0000\u01cb\u01c7\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u001f\u0001\u0000\u0000"+
		"\u0000\u01cd\u01d3\u0006\u0010\uffff\uffff\u0000\u01ce\u01cf\u0003\u001e"+
		"\u000f\u0000\u01cf\u01d0\u0006\u0010\uffff\uffff\u0000\u01d0\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d2\u0006\u0010\uffff\uffff\u0000\u01d2\u01d4"+
		"\u0005\u0004\u0000\u0000\u01d3\u01ce\u0001\u0000\u0000\u0000\u01d3\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d8\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0003 \u0010\u0000\u01d6\u01d7\u0006\u0010\uffff\uffff\u0000\u01d7\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d5\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9!\u0001\u0000\u0000\u0000\u01da\u01de\u0006"+
		"\u0011\uffff\uffff\u0000\u01db\u01dc\u0003&\u0013\u0000\u01dc\u01dd\u0006"+
		"\u0011\uffff\uffff\u0000\u01dd\u01df\u0001\u0000\u0000\u0000\u01de\u01db"+
		"\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e0\u01e1\u0003$\u0012\u0000\u01e1\u01e2\u0006"+
		"\u0011\uffff\uffff\u0000\u01e2#\u0001\u0000\u0000\u0000\u01e3\u01e4\u0006"+
		"\u0012\uffff\uffff\u0000\u01e4\u01e5\u0005E\u0000\u0000\u01e5\u01ec\u0006"+
		"\u0012\uffff\uffff\u0000\u01e6\u01e7\u0005\u0018\u0000\u0000\u01e7\u01e8"+
		"\u0003\"\u0011\u0000\u01e8\u01e9\u0006\u0012\uffff\uffff\u0000\u01e9\u01ea"+
		"\u0005\u0019\u0000\u0000\u01ea\u01ec\u0001\u0000\u0000\u0000\u01eb\u01e3"+
		"\u0001\u0000\u0000\u0000\u01eb\u01e6\u0001\u0000\u0000\u0000\u01ec\u020a"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ee\n\u0002\u0000\u0000\u01ee\u01ef\u0006"+
		"\u0012\uffff\uffff\u0000\u01ef\u01f0\u0006\u0012\uffff\uffff\u0000\u01f0"+
		"\u01f4\u0005\u001a\u0000\u0000\u01f1\u01f2\u0003\n\u0005\u0000\u01f2\u01f3"+
		"\u0006\u0012\uffff\uffff\u0000\u01f3\u01f5\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u001b\u0000\u0000\u01f7"+
		"\u0209\u0006\u0012\uffff\uffff\u0000\u01f8\u01f9\n\u0001\u0000\u0000\u01f9"+
		"\u01fa\u0006\u0012\uffff\uffff\u0000\u01fa\u01fb\u0006\u0012\uffff\uffff"+
		"\u0000\u01fb\u0204\u0005\u0018\u0000\u0000\u01fc\u01fd\u0003(\u0014\u0000"+
		"\u01fd\u01fe\u0006\u0012\uffff\uffff\u0000\u01fe\u0205\u0001\u0000\u0000"+
		"\u0000\u01ff\u0200\u0003,\u0016\u0000\u0200\u0201\u0006\u0012\uffff\uffff"+
		"\u0000\u0201\u0203\u0001\u0000\u0000\u0000\u0202\u01ff\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u0001\u0000\u0000"+
		"\u0000\u0204\u01fc\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000"+
		"\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0207\u0005\u0019\u0000"+
		"\u0000\u0207\u0209\u0006\u0012\uffff\uffff\u0000\u0208\u01ed\u0001\u0000"+
		"\u0000\u0000\u0208\u01f8\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000"+
		"\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000"+
		"\u0000\u0000\u020b%\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000"+
		"\u0000\u020d\u0218\u0006\u0013\uffff\uffff\u0000\u020e\u020f\u0005(\u0000"+
		"\u0000\u020f\u0210\u0006\u0013\uffff\uffff\u0000\u0210\u0216\u0001\u0000"+
		"\u0000\u0000\u0211\u0213\u0005\u0004\u0000\u0000\u0212\u0211\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0217\u0001\u0000"+
		"\u0000\u0000\u0216\u0212\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000"+
		"\u0000\u0000\u0217\u0219\u0001\u0000\u0000\u0000\u0218\u020e\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000"+
		"\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u0006\u0013\uffff\uffff\u0000\u021d\'\u0001\u0000"+
		"\u0000\u0000\u021e\u021f\u0006\u0014\uffff\uffff\u0000\u021f\u0220\u0003"+
		"*\u0015\u0000\u0220\u0227\u0006\u0014\uffff\uffff\u0000\u0221\u0222\u0005"+
		"5\u0000\u0000\u0222\u0223\u0003*\u0015\u0000\u0223\u0224\u0006\u0014\uffff"+
		"\uffff\u0000\u0224\u0226\u0001\u0000\u0000\u0000\u0225\u0221\u0001\u0000"+
		"\u0000\u0000\u0226\u0229\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228)\u0001\u0000\u0000"+
		"\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u022a\u022b\u0003\u0016\u000b"+
		"\u0000\u022b\u0234\u0006\u0015\uffff\uffff\u0000\u022c\u022d\u0003\"\u0011"+
		"\u0000\u022d\u022e\u0006\u0015\uffff\uffff\u0000\u022e\u0235\u0001\u0000"+
		"\u0000\u0000\u022f\u0230\u00030\u0018\u0000\u0230\u0231\u0006\u0015\uffff"+
		"\uffff\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u022f\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0235\u0001\u0000"+
		"\u0000\u0000\u0234\u022c\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000"+
		"\u0000\u0000\u0235+\u0001\u0000\u0000\u0000\u0236\u0237\u0005E\u0000\u0000"+
		"\u0237\u023d\u0006\u0016\uffff\uffff\u0000\u0238\u0239\u00055\u0000\u0000"+
		"\u0239\u023a\u0005E\u0000\u0000\u023a\u023c\u0006\u0016\uffff\uffff\u0000"+
		"\u023b\u0238\u0001\u0000\u0000\u0000\u023c\u023f\u0001\u0000\u0000\u0000"+
		"\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000"+
		"\u023e-\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u0240"+
		"\u0241\u0003 \u0010\u0000\u0241\u0245\u0006\u0017\uffff\uffff\u0000\u0242"+
		"\u0243\u00030\u0018\u0000\u0243\u0244\u0006\u0017\uffff\uffff\u0000\u0244"+
		"\u0246\u0001\u0000\u0000\u0000\u0245\u0242\u0001\u0000\u0000\u0000\u0245"+
		"\u0246\u0001\u0000\u0000\u0000\u0246/\u0001\u0000\u0000\u0000\u0247\u0248"+
		"\u0006\u0018\uffff\uffff\u0000\u0248\u0249\u0003&\u0013\u0000\u0249\u024a"+
		"\u0006\u0018\uffff\uffff\u0000\u024a\u0255\u0001\u0000\u0000\u0000\u024b"+
		"\u024f\u0006\u0018\uffff\uffff\u0000\u024c\u024d\u0003&\u0013\u0000\u024d"+
		"\u024e\u0006\u0018\uffff\uffff\u0000\u024e\u0250\u0001\u0000\u0000\u0000"+
		"\u024f\u024c\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252\u00032\u0019\u0000\u0252"+
		"\u0253\u0006\u0018\uffff\uffff\u0000\u0253\u0255\u0001\u0000\u0000\u0000"+
		"\u0254\u0247\u0001\u0000\u0000\u0000\u0254\u024b\u0001\u0000\u0000\u0000"+
		"\u02551\u0001\u0000\u0000\u0000\u0256\u0257\u0006\u0019\uffff\uffff\u0000"+
		"\u0257\u0258\u0006\u0019\uffff\uffff\u0000\u0258\u025c\u0005\u001a\u0000"+
		"\u0000\u0259\u025a\u0003\n\u0005\u0000\u025a\u025b\u0006\u0019\uffff\uffff"+
		"\u0000\u025b\u025d\u0001\u0000\u0000\u0000\u025c\u0259\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000"+
		"\u0000\u025e\u026e\u0005\u001b\u0000\u0000\u025f\u026a\u0005\u0018\u0000"+
		"\u0000\u0260\u0261\u00030\u0018\u0000\u0261\u0262\u0006\u0019\uffff\uffff"+
		"\u0000\u0262\u026b\u0001\u0000\u0000\u0000\u0263\u0267\u0006\u0019\uffff"+
		"\uffff\u0000\u0264\u0265\u0003(\u0014\u0000\u0265\u0266\u0006\u0019\uffff"+
		"\uffff\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0264\u0001\u0000"+
		"\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000"+
		"\u0000\u0000\u0269\u026b\u0006\u0019\uffff\uffff\u0000\u026a\u0260\u0001"+
		"\u0000\u0000\u0000\u026a\u0263\u0001\u0000\u0000\u0000\u026b\u026c\u0001"+
		"\u0000\u0000\u0000\u026c\u026e\u0005\u0019\u0000\u0000\u026d\u0256\u0001"+
		"\u0000\u0000\u0000\u026d\u025f\u0001\u0000\u0000\u0000\u026e\u0286\u0001"+
		"\u0000\u0000\u0000\u026f\u0270\n\u0002\u0000\u0000\u0270\u0271\u0006\u0019"+
		"\uffff\uffff\u0000\u0271\u0272\u0006\u0019\uffff\uffff\u0000\u0272\u0276"+
		"\u0005\u001a\u0000\u0000\u0273\u0274\u0003\n\u0005\u0000\u0274\u0275\u0006"+
		"\u0019\uffff\uffff\u0000\u0275\u0277\u0001\u0000\u0000\u0000\u0276\u0273"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0278"+
		"\u0001\u0000\u0000\u0000\u0278\u0279\u0006\u0019\uffff\uffff\u0000\u0279"+
		"\u0285\u0005\u001b\u0000\u0000\u027a\u027b\n\u0001\u0000\u0000\u027b\u027c"+
		"\u0006\u0019\uffff\uffff\u0000\u027c\u0280\u0005\u0018\u0000\u0000\u027d"+
		"\u027e\u0003(\u0014\u0000\u027e\u027f\u0006\u0019\uffff\uffff\u0000\u027f"+
		"\u0281\u0001\u0000\u0000\u0000\u0280\u027d\u0001\u0000\u0000\u0000\u0280"+
		"\u0281\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282"+
		"\u0283\u0005\u0019\u0000\u0000\u0283\u0285\u0006\u0019\uffff\uffff\u0000"+
		"\u0284\u026f\u0001\u0000\u0000\u0000\u0284\u027a\u0001\u0000\u0000\u0000"+
		"\u0285\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000"+
		"\u0286\u0287\u0001\u0000\u0000\u0000\u02873\u0001\u0000\u0000\u0000\u0288"+
		"\u0286\u0001\u0000\u0000\u0000\u0289\u028a\u0003\n\u0005\u0000\u028a\u028b"+
		"\u0006\u001a\uffff\uffff\u0000\u028b\u0295\u0001\u0000\u0000\u0000\u028c"+
		"\u028d\u0005\u001c\u0000\u0000\u028d\u028e\u00036\u001b\u0000\u028e\u0290"+
		"\u0006\u001a\uffff\uffff\u0000\u028f\u0291\u00055\u0000\u0000\u0290\u028f"+
		"\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0292"+
		"\u0001\u0000\u0000\u0000\u0292\u0293\u0005\u001d\u0000\u0000\u0293\u0295"+
		"\u0001\u0000\u0000\u0000\u0294\u0289\u0001\u0000\u0000\u0000\u0294\u028c"+
		"\u0001\u0000\u0000\u0000\u02955\u0001\u0000\u0000\u0000\u0296\u029a\u0006"+
		"\u001b\uffff\uffff\u0000\u0297\u0298\u00038\u001c\u0000\u0298\u0299\u0006"+
		"\u001b\uffff\uffff\u0000\u0299\u029b\u0001\u0000\u0000\u0000\u029a\u0297"+
		"\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029b\u029c"+
		"\u0001\u0000\u0000\u0000\u029c\u029d\u00034\u001a\u0000\u029d\u02a9\u0006"+
		"\u001b\uffff\uffff\u0000\u029e\u02a2\u00055\u0000\u0000\u029f\u02a0\u0003"+
		"8\u001c\u0000\u02a0\u02a1\u0006\u001b\uffff\uffff\u0000\u02a1\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a2\u029f\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a5\u0003"+
		"4\u001a\u0000\u02a5\u02a6\u0006\u001b\uffff\uffff\u0000\u02a6\u02a8\u0001"+
		"\u0000\u0000\u0000\u02a7\u029e\u0001\u0000\u0000\u0000\u02a8\u02ab\u0001"+
		"\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001"+
		"\u0000\u0000\u0000\u02aa7\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000"+
		"\u0000\u0000\u02ac\u02b0\u0006\u001c\uffff\uffff\u0000\u02ad\u02ae\u0003"+
		":\u001d\u0000\u02ae\u02af\u0006\u001c\uffff\uffff\u0000\u02af\u02b1\u0001"+
		"\u0000\u0000\u0000\u02b0\u02ad\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b5\u0005"+
		"6\u0000\u0000\u02b59\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005\u001a\u0000"+
		"\u0000\u02b7\u02b8\u0003\n\u0005\u0000\u02b8\u02b9\u0006\u001d\uffff\uffff"+
		"\u0000\u02b9\u02ba\u0005\u001b\u0000\u0000\u02ba\u02bf\u0001\u0000\u0000"+
		"\u0000\u02bb\u02bc\u0005D\u0000\u0000\u02bc\u02bd\u0005E\u0000\u0000\u02bd"+
		"\u02bf\u0006\u001d\uffff\uffff\u0000\u02be\u02b6\u0001\u0000\u0000\u0000"+
		"\u02be\u02bb\u0001\u0000\u0000\u0000\u02bf;\u0001\u0000\u0000\u0000\u02c0"+
		"\u02c1\u0003B!\u0000\u02c1\u02c2\u0006\u001e\uffff\uffff\u0000\u02c2\u02cd"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c4\u0003D\"\u0000\u02c4\u02c5\u0006"+
		"\u001e\uffff\uffff\u0000\u02c5\u02cd\u0001\u0000\u0000\u0000\u02c6\u02c7"+
		"\u0003F#\u0000\u02c7\u02c8\u0006\u001e\uffff\uffff\u0000\u02c8\u02cd\u0001"+
		"\u0000\u0000\u0000\u02c9\u02ca\u0003N\'\u0000\u02ca\u02cb\u0006\u001e"+
		"\uffff\uffff\u0000\u02cb\u02cd\u0001\u0000\u0000\u0000\u02cc\u02c0\u0001"+
		"\u0000\u0000\u0000\u02cc\u02c3\u0001\u0000\u0000\u0000\u02cc\u02c6\u0001"+
		"\u0000\u0000\u0000\u02cc\u02c9\u0001\u0000\u0000\u0000\u02cd=\u0001\u0000"+
		"\u0000\u0000\u02ce\u02d9\u0006\u001f\uffff\uffff\u0000\u02cf\u02d1\u0005"+
		"K\u0000\u0000\u02d0\u02cf\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000"+
		"\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d3\u0003@ \u0000"+
		"\u02d3\u02d4\u0006\u001f\uffff\uffff\u0000\u02d4\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d5\u02d0\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000"+
		"\u0000\u02d8\u02da\u0001\u0000\u0000\u0000\u02d9\u02d5\u0001\u0000\u0000"+
		"\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da?\u0001\u0000\u0000\u0000"+
		"\u02db\u02dc\u0006 \uffff\uffff\u0000\u02dc\u02dd\u0003<\u001e\u0000\u02dd"+
		"\u02de\u0006 \uffff\uffff\u0000\u02de\u02e4\u0001\u0000\u0000\u0000\u02df"+
		"\u02e0\u0006 \uffff\uffff\u0000\u02e0\u02e1\u0003\u0014\n\u0000\u02e1"+
		"\u02e2\u0006 \uffff\uffff\u0000\u02e2\u02e4\u0001\u0000\u0000\u0000\u02e3"+
		"\u02db\u0001\u0000\u0000\u0000\u02e3\u02df\u0001\u0000\u0000\u0000\u02e4"+
		"A\u0001\u0000\u0000\u0000\u02e5\u02e9\u0006!\uffff\uffff\u0000\u02e6\u02e7"+
		"\u0003\n\u0005\u0000\u02e7\u02e8\u0006!\uffff\uffff\u0000\u02e8\u02ea"+
		"\u0001\u0000\u0000\u0000\u02e9\u02e6\u0001\u0000\u0000\u0000\u02e9\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ea\u02ec\u0001\u0000\u0000\u0000\u02eb\u02ed"+
		"\u0005M\u0000\u0000\u02ec\u02eb\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001"+
		"\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001"+
		"\u0000\u0000\u0000\u02efC\u0001\u0000\u0000\u0000\u02f0\u02f1\u0006\""+
		"\uffff\uffff\u0000\u02f1\u02f2\u0005\u000b\u0000\u0000\u02f2\u02f3\u0005"+
		"\u0018\u0000\u0000\u02f3\u02f4\u0003\n\u0005\u0000\u02f4\u02f5\u0006\""+
		"\uffff\uffff\u0000\u02f5\u02f6\u0005\u0019\u0000\u0000\u02f6\u02fa\u0005"+
		"3\u0000\u0000\u02f7\u02f9\u0005M\u0000\u0000\u02f8\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f9\u02fc\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u0315\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fd\u02fe\u0005\b\u0000\u0000"+
		"\u02fe\u02ff\u0005\u000b\u0000\u0000\u02ff\u0300\u0005\u0018\u0000\u0000"+
		"\u0300\u0301\u0003\n\u0005\u0000\u0301\u0302\u0005\u0019\u0000\u0000\u0302"+
		"\u0306\u00053\u0000\u0000\u0303\u0305\u0005M\u0000\u0000\u0304\u0303\u0001"+
		"\u0000\u0000\u0000\u0305\u0308\u0001\u0000\u0000\u0000\u0306\u0304\u0001"+
		"\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0309\u0001"+
		"\u0000\u0000\u0000\u0308\u0306\u0001\u0000\u0000\u0000\u0309\u030a\u0006"+
		"\"\uffff\uffff\u0000\u030a\u0315\u0001\u0000\u0000\u0000\u030b\u030c\u0005"+
		"\b\u0000\u0000\u030c\u0310\u00053\u0000\u0000\u030d\u030f\u0005M\u0000"+
		"\u0000\u030e\u030d\u0001\u0000\u0000\u0000\u030f\u0312\u0001\u0000\u0000"+
		"\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000"+
		"\u0000\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000"+
		"\u0000\u0313\u0315\u0006\"\uffff\uffff\u0000\u0314\u02f0\u0001\u0000\u0000"+
		"\u0000\u0314\u02fd\u0001\u0000\u0000\u0000\u0314\u030b\u0001\u0000\u0000"+
		"\u0000\u0315E\u0001\u0000\u0000\u0000\u0316\u0317\u0005\u0016\u0000\u0000"+
		"\u0317\u0318\u0005\u0018\u0000\u0000\u0318\u0319\u0003\n\u0005\u0000\u0319"+
		"\u031a\u0005\u0019\u0000\u0000\u031a\u031b\u00053\u0000\u0000\u031b\u031c"+
		"\u0006#\uffff\uffff\u0000\u031c\u032e\u0001\u0000\u0000\u0000\u031d\u031e"+
		"\u0005\u0006\u0000\u0000\u031e\u031f\u0003>\u001f\u0000\u031f\u0320\u0005"+
		"\u0016\u0000\u0000\u0320\u0321\u0005\u0018\u0000\u0000\u0321\u0322\u0003"+
		"\n\u0005\u0000\u0322\u0323\u0005\u0019\u0000\u0000\u0323\u0324\u0005M"+
		"\u0000\u0000\u0324\u0325\u0006#\uffff\uffff\u0000\u0325\u032e\u0001\u0000"+
		"\u0000\u0000\u0326\u0327\u0005\n\u0000\u0000\u0327\u0328\u0005\u0018\u0000"+
		"\u0000\u0328\u0329\u0003H$\u0000\u0329\u032a\u0005\u0019\u0000\u0000\u032a"+
		"\u032b\u00053\u0000\u0000\u032b\u032c\u0006#\uffff\uffff\u0000\u032c\u032e"+
		"\u0001\u0000\u0000\u0000\u032d\u0316\u0001\u0000\u0000\u0000\u032d\u031d"+
		"\u0001\u0000\u0000\u0000\u032d\u0326\u0001\u0000\u0000\u0000\u032eG\u0001"+
		"\u0000\u0000\u0000\u032f\u0338\u0006$\uffff\uffff\u0000\u0330\u0331\u0003"+
		"J%\u0000\u0331\u0332\u0006$\uffff\uffff\u0000\u0332\u0339\u0001\u0000"+
		"\u0000\u0000\u0333\u0334\u0003\n\u0005\u0000\u0334\u0335\u0006$\uffff"+
		"\uffff\u0000\u0335\u0337\u0001\u0000\u0000\u0000\u0336\u0333\u0001\u0000"+
		"\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0339\u0001\u0000"+
		"\u0000\u0000\u0338\u0330\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000"+
		"\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033a\u033e\u00054\u0000"+
		"\u0000\u033b\u033c\u0003L&\u0000\u033c\u033d\u0006$\uffff\uffff\u0000"+
		"\u033d\u033f\u0001\u0000\u0000\u0000\u033e\u033b\u0001\u0000\u0000\u0000"+
		"\u033e\u033f\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000"+
		"\u0340\u0344\u00054\u0000\u0000\u0341\u0342\u0003L&\u0000\u0342\u0343"+
		"\u0006$\uffff\uffff\u0000\u0343\u0345\u0001\u0000\u0000\u0000\u0344\u0341"+
		"\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345I\u0001"+
		"\u0000\u0000\u0000\u0346\u0347\u0006%\uffff\uffff\u0000\u0347\u0348\u0003"+
		"\u0016\u000b\u0000\u0348\u034c\u0006%\uffff\uffff\u0000\u0349\u034a\u0003"+
		"\u001a\r\u0000\u034a\u034b\u0006%\uffff\uffff\u0000\u034b\u034d\u0001"+
		"\u0000\u0000\u0000\u034c\u0349\u0001\u0000\u0000\u0000\u034c\u034d\u0001"+
		"\u0000\u0000\u0000\u034dK\u0001\u0000\u0000\u0000\u034e\u034f\u0006&\uffff"+
		"\uffff\u0000\u034f\u0350\u0003\n\u0005\u0000\u0350\u0358\u0006&\uffff"+
		"\uffff\u0000\u0351\u0352\u00055\u0000\u0000\u0352\u0353\u0003\n\u0005"+
		"\u0000\u0353\u0354\u0001\u0000\u0000\u0000\u0354\u0355\u0006&\uffff\uffff"+
		"\u0000\u0355\u0357\u0001\u0000\u0000\u0000\u0356\u0351\u0001\u0000\u0000"+
		"\u0000\u0357\u035a\u0001\u0000\u0000\u0000\u0358\u0356\u0001\u0000\u0000"+
		"\u0000\u0358\u0359\u0001\u0000\u0000\u0000\u0359M\u0001\u0000\u0000\u0000"+
		"\u035a\u0358\u0001\u0000\u0000\u0000\u035b\u035c\u0005\u0005\u0000\u0000"+
		"\u035c\u0367\u0006\'\uffff\uffff\u0000\u035d\u035e\u0005\u0002\u0000\u0000"+
		"\u035e\u0367\u0006\'\uffff\uffff\u0000\u035f\u0360\u0005\u000e\u0000\u0000"+
		"\u0360\u0364\u0006\'\uffff\uffff\u0000\u0361\u0362\u0003\n\u0005\u0000"+
		"\u0362\u0363\u0006\'\uffff\uffff\u0000\u0363\u0365\u0001\u0000\u0000\u0000"+
		"\u0364\u0361\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000"+
		"\u0365\u0367\u0001\u0000\u0000\u0000\u0366\u035b\u0001\u0000\u0000\u0000"+
		"\u0366\u035d\u0001\u0000\u0000\u0000\u0366\u035f\u0001\u0000\u0000\u0000"+
		"\u0367\u0368\u0001\u0000\u0000\u0000\u0368\u0369\u0005M\u0000\u0000\u0369"+
		"O\u0001\u0000\u0000\u0000TTYdiry\u007f\u0086\u008e\u0096\u00a0\u00ae\u00b8"+
		"\u00c2\u00d0\u00df\u00e7\u0134\u0147\u014b\u014d\u015a\u016b\u0183\u018b"+
		"\u0195\u019e\u01a9\u01b3\u01cb\u01d3\u01d8\u01de\u01eb\u01f4\u0202\u0204"+
		"\u0208\u020a\u0214\u0216\u021a\u0227\u0232\u0234\u023d\u0245\u024f\u0254"+
		"\u025c\u0267\u026a\u026d\u0276\u0280\u0284\u0286\u0290\u0294\u029a\u02a2"+
		"\u02a9\u02b2\u02be\u02cc\u02d0\u02d7\u02d9\u02e3\u02e9\u02ee\u02fa\u0306"+
		"\u0310\u0314\u032d\u0336\u0338\u033e\u0344\u034c\u0358\u0364\u0366";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}