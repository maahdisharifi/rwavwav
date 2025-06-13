package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class SpecifierQualifierList extends Node {
    private SpecifierQualifierList specifierQualifierList;
    private DeclarationSpecifier typeSp;

    public void setSpecifierQualifierList(SpecifierQualifierList specifierQualifierList) {
        this.specifierQualifierList = specifierQualifierList;
    }

    public void setDeclarationSpecifier(DeclarationSpecifier declarationSpecifier) {
        this.typeSp = declarationSpecifier;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
