package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class DeclarationSpecifiers extends Node {

    public DeclarationSpecifiers(){}
    private ArrayList<DeclarationSpecifier> ds = new ArrayList<>();
    public void add(DeclarationSpecifier d){ds.add(d);}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public String getType(){return ds.get(0).getKeyword();}
    public String getName(){return ds.get(1).getVarName();}
}
