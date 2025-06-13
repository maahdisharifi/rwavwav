package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class ForDeclaration extends Node {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public ForDeclaration(){}

    public DeclarationSpecifiers getDeclarationSpecifiers() {
        return declarationSpecifiers;
    }

    public InitDeclarator getInitDeclarator() {
        return initDeclaratorList.getInitDeclarator().get(0);
    }

    private DeclarationSpecifiers declarationSpecifiers;
    private InitDeclaratorList initDeclaratorList;

    public void setInitDeclaratorList(InitDeclaratorList initDeclaratorList) {
        this.initDeclaratorList = initDeclaratorList;
    }

    public void setDeclarationSpecifiers(DeclarationSpecifiers declarationSpecifiers) {
        this.declarationSpecifiers = declarationSpecifiers;
    }

}
