package main.ast.nodes.externalDeclaration;

import main.ast.nodes.Stmt.CompoundStatement;
import main.ast.nodes.Stmt.Stmt;
import main.ast.nodes.declaration.DeclarationList;
import main.ast.nodes.declaration.DeclarationSpecifiers;
import main.ast.nodes.declaration.Declarator;
import main.symbolTable.SymbolTable;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class FunctionDefinition extends ExternalDeclaration{
    public int getParametersSize() {
       return this.declarator.getParameterSize();
    }

    private SymbolTable symbolTable;
    public void setSymbolTable(SymbolTable s){this.symbolTable=s;}
    //Line 1: Stmt function main = 1 0
    @Override
    public void printStmtsCount(){ System.out.println("Line " +String.valueOf(getLine())+ ": Stmt function " + declarator.getName() + " = " + String.valueOf(CountStmts() +" " + this.getParametersSize() ));}/*System.out.println(this.stmts.size());*/
    private DeclarationSpecifiers declarationSpecifiers;
    private Declarator declarator;
   // private int parametersSize=0;
    public void DeletePar(DeclarationSpecifiers d){
        this.declarator.DelPar(d);
    }
    public ArrayList<DeclarationSpecifiers> getParVars(){
       return this.declarator.getParVars();
    }
    private DeclarationList declarationList;
    private CompoundStatement compoundStatement;
    public String getName(){ return declarator.getName();}
   // private ArrayList<Stmt> stmts=new ArrayList<>();
    //public void setArray(){}// continue
    public CompoundStatement getCompoundStatement() {

        return compoundStatement;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public FunctionDefinition(){}
   public void setDeclarationSpecifiers(DeclarationSpecifiers d){this.declarationSpecifiers=d;}
    public void setDeclarator(Declarator d){this.declarator=d;}
    public void setDeclarationList(DeclarationList d){this.declarationList=d;}
    public void setCompoundStatement(CompoundStatement c){this.compoundStatement=c;}


    public SymbolTable getSymbolTable() {
       return this.symbolTable;
    }










}
//@Override
//    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}