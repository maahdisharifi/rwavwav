package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class InitializerList extends Node{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private ArrayList<Designation> designationList=new ArrayList<>();
    private ArrayList<Initializer> initializers=new ArrayList<>();
    public void addDesignation(Designation d){this.designationList.add(d);}
    public void addInitializer( Initializer i){this.initializers.add(i);}
    public InitializerList(){}
}
