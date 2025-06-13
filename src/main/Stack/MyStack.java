package main.Stack;

import main.ast.nodes.Cnt;
import main.ast.nodes.Stmt.Stmt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MyStack {
    public MyStack(){}

    private Stack<Cnt> stack = new Stack<>();
    public boolean AreAllIndentsOne(){
        ArrayList<Cnt> x=    this.getRemainingObjects();

       for(Cnt c :x){
                if(c.getIndet()!=1){
                    return false;
                }
            }
       return true;
    }
    public void assignStmtsToPrevScope(){
         ArrayList<Cnt> stmts=new ArrayList<>();
            int currentIndentScope=stack.peek().getIndet();
            if(currentIndentScope==-1){
                this.stack.pop();
                return;
            }
            while (true) {
                if( !stack.isEmpty() && stack.peek().getIndet()== currentIndentScope) {
                    stmts.add(stack.pop());
                }
                else
                    break;
            }
                Collections.reverse(stmts);
                stack.peek().setArr(stmts);
               // stack.push(s);
    }

    public void push(Cnt s){
        if (stack.isEmpty()){
            this.stack.push(s);
        }
        else if (s.getIndet()>= stack.peek().getIndet()){
            this.stack.push(s);
            }

        else {
            while (s.getIndet()<stack.peek().getIndet()) {
                this.assignStmtsToPrevScope();
            }

            stack.push(s);
           /* ArrayList<Cnt> stmts=new ArrayList<>();
            int currentIndentScope=stack.peek().getIndet();
            while (true) {
                if(stack.peek().getIndet()== currentIndentScope) {
                    stmts.add(stack.pop());
                }
                else
                    break;
            }
                stack.peek().setArr(stmts);
                stack.push(s);*/




        }



        }
        public ArrayList<Cnt> getRemainingObjects(){
            ArrayList<Cnt> list = new ArrayList<>(stack);

            // Return the list
            return list;
        }
        public void emptyStack(){
            this.stack.clear();
        }
    }


