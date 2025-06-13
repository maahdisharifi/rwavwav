package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class InitDeclaratorList extends Node {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public InitDeclaratorList(){}
    private ArrayList<InitDeclarator> list=new ArrayList<>();
    public void add(InitDeclarator i){this.list.add(i);}

    public ArrayList<InitDeclarator> getInitDeclarator() {
        return this.list;
    }

    public ArrayList<String> getVars() {
        ArrayList<String> ans=new ArrayList<>();
        for(InitDeclarator id:list){
            ans.add(id.getValName());
        }
        return ans;
    }
}
