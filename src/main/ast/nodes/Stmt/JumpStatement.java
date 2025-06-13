package main.ast.nodes.Stmt;

import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

import java.util.Objects;

public class JumpStatement extends Stmt{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    String type;
    public JumpStatement(String s){this.type=s; expr=null;}
    //public JumpStatement(String s,Expr e){this.type=s;this.expr=e;}
   public void setExpr(Expr e){this.expr=e;}
    private Expr expr;

    public Expr getExpr() {
        return expr;
    }

    public void printItsroot() {
        if(Objects.equals(this.type, "return") && expr!=null){
            expr.printRoot();
        }
    }
}
