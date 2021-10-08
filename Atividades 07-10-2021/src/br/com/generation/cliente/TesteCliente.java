package br.com.generation.cliente;



public class TesteCliente {

	public static void main(String[] args) {

        Cliente cliente = new Cliente();
        
        cliente.setNome("Rafael Rodrigues ");
        cliente.setCelular("92345-6543");
        cliente.setCpf("123.456.789-76");
        cliente.setEndereco("Rua: Manoel pereira, 523, centro, SBC");        

		
	
		 System.out.println("Nome: " + cliente.getNome());
		 System.out.println("CPF: " + cliente.getCpf());
		 System.out.println("Celular: " + cliente.getCelular());
		 System.out.println("Endereço: " + cliente.getEndereco());
	}

}
