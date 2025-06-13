package main.visitor;

import main.ast.nodes.*;
import main.ast.nodes.Stmt.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expr.*;
import main.ast.nodes.expr.primitives.*;
import main.ast.nodes.externalDeclaration.ExternalDeclaration;
import main.ast.nodes.externalDeclaration.FunctionDefinition;

import javax.swing.plaf.ComponentUI;
import java.util.ArrayList;


/*GOALs:
 *   1. print out scope changes each time a new scope starts
 *   2. print the identifier if it is initialized
 *   3. print the identifier if it is used
 *   4. print out the name of the function when it is defined
 *   5. print out the name of the function when it is used
 *
 * */


public class TestVisitor extends Visitor<Void>{
    private ArrayList<FunctionDefinition> Reachablefuncs=new ArrayList<>();
    public void setReachablefuncs(ArrayList<FunctionDefinition> funcs){
        this.Reachablefuncs=funcs;
    }
    @Override
    public Void visit(Program program) {
       // System.out.println("program det");
        TranslationUnit t=program.getTranslationUnit();
        t.accept(this);
       // for (FuncDec func_dec : program.getFuncDecs()){
         //   func_dec.accept(this);
        //}
       // program.getMain().accept(this);
        return null;
    }
    public Void visit(Main main) {
        System.out.println("New Scope: Main");
        for (Stmt stmt : main.getStmts()){
            stmt.accept(this);
        }
        return null;
    }

    public Void visit(FuncDec funcDec) {
        System.out.println("New Scope: " + funcDec.getFuncName());
        for (Stmt stmt : funcDec.getStmts()){
            stmt.accept(this);
        }
        return null;
    }

    public Void visit(Assign assign) {
        System.out.println("Used variable: " + assign.getLeftHand());
        assign.getRightHand().accept(this);
        return null;
    }
    public Void visit(VarDec varDec) {
        System.out.println("Declared variable: " + varDec.getVarName());
        return null;
    }
    public Void visit(IfStmt ifStmt) {
        ifStmt.getCondition().accept(this);
        ifStmt.getIfBody().accept(this);
        ifStmt.getElseBody().accept(this);
        return null;
    }
    public Void visit(FuncCallStmt funcCall) {
       // System.out.println("Called function: " + funcCall.getFunction().getName());
        return null;
    }
    public Void visit(UnaryExpr unaryExpr) {
     //       unaryExpr.printRoot();
     //   unaryExpr.setDepth();
     //   System.out.println(unaryExpr.getDepth());
     //   unaryExpr.getOperand().accept(this);

        return null;
    }
    public Void visit(BinaryExpr binaryExpr) {
      //  binaryExpr.getFirstOperand().accept(this);
      //  binaryExpr.getSecondOperand().accept(this);
     //   binaryExpr.setDepth();
     //   System.out.println(binaryExpr.getDepth());
      //  binaryExpr.printRoot();
        return null;
    }
    public Void visit(Identifier identifier) {
       // System.out.println("Used variable: " + identifier.getName());
     //   identifier.setDepth();
       //     identifier.printRoot();
        return null;
    }

    public Void visit(IntVal int_Val) {
        return null;
    }
    public Void visit(StringVal string_val){return null;}
    public Void visit(BoolVal bool_val){return null;}
    public Void visit(DoubleVal double_vals){return null;}

    @Override
    public Void visit(ArgumentExpressionList ae) {
        return null;
    }

    public Void visit(FuncCallExpr func_call_expr){
       // System.out.println("Called function: " + func_call_expr.getName());
        func_call_expr.getExpr().accept(this);
        return null;
    }
    public Void visit(Return the_return){
        the_return.getReturn_value().accept(this);
        return null;
    }

    @Override
    public Void visit(TranslationUnit translationUnit) {
     //   System.out.println("here");
        for (        ExternalDeclaration ex           :    translationUnit.getExternalDeclarations()){

                        ex.accept(this);
        }

        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition) {
       // for(FunctionDefinition rfds : Reachablefuncs) {
          //  String name1=functionDefinition.getName() + String.valueOf(functionDefinition.getParametersSize());
          //  String name2=rfds.getName() + String.valueOf(rfds.getParametersSize());
           // if (name1.equals(name2)){
                 functionDefinition.printStmtsCount();//?

                for(Cnt c:functionDefinition.getStmts()){
                    c.accept(this);
                }
          //  }
        //}
      //  if(functionDefinition )
      /*  functionDefinition.printStmtsCount();//?

        for(Cnt c:functionDefinition.getStmts()){
            c.accept(this);
        }*/
       // CompoundStatement c =functionDefinition.getCompoundStatement();
       // c.accept(this);
        return null;
    }

    @Override
    public Void visit(DeclarationSpecifiers declarationSpecifiers) {
        return null;
    }

    @Override
    public Void visit(Declarator declarator) {
        return null;
    }

    @Override
    public Void visit(DeclarationList declarationList) {
        return null;
    }

    @Override
    public Void visit(CompoundStatement compoundStatement) {
      //  System.out.println(compoundStatement.getBlocks().size());
        for (BlockItem b:compoundStatement.getBlocks()){
            b.accept(this);//blockItem;0
        }
      //  BlockItem


        return null;
    }

    @Override
    public Void visit(DeclarationSpecifier declarationSpecifier) {
        return null;
    }

    @Override
    public Void visit(Pointer pointer) {
        return null;
    }

    @Override
    public Void visit(Constant constant) {
       // constant.printRoot();
      //  constant.setDepth();
        return null;
    }

    @Override
    public Void visit(TypeName_initList typeNameInitList) {
        return null;
    }

    @Override
    public Void visit(ArrIndexing arrIndexing) {
        return null;
    }

    @Override
    public Void visit(AssignmentExpr assignmentExpr) {
      //  assignmentExpr.printRoot();
        return null;
    }

    @Override
    public Void visit(Assignment assignment) {
        return null;
    }

    @Override
    public Void visit(commaExpr commaExpr) {
       // commaExpr.printRoot();
        return null;
    }

    @Override
    public Void visit(ConditionalExpr conditionalExpr) {
        return null;
    }

    @Override
    public Void visit(Declaration declaration) {
      InitDeclaratorList initDeclaratorList=  declaration.getInitDeclaratorList();
      if(initDeclaratorList!=null) {
          initDeclaratorList.accept(this);
      }
        return null;
    }

    @Override
    public Void visit(InitDeclarator initDeclarator) {
        Initializer i=initDeclarator.getInitializer();
        if(i!=null) {
                i.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Initializer initializer) {
        initializer.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(BlockItem blockItem) {
      Stmt tmp=  blockItem.getStatement();
      if(tmp!=null) {
          tmp.accept(this);
      }
      else if(blockItem.getDeclaration()!=null){
          blockItem.getDeclaration().accept(this);
      }
     // tmp.accept(this);
        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement)
    {
      //  expressionStatement.accept(this);
       // expressionStatement.getExpression().accept(this);
     Expr e=   expressionStatement.getExpression();
     if(e!=null){
         e.accept(this);
     }
        return null;
    }

    //@Override
   // public Void visit(SelectionStatement selectionStatement) {
                //selectionStatement
    //           selectionStatement.getIfBody().accept(this);
    //           selectionStatement.getElseBody().accept(this);
    //    return null;
   // }

    @Override
    public Void visit(JumpStatement jumpStatement) {
     //   jumpStatement.printItsroot();
        return null;
    }

    @Override
    public Void visit(ForExpression forExpression) {

        return null;
    }

    @Override
    public Void visit(Designator designator) {
        return null;
    }

    @Override
    public Void visit(Designation designation) {
        return null;
    }

    @Override
    public Void visit(InitializerList initializerList) {
        return null;
    }

    @Override
    public Void visit(InitDeclaratorList initDeclaratorList) {
       for(InitDeclarator i : initDeclaratorList.getInitDeclarator()){
           i.accept(this);
       }
        return null;
    }

    @Override
    public Void visit(ForDeclaration forDeclaration) {
        return null;
    }

    @Override
    public Void visit(WhileStmt whileStmt) {
       // whileStmt.getStatement().accept(this);
       // whileStmt.getExpression().printRoot();
        whileStmt.printStmtsCount();
        for (Cnt c :whileStmt.getStmts()){
            c.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(DoWhile doWhile) {
        doWhile.printStmtsCount();
        for (Cnt c :doWhile.getStmts()){
            c.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {

       // forStmt.getStatement().accept(this);
        forStmt.printStmtsCount();
        for (Cnt c :forStmt.getStmts()){
            c.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(IdentifierList identifierList) {
        return null;
    }

    @Override
    public Void visit(UnaryOperator unaryOperator) {

        return null;
    }



    @Override
    public Void visit(ParameterList parameterList) {
        return null;
    }

    @Override
    public Void visit(ParameterDeclaration parameterDeclaration) {
        return null;
    }

    @Override
    public Void visit(AbstractDeclarator abstractDeclarator) {
        return null;
    }

    @Override
    public Void visit(ExpressionDAD expressionDAD) {
        return null;
    }

    @Override
    public Void visit(Type2DAD type2DAD) {
        return null;
    }

    @Override
    public Void visit(Type3DAD type3DAD) {
        return null;
    }

    @Override
    public Void visit(Type4DAD type4DAD) {
        return null;
    }

    @Override
    public Void visit(SpecifierQualifierList specifierQualifierList) {
        return null;
    }

    @Override
    public Void visit(TypeName typeName) {
        return null;
    }

    @Override
    public Void visit(Type1CastExpression type1CastExpression) {
        return null;
    }

    @Override
    public Void visit(Type2CastExpression type2CastExpression) {
        return null;
    }

    @Override
    public Void visit(Type3CastExpression type3CastExpression) {
        return null;
    }

    @Override
    public Void visit(Type1DirectDeclarator type1DirectDeclarator) {
        return null;
    }

    @Override
    public Void visit(CastExpression2 castExpression2) {
        return null;
    }

    @Override
    public Void visit(Type2DirectDeclarator type2DirectDeclarator) {
        return null;
    }

    @Override
    public Void visit(Type3DirectDeclarator type3DirectDeclarator) {
        return null;
    }

    @Override
    public Void visit(Type4DirectDeclarator type4DirectDeclarator) {
        return null;
    }

    @Override
    public Void visit(IDPrefixExpr idPrefixExpr) {
        return null;
    }

    @Override
    public Void visit(ConstantPrefixExpr constantPrefixExpr) {
        return null;
    }

    @Override
    public Void visit(StringPrefixExpr stringPrefixExpr) {
        return null;
    }

    @Override
    public Void visit(ExprPrefixExpr exprPrefixExpr) {
        return null;
    }

    @Override
    public Void visit(TypeNamePrefixExpr typeNamePrefixExpr) {
        return null;
    }

    @Override
    public Void visit(UnaryCastPrefixExpr unaryCastPrefixExpr) {
        return null;
    }

    @Override
    public Void visit(TypeOfPrefixExpr typeOfPrefixExpr) {
        return null;
    }

    @Override
    public Void visit(ElseIf elseIf) {
       // elseIf.getExpression().printRoot();
        elseIf.printStmtsCount();
        for (Cnt c :elseIf.getStmts()){
            c.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(If anIf) {
        //anIf.getExpression().printRoot();
        anIf.printStmtsCount();
        for (Cnt c : anIf.getStmts()){
            c.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Else anElse) {
        anElse.printStmtsCount();
        for (Cnt c :anElse.getStmts()){
            c.accept(this);
        }
        return null;
    }


}


