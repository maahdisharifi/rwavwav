package main.ast.nodes.expr;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class ArgumentExpressionList extends Expr{
    public ArrayList<Expr> getArgumentsList() {
        return argumentsList;
    }
   // public int getCalledFuncParametersSize(){return this.argumentsList.get(0).}
    public ArgumentExpressionList(){}
    public int getSize(){
        if(this.getArgumentsList().size()==0){
            return 0;
        }
        Expr c =this.getArgumentsList().get(0);
        if(c instanceof commaExpr){
            commaExpr k=(commaExpr) this.argumentsList.get(0);
             return   k.parameterSizeOfCalledFunc();
        }
       return 1;
        //commaExpr c=(commaExpr) this.argumentsList.get(0);
     // return   c.parameterSizeOfCalledFunc();
    }
    private ArrayList<Expr> argumentsList=new ArrayList<>();
    @Override
    public <T> T accept(IVisitor<T> visitor) {
         return visitor.visit(this);
    }
    public void add(Expr e){argumentsList.add(e);}
}
