package main.ast.nodes.declaration;

import main.ast.nodes.Initializer;
import main.ast.nodes.Node;
import main.visitor.IVisitor;
//InitDeclaratorRet
public class InitDeclarator extends Node {
    private Declarator declarator;
    private Initializer initializer;
    public String getValName(){
        return this.declarator.getName();}
    public void setInitializer(Initializer i) {
        this.initializer = i;
    }

    public void setDeclarator(Declarator d){this.declarator=d;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public InitDeclarator(){}

    public Initializer getInitializer() {
        return this.initializer;
    }
}
