package main.symbolTable.item;

import main.ast.nodes.declaration.FuncDec;
import main.ast.nodes.externalDeclaration.FunctionDefinition;

public class FunctionDefinitionSymbolTableItem extends SymbolTableItem{



    public static final String START_KEY = "FunctionDefinition_";

    public FunctionDefinition getFuncDec() {
        return funcDec;
    }

    public void setFuncDec( FunctionDefinition funcDec) {
        this.funcDec = funcDec;
    }

    private FunctionDefinition funcDec;

    public FunctionDefinitionSymbolTableItem(FunctionDefinition funcDec) {
        this.funcDec = funcDec;
    }

    @Override
    public String getKey() {
        return START_KEY + String.valueOf(this.funcDec.getParametersSize())+this.funcDec.getName();
    }

// @Override
//    public String getKey() {
//        return START_KEY + this.funcDec.getFuncName();
//    }



}
