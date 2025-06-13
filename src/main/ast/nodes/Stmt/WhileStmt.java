package main.ast.nodes.Stmt;

import main.ast.nodes.expr.Expr;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

public class WhileStmt extends IterationStatement{
    private SymbolTable symbolTable;

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    //private Stmt statement;
    private Expr expression;
    public Expr getExpression(){
       return this.expression;
    }
  //  public Stmt getStatement() {
  //      return statement;
  //  }
  public void printStmtsCount(){System.out.println("Line " +String.valueOf(getLine())+ ": Stmt while" + " = " + String.valueOf(CountStmts() ));}
    public WhileStmt( Expr e){this.expression=e;}
    @Override
    public SymbolTable getSymbolTable() {
        return this.symbolTable;
    }
}
