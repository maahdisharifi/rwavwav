package main.ast.nodes.declaration;

import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class ExpressionDAD extends DirectAbstractDeclarator {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private Expr expr;
    public ExpressionDAD(){}

    public void setExpr(Expr expr) {
        this.expr = expr;
    }
}
