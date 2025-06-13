package main.ast.nodes.declaration;

import main.ast.nodes.Node;

public abstract class DirectDeclarator extends Node {
    public String getName(){return "";}

    public abstract String getVal();
}
