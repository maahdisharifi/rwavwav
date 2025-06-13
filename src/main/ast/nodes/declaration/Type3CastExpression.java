package main.ast.nodes.declaration;

import main.ast.nodes.expr.CastExpression;
import main.visitor.IVisitor;

public class Type3CastExpression extends CastExpression {

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private String Digit;
    public Type3CastExpression(String val){this.Digit=val;}
}
