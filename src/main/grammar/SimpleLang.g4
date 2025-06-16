grammar SimpleLang;
@header{

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.Stmt.*;
    import main.ast.nodes.expr.*;
    import main.ast.nodes.expr.primitives.*;

     import main.ast.nodes.externalDeclaration.*;
}
// import main.ast.nodes.expr.operator.*;
program returns [Program programRet]:
    { $programRet = new Program();} (t=translationUnit {$programRet.settranslationUnit($t.translationUnitRet);})? (Newline)* EOF ;

translationUnit returns [TranslationUnit translationUnitRet]
    :{$translationUnitRet=new TranslationUnit();} (ed = externalDeclaration {$translationUnitRet.addED($ed.externalDeclarationRet);})+ ;

externalDeclaration returns [ExternalDeclaration externalDeclarationRet]                    //added newline*
    : (Newline)* f=functionDefinition{ $externalDeclarationRet=$f.functionDefinitionRet;}  | (Newline)* d=declaration{$externalDeclarationRet=$d.declarationRet;} |
      Semi; // stray ;

functionDefinition returns [FunctionDefinition functionDefinitionRet]
    : {$functionDefinitionRet = new FunctionDefinition();}
     (d= declarationSpecifiers{$functionDefinitionRet.setDeclarationSpecifiers($d.declarationSpecifiersRet);} )?
        d2= declarator{$functionDefinitionRet.setDeclarator($d2.declaratorRet);}
        (x=declarationList {$functionDefinitionRet.setDeclarationList($x.declarationListRet);})?
     o= Colon Newline  c = compoundStatement{$functionDefinitionRet.setCompoundStatement($c.compoundStatementRet);$functionDefinitionRet.setLine($o.line); } End (INDENT)? ;

declarationList returns [DeclarationList declarationListRet]
    : {$declarationListRet=new DeclarationList();} (d=declaration{$declarationListRet.add($d.declarationRet);})+ ;

expression returns [Expr expressionRet]
  : i= Identifier{$expressionRet= new Identifier($i.text);$expressionRet.setLine($i.line);} | c=Constant{$expressionRet=new Constant($c.text);$expressionRet.setLine($c.line);} | i= StringLiteral+ {$expressionRet= new StringVal($i.text);}
  | LeftParen e2=expression{$expressionRet=$e2.expressionRet;} RightParen
  | LeftParen ttt=typeName RightParen LeftBrace ill=initializerList Comma? RightBrace{$expressionRet=new TypeName_initList($ttt.typeNameRet,$ill.initializerListRet);}    //TypeName_initList  bayad beporsam
  | e1=expression LeftBracket e3=expression RightBracket {$expressionRet=new ArrIndexing($e1.expressionRet,$e3.expressionRet);}                               // Array indexing
  | e4=expression{FuncCallExpr x=new FuncCallExpr($e4.expressionRet);} l54=LeftParen{x.setLine($l54.line);} (ael=argumentExpressionList {x.setArguments($ael.argumentExpressionListRet);})? RightParen{$expressionRet= x;}                       // Function call
  | e=expression pp=PlusPlus {$expressionRet=new UnaryExpr($e.expressionRet,$pp.text);$expressionRet.setLine($pp.line);}                                                           // Postfix increment
  | e=expression mm=MinusMinus  {$expressionRet=new UnaryExpr($e.expressionRet,$mm.text);$expressionRet.setLine($mm.line);}                                                          // Postfix decrement
  | { ArrayList<String> list = new ArrayList<>();}
      (op = (PlusPlus | MinusMinus | Sizeof) {list.add($op.text);})*
      (
        i = Identifier{ $expressionRet=new IDPrefixExpr($i.text,list);}
       | c=Constant{$expressionRet=new ConstantPrefixExpr($c.text,list);}
       | s=StringLiteral+{$expressionRet=new StringPrefixExpr($s.text,list);}
       | LeftParen q=expression RightParen{$expressionRet=new ExprPrefixExpr($q.expressionRet,list);}
       | LeftParen tw=typeName RightParen LeftBrace iw=initializerList Comma? RightBrace{$expressionRet=new TypeNamePrefixExpr($tw.typeNameRet,$iw.initializerListRet, list);}
       | uno=unaryOperator cen=castExpression{$expressionRet=new UnaryCastPrefixExpr($uno.unaryOperatorRet, $cen.castExpressionRet,list);}
       | Sizeof LeftParen nigga=typeName RightParen{$expressionRet=new TypeOfPrefixExpr($nigga.typeNameRet,list);}
    )
  | LeftParen t1=typeName RightParen c12=castExpression {$expressionRet=new CastExpression2($t1.typeNameRet,$c12.castExpressionRet);}                                 // Cast expression
  | e1=expression op=(Star | Div | Mod) e2=expression {$expressionRet=new BinaryExpr($e1.expressionRet,$op.text,$e2.expressionRet);$expressionRet.setLine($op.line);}                                     // Multiplicative
  | e1=expression op=(Plus | Minus) e2=expression  {$expressionRet=new BinaryExpr($e1.expressionRet,$op.text,$e2.expressionRet);$expressionRet.setLine($op.line);$expressionRet.setLine($op.line);}                                         // Additive
  | e1=expression op=(LeftShift | RightShift) e2=expression{$expressionRet=new BinaryExpr($e1.expressionRet,$op.text,$e2.expressionRet);$expressionRet.setLine($op.line);}                                 // Shift
  | e1=expression op=(Less | Greater | LessEqual | GreaterEqual) e2=expression{$expressionRet=new BinaryExpr($e1.expressionRet,$op.text,$e2.expressionRet);$expressionRet.setLine($op.line);}              // Relational
  | e1=expression op=(Equal | NotEqual)e2=expression{$expressionRet=new BinaryExpr($e1.expressionRet,$op.text,$e2.expressionRet);$expressionRet.setLine($op.line);}                                       // Equality
  | e1=expression op=And e2=expression{$expressionRet=new BinaryExpr($e1.expressionRet,$op.text,$e2.expressionRet);$expressionRet.setLine($op.line);}                                                      // Bitwise AND
  | e1=expression op=Xor e2=expression{$expressionRet=new BinaryExpr($e1.expressionRet,$op.text,$e2.expressionRet);$expressionRet.setLine($op.line);}                                                      // Bitwise XOR
  | e1=expression op=Or e2=expression{$expressionRet=new BinaryExpr($e1.expressionRet,$op.text,$e2.expressionRet);$expressionRet.setLine($op.line);}                                                       // Bitwise OR
  | e1=expression op=AndAnd e2=expression{$expressionRet=new BinaryExpr($e1.expressionRet,$op.text,$e2.expressionRet);$expressionRet.setLine($op.line);}                                                   // Logical AND
  | e1=expression op=OrOr e2=expression {$expressionRet=new BinaryExpr($e1.expressionRet,$op.text,$e2.expressionRet);$expressionRet.setLine($op.line);}                                                     // Logical OR
  | eaaa=expression Question wf=expression Colon fw=expression{$expressionRet=new ConditionalExpr($eaaa.expressionRet,$wf.expressionRet,$fw.expressionRet);}                               // Conditional operator
  | lValue=expression ao=assignmentOperator rVal=expression  {$expressionRet=new AssignmentExpr($lValue.expressionRet,$rVal.expressionRet,$ao.assignmentRet);}                                    // Assignment
  | e=expression{commaExpr ce=new  commaExpr();}{ce.add($e.expressionRet);} (cmm=Comma x=expression{ce.add($x.expressionRet);ce.setLine($cmm.line);})+ {$expressionRet=ce;};                                              // Comma operator

argumentExpressionList returns [ArgumentExpressionList argumentExpressionListRet]
  :{$argumentExpressionListRet=new ArgumentExpressionList();} e=expression{$argumentExpressionListRet.add($e.expressionRet);}
    ((Comma e2=expression){$argumentExpressionListRet.add($e2.expressionRet); })* ;

unaryOperator returns [UnaryOperator unaryOperatorRet]
  : s=(And | Star | Plus | Minus | Tilde | Not){$unaryOperatorRet=new UnaryOperator($s.text);} ;

castExpression returns [CastExpression castExpressionRet]
  : LeftParen t=typeName RightParen c=castExpression{$castExpressionRet=new Type1CastExpression($t.typeNameRet,$c.castExpressionRet);}
  | e=expression{$castExpressionRet=new Type2CastExpression( $e.expressionRet);}
  | d=DigitSequence{$castExpressionRet =new Type3CastExpression($d.text);} ;

assignmentOperator returns [ Assignment  assignmentRet]
  : a=Assign{$assignmentRet=new Assignment($a.text);$assignmentRet.setLine($a.line);} |
   s=StarAssign{$assignmentRet=new Assignment($s.text);$assignmentRet.setLine($s.line);} |
   d=DivAssign{$assignmentRet=new Assignment($d.text);$assignmentRet.setLine($d.line);} |
    m=ModAssign {$assignmentRet=new Assignment($m.text);$assignmentRet.setLine($m.line);}|
   p= PlusAssign{$assignmentRet=new Assignment($p.text);$assignmentRet.setLine($p.line);} |
   ma= MinusAssign {$assignmentRet=new Assignment($ma.text);$assignmentRet.setLine($ma.line);}|
   l= LeftShiftAssign{$assignmentRet=new Assignment($l.text);$assignmentRet.setLine($l.line);} |
    r= RightShiftAssign{$assignmentRet=new Assignment($r.text);$assignmentRet.setLine($r.line);} |
     aa= AndAssign{$assignmentRet=new Assignment($aa.text);$assignmentRet.setLine($aa.line);} |
      x= XorAssign{$assignmentRet=new Assignment($x.text);$assignmentRet.setLine($x.line);} |
      o=  OrAssign{$assignmentRet=new Assignment($o.text);$assignmentRet.setLine($o.line);} ;

declaration returns [Declaration declarationRet]
    : {$declarationRet=new Declaration();} d=declarationSpecifiers{$declarationRet.setDeclarationSpecifiers($d.declarationSpecifiersRet);$declarationRet.setLine($d.declarationSpecifiersRet.getLine());}
        (i=initDeclaratorList{$declarationRet.setInitDeclaratorList($i.initDeclaratorListRet);})?(Newline)  ;

declarationSpecifiers returns [DeclarationSpecifiers declarationSpecifiersRet]
    : {$declarationSpecifiersRet =new DeclarationSpecifiers();} (d=declarationSpecifier {$declarationSpecifiersRet.add($d.declarationSpecifierRet);$declarationSpecifiersRet.setLine($d.declarationSpecifierRet.getLine());})+ ;

declarationSpecifier returns [DeclarationSpecifier declarationSpecifierRet]
    : a=Typedef {$declarationSpecifierRet=new DeclarationSpecifier("typedef");$declarationSpecifierRet.setLine($a.line); } |t= typeSpecifier{$declarationSpecifierRet=$t.declarationSpecifierRet2;$declarationSpecifierRet.setLine($t.declarationSpecifierRet2.getLine());} | c=Const {$declarationSpecifierRet=new DeclarationSpecifier("const");$declarationSpecifierRet.setLine($c.line);} ;

initDeclaratorList returns [InitDeclaratorList initDeclaratorListRet]
    : {$initDeclaratorListRet=new InitDeclaratorList();} i1=initDeclarator
    {$initDeclaratorListRet.add($i1.initDeclaratorRet);} (Comma i2=initDeclarator{$initDeclaratorListRet.add($i2.initDeclaratorRet);})* ;

initDeclarator returns [InitDeclarator initDeclaratorRet]
    : {$initDeclaratorRet=new InitDeclarator();} d=declarator{$initDeclaratorRet.setDeclarator($d.declaratorRet);}
        (Assign i=initializer{$initDeclaratorRet.setInitializer($i.initializerRet);})? ;

typeSpecifier returns [DeclarationSpecifier declarationSpecifierRet2]
    : v= Void {$declarationSpecifierRet2=new DeclarationSpecifier("void"); $declarationSpecifierRet2.setLine($v.line); } |
     c=Char{$declarationSpecifierRet2=new DeclarationSpecifier("char");$declarationSpecifierRet2.setLine($c.line); } |
     s= Short{$declarationSpecifierRet2=new DeclarationSpecifier("short"); $declarationSpecifierRet2.setLine($s.line); } |
       iq=Int{$declarationSpecifierRet2=new DeclarationSpecifier("int");$declarationSpecifierRet2.setLine($iq.line); } |
       l= Long{$declarationSpecifierRet2=new DeclarationSpecifier("long");$declarationSpecifierRet2.setLine($l.line); } |
         f=Float {$declarationSpecifierRet2=new DeclarationSpecifier("float");$declarationSpecifierRet2.setLine($f.line); }|
         d= Double{$declarationSpecifierRet2=new DeclarationSpecifier("double");$declarationSpecifierRet2.setLine($d.line); } |
          ss= Signed{$declarationSpecifierRet2=new DeclarationSpecifier("signed");$declarationSpecifierRet2.setLine($ss.line); } |
           u =Unsigned{$declarationSpecifierRet2=new DeclarationSpecifier("unsigned");$declarationSpecifierRet2.setLine($u.line); } |
            b =Bool{$declarationSpecifierRet2=new DeclarationSpecifier("bool");$declarationSpecifierRet2.setLine($b.line); } |
              i=Identifier{$declarationSpecifierRet2=new DeclarationSpecifier("identifier",$i.text); } ;

specifierQualifierList returns [SpecifierQualifierList specifierQualifierListRet]
    : {$specifierQualifierListRet=new SpecifierQualifierList();} (t=typeSpecifier{$specifierQualifierListRet.setDeclarationSpecifier($t.declarationSpecifierRet2);}
     |{$specifierQualifierListRet.setDeclarationSpecifier(new DeclarationSpecifier("const"));} Const)
      (q=specifierQualifierList{$specifierQualifierListRet.setSpecifierQualifierList($q.specifierQualifierListRet);})? ;

declarator returns [Declarator declaratorRet]
    : {$declaratorRet =new Declarator();}(p=pointer{$declaratorRet.setPointer($p.pointerRet);})?
     d=directDeclarator{ $declaratorRet.setDirectDeclarator($d.directDeclaratorRet); $declaratorRet.setLine($d.directDeclaratorRet.getLine());} ;

directDeclarator returns [DirectDeclarator directDeclaratorRet]
    : i=Identifier {$directDeclaratorRet=new Type1DirectDeclarator($i.text);$directDeclaratorRet.setLine($i.line); }
    | l1=LeftParen d=declarator{$directDeclaratorRet=new Type2DirectDeclarator($d.declaratorRet);$directDeclaratorRet.setLine($l1.line);} RightParen
    | d12=directDeclarator{Type3DirectDeclarator x=new Type3DirectDeclarator();}{x.setDirectDeclarator($d12.directDeclaratorRet);}
        l2=LeftBracket (e=expression{x.setExpr($e.expressionRet);})? RightBracket{x.setLine($l2.line);$directDeclaratorRet=x;}
    | d32=directDeclarator{Type4DirectDeclarator x1=new Type4DirectDeclarator();}{x1.setDirectDeclarator($d32.directDeclaratorRet);}
     LeftParen  (p=parameterList{x1.setParameterList($p.parameterListRet);} | (il=identifierList{x1.setIdentifierList($il.identifierListRet);})?) r=RightParen{x1.setLine($r.line);$directDeclaratorRet=x1;} ;

pointer returns [Pointer pointerRet]
    : {int StarCount=0;} ((Star {StarCount+=1;}) (Const+)?)+ {$pointerRet=new Pointer(StarCount);} ;

parameterList returns [ParameterList parameterListRet]
    : {$parameterListRet=new ParameterList(); } p1=parameterDeclaration {$parameterListRet.add($p1.parameterDeclarationRet);}
    (Comma p2=parameterDeclaration{$parameterListRet.add($p2.parameterDeclarationRet);})* ;

parameterDeclaration returns [ParameterDeclaration parameterDeclarationRet]
    : d=declarationSpecifiers{$parameterDeclarationRet=new ParameterDeclaration($d.declarationSpecifiersRet);}
     (d2=declarator{$parameterDeclarationRet.setDeclarator($d2.declaratorRet);}
      | (a=abstractDeclarator{$parameterDeclarationRet.setAbstractDeclarator($a.abstractDeclaratorRet);})?) ;

identifierList returns [IdentifierList identifierListRet]
    :  i1=Identifier{$identifierListRet =new IdentifierList($i1.text);} (Comma i2=Identifier {$identifierListRet.add($i2.text);})* ;

typeName returns [TypeName typeNameRet]
    : s=specifierQualifierList{$typeNameRet=new TypeName($s.specifierQualifierListRet);}
     (a=abstractDeclarator{$typeNameRet.setAbstractDeclarator($a.abstractDeclaratorRet);})? ;

abstractDeclarator returns [AbstractDeclarator abstractDeclaratorRet]
    : {$abstractDeclaratorRet=new AbstractDeclarator(); }p=pointer{$abstractDeclaratorRet.setPointer($p.pointerRet);}
     |{$abstractDeclaratorRet=new AbstractDeclarator(); } (p2=pointer {$abstractDeclaratorRet.setPointer($p2.pointerRet);})?
      d=directAbstractDeclarator{$abstractDeclaratorRet.setDirectAbstractDeclarator($d.directAbstractDeclaratorRet);} ;

directAbstractDeclarator returns [DirectAbstractDeclarator directAbstractDeclaratorRet  ]
    : {$directAbstractDeclaratorRet=new ExpressionDAD();}LeftBracket (e=expression{ ((ExpressionDAD) $directAbstractDeclaratorRet).setExpr($e.expressionRet);})? RightBracket
    | LeftParen  (a=abstractDeclarator{$directAbstractDeclaratorRet=new Type2DAD($a.abstractDeclaratorRet);} |{Type2DAD temp=new Type2DAD();} (p=parameterList{temp.setParameterList($p.parameterListRet);})?{$directAbstractDeclaratorRet=temp;}) RightParen
    |  d=directAbstractDeclarator
        {Type3DAD temp1=new Type3DAD();}{temp1.setDirectAbstractDeclarator($d.directAbstractDeclaratorRet);}
        LeftBracket(e=expression{temp1.setExpr($e.expressionRet);})? {$directAbstractDeclaratorRet=temp1;}RightBracket
    |  d=directAbstractDeclarator{Type4DAD tmp= new Type4DAD();tmp.setDirectAbstractDeclarator($d.directAbstractDeclaratorRet);} LeftParen (p=parameterList{tmp.setParameterList($p.parameterListRet);})? RightParen{$directAbstractDeclaratorRet=tmp;} ;

initializer returns [Initializer initializerRet]
    : e1=expression{$initializerRet=new Initializer($e1.expressionRet);} | LeftBrace i= initializerList{$initializerRet=new Initializer($i.initializerListRet);} Comma? RightBrace ;

initializerList returns [InitializerList initializerListRet]
    :{$initializerListRet=new InitializerList();} (d1=designation{$initializerListRet.addDesignation($d1.designationRet);})?
     i1=initializer{$initializerListRet.addInitializer($i1.initializerRet);}
      (Comma (d2=designation{$initializerListRet.addDesignation($d2.designationRet);})? i2=initializer{$initializerListRet.addInitializer($i2.initializerRet);})* ;

designation returns [Designation designationRet]
    : {$designationRet=new Designation();} (d=designator {$designationRet.add($d.designatorRet);})+ Assign ;

designator returns [Designator designatorRet]
    : LeftBracket e1=expression{$designatorRet=new Designator($e1.expressionRet);} RightBracket |
        Dot i=Identifier{$designatorRet=new Designator($i.text);} ;

statement returns [Stmt statementRet]
    :    e=expressionStatement{$statementRet=$e.expressionStatementRet;}
    |  s=selectionStatement {$statementRet=$s.selectionStatementRet;}
     | i=iterationStatement {$statementRet=$i.iterationStatementRet;}
      |   j=jumpStatement {$statementRet=$j.jumpStatementRet;}  ;

compoundStatement returns [CompoundStatement compoundStatementRet]
    : {  $compoundStatementRet=new CompoundStatement();  }   (( (k=INDENT)? b=blockItem{$compoundStatementRet.addBlock($b.blockItemRet); $b.blockItemRet.addIndent($k.text);})+)?
     ;

blockItem returns [BlockItem blockItemRet]
    :{$blockItemRet =new BlockItem();}  s=statement{$blockItemRet.setStatement($s.statementRet);} |
    {$blockItemRet =new BlockItem();}  d=declaration{$blockItemRet.setDeclaration($d.declarationRet);}  ;

expressionStatement returns [ExpressionStatement expressionStatementRet]
    : {$expressionStatementRet=new ExpressionStatement();}  ((e=expression{$expressionStatementRet.setExpression($e.expressionRet);}))? (Newline)+ ;

//selectionStatement returns [SelectionStatement selectionStatementRet]
  //  : {$selectionStatementRet=new SelectionStatement(); }  If LeftParen e=expression{$selectionStatementRet.setCondition($e.expressionRet);}
  //   RightParen Colon (Newline)*  /*s1=compoundStatement {$selectionStatementRet.setIfBody($s1.compoundStatementRet);}*/
  //    (INDENT Else (Colon)?   /*s2=compoundStatement {$selectionStatementRet.setElseBody($s2.compoundStatementRet);}*/)? ;




  selectionStatement returns [SelectionStatement selectionStatementRet]
      : {If temp=new If(); } i= If LeftParen e=expression{temp.setCondition($e.expressionRet); $selectionStatementRet=temp;$selectionStatementRet.setLine($i.line);$e.expressionRet.setLine($i.line);}
       RightParen Colon  (Newline)*| ef=Else If LeftParen e23=expression RightParen Colon (Newline)* {$selectionStatementRet=new ElseIf($e23.expressionRet);$selectionStatementRet.setLine($ef.line);$e23.expressionRet.setLine($ef.line);} |
        e2222=Else Colon (Newline)* {$selectionStatementRet=new Else();$selectionStatementRet.setLine($e2222.line);}; /*s1=compoundStatement {$selectionStatementRet.setIfBody($s1.compoundStatementRet);}*/
       // (INDENT Else (Colon)?   /*s2=compoundStatement {$selectionStatementRet.setElseBody($s2.compoundStatementRet);}*/)? ;





//iterationStatement returns [ IterationStatement iterationStatementRet]
  //  : While LeftParen e=expression RightParen Colon  s= compoundStatement{$iterationStatementRet=new WhileStmt($s.compoundStatementRet,$e.expressionRet);}
 //   | Do s=compoundStatement While LeftParen e=expression RightParen (Newline){$iterationStatementRet=new DoWhile($s.compoundStatementRet,$e.expressionRet);}
 //   | For LeftParen fc=forCondition RightParen Colon s=compoundStatement{$iterationStatementRet= new ForStmt($s.compoundStatementRet,$fc.forConditionRet);} ;






iterationStatement returns [ IterationStatement iterationStatementRet]
    : ww=While LeftParen e=expression RightParen Colon{$iterationStatementRet=new WhileStmt($e.expressionRet);$iterationStatementRet.setLine($ww.line);$e.expressionRet.setLine($ww.line);} /* s= compoundStatement{$iterationStatementRet=new WhileStmt($s.compoundStatementRet,$e.expressionRet);}*/
    | d=Do s=compoundStatement While LeftParen e=expression RightParen (Newline){$iterationStatementRet=new DoWhile($e.expressionRet);$iterationStatementRet.setLine($d.line);}
    | fuc= For LeftParen fc=forCondition RightParen Colon {$iterationStatementRet= new ForStmt($fc.forConditionRet);$iterationStatementRet.setLine($fuc.line);} /* s=compoundStatement{$iterationStatementRet= new ForStmt($s.compoundStatementRet,$fc.forConditionRet);}*/ ;










forCondition returns [ForCondition forConditionRet]
    : {$forConditionRet=new ForCondition();}
    ( f=forDeclaration{$forConditionRet.setFd($f.forDeclarationRet);} | (e=expression{$forConditionRet.setE($e.expressionRet);})?)
     Semi (f2=forExpression{$forConditionRet.setFe1($f2.forExpressionRet);})?
      Semi (f3=forExpression{$forConditionRet.setFe2($f3.forExpressionRet);})? ;

forDeclaration returns [ForDeclaration forDeclarationRet]
    : {$forDeclarationRet=new ForDeclaration();}
    d=declarationSpecifiers {$forDeclarationRet.setDeclarationSpecifiers($d.declarationSpecifiersRet);}
    (i=initDeclaratorList{$forDeclarationRet.setInitDeclaratorList($i.initDeclaratorListRet);})? ;

forExpression returns [ ForExpression  forExpressionRet]
    :{$forExpressionRet=new ForExpression();} e1=expression{$forExpressionRet.add($e1.expressionRet);}
     ((Comma e2=expression){$forExpressionRet.add($e2.expressionRet);})* ;

jumpStatement returns [JumpStatement jumpStatementRet]
    : (  c=Continue{$jumpStatementRet=new JumpStatement($c.text); } |
    b=Break{$jumpStatementRet=new JumpStatement($b.text); } |
     r=Return {$jumpStatementRet=new JumpStatement($r.text); $jumpStatementRet.setLine($r.line);} (e=expression {$jumpStatementRet.setExpr($e.expressionRet);$e.expressionRet.setLine($r.line);} )? ) (Newline);
End :'end';
Break                 : 'break'                 ;
Char                  : 'char'                  ;
Const                 : 'const'                 ;
Continue              : 'continue'              ;
Do                    : 'do'                    ;
Double                : 'double'                ;
Else                  : 'else'                  ;
Float                 : 'float'                 ;
For                   : 'for'                   ;
If                    : 'if'                    ;
Int                   : 'int'                   ;
Long                  : 'long'                  ;
Return                : 'return'                ;
Short                 : 'short'                 ;
Signed                : 'signed'                ;
Sizeof                : 'sizeof'                ;
Switch                : 'switch'                ;
Typedef               : 'typedef'               ;
Unsigned              : 'unsigned'              ;
Void                  : 'void'                  ;
While                 : 'while'                 ;
Bool                  : 'bool'                  ;
LeftParen             : '('                     ;
RightParen            : ')'                     ;
LeftBracket           : '['                     ;
RightBracket          : ']'                     ;
LeftBrace             : '{'                     ;
RightBrace            : '}'                     ;
Less                  : '<'                     ;
LessEqual             : '<='                    ;
Greater               : '>'                     ;
GreaterEqual          : '>='                    ;
LeftShift             : '<<'                    ;
RightShift            : '>>'                    ;
Plus                  : '+'                     ;
PlusPlus              : '++'                    ;
Minus                 : '-'                     ;
MinusMinus            : '--'                    ;
Star                  : '*'                     ;
Div                   : '/'                     ;
Mod                   : '%'                     ;
And                   : '&'                     ;
Or                    : '|'                     ;
AndAnd                : '&&'                    ;
OrOr                  : '||'                    ;
Xor                   : '^'                     ;
Not                   : '!'                     ;
Tilde                 : '~'                     ;
Question              : '?'                     ;
Colon                 : ':'                     ;
Semi                  : ';'                     ;
Comma                 : ','                     ;
Assign                : '='                     ;
StarAssign            : '*='                    ;
DivAssign             : '/='                    ;
ModAssign             : '%='                    ;
PlusAssign            : '+='                    ;
MinusAssign           : '-='                    ;
LeftShiftAssign       : '<<='                   ;
RightShiftAssign      : '>>='                   ;
AndAssign             : '&='                    ;
XorAssign             : '^='                    ;
OrAssign              : '|='                    ;
Equal                 : '=='                    ;
NotEqual              : '!='                    ;
Arrow                 : '->'                    ;
Dot                   : '.'                     ;

Identifier
    : IdentifierNondigit (IdentifierNondigit | Digit)* ;

fragment IdentifierNondigit
    : Nondigit | UniversalCharacterName ;

fragment Nondigit
    : [a-zA-Z_] ;

fragment Digit
    : [0-9] ;

fragment UniversalCharacterName
    : '\\u' HexQuad | '\\U' HexQuad HexQuad ;

fragment HexQuad
    : HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit ;

Constant
    : IntegerConstant | FloatingConstant | CharacterConstant ;

fragment IntegerConstant
    : DecimalConstant IntegerSuffix?
    | OctalConstant IntegerSuffix?
    | HexadecimalConstant IntegerSuffix?
    | BinaryConstant ;

fragment BinaryConstant
    : '0' [bB] [0-1]+ ;

fragment DecimalConstant
    : NonzeroDigit Digit* ;

fragment OctalConstant
    : '0' OctalDigit* ;

fragment HexadecimalConstant
    : HexadecimalPrefix HexadecimalDigit+ ;

fragment HexadecimalPrefix
    : '0' [xX] ;

fragment NonzeroDigit
    : [1-9] ;

fragment OctalDigit
    : [0-7] ;

fragment HexadecimalDigit
    : [0-9a-fA-F] ;

fragment IntegerSuffix
    : UnsignedSuffix LongSuffix? | UnsignedSuffix LongLongSuffix | LongSuffix UnsignedSuffix? | LongLongSuffix UnsignedSuffix? ;

fragment UnsignedSuffix
    : [uU] ;

fragment LongSuffix
    : [lL] ;

fragment LongLongSuffix
    : 'll' | 'LL' ;

fragment FloatingConstant
    : DecimalFloatingConstant | HexadecimalFloatingConstant ;

fragment DecimalFloatingConstant
    : FractionalConstant ExponentPart? FloatingSuffix? | DigitSequence ExponentPart FloatingSuffix? ;

fragment HexadecimalFloatingConstant
    : HexadecimalPrefix (HexadecimalFractionalConstant | HexadecimalDigitSequence) BinaryExponentPart FloatingSuffix? ;

fragment FractionalConstant
    : DigitSequence? Dot DigitSequence | DigitSequence Dot ;

fragment ExponentPart
    : [eE] Sign? DigitSequence ;

fragment Sign
    : [+-] ;

DigitSequence
    : Digit+ ;

fragment HexadecimalFractionalConstant
    : HexadecimalDigitSequence? Dot HexadecimalDigitSequence | HexadecimalDigitSequence Dot ;

fragment BinaryExponentPart
    : [pP] Sign? DigitSequence ;

fragment HexadecimalDigitSequence
    : HexadecimalDigit+ ;

fragment FloatingSuffix
    : [flFL] ;

fragment CharacterConstant
    : '\'' CCharSequence '\'' | 'L\'' CCharSequence '\''| 'u\'' CCharSequence '\'' | 'U\'' CCharSequence '\''
    ;

fragment CCharSequence
    : CChar+ ;

fragment CChar
    : ~['\\\r\n] | EscapeSequence ;

fragment EscapeSequence
    : SimpleEscapeSequence | OctalEscapeSequence | HexadecimalEscapeSequence | UniversalCharacterName ;

fragment SimpleEscapeSequence
    : '\\' ['"?abfnrtv\\] ;

fragment OctalEscapeSequence
    : '\\' OctalDigit OctalDigit? OctalDigit? ;

fragment HexadecimalEscapeSequence
    : '\\x' HexadecimalDigit+ ;

StringLiteral
    : EncodingPrefix? '"' SCharSequence? '"' ;

fragment EncodingPrefix
    : 'u8' | 'u' | 'U' | 'L' ;

fragment SCharSequence
    : SChar+ ;

fragment SChar
    : ~["\\\r\n] | EscapeSequence | '\\\n' | '\\\r\n' ;

MultiLineMacro
    : '#' (~[\n]*? '\\' '\r'? '\n')+ ~ [\n]+ -> channel(HIDDEN) ;

Directive
    : '#' ~[\n]* -> channel(HIDDEN) ;


fragment FOUR_SPACES
  : ' ' ' ' ' ' ' '
  ;

// option A: emit one INDENT per quartet
//INDENT
//  : FOUR_SPACES
 // ;

 //option B: emit one INDENT whose length may be 4, 8, 12, …

INDENT
  : FOUR_SPACES+
  ;






Whitespace
    : [ \t]+ -> channel(HIDDEN) ;

Newline
    : ('\r' '\n'? | '\n') ;

BlockComment
    : '/*' .*? '*/' -> channel(HIDDEN) ;

LineComment
    : '//' ~[\r\n]* -> channel(HIDDEN) ;