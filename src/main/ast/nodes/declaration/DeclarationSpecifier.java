package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class DeclarationSpecifier extends Node {
    private String keyword;
    public String getKeyword(){return this.keyword;}
    private String intVal="";
    public DeclarationSpecifier(String t){this.keyword=t;}
    public DeclarationSpecifier(String t,String val){this.keyword=t;this.intVal=val;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public String getVarName() {
        return this.intVal;
    }
}
