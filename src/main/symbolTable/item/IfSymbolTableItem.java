package main.symbolTable.item;

import main.ast.nodes.Stmt.If;

public class IfSymbolTableItem extends SymbolTableItem {
    public static final String START_KEY = "if_";
    private If if_;
    public IfSymbolTableItem(If if_){this.if_=if_;}
    @Override
    public String getKey() {
        return START_KEY;
    }
}
