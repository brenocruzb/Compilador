package Semantica;

public class Simbolo {
	public String tipo;
	private int tamanho;
	private Object valor;
	
	public Simbolo()
	{
		this.tamanho = -15328;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
		this.tipo = tipo.substring(0, tipo.length()-1);
	}
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}

	

}
