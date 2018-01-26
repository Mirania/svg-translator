

import java.io.File;
import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class HelloRunner 
{
    public static void main( String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input file >> ");
        String fname = sc.nextLine();
        sc.close();
        File f = new File(fname);
        if (!f.exists()) {
        	System.err.println("Input file not found!");
        	System.exit(1);
        }
        
        Scanner fsc = new Scanner(f);
        String content = fsc.useDelimiter("\\Z").next();
        content+="\n";
        fsc.close();
        
        ANTLRInputStream input = new ANTLRInputStream(content);

        RulesLexer lexer = new RulesLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        RulesParser parser = new RulesParser(tokens);
        ParseTree tree = parser.main(); // begin parsing at main rule
        
        //input reading and output generation
         SVGGenerator listener = new SVGGenerator();
        if (parser.getNumberOfSyntaxErrors() == 0) {
            ParseTreeWalker walker=new ParseTreeWalker();
            walker.walk(listener, tree);
        }
       
    }
}