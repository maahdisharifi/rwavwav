package main.ast.nodes.declaration;

import main.visitor.IVisitor;

public class Type1DirectDeclarator extends DirectDeclarator {
    @Override
    public String getName(){return this.val;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private String val;
    @Override
    public String getVal(){return this.val;}
    public Type1DirectDeclarator(String s){this.val=s;}
}
