package main.ast.nodes.Stmt;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.Declaration;
import main.visitor.IVisitor;

import java.beans.Statement;

public class BlockItem extends Node {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public BlockItem(){this.declaration=null;this.statement=null;}
    private Declaration declaration;// dont count;
    private Stmt statement=null;
public void    addIndent(String indent){
            if(declaration != null){
                this.declaration.addIndent(indent);
            }
            else if(statement != null){
                this.statement.addIndent(indent);
            }
    }
    public Stmt getStatement() {
        return statement;
    }

    public Declaration getDeclaration() {
        return declaration;
    }

    public void setDeclaration(Declaration declaration) {
        this.declaration = declaration;
    }

    public void setStatement(Stmt statement) {
        this.statement = statement;
    }
}
