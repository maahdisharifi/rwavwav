package main.symbolTable;


import main.ast.nodes.Cnt;
import main.ast.nodes.Stmt.*;
import main.ast.nodes.expr.FuncCallExpr;
import main.ast.nodes.externalDeclaration.FunctionDefinition;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.item.FuncCallSymbolTableItem;
import main.symbolTable.item.FunctionDefinitionSymbolTableItem;
import main.symbolTable.item.SymbolTableItem;

import java.util.*;


public class SymbolTable {

    //Start of static members

    public static SymbolTable top;
    public static SymbolTable root;
    private static Stack<SymbolTable> stack = new Stack<>();

    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }

    public static void pop() {
        top = stack.pop();
    }

    public SymbolTable pre;
    public Map<String, SymbolTableItem> items;

    public SymbolTable() {
        this(null);
    }
    public ArrayList<FuncCallExpr> getAllFuncCalled(String key){
        ArrayList<FuncCallExpr> ans=new ArrayList<>();
        for(SymbolTableItem s:this.items.values()){
            if(s instanceof FuncCallSymbolTableItem && Objects.equals(s.getKey(), key)){
                ans.add(((FuncCallSymbolTableItem) s).getFuncCallExpr());
            }
        }
        return ans;
    }
    public SymbolTable(SymbolTable pre) {
        this.pre = pre;
        this.items = new HashMap<>();
    }

    public static Stack<SymbolTable> getStack() {
        return stack;
    }

    public void put(SymbolTableItem item) throws ItemAlreadyExistsException {
       /* if(item instanceof FunctionDefinitionSymbolTableItem){
            if (items.containsKey(item.getKey())){
               FunctionDefinition funcToAdd= ((FunctionDefinitionSymbolTableItem) item).getFuncDec();
               FunctionDefinitionSymbolTableItem fd= (FunctionDefinitionSymbolTableItem) items.get(item.getKey());
               FunctionDefinition storedFunc=fd.getFuncDec();
              // if(funcToAdd.getParVars()!= storedFunc.getpar)


            if()


            }
        }*/
        if(items instanceof FuncCallSymbolTableItem){
            items.put(item.getKey(), item);
            return;
        }
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExistsException();
        items.put(item.getKey(), item);
    }

    public SymbolTableItem getItem(String key) throws ItemNotFoundException {
        SymbolTable currentSymbolTable = this;

        while(currentSymbolTable != null) {
            SymbolTableItem symbolTableItem = currentSymbolTable.items.get(key);
            if( symbolTableItem != null )
                return symbolTableItem;
            currentSymbolTable = currentSymbolTable.pre;
        }
        throw new ItemNotFoundException();
    }




    public void getAllFUncCallInThisScope(ArrayList<FuncCallSymbolTableItem> ans,Cnt scope)  {

           // SymbolTable currentSymbolTable = this;
           // ArrayList<FuncCallExpr> ans=new ArrayList<>();


                for(SymbolTableItem s:scope.getSymbolTable().items.values()){
                    if(s instanceof FuncCallSymbolTableItem ){
                        ans.add((FuncCallSymbolTableItem) s);
                    }

                }

                for(Cnt stmt: scope.getStmts() ){
                        if(stmt.getSymbolTable()!=null) {
                            stmt.getSymbolTable().getAllFUncCallInThisScope(ans, stmt);
                        }

                }

          //  return ans;
    }





    public int getItemsSize() {
        return this.items.size();
    }
}
