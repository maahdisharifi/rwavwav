package main.ast.nodes.declaration;

import main.visitor.IVisitor;

public class Type4DAD extends DirectAbstractDeclarator {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    private DirectAbstractDeclarator directAbstractDeclarator;
    private ParameterList parameterList;
    public Type4DAD(){}

    public void setDirectAbstractDeclarator(DirectAbstractDeclarator directAbstractDeclarator) {
        this.directAbstractDeclarator = directAbstractDeclarator;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }
}
