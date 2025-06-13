package main.visitor;

import main.Stack.MyStack;
import main.ast.nodes.*;
import main.ast.nodes.Stmt.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expr.*;
import main.ast.nodes.expr.primitives.UnaryOperator;
import main.ast.nodes.externalDeclaration.ExternalDeclaration;
import main.ast.nodes.externalDeclaration.FunctionDefinition;

import java.util.ArrayList;
import java.util.List;

//public class TestVisitor extends Visitor<Void>
public class PythnicVisitor extends Visitor<Void>{
    private MyStack myStack= new MyStack();


    @Override
    public Void visit(Program program) {
        program.getTranslationUnit().accept(this);
        return null;
    }

    @Override
    public Void visit(ArgumentExpressionList ae) {
        return null;
    }


    @Override
    public Void visit(TranslationUnit translationUnit) {
       // translationUnit.
        for (        ExternalDeclaration ex           :    translationUnit.getExternalDeclarations()){
            ex.accept(this);
          //  myStack.getRemainingObjects()
            //
            if(myStack.AreAllIndentsOne()){
                ex.setFuncStmts(myStack.getRemainingObjects());
                myStack.emptyStack();
            }
           // else if()
            else {
                myStack.assignStmtsToPrevScope();//
                ex.setFuncStmts(myStack.getRemainingObjects());
                myStack.emptyStack();
            }

            // empty
           // myStack.emptyStack();
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition) {
        CompoundStatement c =functionDefinition.getCompoundStatement();
        c.accept(this);
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
        for (BlockItem b:compoundStatement.getBlocks()){
            b.accept(this);//blockItem;0
        }
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
        return null;
    }

    @Override
    public Void visit(Assignment assignment) {
        return null;
    }

    @Override
    public Void visit(commaExpr commaExpr) {
        return null;
    }

    @Override
    public Void visit(ConditionalExpr conditionalExpr) {
        return null;
    }

    @Override
    public Void visit(Declaration declaration) {
        //myStack.push(declaration);
        myStack.push(declaration);
        return null;
    }

    @Override
    public Void visit(InitDeclarator initDeclarator) {
        return null;
    }

    @Override
    public Void visit(Initializer initializer) {
        return null;
    }

    @Override
    public Void visit(BlockItem blockItem) {
        Stmt tmp=  blockItem.getStatement();
        if(tmp!=null)
            tmp.accept(this); // accept stmt
        else if(blockItem.getDeclaration()!=null){
            blockItem.getDeclaration().accept(this);
        }

        return null;
       // return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        if (expressionStatement.getExpression() ==null) {
            return null;
        }
                 myStack.push(expressionStatement);  //add to stack
        return null;
    }

    @Override
    public Void visit(JumpStatement jumpStatement) {
        myStack.push(jumpStatement);
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
        return null;
    }

    @Override
    public Void visit(ForDeclaration forDeclaration) {
        return null;
    }

    @Override
    public Void visit(WhileStmt whileStmt) {
        myStack.push(whileStmt);
        return null;
    }

    @Override
    public Void visit(DoWhile doWhile) {
        myStack.push(doWhile);
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
        myStack.push(forStmt);
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
        myStack.push(elseIf);
        return null;
    }

    @Override
    public Void visit(If iff) {
        myStack.push(iff);
        return null;
    }

    @Override
    public Void visit(Else elsee) {
        myStack.push(elsee);
        return null;
    }
}
