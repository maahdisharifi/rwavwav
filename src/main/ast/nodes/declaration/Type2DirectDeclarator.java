package main.ast.nodes.declaration;

import main.visitor.IVisitor;

public class Type2DirectDeclarator extends DirectDeclarator {
    private Declarator declarator;
    public Type2DirectDeclarator(Declarator d){this.declarator=d;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String getVal() {
        return "";
    }
}
