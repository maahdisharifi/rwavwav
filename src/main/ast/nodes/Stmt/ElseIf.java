package main.ast.nodes.Stmt;

import main.ast.nodes.expr.Expr;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class ElseIf extends SelectionStatement{
   public ElseIf(Expr expr){this.expr=expr;}
    private Expr expr;
    private SymbolTable symbolTable;

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    @Override
    public void printStmtsCount(){System.out.println("Line " +String.valueOf(getLine())+ ": Stmt selection" + " = " +String.valueOf(CountStmts() ) );}

    public Expr getExpression() {
        return this.expr;
    }
    @Override
    public SymbolTable getSymbolTable() {
        return this.symbolTable;
    }
}
