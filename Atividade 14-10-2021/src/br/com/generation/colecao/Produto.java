package br.com.generation.colecao;

public class Produto {
	private String nome;
	private double valor;
    private int cod;
	

	public Produto(String nome, double valor, int cod) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}

	public String toString() {
		return "\nO produto: " + this.nome +" tem o preço de R$"+ this.valor + " reais.";
	}


}
