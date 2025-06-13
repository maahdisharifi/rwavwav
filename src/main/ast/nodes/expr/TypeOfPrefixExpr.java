package main.ast.nodes.expr;

import main.ast.nodes.declaration.TypeName;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class TypeOfPrefixExpr extends PrefixExpr{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private TypeName typeName;
    public TypeOfPrefixExpr(TypeName t, ArrayList<String> a){this.typeName=t;this.prfixOperators=a;}
}
