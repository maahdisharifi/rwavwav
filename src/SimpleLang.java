import main.ast.nodes.Program;
import main.ast.nodes.externalDeclaration.FunctionDefinition;
import main.grammar.SimpleLangLexer;
import main.grammar.SimpleLangParser;
import main.symbolTable.SymbolTable;
import main.visitor.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.ArrayList;

public class SimpleLang {
    public static void main(String[] args) throws IOException {
        //System.out.println("f");
        CharStream reader = CharStreams.fromFileName(args[0]);
        //System.out.println("f7");
        SimpleLangLexer simpleLangLexer = new SimpleLangLexer(reader);
        CommonTokenStream tokens = new CommonTokenStream(simpleLangLexer);
        SimpleLangParser flParser = new SimpleLangParser(tokens);
        Program program = flParser.program().programRet;
        System.out.println();

        PythnicVisitor v1= new PythnicVisitor();
        v1.visit(program);
        System.out.println();
        NameAnalyzer my_name_analyzer = new NameAnalyzer();
        my_name_analyzer.visit(program);
        System.out.println();
        MemoryCheckerVisitor memoryChecker = new MemoryCheckerVisitor();
        memoryChecker.visit(program);

        TypeCheckerVisitor typeChecker = new TypeCheckerVisitor();
        typeChecker.visit(program);

        TestVisitor my_visitor = new TestVisitor();

        //my_visitor.setReachablefuncs(Reachablefuncs);
        my_visitor.visit(program);

    }
}