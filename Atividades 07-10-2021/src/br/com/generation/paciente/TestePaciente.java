package br.com.generation.paciente;

public class TestePaciente {

	public static void main(String[] args) {

   Paciente p = new Paciente();
    
   p.setNome("Rafael Rodrigues");
   p.setIdade(29);
   p.setNumeroPaciente(102432);
   p.setProntuario("Internado");
   
   System.out.println("Nome: " + p.getNome());
   System.out.println("Idade: " + p.getIdade());
   System.out.println("Numero do paciente: " + p.getNumeroPaciente());
   System.out.println("Situação: " + p.getProntuario());
	}

}
