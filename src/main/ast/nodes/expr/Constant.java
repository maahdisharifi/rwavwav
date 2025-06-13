package main.ast.nodes.expr;

import main.visitor.IVisitor;

public class Constant extends Expr{
    private String val;
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public Constant(String v){this.val=v;}
    @Override
    public void printRoot(){System.out.println("Line " + String.valueOf(getLine())+": Expr " +val);}

    public Object getName() {
        return this.val;
    }
}
