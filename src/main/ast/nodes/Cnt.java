package main.ast.nodes;

import main.ast.nodes.Stmt.Else;
import main.ast.nodes.Stmt.ElseIf;
import main.ast.nodes.Stmt.Stmt;
import main.symbolTable.SymbolTable;

import java.util.ArrayList;

public abstract class Cnt extends Node {
    protected String  indent;
    public void addIndent(String  indent) {
        this.indent=indent;
    }
    public int getIndet(){
        if(this.indent!=null){return (indent.length())/4 ;}
        return -1;
    }
    public void printStmtsCount(){/*System.out.println(this.stmts.size());*/}
   protected ArrayList<Cnt> stmts=new ArrayList<>();
    public void setArr(ArrayList<Cnt> s){this.stmts=s;}
    public void setFuncStmts(ArrayList<Cnt>s) {
        this.stmts=s;
    }
    public ArrayList<Cnt> getStmts(){return this.stmts;}
    protected int CountStmts(){
        int s=0;
        for(Cnt c:this.stmts){
            if(c instanceof ElseIf || c instanceof Else ){
                continue;
            }
            s++;

        }
        return s;
    }

    public SymbolTable getSymbolTable() {
        //return false;
        return null;
    }
}
