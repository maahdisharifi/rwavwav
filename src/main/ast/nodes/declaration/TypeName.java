package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class TypeName extends Node {
    private SpecifierQualifierList specifierQualifierList;
    private AbstractDeclarator abstractDeclarator;

    public void setAbstractDeclarator(AbstractDeclarator abstractDeclarator) {
        this.abstractDeclarator = abstractDeclarator;
    }

    public TypeName(SpecifierQualifierList s){this.specifierQualifierList=s;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
