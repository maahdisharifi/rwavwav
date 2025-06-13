package main.ast.nodes.declaration;

import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class Type3DAD extends DirectAbstractDeclarator{
    private DirectAbstractDeclarator directAbstractDeclarator;
    private Expr expr=null;

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public void setDirectAbstractDeclarator(DirectAbstractDeclarator directAbstractDeclarator) {
        this.directAbstractDeclarator = directAbstractDeclarator;
    }
    public Type3DAD(){}

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
