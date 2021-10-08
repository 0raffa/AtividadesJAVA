package br.com.generation.funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario func = new Funcionario();
		
		func.setNome("Maria Silva");
		func.setCpf("345.123.677-17");
		func.setEndereco("Rua Sampaio de Camargo, 14,  zl, São Paulo-SP");
		func.setSal(1091.94);
		
		
		System.out.println("Nome: " + func.getNome());
		System.out.println("CPF: " + func.getCpf());
		System.out.println("Endereço: " + func.getEndereco());
		System.out.println("Salário: " + func.getSal());
		
	}

}
