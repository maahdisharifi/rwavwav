package main.ast.nodes.expr;

import main.visitor.IVisitor;

import java.util.ArrayList;

public abstract class PrefixExpr extends Expr
{
    protected ArrayList<String> prfixOperators=new ArrayList<>();
    /*private String IDName=null;
    private Expr expr=null;

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public void setIDName(String IDName) {
        this.IDName = IDName;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private ArrayList<String> prfixOperators=new ArrayList<>();
    //public PrefixExpr(){}
    public void add(String s){this.prfixOperators.add(s);}*/
}
