package main.ast.nodes.declaration;

import main.ast.nodes.expr.CastExpression;
import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class Type2CastExpression extends CastExpression {
    private Expr expr;
    public Type2CastExpression(Expr e){this.expr=e;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
