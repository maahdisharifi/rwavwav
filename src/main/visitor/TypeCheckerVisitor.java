package main.visitor;

import main.ast.nodes.*;
import main.ast.nodes.Stmt.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expr.*;
import main.ast.nodes.expr.primitives.BoolVal;
import main.ast.nodes.expr.primitives.DoubleVal;
import main.ast.nodes.expr.primitives.IntVal;
import main.ast.nodes.expr.primitives.StringVal;
import main.ast.nodes.expr.primitives.UnaryOperator;
import main.ast.nodes.externalDeclaration.ExternalDeclaration;
import main.ast.nodes.externalDeclaration.FunctionDefinition;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.item.FunctionDefinitionSymbolTableItem;
import main.symbolTable.item.VarDecSymbolTableItem;

import java.util.ArrayList;
import java.util.Objects;

public class TypeCheckerVisitor extends Visitor<String> {

    private FunctionDefinition currentFunction;

    // Utility to get type from DeclarationSpecifiers
    private String getTypeFromDeclarationSpecifiers(DeclarationSpecifiers specifiers) {
        if (specifiers == null) return "void";
        // This is a simplified assumption. A real implementation would handle combinations
        // like "unsigned int". For this language, we'll assume the first specifier is the base type.
        return specifiers.getType();
    }

    // Utility to check if a type can be implicitly cast to another
    private boolean isCompatible(String actualType, String expectedType) {
        if (actualType.equals(expectedType)) {
            return true;
        }
        // Allow casting from smaller numeric types to larger ones
        if (isNumeric(actualType) && isNumeric(expectedType)) {
            if (expectedType.equals("double")) return true;
            if (expectedType.equals("float") && !actualType.equals("double")) return true;
            if (expectedType.equals("int") && (actualType.equals("short") || actualType.equals("char"))) return true;
        }
        // Handle pointer compatibility if needed (e.g., any pointer to void*)
        return false;
    }

    private boolean isNumeric(String type) {
        return type.equals("int") || type.equals("float") || type.equals("double") || type.equals("short") || type.equals("char");
    }


    @Override
    public String visit(Program program) {
        for (ExternalDeclaration dec : program.getTranslationUnit().getExternalDeclarations()) {
            dec.accept(this);
        }
        return null;
    }

    @Override
    public String visit(FunctionDefinition functionDefinition) {
        this.currentFunction = functionDefinition;
        // The body of the function is a list of Cnt nodes
        for (Cnt c : functionDefinition.getStmts()) {
            c.accept(this);
        }
        this.currentFunction = null;
        return null;
    }

    @Override
    public String visit(DeclarationSpecifiers declarationSpecifiers) {
        return "";
    }

    @Override
    public String visit(Declarator declarator) {
        return "";
    }

    @Override
    public String visit(DeclarationList declarationList) {
        return "";
    }

    @Override
    public String visit(CompoundStatement compoundStatement) {
        return "";
    }

    @Override
    public String visit(DeclarationSpecifier declarationSpecifier) {
        return "";
    }

    @Override
    public String visit(Pointer pointer) {
        return "";
    }
    public enum LiteralType {
        CHAR,
        INT,
        FLOAT,
        DOUBLE,
        STRING
    }
    @Override
    public String visit(Constant constant) {

      String val= (String) constant.getName();
        // 1) CHAR: exactly one character, which is not a digit
        if (val.length() == 3  && val.startsWith("'") && val.endsWith("'") ) {
            return LiteralType.CHAR.name().toLowerCase();
        }

        // 2) INT: an optional +/–, then one or more digits
        //    this will treat "01", "14", "1", "-42" all as INT
        if (val.matches("[+-]?\\d+")) {
            return LiteralType.INT.name().toLowerCase();
        }

        // 3) FLOAT/DOUBLE: decimal or exponent form, optional f/F at end
        //    e.g. "0.4", "44.14", "3e5", "2.1E-3", "6.02e23f"
        if (val.matches(
                "[+-]?(" +
                        "(\\d+\\.\\d*)|(\\.\\d+)" +          // decimal no exponent
                        "|(\\d+[eE][+-]?\\d+)" +            // integer with exponent
                        "|(\\d+\\.\\d*[eE][+-]?\\d+)" +     // decimal with exponent
                        ")[fF]?")) {
            // if it ends with 'f' or 'F', treat as float, else double
            if (val.endsWith("f") || val.endsWith("F")) {
                return LiteralType.FLOAT.name().toLowerCase();
            } else {
                return LiteralType.DOUBLE.name().toLowerCase();
            }
        }

        // 4) fallback
        return LiteralType.STRING.name().toLowerCase();
    }

    @Override
    public String visit(TypeName_initList typeNameInitList) {
        return "";
    }

    @Override
    public String visit(ArrIndexing arrIndexing) {
        return "";
    }

    @Override
    public String visit(Return returnStmt) {
        if (currentFunction == null ) {
            return null;
        }
        String actualReturnType="";
        if (returnStmt.getReturn_value()==null){
            actualReturnType="void";
        }
        else {
             actualReturnType = returnStmt.getReturn_value().accept(this);
        }
        String expectedReturnType = getTypeFromDeclarationSpecifiers(currentFunction.getDeclarationSpecifiers());

        if (!isCompatible(actualReturnType, expectedReturnType)) {
            System.out.println("Line:" + returnStmt.getLine() + " -> return type mismatch");
        }
        return null;
    }

    @Override
    public String visit(TranslationUnit translationUnit) {
        return "";
    }

    @Override
    public String visit(BinaryExpr binaryExpr) {
        String leftType = binaryExpr.getFirstOperand().accept(this);
        String rightType = binaryExpr.getSecondOperand().accept(this);

        if (leftType.equals("ERROR") || rightType.equals("ERROR")) {
            return "ERROR";
        }
        // Task 2: Non-Same Operands
        if (isNumeric(leftType) && isNumeric(rightType)) {
            if (leftType.equals("double") || rightType.equals("double")) return "double";
            if (leftType.equals("float") || rightType.equals("float")) return "float";
            return "int";
        }

        if (leftType.equals("string") && rightType.equals("string") && binaryExpr.getOperator().equals("+")) {
            return "string";
        }

        if (!leftType.equals(rightType)) {
            System.out.println("Line:" + binaryExpr.getLine() + " -> type mismatch in expression");
            return "ERROR";
        }

        return leftType;
    }

    @Override
    public String visit(AssignmentExpr assignmentExpr) {
        String leftType = assignmentExpr.getLeft().accept(this);
        String rightType = assignmentExpr.getRight().accept(this);

        if (leftType.equals("ERROR") || rightType.equals("ERROR")) {
            return "ERROR";
        }
        if (!isCompatible(rightType, leftType)) {
            System.out.println("Line:" + assignmentExpr.getLine() + " -> type mismatch in expression");
            return "ERROR";
        }
        return leftType;
    }

    @Override
    public String visit(Assignment assignment) {
        return "";
    }

    @Override
    public String visit(commaExpr commaExpr) {
        return "";
    }

    @Override
    public String visit(ConditionalExpr conditionalExpr) {
        return "";
    }

    @Override
    public String visit(FuncCallExpr funcCallExpr) {
        Identifier funcId = (Identifier) funcCallExpr.getName();
        String funcName = funcId.getName();

        ArrayList<Expr> args = new ArrayList<>();
        if (funcCallExpr.getArguments() != null) {
          //  args = ((ArgumentExpressionList) funcCallExpr.getArguments()).getArgumentsList();
          args=  ((ArgumentExpressionList) funcCallExpr.getArguments()).calledFuncParams();
        }

        String key = FunctionDefinitionSymbolTableItem.START_KEY + ((ArgumentExpressionList) funcCallExpr.getArguments()).getSize() + funcName;

        try {
            FunctionDefinitionSymbolTableItem item = (FunctionDefinitionSymbolTableItem) SymbolTable.root.getItem(key);
            FunctionDefinition funcDef = item.getFuncDec();

            ArrayList<DeclarationSpecifiers> params = funcDef.getParVars();

            // Task 1: Argument Mismatch Type
            if (args.size() != params.size()) {
                System.out.println("Line:" + funcCallExpr.getLine() + " -> argument type mismatch");
                return "ERROR";
            }

            for (int i = 0; i < args.size(); i++) {
                String argType = args.get(i).accept(this);
                String paramType = getTypeFromDeclarationSpecifiers(params.get(i));
                if (!isCompatible(argType, paramType)) {
                    System.out.println("Line:" + funcCallExpr.getLine() + " -> argument type mismatch");
                }
            }
            return getTypeFromDeclarationSpecifiers(funcDef.getDeclarationSpecifiers());

        } catch (ItemNotFoundException e) {
            // built in functions handle?
         //   if()
           // return "ERROR";
            return "ERROR";
        }
    }

    @Override
    public String visit(Identifier identifier) {
        try {//

            VarDecSymbolTableItem item = (VarDecSymbolTableItem) currentFunction.getSymbolTable().getItem(VarDecSymbolTableItem.START_KEY + identifier.getName());
            return item.getType();
           // return "";
        } catch (ItemNotFoundException e) {
            return "ERROR";
        }
    }

    @Override
    public String visit(IntVal intVal) {
        return "int";
    }

    @Override
    public String visit(DoubleVal doubleVal) {
        return "double";
    }

    @Override
    public String visit(StringVal stringVal) {
        return "string";
    }

    @Override
    public String visit(BoolVal boolVal) {
        return "bool";
    }

    // Default visiting for other nodes to traverse the tree
    @Override
    public String visit(UnaryExpr unaryExpr) {
        return unaryExpr.getOperand().accept(this);
    }

    @Override
    public String visit(ExpressionStatement expressionStatement) {
        if(expressionStatement.getExpression() != null) {
            expressionStatement.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public String visit(JumpStatement jumpStatement) {
        if (Objects.equals(jumpStatement.getType(), "return")){
            if (currentFunction == null ) {
                return null;
            }
            String actualReturnType="";
            if (jumpStatement.getReturn_value()==null){
                actualReturnType="void";
            }
            else {
                actualReturnType = jumpStatement.getReturn_value().accept(this);
            }
            String expectedReturnType = getTypeFromDeclarationSpecifiers(currentFunction.getDeclarationSpecifiers());

            if (!isCompatible(actualReturnType, expectedReturnType)) {
                System.out.println("Line:" + jumpStatement.getLine() + " -> return type mismatch");
            }
            return null;
        }
        return "";
    }

    @Override
    public String visit(ForExpression forExpression) {
        return "";
    }

    @Override
    public String visit(Designator designator) {
        return "";
    }

    @Override
    public String visit(Designation designation) {
        return "";
    }

    @Override
    public String visit(InitializerList initializerList) {
        return "";
    }

    @Override
    public String visit(Declaration declaration) {
        if(declaration.getInitDeclaratorList() != null) {
         String rhsTyp=   declaration.getInitDeclaratorList().accept(this);
         if(rhsTyp=="ERROR"){
             return null;
         }
         String lftTyp=getTypeFromDeclarationSpecifiers(declaration.getDeclarationSpecifiers());
            if (!isCompatible(rhsTyp, lftTyp)) {
                System.out.println("Line:" + declaration.getLine() + " -> type mismatch in expression");
                return "ERROR";
            }
        }
        return null;
    }

    @Override
    public String visit(InitDeclaratorList initDeclaratorList) {
        for(InitDeclarator id : initDeclaratorList.getInitDeclarator()) {
            return id.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ForDeclaration forDeclaration) {
        return "";
    }

    @Override
    public String visit(InitDeclarator initDeclarator) {
        if (initDeclarator.getInitializer() != null) {
           return initDeclarator.getInitializer().accept(this);
        }
        return null;
    }

    /*@Override
    public String visit(Initializer initializer) {
        return "";
    }*/

    @Override
    public String visit(BlockItem blockItem) {
        return "";
    }

    @Override
    public String visit(Initializer initializer) {
        if(initializer.getExpression() != null) {
         return    initializer.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public String visit(If anIf) {
        anIf.getExpression().accept(this);
        for(Cnt c: anIf.getStmts()) {
            c.accept(this);
        }
        return null;
    }

    @Override
    public String visit(Else anElse) {
        for(Cnt c: anElse.getStmts()) {
            c.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ArgumentExpressionList argumentExpressionList) {
        return "";
    }

    @Override
    public String visit(ElseIf elseIf) {
        elseIf.getExpression().accept(this);
        for(Cnt c: elseIf.getStmts()) {
            c.accept(this);
        }
        return null;
    }

    @Override
    public String visit(WhileStmt whileStmt) {
        whileStmt.getExpression().accept(this);
        for(Cnt c : whileStmt.getStmts()) {
            c.accept(this);
        }
        return null;
    }

    @Override
    public String visit(DoWhile doWhile) {
        return "";
    }

    @Override
    public String visit(ForStmt forStmt) {
        return "";
    }

    @Override
    public String visit(IdentifierList identifierList) {
        return "";
    }

    @Override
    public String visit(UnaryOperator unaryOperator) {
        return "";
    }

    @Override
    public String visit(ParameterList parameterList) {
        return "";
    }

    @Override
    public String visit(ParameterDeclaration parameterDeclaration) {
        return "";
    }

    @Override
    public String visit(AbstractDeclarator abstractDeclarator) {
        return "";
    }

    @Override
    public String visit(ExpressionDAD expressionDAD) {
        return "";
    }

    @Override
    public String visit(Type2DAD type2DAD) {
        return "";
    }

    @Override
    public String visit(Type3DAD type3DAD) {
        return "";
    }

    @Override
    public String visit(Type4DAD type4DAD) {
        return "";
    }

    @Override
    public String visit(SpecifierQualifierList specifierQualifierList) {
        return "";
    }

    @Override
    public String visit(TypeName typeName) {
        return "";
    }

    @Override
    public String visit(Type1CastExpression type1CastExpression) {
        return "";
    }

    @Override
    public String visit(Type2CastExpression type2CastExpression) {
        return "";
    }

    @Override
    public String visit(Type3CastExpression type3CastExpression) {
        return "";
    }

    @Override
    public String visit(Type1DirectDeclarator type1DirectDeclarator) {
        return "";
    }

    @Override
    public String visit(CastExpression2 castExpression2) {
        return "";
    }

    @Override
    public String visit(Type2DirectDeclarator type2DirectDeclarator) {
        return "";
    }

    @Override
    public String visit(Type3DirectDeclarator type3DirectDeclarator) {
        return "";
    }

    @Override
    public String visit(Type4DirectDeclarator type4DirectDeclarator) {
        return "";
    }

    @Override
    public String visit(IDPrefixExpr idPrefixExpr) {
        return "";
    }

    @Override
    public String visit(ConstantPrefixExpr constantPrefixExpr) {
        return "";
    }

    @Override
    public String visit(StringPrefixExpr stringPrefixExpr) {
        return "";
    }

    @Override
    public String visit(ExprPrefixExpr exprPrefixExpr) {
        return "";
    }

    @Override
    public String visit(TypeNamePrefixExpr typeNamePrefixExpr) {
        return "";
    }

    @Override
    public String visit(UnaryCastPrefixExpr unaryCastPrefixExpr) {
        return "";
    }

    @Override
    public String visit(TypeOfPrefixExpr typeOfPrefixExpr) {
        return "";
    }
}