package main.ast.nodes.Stmt;

import main.ast.nodes.externalDeclaration.ExternalDeclaration;
import main.ast.nodes.Node;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class TranslationUnit extends Node {
    private SymbolTable symbolTable;
    public void set_symbol_table(SymbolTable symbol_table) {this.symbolTable = symbol_table;}
    public TranslationUnit() {}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private ArrayList<ExternalDeclaration> externalDeclarations = new ArrayList<>();

    public ArrayList<ExternalDeclaration> getExternalDeclarations() {
        return externalDeclarations;
    }

    //  private List<ExternalDeclaration> externalDeclarations;
   public void addED(ExternalDeclaration ed) {
        externalDeclarations.add(ed);
    }
}
