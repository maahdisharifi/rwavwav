package main.symbolTable.item;

import main.ast.nodes.Stmt.VarDec;
import main.ast.nodes.declaration.DeclarationSpecifier;
import main.ast.nodes.declaration.DeclarationSpecifiers;
import main.ast.nodes.declaration.InitDeclarator;

public class VarDecSymbolTableItem extends SymbolTableItem{
    public static final String START_KEY = "VarDec_";

   // public VarDec getVarDec() {
      //  return varDec;
   // }

  //  public void setVarDec(VarDec varDec) {
    //    this.varDec = varDec;
   // }

   // private VarDec varDec;
    public String getType(){return this.declarationSpecifiers.getType();}
    private DeclarationSpecifiers declarationSpecifiers;// type is always here ; name could be here
    private InitDeclarator initDeclarator;// name could be here

    public VarDecSymbolTableItem(DeclarationSpecifiers declarationSpecifiers, InitDeclarator initDeclarator) {

        this.declarationSpecifiers=declarationSpecifiers;this.initDeclarator=initDeclarator;
    }
    public VarDecSymbolTableItem(DeclarationSpecifiers declarationSpecifiers) {

        this.declarationSpecifiers=declarationSpecifiers;this.initDeclarator=null;
    }
    public String getVarName(){
        if( this.initDeclarator!=null) {
            return  this.initDeclarator.getValName();
        }
        else {
            return  this.declarationSpecifiers.getName();
        }
    }
    @Override
    public String getKey() {
        if( this.initDeclarator!=null) {
            return START_KEY + this.initDeclarator.getValName();
        }
        else {
            return START_KEY + this.declarationSpecifiers.getName();
        }
    }

}
