package main.ast.nodes.expr;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.TypeName;
import main.visitor.IVisitor;

public class Type1CastExpression extends CastExpression {
    private TypeName typeName;
    private CastExpression castExpression;
    public Type1CastExpression(TypeName t,CastExpression c){this.typeName=t;this.castExpression=c;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
