package main.ast.nodes;

import main.ast.nodes.Stmt.TranslationUnit;
import main.ast.nodes.declaration.FuncDec;
import main.ast.nodes.declaration.Main;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class Program extends Node{
    private TranslationUnit translationUnit;

    public TranslationUnit getTranslationUnit() {
        return translationUnit;
    }

    public Program() {}


    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }


    public void settranslationUnit(TranslationUnit translationUnit) {
        this.translationUnit = translationUnit;
    }


}
