package main.ast.nodes;

import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class Designator extends Node{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private Expr expr;
    private String IDName;
    public Designator(String ID){this.IDName=ID;this.expr=null;}
    public Designator(Expr e){this.expr=e;IDName=null;}
}
