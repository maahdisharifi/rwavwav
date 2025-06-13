package main.ast.nodes.expr;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class StringPrefixExpr extends PrefixExpr{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private String val;
    public StringPrefixExpr(String s, ArrayList<String> a){this.val=s;prfixOperators=a;}
}
