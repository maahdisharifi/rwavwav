package main.ast.nodes.expr;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class IdentifierList extends Node {
    ArrayList<String> identifires;

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public void add(String s){this.identifires.add(s);}
    public IdentifierList(String s){this.identifires.add(s);}
}
