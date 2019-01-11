//Main.java
import java.io.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;




public class CJAVA {
    public static void main(String[] args) throws Exception {
        // create a CharStream thatreads from standard input
        String inputFile = "data.txt";
        String outputFile = "Main.java";

        if(args.length == 0)
            System.out.print("no C file");
        else if(args.length == 1)
            inputFile = args[0];
        else {
            inputFile = args[0];
        }



        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
//        org.antlr.runtime.ANTLRInputStream input = new org.antlr.runtime.ANTLRInputStream(is)
        ANTLRInputStream input = new ANTLRInputStream(is);
        Boolean a = new Boolean(true);

        LabeledExprLexer lexer = new LabeledExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);
        ParseTree tree = parser.prog(); // parse
        EvalVisitor eval = new EvalVisitor();
        Node result = eval.visit(tree);
        File file = new File(outputFile);
//        if(!file.getParentFile().exists()){
//            file.getParentFile().mkdirs();
//        }
        Writer out = new FileWriter(file);
        out.write(result.visitString);
        out.close();
//        System.out.println(result.visitString);
    }
}
