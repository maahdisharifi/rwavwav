package main.visitor;

import main.ast.nodes.*;
import main.ast.nodes.Stmt.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expr.*;
import main.ast.nodes.expr.primitives.UnaryOperator;
import main.ast.nodes.externalDeclaration.ExternalDeclaration;
import main.ast.nodes.externalDeclaration.FunctionDefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class MemoryCheckerVisitor extends Visitor<Void> {

    // Stacks to manage scopes for each check
    private final Stack<HashMap<String, Integer>> allocatedPointersStack = new Stack<>();
    private final Stack<HashSet<String>> initializedVariablesStack = new Stack<>();
    private final Stack<HashSet<String>> taintedVariablesStack = new Stack<>();

    // Helper to get the current map/set from the top of the stack
    private HashMap<String, Integer> allocatedPointers() {
        return allocatedPointersStack.peek();
    }

    private HashSet<String> initializedVariables() {
        return initializedVariablesStack.peek();
    }

    private HashSet<String> taintedVariables() {
        return taintedVariablesStack.peek();
    }

    // Helper to check all scopes for an initialized variable
    private boolean isInitialized(String name) {
        for (int i = initializedVariablesStack.size() - 1; i >= 0; i--) {
            if (initializedVariablesStack.get(i).contains(name)) {
                return true;
            }
        }
        return false;
    }

    // A recursive helper to check if an expression is tainted
    private boolean isTainted(Expr expr) {
        if (expr == null) return false;
        if (expr instanceof Identifier) {
            for (HashSet<String> scope : taintedVariablesStack) {
                if (scope.contains(((Identifier) expr).getName())) {
                    return true;
                }
            }
        }
        if (expr instanceof BinaryExpr) {
            return isTainted(((BinaryExpr) expr).getFirstOperand()) || isTainted(((BinaryExpr) expr).getSecondOperand());
        }
        if (expr instanceof UnaryExpr) {
            return isTainted(((UnaryExpr) expr).getOperand());
        }
        // Extend with more expression types if necessary
        return false;
    }

    // Helper to mark variables from scanf as tainted
    private void markTainted(Expr args) {
        if (args instanceof Identifier) {
            taintedVariables().add(((Identifier) args).getName());
        }
        // A more robust solution would handle comma-separated arguments in scanf
    }

    // Helper to push new scope-tracking structures onto the stacks
    private void pushScope() {
        allocatedPointersStack.push(new HashMap<>());
        initializedVariablesStack.push(new HashSet<>());
        taintedVariablesStack.push(new HashSet<>());
    }

    // Helper to pop scopes and check for memory leaks
    private void popScope() {
        // Task 1: Check for memory leaks at the end of a scope
        HashMap<String, Integer> leakedPointers = allocatedPointersStack.pop();
        for (String ptrName : leakedPointers.keySet()) {
            leakedPointers.get(ptrName);
            System.out.println("Line:" + leakedPointers.get(ptrName) + " -> memory not deallocated");
        }
        initializedVariablesStack.pop();
        taintedVariablesStack.pop();
    }

    @Override
    public Void visit(Program program) {
        pushScope(); // Global scope
        program.getTranslationUnit().accept(this);
        popScope(); // Check for any leaks in the global scope
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition) {
        pushScope();

        if (functionDefinition.getParVars() != null) {
            functionDefinition.getParVars().forEach(p -> {
                initializedVariables().add(p.getName());
                // You could also mark parameters as tainted if they are pointers, for a stricter check
            });
        }

        for (Cnt stmt : functionDefinition.getStmts()) {
            stmt.accept(this);
        }

        popScope();
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

    // For loop scope
    @Override
    public Void visit(ForStmt forStmt) {
        pushScope();
        // Handle for-loop initializations here if needed
        for (Cnt c : forStmt.getStmts()) {
            c.accept(this);
        }
        popScope();
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

    // While loop scope
    @Override
    public Void visit(WhileStmt whileStmt) {
        pushScope();
        for (Cnt c : whileStmt.getStmts()) {
            c.accept(this);
        }
        popScope();
        return null;
    }

    @Override
    public Void visit(DoWhile doWhile) {
        return null;
    }

    // If block scope
    @Override
    public Void visit(If anIf) {
        anIf.getExpression().accept(this);
        pushScope();
        for (Cnt c : anIf.getStmts()) {
            c.accept(this);
        }
        popScope();
        return null;
    }

    // Else-If block scope
    @Override
    public Void visit(ElseIf elseIf) {
        elseIf.getExpression().accept(this);
        pushScope();
        for (Cnt c : elseIf.getStmts()) {
            c.accept(this);
        }
        popScope();
        return null;
    }

    // Else block scope
    @Override
    public Void visit(Else anElse) {
        pushScope();
        for (Cnt c : anElse.getStmts()) {
            c.accept(this);
        }
        popScope();
        return null;
    }

    @Override
    public Void visit(ArgumentExpressionList argumentExpressionList) {
        return null;
    }

    @Override
    public Void visit(Declaration declaration) {
        if (declaration.getInitDeclaratorList() != null) {
            for (InitDeclarator declarator : declaration.getInitDeclaratorList().getInitDeclarator()) {
                // If there's an initializer, it means the variable is being assigned a value.
                if (declarator.getInitializer() != null) {
                    Expr rhs = declarator.getInitializer().getExpression();
                    // Visit the right-hand side to check for uninitialized vars BEFORE marking the new one as initialized
                    rhs.accept(this);

                    String varName = declarator.getValName();
                    // Mark this new variable as initialized.
                    initializedVariables().add(varName);

                    // Handle malloc calls during declaration
                    if (rhs instanceof FuncCallExpr && ((Identifier) ((FuncCallExpr) rhs).getName()).getName().equals("malloc")) {
                        allocatedPointers().put(varName, rhs.getLine());
                        if (isTainted(((FuncCallExpr) rhs).getArguments())) {
                            System.out.println("Line:" + rhs.getLine() + " -> user-controlled value used in malloc");
                        }
                    } else if (isTainted(rhs)) { // Propagate taint
                        taintedVariables().add(varName);
                    }
                }
            }
        }
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
        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        expressionStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(JumpStatement jumpStatement) {
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
    public Void visit(AssignmentExpr assignmentExpr) {
        Expr lhs = assignmentExpr.getLeft();
        Expr rhs = assignmentExpr.getRight();

        // Check for usage of uninitialized or tainted variables on the right side
        rhs.accept(this);

        if (lhs instanceof Identifier) {
            String varName = ((Identifier) lhs).getName();

            // Handle malloc
            if (rhs instanceof FuncCallExpr && ((Identifier) ((FuncCallExpr) rhs).getName()).getName().equals("malloc")) {
                allocatedPointers().put(varName, lhs.getLine());
                if (isTainted(((FuncCallExpr) rhs).getArguments())) {
                    System.out.println("Line:" + rhs.getLine() + " -> user-controlled value used in malloc");
                }
            }

            // The variable on the left side is now initialized.
            initializedVariables().add(varName);

            // If the right side was tainted, the left side is now tainted too.
            if (isTainted(rhs)) {
                taintedVariables().add(varName);
            }
        }
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
    public Void visit(Identifier identifier) {
        if (!isInitialized(identifier.getName())) {
            System.out.println("Line:" + identifier.getLine() + " -> uninitialized variable used");
        }
        return null;
    }

    @Override
    public Void visit(FuncCallExpr funcCallExpr) {
        Identifier funcName = (Identifier) funcCallExpr.getName();

        if (funcCallExpr.getArguments() != null) {
            funcCallExpr.getArguments().accept(this);
        }

        if (funcName.getName().equals("free")) {
            Expr arg = funcCallExpr.getArguments();
            if (arg instanceof ArgumentExpressionList) {
                // Remove from the maps of all scopes
                ArrayList<Expr>name=  ((ArgumentExpressionList) arg).getArgumentsList();
                if (name!=null){
                    String n=   ( (Identifier) name.getFirst()).getName();
                    for (HashMap<String, Integer> scope : allocatedPointersStack) {
                        scope.remove(n);
                    }
                }

            }
        }

        if (funcName.getName().equals("scanf")) {
            // This is a simplified approach; a full implementation would parse the format string
            // and mark the corresponding variables passed by reference as tainted.
            markTainted(funcCallExpr.getArguments());
        }
        return null;
    }

    @Override
    public Void visit(TranslationUnit translationUnit) {
        for (        ExternalDeclaration ex           :    translationUnit.getExternalDeclarations()){

            ex.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(BinaryExpr binaryExpr) {
        binaryExpr.getFirstOperand().accept(this);
        binaryExpr.getSecondOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpr unaryExpr) {
        unaryExpr.getOperand().accept(this);
        return null;
    }
}