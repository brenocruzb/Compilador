package Semantica;

public class Simbolo {
	private String tipo;
	private int tamanho;
	private Object valor;
	
	public Simbolo()
	{
		this.tamanho = -1;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}

	

}
