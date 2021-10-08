package br.com.generation.aviao;

public class TesteAviao {

	public static void main(String[] args) {
	
		Aviao aviao =  new Aviao();
		
		aviao.setEmpresa("Gol");
		aviao.setModelo("boeing 707");
		aviao.setAno(2019);

		System.out.println("Empresa: " + aviao.getEmpresa());
		System.out.println("Modelo: " + aviao.getModelo());
		System.out.println("Modelo: " + aviao.getAno());
	}

}
