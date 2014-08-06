package Semantica;

import java.util.HashMap;
import java.util.LinkedList;

import node.*;
import analysis.DepthFirstAdapter;
import Semantica.Simbolo;

import java.util.HashMap;

public class Semantico extends DepthFirstAdapter {

	HashMap<String, Simbolo> tabelaSimbolos;
	
	public Semantico()
	{
		tabelaSimbolos = new HashMap<String, Simbolo>();
	}
	
	private Simbolo getSimbolo(String valor)
	{
		Simbolo sim = new Simbolo();
		if(valor.charAt(0)=='\'')
		{
			sim.setTipo("caractere");
			sim.setTamanho(valor.length()-2);
			sim.setValor(valor.substring(1,valor.length()-2));
		}else
		{
			if(valor.contains(","))
			{	sim.setTipo("real");
				valor = valor.replace(',','.');   
				sim.setValor(Double.parseDouble(valor));
			}
			else
			{	sim.setTipo("inteiro");
				sim.setValor(Integer.parseInt(valor));
			}
		}
		return sim;
	}
	
	@Override
	public void outStart(Start node) {
		// TODO Auto-generated method stub
		super.outStart(node);
	}
	
	@Override
	public void outATotal(ATotal node) {
		// TODO Auto-generated method stub
		String nomePrograma = node.getIdentificador().getText();
		if(tabelaSimbolos.containsKey(nomePrograma)){	
				System.err.println("Erro semantico: O nome do programa nao pode ser usado como variavel ["+Integer.toString(node.getIdentificador().getLine())+
        		","+Integer.toString(node.getIdentificador().getPos())+"]");
        }
		super.outATotal(node);
	}

	@Override
	public void outADconstanteDeclaracaoVariavel(
			ADconstanteDeclaracaoVariavel node) {
        String nome = node.getIdentificador().getText();
        if(tabelaSimbolos.containsKey(nome))
        {	System.err.println("Erro semantico: constante j� declarada ["+Integer.toString(node.getIdentificador().getLine())+
        		","+Integer.toString(node.getIdentificador().getPos())+"]");}
        else
        {
        	tabelaSimbolos.put(nome, getSimbolo(node.getValor().toString()));
        }
		super.outADconstanteDeclaracaoVariavel(node);
	}
	
	@Override
	public void outAVariavelDeclaracaoVariavel(AVariavelDeclaracaoVariavel node) {
		String tipo = node.getTipo().toString();
		LinkedList<PVariaveld> lista = node.getPrimeiro();
		String nome = "";
		Node cara = node.getSegundo();
		while(true){
			switch (cara.getClass().toString())
			{
			case "class node.ASimplesVariaveld":
				ASimplesVariaveld segundo = (ASimplesVariaveld) cara;
				Token token = segundo.getIdentificador();
				nome = token.getText();
				
				if(tabelaSimbolos.containsKey(nome))
		        {	System.err.println("Erro semantico: variavel j� declarada ["+Integer.toString(token.getLine())+
		        		","+Integer.toString(token.getPos())+"]");}
		        else
		        {
		        	Simbolo simbolo = new Simbolo();
		        	simbolo.setTipo(tipo);
		        	tabelaSimbolos.put(nome, simbolo);
		        }
			break;	
			case "class node.AVetorVariaveld":
				AVetorVariaveld segundo2 = (AVetorVariaveld) cara;
				token = segundo2.getIdentificador();
				nome = token.getText();
				
				if(tabelaSimbolos.containsKey(nome))
		        {	System.err.println("Erro semantico: variavel j� declarada ["+Integer.toString(token.getLine())+
		        		","+Integer.toString(token.getPos())+"]");}
				else
		        {
		        	Simbolo simbolo = new Simbolo();
		        	simbolo.setTipo(tipo);
	        		simbolo.setTamanho(Integer.parseInt(segundo2.getNumero().getText()));
	        		tabelaSimbolos.put(nome, simbolo);
		        }
			break;
			}
//			System.out.println(nome+":");
//			Simbolo simbolo = tabelaSimbolos.get(nome);
//			if(simbolo!=null)
//			{
//				if(simbolo.getValor() == null)
//				{
//					System.out.printf(" tipo "+  simbolo.getTipo() +", tamanho ");
//				}else
//				{
//					System.out.printf(" valor "+ simbolo.getValor().toString() +" , tipo "+  simbolo.getTipo() +", tamanho ");
//				}
//				
//				System.out.println(simbolo.getTamanho());
//			}
			if(lista.peek() != null)
				cara = lista.pop();
			else
				break;
			
		}
		
		super.outAVariavelDeclaracaoVariavel(node);
	}

	
	public String OperacaoExpr(Node no) {
		// TODO Auto-generated method stub
		String ret = "ERRO";
		//AVariavelExpr node = (AVariavelExpr)no;
		switch(no.getClass().toString()){
			case "class node.AOperacaoExpr":			
				String resul_esq;
				PExpr esquerda = ((AOperacaoExpr)no).getPrimeiro();
				String resul_dir;
				PExpr direita = ((AOperacaoExpr)no).getSegundo();
				resul_esq = OperacaoExpr((Node) esquerda);	
				resul_dir = OperacaoExpr((Node) direita);
				
				// "inteiro" "real" "caractere" "ERRO"
				
				if(resul_esq == "caractere" || resul_dir == "caractere"){
					System.err.println("Erro semantico: opera��es aritmeticas com caracteres n�o s�o permitidas,");
					ret = "ERRO";
				}
				else if(resul_esq == resul_dir){
					ret = resul_esq;
				}
				else if(resul_esq == "real" || resul_dir == "real"){
					ret = "real";
				}else{
					ret = "inteiro";
				}
			break;
			
			case "class node.AInternoExpr":
				ret = OperacaoExpr(((AInternoExpr)no).getExpr());
			break;
			
			case "class node.ANegativoExpr":
				ret = OperacaoExpr(((ANegativoExpr)no).getExpr());
				if(ret == "caractere")
				{	ret = "ERRO";
					System.err.println("Erro semantico: opera��es aritmeticas com caracteres n�o s�o permitidas,");
				}
			break;
			
			case "class node.ANumeroExpr":			
				ret = "inteiro";
			break;
		
			case "class node.ARealExpr":				
				ret = "real";
			break;
		
			case "class node.AVariavelExpr":						
			switch(((AVariavelExpr)no).getVar().getClass().toString())
			 {
			  	case "class node.AIdVar":				  		
					 AIdVar variavel = (AIdVar) ((AVariavelExpr)no).getVar();									
					 Simbolo sim = tabelaSimbolos.get(variavel.getIdentificador().getText());					
					 if(sim!=null)
					 {
					     if(sim.getTamanho() != -15328 && sim.getTipo() != "caractere")
						 {
							 System.err.println("Erro semantico: posicao do vetor nao especificada: \'"+variavel.getIdentificador().getText()+"\' ["+
								 		Integer.toString(variavel.getIdentificador().getLine())+
					        		","+Integer.toString(variavel.getIdentificador().getPos())+"]");
						 }
						 return sim.getTipo();							
					 }else
					 {
						 System.err.println("Erro semantico: vari�vel n�o declarada \'"+variavel.getIdentificador().getText()+"\' ["+
							 		Integer.toString(variavel.getIdentificador().getLine())+
				        		","+Integer.toString(variavel.getIdentificador().getPos())+"]");
					 }
				 
				break;
			  	case "class node.AVetorVar":				
			  		 AVetorVar variavel2 = (AVetorVar) ((AVariavelExpr)no).getVar();				  	
					 sim = tabelaSimbolos.get(variavel2.getIdentificador().getText());
					 if(OperacaoExpr((Node)variavel2.getExpr()) != "inteiro")
					 {
						 System.err.println("Erro semantico: enderen�o do vetor n�o � inteiro \'"+variavel2.getIdentificador().getText()+"\' ["+
							 		Integer.toString(variavel2.getIdentificador().getLine())+
				        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
					 }
					 if(sim!=null)
					 {
						 if(sim.getTipo()=="caractere")
						 {
							 System.err.println("Erro semantico: Opera��o n�o autorizada para variaveis do tipo caractere, \'"+variavel2.getIdentificador().getText()+"\' ["+
										 		Integer.toString(variavel2.getIdentificador().getLine())+
							        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
						 }else if(sim.getTamanho() == -15328)
						 {
							 System.err.println("Erro semantico: n�o � um vetor: \'"+variavel2.getIdentificador().getText()+"\' ["+
								 		Integer.toString(variavel2.getIdentificador().getLine())+
					        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
						 }
						 return sim.getTipo();
					 }else
					 {
						 System.err.println("Erro semantico: vari�vel n�o declarada \'"+variavel2.getIdentificador().getText()+"\' ["+
								 		Integer.toString(variavel2.getIdentificador().getLine())+
					        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
					 }
					 
			  	break;
			 }
			break;
			default://case "class node.AOperacaologicaExpr":
				ret = OperacaologicaExpr(no);
			break;
		}
		return ret;
	}
//-------------------------------------------------
	@Override
	public void outAOperacaologicaExpr(AOperacaologicaExpr node){		
		OperacaologicaExpr((Node) node);
	}

	public String OperacaologicaExpr(Node no) {
		// TODO Auto-generated method stub
		String ret = "ERRO";
		switch(no.getClass().toString()){
			case"class node.AOperacaologicaExpr":
				
				String resul_esq;
				PExpr esquerda = ((AOperacaologicaExpr)no).getPrimeiro();
				String resul_dir = "";
				PExpr direita = ((AOperacaologicaExpr)no).getSegundo();
				resul_esq = OperacaologicaExpr((Node) esquerda);	
				resul_dir = OperacaologicaExpr((Node) direita);
				
				if(resul_esq == "ERRO" || resul_esq == "caractere" ||
						resul_dir == "ERRO" || resul_dir == "caractere"){
					ret = "ERRO";
				}else{
					ret = "booleano";
				}					
			break;
			
			case"class node.ANegadoExpr":
				ret = OperacaologicaExpr(((ANegadoExpr)no).getExpr());
				break;
			
			case"default":
				ret = OperacaoExpr(no);	
				break;
		}			
		return ret;
	}
				
//-----------------------------------------------------------------------
	@Override
	public void outASeComandoSe(ASeComandoSe node) {
		String expr = OperacaologicaExpr((Node)node.getExpr());
		node.getComando();
		super.outASeComandoSe(node);
	}

	@Override
	public void outASeNaoComandoSe(ASeNaoComandoSe node) {
		// TODO Auto-generated method stub
		String expr = OperacaologicaExpr((Node)node.getExpr());
		super.outASeNaoComandoSe(node);
	}

	@Override
	public void outAComandoRepita(AComandoRepita node) {
		// TODO Auto-generated method stub
		OperacaoExpr(node.getExpr());
		super.outAComandoRepita(node);
	}

	@Override
	public void outAComandoEnquanto(AComandoEnquanto node) {
		// TODO Auto-generated method stub
		OperacaoExpr(node.getExpr());
		super.outAComandoEnquanto(node);
	}

	public void Casos(ACasos node,String esperado) {
		// TODO Auto-generated method stub
		switch(node.getValor().getClass().toString())
		{
			case "class node.AStringValor":
				if(esperado != "caractere"){
					System.err.println("Erro semantico: tipo diferente do esperado no caso da avalia��o: "+((AStringValor)node.getValor()).getString().getText()+" ["+
					 		Integer.toString(((AStringValor)node.getValor()).getString().getLine())+
		        		","+Integer.toString(((AStringValor)node.getValor()).getString().getPos())+"]");
				}
			break;
			case "class node.ANumeroValor":
				if(esperado != "inteiro"){
					System.err.println("Erro semantico: diferentes tipos nos casos da avalia��o \'"+((ANumeroValor)node.getValor()).getNumero().getText()+"\' ["+
					 		Integer.toString(((ANumeroValor)node.getValor()).getNumero().getLine())+
		        		","+Integer.toString(((ANumeroValor)node.getValor()).getNumero().getPos())+"]");
				}
			break;
			case "class node.ARealValor":
				if(esperado != "real"){
					System.err.println("Erro semantico: diferentes tipos nos casos da avalia��o \'"+((ARealValor)node.getValor()).getNumeroReal().getText()+"\' ["+
					 		Integer.toString(((ARealValor)node.getValor()).getNumeroReal().getLine())+
		        		","+Integer.toString(((ARealValor)node.getValor()).getNumeroReal().getPos())+"]");
				}
			break;
		}
		super.outACasos(node);
	}

	@Override
	public void outANormalComandoAvalie(ANormalComandoAvalie node) {
		// TODO Auto-generated method stub
		String expr = OperacaoExpr(node.getExpr());
		LinkedList<PCasos> lista = node.getCasos();
		if(expr != "ERRO")
		{
		 while(lista.peek() != null)
		 {Casos((ACasos)lista.pop(),expr);}
		}
		super.outANormalComandoAvalie(node);
	}

	@Override
	public void outASenaoComandoAvalie(ASenaoComandoAvalie node) {
		// TODO Auto-generated method stub
		String expr = OperacaoExpr(node.getExpr());
		LinkedList<PCasos> lista = node.getCasos();
		if(expr != "ERRO")
		{
		 while(lista.peek() != null)
		 {Casos((ACasos)lista.pop(),expr);}
		}
		super.outASenaoComandoAvalie(node);
	}

	@Override
	public void outANumParatipos(ANumParatipos node) {
		// TODO Auto-generated method stub
		super.outANumParatipos(node);
	}

	@Override
	public void outAVarParatipos(AVarParatipos node) {
		// TODO Auto-generated method stub
		super.outAVarParatipos(node);
	}

	@Override
	public void outASempassoComandoPara(ASempassoComandoPara node) {
		// TODO Auto-generated method stub
		= ((ANumParatipos)node.getParatipos()).getNumero();
		super.outASempassoComandoPara(node);
	}

	@Override
	public void outACompassoComandoPara(ACompassoComandoPara node) {
		// TODO Auto-generated method stub
		super.outACompassoComandoPara(node);
	}

	@Override
	public void outANormalComandoEscrita(ANormalComandoEscrita node) {
		// TODO Auto-generated method stub
		OperacaoExpr(node.getExpr());
		super.outANormalComandoEscrita(node);
	}


	@Override
	public void outAComandoLeia(AComandoLeia node) {
		// TODO Auto-generated method stub
		String tipoVar = null;
		switch(node.getVar().getClass().toString())
		 {
		  	case "class node.AIdVar":				  		
				 AIdVar variavel = (AIdVar) node.getVar();									
				 Simbolo sim = tabelaSimbolos.get(variavel.getIdentificador().getText());					
				 if(sim==null)
				 {					
					 System.err.println("Erro semantico: vari�vel n�o declarada \'"+variavel.getIdentificador().getText()+"\' ["+
						 		Integer.toString(variavel.getIdentificador().getLine())+
			        		","+Integer.toString(variavel.getIdentificador().getPos())+"]");
				 }else if(sim.getValor() != null)
				 {
					 System.err.println("Erro semantico: n�o se modifica o valor de uma constante: \'"+variavel.getIdentificador().getText()+"\' ["+
						 		Integer.toString(variavel.getIdentificador().getLine())+
			        		","+Integer.toString(variavel.getIdentificador().getPos())+"]");
				 }else if(sim.getTamanho() != -15328 && sim.getTipo() != "caractere")
				 {
					 System.err.println("Erro semantico: posicao do vetor nao especificada: \'"+variavel.getIdentificador().getText()+"\' ["+
						 		Integer.toString(variavel.getIdentificador().getLine())+
			        		","+Integer.toString(variavel.getIdentificador().getPos())+"]");
				 }
				 else{
					 tipoVar = sim.getTipo();
				 }
			 
			 break;
		  	case "class node.AVetorVar":				
		  		 AVetorVar variavel2 = (AVetorVar) node.getVar();
				 sim = tabelaSimbolos.get(variavel2.getIdentificador().getText());						
				 if(OperacaoExpr((Node)variavel2.getExpr()) != "inteiro")
				 {
					 System.err.println("Erro semantico: enderen�o do vetor n�o � inteiro \'"+variavel2.getIdentificador().getText()+"\' ["+
						 		Integer.toString(variavel2.getIdentificador().getLine())+
			        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
				 }
				 if(sim==null)
				 {
					 System.err.println("Erro semantico: vari�vel n�o declarada \'"+variavel2.getIdentificador().getText()+"\' ["+
							 		Integer.toString(variavel2.getIdentificador().getLine())+
				        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
				 }else if(sim.getTamanho() == -15328)
				 {
					 System.err.println("Erro semantico: n�o � um vetor: \'"+variavel2.getIdentificador().getText()+"\' ["+
						 		Integer.toString(variavel2.getIdentificador().getLine())+
			        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
				 }
				 else if(sim.getValor() != null)
				 {
					 System.err.println("Erro semantico: n�o se modifica o valor de uma constante: \'"+variavel2.getIdentificador().getText()+"\' ["+
						 		Integer.toString(variavel2.getIdentificador().getLine())+
			        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
				 }else
				 {
					 tipoVar = sim.getTipo();
				 }
				 
		  	break;
		 }
		//super.outAComandoLeia(node);
	}

	@Override
	public void outAComandoAtribuicao(AComandoAtribuicao node) {
		// TODO Auto-generated method stub
		String tipoVar = null;
		String tipoExpr = OperacaoExpr(node.getExpr());
		switch(node.getVar().getClass().toString())
		 {
		  	case "class node.AIdVar":				  		
				 AIdVar variavel = (AIdVar) node.getVar();									
				 Simbolo sim = tabelaSimbolos.get(variavel.getIdentificador().getText());					
				 if(sim==null)
				 {					
					 System.err.println("Erro semantico: vari�vel n�o declarada \'"+variavel.getIdentificador().getText()+"\' ["+
						 		Integer.toString(variavel.getIdentificador().getLine())+
			        		","+Integer.toString(variavel.getIdentificador().getPos())+"]");
				 }
				 else if(sim.getValor() != null)
				 {
					 System.err.println("Erro semantico: n�o se modifica o valor de uma constante: \'"+variavel.getIdentificador().getText()+"\' ["+
						 		Integer.toString(variavel.getIdentificador().getLine())+
			        		","+Integer.toString(variavel.getIdentificador().getPos())+"]");
				 }else if(sim.getTamanho() != -15328)
				 {
					 System.err.println("Erro semantico: posicao do vetor nao especificada: \'"+variavel.getIdentificador().getText()+"\' ["+
						 		Integer.toString(variavel.getIdentificador().getLine())+
			        		","+Integer.toString(variavel.getIdentificador().getPos())+"]");
				 }
				 else{
					 tipoVar = sim.getTipo();
				 }
				 if(tipoVar!=null)
					{
						if(tipoExpr !=  tipoVar && tipoExpr == "real" || tipoVar == "caractere"){
							System.err.println("Erro incompatibilidade de tipos na atribui��o a variavel \'"+variavel.getIdentificador().getText()+"\' ["+
							 		Integer.toString(variavel.getIdentificador().getLine())+
				        		","+Integer.toString(variavel.getIdentificador().getPos())+"]");
						}
					}
			 
			 break;
		  	case "class node.AVetorVar":				
		  		 AVetorVar variavel2 = (AVetorVar) node.getVar();
				 sim = tabelaSimbolos.get(variavel2.getIdentificador().getText());						
				 if(OperacaoExpr((Node)variavel2.getExpr()) != "inteiro")
				 {
					 System.err.println("Erro semantico: enderen�o do vetor n�o � inteiro \'"+variavel2.getIdentificador().getText()+"\' ["+
						 		Integer.toString(variavel2.getIdentificador().getLine())+
			        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
				 }
				 if(sim==null)
				 {
					 System.err.println("Erro semantico: vari�vel n�o declarada \'"+variavel2.getIdentificador().getText()+"\' ["+
							 		Integer.toString(variavel2.getIdentificador().getLine())+
				        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
				 }else if(sim.getTamanho() == -15328)
				 {
					 System.err.println("Erro semantico: n�o � um vetor: \'"+variavel2.getIdentificador().getText()+"\' ["+
						 		Integer.toString(variavel2.getIdentificador().getLine())+
			        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
				 }
				 else if(sim.getValor() != null)
				 {
					 System.err.println("Erro semantico: n�o se modifica o valor de uma constante: \'"+variavel2.getIdentificador().getText()+"\' ["+
						 		Integer.toString(variavel2.getIdentificador().getLine())+
			        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
				 }else
				 {
					 tipoVar = sim.getTipo();
				 }
				 if(tipoVar!=null)
					{
						if(tipoExpr !=  tipoVar && tipoExpr == "real" || tipoVar == "caractere"){
							System.err.println("Erro incompatibilidade de tipos na atribui��o a variavel \'"+variavel2.getIdentificador().getText()+"\' ["+
							 		Integer.toString(variavel2.getIdentificador().getLine())+
				        		","+Integer.toString(variavel2.getIdentificador().getPos())+"]");
						}
					}
				 
		  	break;
		 }
		//super.outAComandoAtribuicao(node);
	}


}
