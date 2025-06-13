package main.ast.nodes.Stmt;

import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class Else extends SelectionStatement{
    private SymbolTable symbolTable;
    public  void setSymbolTable(SymbolTable symbolTable){this.symbolTable=symbolTable;}
   public Else (){}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    @Override
    public void printStmtsCount(){System.out.println("Line " +String.valueOf(getLine())+ ": Stmt selection" + " = " +String.valueOf(CountStmts() ) );}
    @Override
    public SymbolTable getSymbolTable() {
        return this.symbolTable;
    }
}
