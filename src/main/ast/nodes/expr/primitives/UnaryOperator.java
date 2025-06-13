package main.ast.nodes.expr.primitives;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class UnaryOperator extends Node {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private String val;
   public UnaryOperator(String s){this.val=s;}
}
