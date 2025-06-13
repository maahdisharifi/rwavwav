package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.ast.nodes.externalDeclaration.ExternalDeclaration;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class Declaration extends ExternalDeclaration {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public Declaration(){}
    private InitDeclaratorList initDeclaratorList;

    public ArrayList<String> getVariablesNames(){
        return this.initDeclaratorList.getVars();
    }

 //  private String  indnt;//addIndent
    public void setInitDeclaratorList(InitDeclaratorList initDeclaratorList) {
        this.initDeclaratorList = initDeclaratorList;
    }

    private DeclarationSpecifiers declarationSpecifiers;
    public void setDeclarationSpecifiers(DeclarationSpecifiers d){this.declarationSpecifiers=d;}

    public InitDeclaratorList getInitDeclaratorList() {
        return this.initDeclaratorList;
    }
    public DeclarationSpecifiers getDeclarationSpecifiers(){return this.declarationSpecifiers;}
    //  public void addIndent(String  indent) {
  //          this.indnt=indent;
   // }
}
