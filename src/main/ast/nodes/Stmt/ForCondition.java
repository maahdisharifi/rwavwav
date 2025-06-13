package main.ast.nodes.Stmt;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.ForDeclaration;
import main.ast.nodes.declaration.InitDeclarator;
import main.ast.nodes.expr.Expr;
import main.visitor.IVisitor;

public class ForCondition extends Node {
    private ForExpression fe1;
    private ForExpression fe2;
    private ForDeclaration fd=null;
    public ForDeclaration getFd(){return this.fd;}
    private Expr e=null;
    public ForCondition(){}

    public ForExpression getFe1() {
        return fe1;
    }

    public ForExpression getFe2() {
        return fe2;
    }

    public void setFd(ForDeclaration fd) {
        this.fd = fd; this.e=null;
    }

    public void setFe1(ForExpression fe1) {
        this.fe1 = fe1;
    }

    public void setFe2(ForExpression fe2) {
        this.fe2 = fe2;
    }

    public void setE(Expr e) {
        this.e = e; this.fd=null;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return null;
    }
}
