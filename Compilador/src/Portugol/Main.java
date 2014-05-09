package Portugol;

/* Create an AST, then invoke our interpreter. */ 

import lexer.* ; 
import node.* ;
//import java.util.Scanner;

import java.io.* ; 

//import Portugol.Interpreter;
  
public class Main { 
   public static void main(String[] args) { 
      if (args.length > 0) { 
         try { 
            /* Form our AST */ 
        	//Path file = Paths.get("Entrada.txt");
            //byte[] arquivo = Files.readAllBytes(file);
        	boolean houveProblema = false;
        	Lexer lexer = new Lexer (new PushbackReader(new FileReader(args[0]), 1024));
        	
        	while(true)
        	{
        		try
        		{
        			Token tok = lexer.next();
        				System.out.printf(tok.getText());
        			
        			if(tok.getText() == "")
            			break;
        		}
        		catch (Exception e) 
        		{ 
        	        houveProblema = true;    
        			System.out.println ("Erro: "+e.getMessage()); 
        	    }
        	}
        	
        	if(!houveProblema)
        		System.out.print("\nc�digo pertence a linguagem!!");
        	else
        		System.out.print("\n!!O executavel nao foi gerado pelos erros de compilacao!!");
            
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