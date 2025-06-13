package main.ast.nodes.expr;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class commaExpr extends Expr{

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
   private ArrayList<Expr> List=new ArrayList<>();

    public ArrayList<Expr> getList() {
        return List;
    }
    public void calledFunctionParams(ArrayList<Expr> ans){
        for(Expr e:List) {
            if(e instanceof commaExpr){
                ((commaExpr) e).calledFunctionParams(ans);
            }
            else {
                ans.add(e);
            }
            // return this.List.size();
        }
        return;
    }
    public int parameterSizeOfCalledFunc(){
        int sum=0;
        for(Expr e:List) {
            if(e instanceof commaExpr){
                sum+=((commaExpr) e).parameterSizeOfCalledFunc();
            }
            else {
                sum+=1;
            }
           // return this.List.size();
        }
        return sum;
    }
    public commaExpr(){}
    public void add(Expr e){List.add(e);}
    @Override
    public void printRoot(){System.out.println("Line "+String.valueOf(getLine())+": Expr ,");}
}
