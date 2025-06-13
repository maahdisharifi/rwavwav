package main.ast.nodes.declaration;

import main.visitor.IVisitor;

public class Type2DAD extends DirectAbstractDeclarator {
    private AbstractDeclarator abstractDeclarator;
    private ParameterList parameterList;
    public Type2DAD(){parameterList=null;abstractDeclarator=null;}

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public Type2DAD(AbstractDeclarator a){this.abstractDeclarator=a;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
