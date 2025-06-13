package main.ast.nodes.Stmt;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class CompoundStatement extends Stmt {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public CompoundStatement(){}


    ArrayList<BlockItem> blocks=new ArrayList<>();

    public ArrayList<BlockItem> getBlocks() {
        return blocks;
    }

    public void addBlock(BlockItem b){this.blocks.add(b);}

}
