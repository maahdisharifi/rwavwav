package main.symbolTable.item;

import main.ast.nodes.expr.ArgumentExpressionList;
import main.ast.nodes.expr.Expr;
import main.ast.nodes.expr.FuncCallExpr;
import main.ast.nodes.expr.Identifier;
import main.ast.nodes.externalDeclaration.FunctionDefinition;

public class FuncCallSymbolTableItem extends SymbolTableItem{
    public FuncCallExpr getFuncCallExpr() {
        return funcCallExpr;
    }

    private FuncCallExpr funcCallExpr;
    public FuncCallSymbolTableItem(FuncCallExpr fe) {
        this.funcCallExpr=fe;
    }
    @Override
    public String getKey() {
        Identifier id= (Identifier)  funcCallExpr.getName();
        Expr ww=funcCallExpr.getArguments();
        int parametersSize=0;
        if(ww==null){
            parametersSize=0;
        }
        else {
            ArgumentExpressionList a = (ArgumentExpressionList) funcCallExpr.getArguments();
            parametersSize = a.getSize();
        }
       return "funcCall_" + String.valueOf(parametersSize) +id.getName();
       // return "FuncCall_"+ id.getName();
    }
}
