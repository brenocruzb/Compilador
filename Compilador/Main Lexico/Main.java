package Portugol;

/* Create an AST, then invoke our interpreter. */ 

import lexer.* ; 
import node.* ;
import parser.*;
//import java.util.Scanner;

import java.io.* ; 

//import Portugol.Interpreter;
  
public class Main { 
   public static void main(String[] args) { 
      if (args.length > 0) { 
         try { 
        	MyLexer lexer = new MyLexer (new PushbackReader(new FileReader(args[0]), 1024));
        	while(true)
        	{
        		try
        		
        		{        			
        		
        			Token tok = lexer.next();
        			String nome_token = tok.getClass().getName().substring(6);
        			System.out.print(nome_token+" ");
        			if(nome_token.equals("Lf"))
        			{System.out.println("");}
        			
        			if(tok.getText() == "")
            			break;
        		}
        		catch (Exception e) 
        		{ 
        	        lexer.houveProblema = true;    
        	        System.out.println ("Erro: "+e.getMessage()); 
        	    }
        	}
        	if(!lexer.houveProblema)
        		System.out.println("\ncódigo pertence a linguagem!!");
        	else
        		System.err.println("\n!!O executavel nao foi gerado pois houve erros de compilacao!!");
            
         } 
         catch (Exception e) { 

        	 System.out.println (e);

         } 
      } else { 
         System.err.println("Nenhum arquivo foi dado como entrada"); 
         System.exit(1); 
      } 
   } 
}