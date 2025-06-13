package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class Pointer extends Node {
   // private String val;
   //public Pointer (String passedVal){this.val=passedVal;}
   public Pointer (){}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
