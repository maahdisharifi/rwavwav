package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ParameterList extends Node {

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
  public   ParameterList(){}
    ArrayList<ParameterDeclaration> list=new ArrayList<>();
    public  ArrayList<ParameterDeclaration> getParameterDeclarationList(){ return this.list;}
    public void add(ParameterDeclaration p){this.list.add(p);}
}
