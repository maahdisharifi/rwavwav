package main.ast.nodes.expr;

import main.ast.nodes.declaration.Type2CastExpression;
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
    public ArrayList<Expr> getParams(ArrayList <Expr> ans){
       // ArrayList <Expr> ans=new ArrayList<>();
        if(castExpression instanceof Type2CastExpression){
            Type2CastExpression tce = (Type2CastExpression) castExpression;
          //  Expr expr = tce.getExpr();

            tce.getParams(ans);
            return ans;

        }
        return ans;

    }
}
