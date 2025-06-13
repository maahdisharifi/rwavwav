package main.visitor;

import main.ast.nodes.*;
import main.ast.nodes.Stmt.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expr.*;
import main.ast.nodes.expr.primitives.UnaryOperator;
import main.ast.nodes.externalDeclaration.ExternalDeclaration;
import main.ast.nodes.externalDeclaration.FunctionDefinition;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;

import main.symbolTable.item.*;

import java.util.ArrayList;
import java.util.Arrays;

/*
*   Main Changes:
*       1.create a SymbolTable class to act as our symbol table
*       2.create some symbolTableItems as the different nodes which are going to be stored in the SymbolTable
*       3.create a new visitor as our NameAnalyzer
*       4.add a symbolTable field in program, main, and func_dec AST nodes to store the corresponding symbol table
* */


public class NameAnalyzer extends Visitor<Void>{

    public boolean nameAnalyzerActivated=false;
    ArrayList<String> builtInFunctions = new ArrayList<>(Arrays.asList("printf", "scanf"));
    @Override
    public Void visit(ArgumentExpressionList ae){

       for(Expr e: ae.getArgumentsList()){
           e.accept(this);
       }
       return null;
    }
    @Override
    public Void visit(FuncCallExpr funcCallExpr) {
      Identifier id= (Identifier)  funcCallExpr.getName();

        if (builtInFunctions.contains(id.getName())  ){
            Expr e=funcCallExpr.getArguments();
                    if(e!=null) {
                        e.accept(this);
                    }
            return null;
        }
        Expr ww=funcCallExpr.getArguments();
        int parametersSize=0;
        if(ww==null){
            parametersSize=0;
        }else {
            ArgumentExpressionList a = (ArgumentExpressionList) funcCallExpr.getArguments();
            parametersSize = a.getSize();
        }
        FuncCallSymbolTableItem fcst=new FuncCallSymbolTableItem(funcCallExpr);
        try {
            SymbolTable.top.getItem(FunctionDefinitionSymbolTableItem.START_KEY + String.valueOf(parametersSize) +id.getName());
            try {
                SymbolTable.top.put(fcst);
            } catch (ItemAlreadyExistsException e) {
               // System.out.println("Redefinition of var");
            }
        } catch (ItemNotFoundException e) {
            //Line:<LineNumber>-> <Function> not declared
            this.nameAnalyzerActivated=true;
            System.out.println("Line:"+String.valueOf(funcCallExpr.getLine())+"-> "+id.getName() +" not declared");
        }
        if(ww!=null) {
            funcCallExpr.getArguments().accept(this);
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
    public Void visit(Program program) {
        TranslationUnit t=program.getTranslationUnit();
        t.accept(this);
        return null;
    }

    @Override
    public Void visit(TranslationUnit translationUnit) {
        SymbolTable.top = new SymbolTable();
        SymbolTable.root = SymbolTable.top;

        translationUnit.set_symbol_table(SymbolTable.top);
        for (        ExternalDeclaration ex           :    translationUnit.getExternalDeclarations()){
            ex.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition functionDefinition) {
     //   afterReturn=false;
       FunctionDefinitionSymbolTableItem f=new FunctionDefinitionSymbolTableItem(functionDefinition);

        try {
            SymbolTable.top.put(f);
        } catch (ItemAlreadyExistsException e) {
            System.out.println("Redefinition of function \"" + functionDefinition.getName() +"\" in line " + functionDefinition.getLine());
        }
        SymbolTable func_dec_symbol_table = new SymbolTable(SymbolTable.top);
        functionDefinition.setSymbolTable(func_dec_symbol_table);
        SymbolTable.push(func_dec_symbol_table);

        for(DeclarationSpecifiers d:functionDefinition.getParVars()){
            VarDecSymbolTableItem x = new VarDecSymbolTableItem(d);
            try {
                SymbolTable.top.put(x);
            } catch (ItemAlreadyExistsException e) {
                System.out.println("Redefinition of var");
            }

        }
        for(Cnt c:functionDefinition.getStmts()){
            c.accept(this);
        }

        SymbolTable.pop();
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
    public Void visit(Identifier id) {
        try {
            SymbolTable.top.getItem(id.START_KEY + id.getName());
        } catch (ItemNotFoundException e) {
            //Line:<LineNumber>-> <Variable> not declared
            this.nameAnalyzerActivated=true;
            System.out.println("Line:"+String.valueOf(id.getLine())+"-> "+id.getName()+" not declared");
        }
        return null;
    }

    @Override
    public Void visit(AssignmentExpr assignmentExpr) {

    assignmentExpr.getLeft().accept(this);
    assignmentExpr.getRight().accept(this);

        return null;
    }

    @Override
    public Void visit(Assignment assignment) {
        return null;
    }

    @Override
    public Void visit(commaExpr commaExpr) {
        for( Expr e: commaExpr.getList()){
            e.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConditionalExpr conditionalExpr) {
        return null;
    }

    @Override
    public Void visit(Declaration declaration) {
      //  declaration.
        //
        DeclarationSpecifiers ds= declaration.getDeclarationSpecifiers();
        if(declaration.getInitDeclaratorList() !=null ) {
            for (InitDeclarator id : declaration.getInitDeclaratorList().getInitDeclarator()) {
                VarDecSymbolTableItem f = new VarDecSymbolTableItem(ds, id);//int a,b

                try {
                    SymbolTable.top.put(f);
                } catch (ItemAlreadyExistsException e) {
                    //Line:<LineNumber>-> <Variable> not declared
                    System.out.println("Redefinition of var");
                }

            }
            if( declaration.getInitDeclaratorList().getInitDeclarator().get(0).getInitializer()!=null){
                declaration.getInitDeclaratorList().getInitDeclarator().get(0).getInitializer().getExpression().accept(this);//int a=5+b
            }
        }







        else{//int a
            VarDecSymbolTableItem f = new VarDecSymbolTableItem(ds);

            try {
                SymbolTable.top.put(f);
            } catch (ItemAlreadyExistsException e) {
                System.out.println("Redefinition of var");
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
        if(jumpStatement.getExpr()!=null) {
            jumpStatement.getExpr().accept(this);
        }
        //afterReturn=true;
        return null;
    }
    @Override
    public Void visit(UnaryExpr unaryExpr) {
        unaryExpr.getOperand().accept(this);
        //jumpStatement.getExpr().accept(this);
        //afterReturn=true;
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
        whileStmt.getExpression().accept(this);
        SymbolTable while_symbol_table = new SymbolTable(SymbolTable.top);
        whileStmt.setSymbolTable(while_symbol_table);
        SymbolTable.push(while_symbol_table);

        for (Cnt stmt :whileStmt.getStmts()) {
            if (stmt != null) {
                stmt.accept(this);
            }
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(DoWhile doWhile) {
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
       // elseIf.getExpression().accept(this);

        SymbolTable for_symbol_table = new SymbolTable(SymbolTable.top);
        forStmt.setSymbolTable(for_symbol_table);
        SymbolTable.push(for_symbol_table);
     //   forStmt.getSpecifer();
      //  forStmt.getInitDeclarator();
       VarDecSymbolTableItem vd=new VarDecSymbolTableItem( forStmt.getSpecifer(),forStmt.getInitDeclarator());
        try {
            SymbolTable.top.put(vd);
        } catch (ItemAlreadyExistsException e) {
            System.out.println("Redefinition of var");
        }
        for (Cnt stmt :forStmt.getStmts()) {
            if (stmt != null) {
                stmt.accept(this);
            }
        }

        SymbolTable.pop();
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
     //   ElseIfSymbolTableItem elseIf_item = new ElseIfSymbolTableItem(elseIf);
       /* try {
            SymbolTable.top.put(elseIf_item);
        } catch (ItemAlreadyExistsException e) {
            // System.out.println("Redefinition of function \"" + func_dec.getFuncName() +"\" in line " + func_dec.getLine());
        }*/

        elseIf.getExpression().accept(this);
        SymbolTable elseIf_symbol_table = new SymbolTable(SymbolTable.top);
        elseIf.setSymbolTable(elseIf_symbol_table);
        SymbolTable.push(elseIf_symbol_table);

        for (Cnt stmt : elseIf.getStmts()) {
            if (stmt != null) {
                stmt.accept(this);
            }
        }

        SymbolTable.pop();

        return null;
    }

    @Override
    public Void visit(If anIf) {
       /* IfSymbolTableItem if_item = new IfSymbolTableItem(anIf);
        try {
            SymbolTable.top.put(if_item);
        } catch (ItemAlreadyExistsException e) {
           // System.out.println("Redefinition of function \"" + func_dec.getFuncName() +"\" in line " + func_dec.getLine());
        }**/

        anIf.getExpression().accept(this);
        SymbolTable if_symbol_table = new SymbolTable(SymbolTable.top);
        anIf.set_symbol_table(if_symbol_table);
        SymbolTable.push(if_symbol_table);

        for (Cnt stmt : anIf.getStmts()) {
            if (stmt != null) {
                stmt.accept(this);
            }
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(Else anElse) {
     /*   ElseSymbolTableItem else_item = new ElseSymbolTableItem(anElse);
        try {
            SymbolTable.top.put(else_item);
        } catch (ItemAlreadyExistsException e) {
            // System.out.println("Redefinition of function \"" + func_dec.getFuncName() +"\" in line " + func_dec.getLine());
        }*/


        SymbolTable else_symbol_table = new SymbolTable(SymbolTable.top);
        anElse.setSymbolTable(else_symbol_table);
        SymbolTable.push(else_symbol_table);

        for (Cnt stmt : anElse.getStmts()) {
            if (stmt != null) {
                stmt.accept(this);
            }
        }

        SymbolTable.pop();
        return null;
    }
}
