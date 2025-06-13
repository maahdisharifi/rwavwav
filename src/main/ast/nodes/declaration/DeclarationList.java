package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class DeclarationList extends Node {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private ArrayList<Declaration> list=new ArrayList<>();
    public DeclarationList(){}
    public void add(Declaration d){this.list.add(d);}
}
