package main.symbolTable.item;

import main.ast.nodes.Stmt.Else;
import main.symbolTable.SymbolTable;

public class ElseSymbolTableItem extends SymbolTableItem {
    public String START_KEY="else_";
    public ElseSymbolTableItem(Else else_){this.else_=else_;}
            private Else else_;
    @Override
    public String getKey() {
        return START_KEY;
    }
}
