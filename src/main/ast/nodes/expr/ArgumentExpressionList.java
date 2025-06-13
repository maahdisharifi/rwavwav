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
    public  ArrayList<Expr> calledFuncParams(){
        ArrayList<Expr> ans=new ArrayList<>();
       // if(this.getArgumentsList().size()==0){
      //      return ans;
     //   }
        Expr c =this.getArgumentsList().get(0);
        if (!(c instanceof commaExpr)) {
            ans.add(c);
            return ans;
        }
        if(c instanceof commaExpr){
            commaExpr k=(commaExpr) this.argumentsList.get(0);
            k.calledFunctionParams(ans);
        }

        return ans;
    }
    private ArrayList<Expr> argumentsList=new ArrayList<>();
    @Override
    public <T> T accept(IVisitor<T> visitor) {
         return visitor.visit(this);
    }
    public void add(Expr e){argumentsList.add(e);}
}
