package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class Designation extends Node{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    ArrayList<Designator> list=new ArrayList<>();
    public Designation (){}
    public void add(Designator d){this.list.add(d);}
}
