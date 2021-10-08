package br.com.generation.contabancaria;

public class ContaBancaria {
	
	private String nome;
	private String tipoConta;
	private int conta;
	private int digito;
	private double saldo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
