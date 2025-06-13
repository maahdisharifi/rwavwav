package main.ast.nodes.Stmt;

import main.ast.nodes.expr.Expr;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class If extends SelectionStatement{
    private SymbolTable symbolTable;

    private Expr e;
    public If(){}
   public void setCondition(Expr e){this.e=e;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    @Override
    public void printStmtsCount(){System.out.println("Line " +String.valueOf(getLine())+ ": Stmt selection" + " = " +String.valueOf(CountStmts() ) );}

    public Expr getExpression() {
        return this.e;
    }

    public void set_symbol_table(SymbolTable ifSymbolTable) {
        this.symbolTable=ifSymbolTable;
    }
    @Override
    public SymbolTable getSymbolTable() {
        return this.symbolTable;
    }
}
