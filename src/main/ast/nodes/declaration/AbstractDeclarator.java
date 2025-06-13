package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class AbstractDeclarator extends Node {
    private Pointer pointer;
    private DirectAbstractDeclarator directAbstractDeclarator;
    public AbstractDeclarator(){}

    public void setDirectAbstractDeclarator(DirectAbstractDeclarator directAbstractDeclarator) {
        this.directAbstractDeclarator = directAbstractDeclarator;
    }

    public void setPointer(Pointer pointer) {
        this.pointer = pointer;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
