package br.com.generation.patinete;

public class PatineteTeste {

	public static void main(String[] args) {

 Patinete p =  new Patinete();
 
     p.setMarca("DROP");
     p.setModelo("PATINETE ELÉTRICO DROP GO-8");
     p.setPreco(3999.99);
     
     
     System.out.println("A marca: " + p.getMarca());
     System.out.println("O modelo: " + p.getModelo());
     System.out.println("O preço: " + p.getPreco());
	}

}
