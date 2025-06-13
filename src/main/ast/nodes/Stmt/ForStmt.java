package main.ast.nodes.Stmt;

import main.ast.nodes.declaration.DeclarationSpecifiers;
import main.ast.nodes.declaration.InitDeclarator;
import main.ast.nodes.declaration.InitDeclaratorList;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

import java.beans.Statement;

public class ForStmt extends IterationStatement{
    private SymbolTable symbolTable;

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private ForCondition forCondition;

    public ForCondition getForCondition() {
        return forCondition;
    }

    //public
   // private Stmt statement;
    public DeclarationSpecifiers getSpecifer(){return this.forCondition.getFd().getDeclarationSpecifiers();}
    public InitDeclarator getInitDeclarator(){return this.forCondition.getFd().getInitDeclarator();}
   // public Stmt getStatement() {
   //     return statement;
   // }
   @Override
   public void printStmtsCount(){System.out.println("Line " +String.valueOf(getLine())+ ": Stmt for" + " = " +String.valueOf(CountStmts() ) );}
    public ForStmt( ForCondition fc){this.forCondition=fc;}
    @Override
    public SymbolTable getSymbolTable() {
        return this.symbolTable;
    }
}
