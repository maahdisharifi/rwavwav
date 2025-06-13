package main.ast.nodes.Stmt;

import main.ast.nodes.Node;
import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class ForExpression extends Node {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private ArrayList<Expr> exprList=new ArrayList<>();

    public ForExpression(){}
    public void add(Expr e){this.exprList.add(e);}

    public ArrayList<Expr> getExprList() {
        return exprList;
    }
}
