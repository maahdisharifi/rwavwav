/*package main.visitor;

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
}*/
/*package main.visitor;

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

    private final HashMap<String, FunctionDefinition> functionDefinitions = new HashMap<>();
    private final Stack<HashMap<String, Integer>> allocatedPointersStack = new Stack<>();
    private final Stack<HashSet<String>> initializedVariablesStack = new Stack<>();
    private final Stack<HashSet<String>> taintedVariablesStack = new Stack<>();

    //region Helper Methods for State Management
    private HashMap<String, Integer> allocatedPointers() {
        return allocatedPointersStack.peek();
    }

    private HashSet<String> initializedVariables() {
        return initializedVariablesStack.peek();
    }

    private HashSet<String> taintedVariables() {
        return taintedVariablesStack.peek();
    }

    private boolean isInitialized(String name) {
        for (int i = initializedVariablesStack.size() - 1; i >= 0; i--) {
            if (initializedVariablesStack.get(i).contains(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isTainted(Expr expr) {
        if (expr == null) return false;
        if (expr instanceof Identifier) {
            String name = ((Identifier) expr).getName();
            for (HashSet<String> scope : taintedVariablesStack) {
                if (scope.contains(name)) return true;
            }
        }
        if (expr instanceof BinaryExpr) {
            return isTainted(((BinaryExpr) expr).getFirstOperand()) || isTainted(((BinaryExpr) expr).getSecondOperand());
        }
        if (expr instanceof UnaryExpr) {
            return isTainted(((UnaryExpr) expr).getOperand());
        }
        return false;
    }

    private boolean isPointerAllocated(String name) {
        for (HashMap<String, Integer> scope : allocatedPointersStack) {
            if (scope.containsKey(name)) {
                return true;
            }
        }
        return false;
    }

    private void freePointer(String name) {
        for (HashMap<String, Integer> scope : allocatedPointersStack) {
            if (scope.remove(name) != null) {
                return;
            }
        }
    }

    private void markTainted(Expr args) {
        if (args instanceof Identifier) {
            taintedVariables().add(((Identifier) args).getName());
        } else if (args instanceof ArgumentExpressionList) {
            for (Expr arg : ((ArgumentExpressionList) args).getArgumentsList()) {
                if (arg instanceof Identifier) { // Simplified for now
                    taintedVariables().add(((Identifier) arg).getName());
                }
            }
        }
    }

    private void pushScope() {
        allocatedPointersStack.push(new HashMap<>());
        initializedVariablesStack.push(new HashSet<>());
        taintedVariablesStack.push(new HashSet<>());
    }

    private void popScope() {
        HashMap<String, Integer> leakedPointers = allocatedPointersStack.pop();
        for (String ptrName : leakedPointers.keySet()) {
            System.out.println("Line:" + leakedPointers.get(ptrName) + " -> memory not deallocated");
        }
        initializedVariablesStack.pop();
        taintedVariablesStack.pop();
    }
    //endregion

    @Override
    public Void visit(Program program) {
        // First pass: collect all function definitions
        for (ExternalDeclaration dec : program.getTranslationUnit().getExternalDeclarations()) {
            if (dec instanceof FunctionDefinition) {
                FunctionDefinition funcDef = (FunctionDefinition) dec;
                functionDefinitions.put(funcDef.getName(), funcDef);
            }
        }

        // Second pass: start analysis from main (or all functions if no main)
        FunctionDefinition mainFunction = functionDefinitions.get("main");
        if (mainFunction != null) {
            mainFunction.accept(this);
        } else {
            // Or visit all functions if there's no main entry point
            for (FunctionDefinition funcDef : functionDefinitions.values()) {
                funcDef.accept(this);
            }
        }

        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition) {
        pushScope();

        if (functionDefinition.getParVars() != null) {
            functionDefinition.getParVars().forEach(p -> initializedVariables().add(p.getName()));
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

    @Override
    public Void visit(FuncCallExpr funcCallExpr) {
        Identifier funcNameId = (Identifier) funcCallExpr.getName();
        String funcName = funcNameId.getName();

        // Handle special built-in functions first
        if ("free".equals(funcName)) {
            Expr arg = ((ArgumentExpressionList) funcCallExpr.getArguments()).getArgumentsList().get(0);
            if (arg instanceof Identifier) {
                freePointer(((Identifier) arg).getName());
            }
            return null;
        }

        if ("scanf".equals(funcName)) {
            markTainted(funcCallExpr.getArguments());
            return null;
        }

        // For user-defined functions, perform inter-procedural analysis
        FunctionDefinition callee = functionDefinitions.get(funcName);
        if (callee != null) {
            // Simulate the function call
            HashMap<String, Integer> newAllocated = new HashMap<>();
            HashSet<String> newInitialized = new HashSet<>();
            HashSet<String> newTainted = new HashSet<>();

        //    ArrayList<Expr> args = ((ArgumentExpressionList) funcCallExpr.getArguments()).getArgumentsList();
            ArrayList<DeclarationSpecifiers> params = callee.getParVars();
            ArrayList<Expr> args=   ((ArgumentExpressionList) funcCallExpr.getArguments()).calledFuncParams();
            // 1. Propagate state from arguments to parameters
            for (int i = 0; i < params.size(); i++) {
                String paramName = params.get(i).getName();
                newInitialized.add(paramName); // Parameters are considered initialized

                if (args.get(i) instanceof Identifier) {
                    String argName = ((Identifier) args.get(i)).getName();
                    if (isPointerAllocated(argName)) {
                        newAllocated.put(paramName, args.get(i).getLine());
                    }
                    if (isTainted(args.get(i))) {
                        newTainted.add(paramName);
                    }
                }
            //    else if(args.get(i) instanceof Constant ){

                //}

            }

            // 2. Push the new scope and visit the function body
            allocatedPointersStack.push(newAllocated);
            initializedVariablesStack.push(newInitialized);
            taintedVariablesStack.push(newTainted);

            for (Cnt stmt : callee.getStmts()) {
                stmt.accept(this);
            }

            // 3. Propagate effects back to the caller's scope
            for (int i = 0; i < params.size(); i++) {
                String paramName = params.get(i).getName();
                Expr arg = args.get(i);

                if (arg instanceof Identifier) {
                    String argName = ((Identifier) arg).getName();
                    // If parameter pointer was freed, reflect it in the caller's scope
                    if (isPointerAllocated(argName) && allocatedPointers().containsKey(paramName)) {
                        freePointer(argName);
                    }
                }
            }

            // 4. Pop the function's scope (leaks inside are checked here)
            popScope();

        } /*else {
            // If function is not found, just visit arguments
            if (funcCallExpr.getArguments() != null) {
                funcCallExpr.getArguments().accept(this);
            }
        }*/
    /*    return null;
    }

    // All other visit methods for expressions and declarations remain the same
    // as the previously corrected version...

    @Override
    public Void visit(TranslationUnit translationUnit) {
        for (ExternalDeclaration ex : translationUnit.getExternalDeclarations()) {
            if (ex instanceof FunctionDefinition) {
                if (((FunctionDefinition) ex).getName().equals("main")) {
                    ex.accept(this);
                }
            }
        }
        return null;
    }

    @Override
    public Void visit(Declaration declaration) {
        if (declaration.getInitDeclaratorList() != null) {
            for (InitDeclarator declarator : declaration.getInitDeclaratorList().getInitDeclarator()) {
                if (declarator.getInitializer() != null) {
                    Expr rhs = declarator.getInitializer().getExpression();
                    rhs.accept(this); // Check RHS first
                    String varName = declarator.getValName();
                    initializedVariables().add(varName);

                    if (rhs instanceof FuncCallExpr && "malloc".equals(((Identifier)((FuncCallExpr)rhs).getName()).getName())) {
                        allocatedPointers().put(varName, rhs.getLine());
                        if (isTainted(((FuncCallExpr) rhs).getArguments())) {
                            System.out.println("Line:" + rhs.getLine() + " -> user-controlled value used in malloc");
                        }
                    } else if (isTainted(rhs)) {
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
    public Void visit(AssignmentExpr assignmentExpr) {
        Expr lhs = assignmentExpr.getLeft();
        Expr rhs = assignmentExpr.getRight();
        rhs.accept(this);
        if (lhs instanceof Identifier) {
            String varName = ((Identifier) lhs).getName();
            if (rhs instanceof FuncCallExpr && "malloc".equals(((Identifier)((FuncCallExpr)rhs).getName()).getName())) {
                allocatedPointers().put(varName, lhs.getLine());
                if (isTainted(((FuncCallExpr) rhs).getArguments())) {
                    System.out.println("Line:" + rhs.getLine() + " -> user-controlled value used in malloc");
                }
            }
            initializedVariables().add(varName);
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
    public Void visit(If anIf) {
        anIf.getExpression().accept(this);
        pushScope();
        for (Cnt c : anIf.getStmts()) { c.accept(this); }
        popScope();
        return null;
    }

    @Override
    public Void visit(Else anElse) {
        pushScope();
        for (Cnt c : anElse.getStmts()) { c.accept(this); }
        popScope();
        return null;

    }

    @Override
    public Void visit(ArgumentExpressionList argumentExpressionList) {
        return null;
    }

   /* @Override
    public Void visit(ElseAnElse anElse) {
        pushScope();
        for (Cnt c : anElse.getStmts()) { c.accept(this); }
        popScope();
        return null;
    }*/

  /*  @Override
    public Void visit(ElseIf elseIf) {
        elseIf.getExpression().accept(this);
        pushScope();
        for (Cnt c : elseIf.getStmts()) { c.accept(this); }
        popScope();
        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        if(expressionStatement.getExpression() != null)
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
    public Void visit(WhileStmt whileStmt) {
        return null;
    }

    @Override
    public Void visit(DoWhile doWhile) {
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
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
}*/
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

    private final HashMap<String, FunctionDefinition> functionDefinitions = new HashMap<>();
    private final HashMap<Integer, Integer> allocationSites = new HashMap<>(); // Key: malloc line, Value: malloc line (for error reporting)
    private final Stack<HashMap<String, Integer>> pointerSourceStack = new Stack<>();
    private final Stack<HashSet<String>> initializedVariablesStack = new Stack<>();
    private final Stack<HashSet<String>> taintedVariablesStack = new Stack<>();

    //region Helper Methods
    private HashMap<String, Integer> pointerSources() { return pointerSourceStack.peek(); }
    private HashSet<String> initializedVariables() { return initializedVariablesStack.peek(); }
    private HashSet<String> taintedVariables() { return taintedVariablesStack.peek(); }

    private void pushScope() {
        pointerSourceStack.push(new HashMap<>());
        initializedVariablesStack.push(new HashSet<>());
        taintedVariablesStack.push(new HashSet<>());
    }

    private void popScope() {
        pointerSourceStack.pop();
        initializedVariablesStack.pop();
        taintedVariablesStack.pop();
    }

    private boolean isInitialized(String name) {
        for (HashSet<String> scope : initializedVariablesStack) {
            if (scope.contains(name)) return true;
        }
        return false;
    }

    private Integer findPointerSource(String name) {
        for (int i = pointerSourceStack.size() - 1; i >= 0; i--) {
            if (pointerSourceStack.get(i).containsKey(name)) {
                return pointerSourceStack.get(i).get(name);
            }
        }
        return null;
    }

    private boolean isTainted(Expr toCheck) {
       // ArgumentExpressionList aer =(ArgumentExpressionList) expr;
       // ArrayList<Expr> list=aer.getArgumentsList();
       // Expr toCheck= list.get(0);
       // if (list.size() == 0) return false;
       // Expr toCheck= list.get(0);
        if (toCheck instanceof Identifier) {
            String name = ((Identifier) toCheck).getName();
            for (HashSet<String> scope : taintedVariablesStack) {
                if (scope.contains(name)) return true;
            }
        }
        if (toCheck instanceof BinaryExpr) {
            return isTainted(((BinaryExpr) toCheck).getFirstOperand()) || isTainted(((BinaryExpr) toCheck).getSecondOperand());
        }
     //   if (expr instanceof UnaryExpr) {
     //       return isTainted(((UnaryExpr) expr).getOperand());
      //  }
        return false;
    }
    //endregion

    @Override
    public Void visit(Program program) {
        for (ExternalDeclaration dec : program.getTranslationUnit().getExternalDeclarations()) {
            if (dec instanceof FunctionDefinition) {
                functionDefinitions.put(((FunctionDefinition) dec).getName(), (FunctionDefinition) dec);
            }
        }

        FunctionDefinition mainFunc = functionDefinitions.get("main");
        if (mainFunc != null) {
            mainFunc.accept(this);
        }

        // After all analysis, check for leaks
        for (Integer line : allocationSites.values()) {
            System.out.println("Line:" + line + " -> memory not deallocated");
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition) {
        pushScope();

        if (functionDefinition.getParVars() != null) {
            functionDefinition.getParVars().forEach(p -> initializedVariables().add(p.getName()));
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

    private void handleVariableAssignment(String varName, int line, Expr rhs) {
        rhs.accept(this); // First, analyze the right-hand side.

        // Check for malloc
        if (rhs instanceof FuncCallExpr && "malloc".equals(((Identifier)((FuncCallExpr)rhs).getName()).getName())) {
            int mallocLine = rhs.getLine();
            allocationSites.put(mallocLine, mallocLine); // Register new allocation
            pointerSources().put(varName, mallocLine);   // Track what this pointer points to

            // Check for user-controlled malloc
           Expr expr= ((FuncCallExpr) rhs).getArguments();

             ArgumentExpressionList aer =(ArgumentExpressionList) expr;
             ArrayList<Expr> list=aer.getArgumentsList();

             if (list.size() != 0) {
                 Expr toCheck= list.get(0);
                if (isTainted(toCheck)) {
                    System.out.println("Line:" + mallocLine + " -> user-controlled value used in malloc");
                }

             }
            //

        }
        // Propagate pointer sources and taints
        else if (rhs instanceof Identifier) {
            Integer source = findPointerSource(((Identifier) rhs).getName());
            if (source != null) {
                pointerSources().put(varName, source);
            }
            if (isTainted(rhs)) {
                taintedVariables().add(varName);
            }
        }

        initializedVariables().add(varName); // Mark as initialized
    }

    @Override
    public Void visit(Declaration declaration) {
        if (declaration.getInitDeclaratorList() != null) {
            for (InitDeclarator declarator : declaration.getInitDeclaratorList().getInitDeclarator()) {
                if (declarator.getInitializer() != null) {
                    handleVariableAssignment(declarator.getValName(), declarator.getLine(), declarator.getInitializer().getExpression());
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
    public Void visit(AssignmentExpr assignmentExpr) {
        if (assignmentExpr.getLeft() instanceof Identifier) {
            handleVariableAssignment(((Identifier) assignmentExpr.getLeft()).getName(), assignmentExpr.getLine(), assignmentExpr.getRight());
        } else {
            assignmentExpr.getRight().accept(this);
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
        String funcName = ((Identifier) funcCallExpr.getName()).getName();

        // Visit arguments first to check for errors
        if (funcCallExpr.getArguments() != null) {
            funcCallExpr.getArguments().accept(this);
        }

        // Handle special built-in functions
        if ("free".equals(funcName) && funcCallExpr.getArguments() instanceof ArgumentExpressionList) {
            Expr arg = ((ArgumentExpressionList) funcCallExpr.getArguments()).getArgumentsList().get(0);
            if (arg instanceof Identifier) {
                Integer mallocLine = findPointerSource(((Identifier) arg).getName());
                if (mallocLine != null) {
                    allocationSites.remove(mallocLine);
                }
            }
            return null;
        }

        if ("scanf".equals(funcName)) {
            // This is a simplified taint marking.
            //funcCallExpr.getArguments()
            if (funcCallExpr.getArguments() instanceof ArgumentExpressionList) {
              commaExpr cm= (commaExpr) ((ArgumentExpressionList)funcCallExpr.getArguments()).getArgumentsList().getFirst();
                ArrayList<Expr> cmList=  cm.getList();
              UnaryCastPrefixExpr ucp= (UnaryCastPrefixExpr) cmList.get(1);
             ArrayList<Expr> params=new ArrayList<>();
                      ucp.getParams(params);

                for(Expr arg : params) {
                    if (arg instanceof Identifier) {
                        taintedVariables().add(((Identifier) arg).getName());
                        initializedVariables().add(((Identifier) arg).getName());
                    }
                }
            }
            return null;
        }

        // Handle user-defined functions with inter-procedural analysis
        FunctionDefinition callee = functionDefinitions.get(funcName);
        if (callee != null) {
            pushScope(); // Create a new scope for the callee

           // ArrayList<Expr> args = ((ArgumentExpressionList) funcCallExpr.getArguments()).getArgumentsList();
            ArrayList<DeclarationSpecifiers> params = callee.getParVars();

           // ArrayList<Expr> args=   ((ArgumentExpressionList) funcCallExpr.getArguments()).calledFuncParams();
            // Propagate state from arguments to parameters
            if(params.size()>0) {
                ArrayList<Expr> args=   ((ArgumentExpressionList) funcCallExpr.getArguments()).calledFuncParams();
                for (int i = 0; i < params.size(); i++) {

                    String paramName = params.get(i).getName();
                    initializedVariables().add(paramName);

                    if (i < args.size() && args.get(i) instanceof Identifier) {
                        String argName = ((Identifier) args.get(i)).getName();
                        Integer source = findPointerSource(argName);
                        if (source != null) {
                            pointerSources().put(paramName, source);
                        }
                        if (isTainted(args.get(i))) {
                            taintedVariables().add(paramName);
                        }
                    }
                }
            }
            // Visit the function body with the new context
            for (Cnt stmt : callee.getStmts()) {
                stmt.accept(this);
            }

            popScope(); // Pop the callee's scope
        }
        return null;
    }

    //region Other Visitor Methods
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

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        if(expressionStatement.getExpression() != null)
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
    public Void visit(TranslationUnit translationUnit) {
        for (ExternalDeclaration ex : translationUnit.getExternalDeclarations()) {
            if (ex instanceof FunctionDefinition) {
                if (((FunctionDefinition) ex).getName().equals("main")) {
                    ex.accept(this);
                    return null; // Start and end analysis with main
                }
            }
        }
        // If no main, analyze all functions
        for (ExternalDeclaration ex : translationUnit.getExternalDeclarations()) {
            ex.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(If anIf) {
        anIf.getExpression().accept(this);
        pushScope();
        for (Cnt c : anIf.getStmts()) { c.accept(this); }
        popScope();
        return null;
    }

    @Override
    public Void visit(Else anElse) {
        pushScope();
        for (Cnt c : anElse.getStmts()) { c.accept(this); }
        popScope();
        return null;
    }

    @Override
    public Void visit(ElseIf elseIf) {
        elseIf.getExpression().accept(this);
        pushScope();
        for (Cnt c : elseIf.getStmts()) { c.accept(this); }
        popScope();
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
        pushScope();
     //   forStmt.getSpecifer().getName()
       // handleVariableAssignment();
        for (Cnt c : forStmt.getStmts()) { c.accept(this); }
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

    @Override
    public Void visit(WhileStmt whileStmt) {
        whileStmt.getExpression().accept(this);
        pushScope();
        for (Cnt c : whileStmt.getStmts()) { c.accept(this); }
        popScope();
        return null;
    }

    @Override
    public Void visit(DoWhile doWhile) {
        return null;
    }

    @Override
    public Void visit(ArgumentExpressionList list) {
        for (Expr expr : list.getArgumentsList()) {
            expr.accept(this);
        }
        return null;
    }
    //endregion
}