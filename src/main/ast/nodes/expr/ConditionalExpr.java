package main.ast.nodes.expr;

import main.visitor.IVisitor;

public class ConditionalExpr extends Expr{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private Expr e1,e2,e3;
    public ConditionalExpr( Expr e1,Expr e2,Expr e3){}
}
