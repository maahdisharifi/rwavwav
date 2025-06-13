package main.ast.nodes;

import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class Initializer extends Node{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private Expr expr;
    private InitializerList initializerList;
    public Initializer(Expr e){this.expr=e;this.initializerList=null;}
    public Initializer(InitializerList i){this.initializerList=i;this.expr=null;}

    public Expr getExpression() {
        return this.expr;
    }
}
