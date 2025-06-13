package main.ast.nodes.expr;

import main.visitor.IVisitor;

public class FuncCallExpr extends Expr{
    public Expr getArguments(){return this.arguments;}
    //public String START_KEY="";
    private Expr name;
    private Expr arguments;
    public FuncCallExpr(Expr _name) {name = _name;this.arguments=null;}
    //public void setName(String name) {this.name = name;}
   // public String getName(){return this.name;}

    public void setArguments(Expr arguments) {
        this.arguments = arguments;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {return visitor.visit(this);}
   // @Override
   // public void printRoot(){System.out.println("Line "+String.valueOf(getLine())+": Expr "+this.name);}
   // public String getName(){return this.name;}
    public Expr getExpr() {
            return this.name;
    }

    public Expr getName() {
        return this.name;
    }
}
