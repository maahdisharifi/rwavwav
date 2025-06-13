package main.ast.nodes.expr;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class ExprPrefixExpr extends PrefixExpr{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private Expr expr;
    public ExprPrefixExpr(Expr e, ArrayList<String> a){this.expr=e;this.prfixOperators=a;}
}
