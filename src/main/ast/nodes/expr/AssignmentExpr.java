package main.ast.nodes.expr;

import main.visitor.IVisitor;

public class AssignmentExpr extends Expr{

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public AssignmentExpr(  Expr left, Expr right,Assignment assType){this.left=left;this.right=right;this.assType=assType;}
    private Expr left;
    private Expr right;
    public Expr getLeft(){return this.left;}
    public Expr getRight(){return this.right;}
    @Override
    public void printRoot(){System.out.println("Line " + String.valueOf(assType.getLine())+": Expr " +assType.getAss());}
    private Assignment assType;
}
