package main.visitor;

import main.ast.nodes.*;
import main.ast.nodes.Stmt.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expr.*;
import main.ast.nodes.expr.primitives.*;
import main.ast.nodes.externalDeclaration.FunctionDefinition;


public interface IVisitor<T> {

    T visit(Program program);
    T visit(Main main);
    T visit(VarDec varDec);
    T visit(IfStmt ifStmt);
    T visit(FuncCallStmt funcCall);
    T visit(Assign assign);
    T visit(FuncDec funcDec);
    T visit(UnaryExpr unaryExpr);
    T visit(BinaryExpr binaryExpr);
    T visit(Identifier identifier);
    T visit(IntVal int_Val);
    T visit(StringVal string_val);
    T visit(BoolVal int_Val);
    T visit(DoubleVal double_val);
    T visit(FuncCallExpr func_call_expr);
    T visit(Return returnStmt);

    T visit(TranslationUnit translationUnit);

    T visit(FunctionDefinition functionDefinition);

    T visit(DeclarationSpecifiers declarationSpecifiers);

    T visit(Declarator declarator);

    T visit(DeclarationList declarationList);

    T visit(CompoundStatement compoundStatement);

    T visit(DeclarationSpecifier declarationSpecifier);

    T visit(Pointer pointer);

    T visit(Constant constant);

    T visit(TypeName_initList typeNameInitList);

    T visit(ArrIndexing arrIndexing);

    T visit(AssignmentExpr assignmentExpr);

    T visit(Assignment assignment);

    T visit(commaExpr commaExpr);

    T visit(ConditionalExpr conditionalExpr);

    T visit(Declaration declaration);

    T visit(InitDeclarator initDeclarator);

    T visit(Initializer initializer);

    T visit(BlockItem blockItem);

    T visit(ExpressionStatement expressionStatement);

   // T visit(SelectionStatement selectionStatement);

    T visit(JumpStatement jumpStatement);

    T visit(ForExpression forExpression);

    T visit(Designator designator);

    T visit(Designation designation);

    T visit(InitializerList initializerList);

    T visit(InitDeclaratorList initDeclaratorList);

    T visit(ForDeclaration forDeclaration);

    T visit(WhileStmt whileStmt);

    T visit(DoWhile doWhile);

    T visit(ForStmt forStmt);

    T visit(IdentifierList identifierList);

    T visit(UnaryOperator unaryOperator);



    T visit(ParameterList parameterList);

    T visit(ParameterDeclaration parameterDeclaration);

    T visit(AbstractDeclarator abstractDeclarator);


    T visit(ExpressionDAD expressionDAD);

    T visit(Type2DAD type2DAD);

    T visit(Type3DAD type3DAD);

    T visit(Type4DAD type4DAD);

    T visit(SpecifierQualifierList specifierQualifierList);

    T visit(TypeName typeName);

    T visit(Type1CastExpression type1CastExpression);

    T visit(Type2CastExpression type2CastExpression);

    T visit(Type3CastExpression type3CastExpression);

    T visit(Type1DirectDeclarator type1DirectDeclarator);

    T visit(CastExpression2 castExpression2);

    T visit(Type2DirectDeclarator type2DirectDeclarator);

    T visit(Type3DirectDeclarator type3DirectDeclarator);

    T visit(Type4DirectDeclarator type4DirectDeclarator);

    T visit(IDPrefixExpr idPrefixExpr);

    T visit(ConstantPrefixExpr constantPrefixExpr);

    T visit(StringPrefixExpr stringPrefixExpr);

    T visit(ExprPrefixExpr exprPrefixExpr);

    T visit(TypeNamePrefixExpr typeNamePrefixExpr);

    T visit(UnaryCastPrefixExpr unaryCastPrefixExpr);

    T visit(TypeOfPrefixExpr typeOfPrefixExpr);

    T visit(ElseIf elseIf);

    T visit(If anIf);

    T visit(Else anElse);

    T visit(ArgumentExpressionList argumentExpressionList);
}
