package Portugol;

/* Create an AST, then invoke our interpreter. */ 

import lexer.* ; 
import node.* ;
import java.util.Scanner;

import java.io.* ; 

//import Portugol.Interpreter;
  
public class Main { 
   public static void main(String[] args) { 
      if (args.length > 0) { 
         try { 
            /* Form our AST */ 
        	//Path file = Paths.get("Entrada.txt");
            //byte[] arquivo = Files.readAllBytes(file);
        	Scanner scan = new Scanner(System.in);
        	Lexer lexer = new Lexer (new PushbackReader(new FileReader(args[0]), 1024)); 
        	while(true)
        	{
        		Token tok = lexer.peek();
        		System.out.println(tok.getText());
        		if(tok == null)
        			break;
        		lexer.next();
        		scan.nextInt();
        	}
        	System.out.print("c�digo pertence a linguagem");
            //Parser parser = new Parser(lexer); 
            //Start ast = parser.parse() ; 
  
            /* Get our Interpreter going. */ 
            //Interpreter interp = new Interpreter () ; 
            //ast.apply(interp) ; 
         } 
         catch (Exception e) { 
            System.out.println (e) ; 
         } 
      } else { 
         System.err.println("Nenhum arquivo foi dado como entrada"); 
         System.exit(1); 
      } 
   } 
}