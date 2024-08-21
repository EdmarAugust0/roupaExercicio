package br.com.edmar;

public class Roupa {
	//Propriedades da roupa
	private String tipo;
	private String cor;
	private String tamanho;
	private boolean limpa;

	public Roupa (String tipo, String cor, String tamanho) {
		this.tipo = tipo;
		this.cor = cor;
		this.tamanho = tamanho;
		this.limpa = false;
	}
	
	public void usar() {
		this.limpa = false;
	}
	
	public boolean estaLimpa() {
		return this.limpa;
	}
	
	public String detalhes() {
		return this.tipo + " " + this.tamanho + ", Cor: " + this.cor + ".";
	}
}
