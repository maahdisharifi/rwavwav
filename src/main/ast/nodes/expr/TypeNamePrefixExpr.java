package main.ast.nodes.expr;

import main.ast.nodes.InitializerList;
import main.ast.nodes.declaration.TypeName;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class TypeNamePrefixExpr extends PrefixExpr {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private TypeName typeName;
    private InitializerList initializerList;
    public  TypeNamePrefixExpr(TypeName t,InitializerList i, ArrayList<String> a){
        this.typeName=t;this.initializerList=i;this.prfixOperators=a;
    }
}
