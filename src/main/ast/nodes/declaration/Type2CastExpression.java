package main.ast.nodes.declaration;

import main.ast.nodes.expr.CastExpression;
import main.ast.nodes.expr.Expr;
import main.ast.nodes.expr.Identifier;
import main.ast.nodes.expr.commaExpr;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class Type2CastExpression extends CastExpression {
    private Expr expr;
    public Type2CastExpression(Expr e){this.expr=e;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Expr> getParams(ArrayList<Expr> ans) {
       // ArrayList<Expr> ans=new ArrayList<>();
        if(this.expr instanceof Identifier) {
            ans.add(this.expr);
            return ans;
        }
        else {

           commaExpr cm= (commaExpr) this.expr;

           cm.calledFunctionParams2(ans);
           return ans;
        }
    }
}
