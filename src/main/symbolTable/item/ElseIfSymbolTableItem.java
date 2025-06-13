package main.symbolTable.item;

import main.ast.nodes.Stmt.ElseIf;

public class ElseIfSymbolTableItem extends SymbolTableItem{
    public String START_KEY="elseIf_";
    private ElseIf elseIf;

    public ElseIfSymbolTableItem(ElseIf elseIf){this.elseIf=elseIf;}
    @Override
    public String getKey() {
        return START_KEY;
    }
}
