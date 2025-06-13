package main.ast.nodes.expr;

import main.visitor.IVisitor;

public class ArrIndexing extends Expr{
    public Expr getIndexExpr() {
        return index;
    }

    public Expr getArrName() {
        return ArrName;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private Expr ArrName;
    private Expr index;
 public    ArrIndexing(Expr name,Expr indx){this.ArrName=name;this.index=indx;}
}
