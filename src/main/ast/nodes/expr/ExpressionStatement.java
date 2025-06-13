package main.ast.nodes.expr;

import main.ast.nodes.Stmt.Stmt;
import main.visitor.IVisitor;

public class ExpressionStatement extends Stmt {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private Expr expression;

    public Expr getExpression() {
        return expression;
    }

    public ExpressionStatement(){}

    public void setExpression(Expr expression) {
        this.expression = expression;
    }
}
