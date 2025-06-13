package main.ast.nodes.Stmt;

import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class DoWhile extends IterationStatement{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
   // private Stmt statement;
    private Expr expression;
    public DoWhile(Expr e){this.expression=e;}
}
