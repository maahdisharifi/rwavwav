package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class ParameterDeclaration extends Node {
    private DeclarationSpecifiers declarationSpecifiers;
    private Declarator declarator;
    private AbstractDeclarator abstractDeclarator;
    public DeclarationSpecifiers getDeclarationSpecifiers(){return this.declarationSpecifiers;}
    public void setAbstractDeclarator(AbstractDeclarator abstractDeclarator) {
        this.abstractDeclarator = abstractDeclarator;
    }

    public void setDeclarator(Declarator declarator) {
        this.declarator = declarator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public ParameterDeclaration(DeclarationSpecifiers D){this.declarationSpecifiers=D;}
}
