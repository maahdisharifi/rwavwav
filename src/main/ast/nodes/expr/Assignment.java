package main.ast.nodes.expr;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class Assignment extends Node {
    private String val;
    public Assignment(String s){this.val=s;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String getAss() {
        return this.val;
    }
}
