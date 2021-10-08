package br.com.generation.contabancaria;

public class TesteContaBancaria {

	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria();
		
		conta.setNome("Marcos Pereira");
		conta.setConta(19532);
        conta.setDigito(1);
        conta.setSaldo(1122.12);
        
        System.out.println("Nome: "+ conta.getNome());
        System.out.println("Conta: "+ conta.getConta());
        System.out.println("Digito: "+ conta.getDigito());
        System.out.println("Saldo: "+ conta.getSaldo());
	}

}
