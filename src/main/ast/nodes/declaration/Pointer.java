package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public class Pointer extends Node {
   // private String val;
   //public Pointer (String passedVal){this.val=passedVal;}
    private int StarCount=0;
   public Pointer (int StarCount){this.StarCount=StarCount;}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public int getStar() {
       return StarCount;
    }
}
