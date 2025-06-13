package main.ast.nodes.declaration;

import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class Type3DirectDeclarator extends DirectDeclarator{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private DirectDeclarator directDeclarator;
    private Expr expr=null;
    public Type3DirectDeclarator(){}

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public void setDirectDeclarator(DirectDeclarator directDeclarator) {
        this.directDeclarator = directDeclarator;
    }

    @Override
    public String getVal() {
        return this.directDeclarator.getName();
    }
}
