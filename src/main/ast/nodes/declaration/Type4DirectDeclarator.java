package main.ast.nodes.declaration;

import main.ast.nodes.expr.IdentifierList;
import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Type4DirectDeclarator extends DirectDeclarator {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    private DirectDeclarator directDeclarator=null;
    private ParameterList parameterList=null;

    public ArrayList<ParameterDeclaration> getParameterList() {
        if(parameterList!=null) {
            return parameterList.getParameterDeclarationList();
        }
        ArrayList<ParameterDeclaration> p= new ArrayList<>();
        return p ;
    }
    public void DeletePar(DeclarationSpecifiers d){
        if (parameterList != null) {
            Iterator<ParameterDeclaration> iterator = parameterList.getParameterDeclarationList().iterator();
            while (iterator.hasNext()) {
                ParameterDeclaration pd = iterator.next();
                if (Objects.equals(d.getName(), pd.getDeclarationSpecifiers().getName())) {
                    iterator.remove(); // Safely removes the current element
                }
            }
        }
    }
    private IdentifierList identifierList=null;
    @Override
    public String getName(){return this.directDeclarator.getName();}

    @Override
    public String getVal() {
        return this.directDeclarator.getVal() ;
    }

    public void setDirectDeclarator(DirectDeclarator directDeclarator) {
        this.directDeclarator = directDeclarator;
    }

    public void setIdentifierList(IdentifierList identifierList) {
        this.identifierList = identifierList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }
    public Type4DirectDeclarator(){}
}
