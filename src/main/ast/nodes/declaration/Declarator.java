package main.ast.nodes.declaration;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class Declarator extends Node {

    private Pointer pointer;
   public int getStar(){return this.pointer.getStar();}
    private  DirectDeclarator DirectDeclarator;

    public String getName(){return this.DirectDeclarator.getVal();}
    public void setDirectDeclarator(main.ast.nodes.declaration.DirectDeclarator directDeclarator) {
        DirectDeclarator = directDeclarator;
    }
    public int getParameterSize(){
        Type4DirectDeclarator t=    (Type4DirectDeclarator)this.DirectDeclarator;
        return t.getParameterList().size();
    }
    public void DelPar(DeclarationSpecifiers d){
        Type4DirectDeclarator t=    (Type4DirectDeclarator)this.DirectDeclarator;
        t.DeletePar(d);
    }
 public ArrayList<DeclarationSpecifiers> getParVars(){
        ArrayList<DeclarationSpecifiers> ans=new ArrayList<>();

      Type4DirectDeclarator t=    (Type4DirectDeclarator)this.DirectDeclarator;
     //
     for( ParameterDeclaration p :t.getParameterList()){
            if(p.getDeclarator()==null) {
                ans.add(p.getDeclarationSpecifiers());
            }
            else {
                DeclarationSpecifiers a=  new DeclarationSpecifiers();
                int sc=p.getDeclarator().getStar();
                String s="";
               for(int i=0;i< sc;i++){
                 s+="*";

               }
                DeclarationSpecifier first= new DeclarationSpecifier(p.getDeclarationSpecifiers().getType()+s);
                DeclarationSpecifier second= new DeclarationSpecifier("identifer",p.getDeclarator().DirectDeclarator.getVal());

                a.add(first);
                a.add(second);
                ans.add(a);
            }
     }
    return  ans;
    }
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public void setPointer(Pointer p){this.pointer=p;}
   public Declarator (){}


}
