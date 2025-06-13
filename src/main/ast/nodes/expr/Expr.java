package main.ast.nodes.expr;

import main.ast.nodes.Node;

public abstract class Expr extends Node {
    protected int depth;
    public void setDepth(){depth=0;}
    public int getDepth(){return depth;}

    public void printRoot(){}
}
