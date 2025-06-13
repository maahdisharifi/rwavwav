package main.ast.nodes.expr;

import main.ast.nodes.InitializerList;
import main.ast.nodes.declaration.TypeName;
import main.visitor.IVisitor;

public class TypeName_initList extends Expr{
    private TypeName typeName;
    private InitializerList initializerList;

    public TypeName_initList(TypeName t,InitializerList i){this.typeName=t;this.initializerList=i;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
