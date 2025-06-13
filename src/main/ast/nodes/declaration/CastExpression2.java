package main.ast.nodes.declaration;

import main.ast.nodes.expr.CastExpression;
import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class CastExpression2 extends Expr {
    private CastExpression castExpression;
    private TypeName typeName;
    public CastExpression2(TypeName t,CastExpression c){this.typeName=t;this.castExpression=c;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
