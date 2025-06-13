package main.ast.nodes.expr;

import main.ast.nodes.expr.primitives.UnaryOperator;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class UnaryCastPrefixExpr extends PrefixExpr {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private UnaryOperator unaryOperator;
    private CastExpression castExpression;
    public UnaryCastPrefixExpr(UnaryOperator u, CastExpression ce, ArrayList<String> a){
        this.unaryOperator=u;this.castExpression=ce;this.prfixOperators=a;
    }
}
