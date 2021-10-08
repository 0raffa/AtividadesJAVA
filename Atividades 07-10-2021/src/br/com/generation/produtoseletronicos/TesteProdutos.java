package br.com.generation.produtoseletronicos;

public class TesteProdutos {

	public static void main(String[] args) {
		
		ProdutosEletronicos prod = new ProdutosEletronicos();
		
		prod.setTipoDeAparelho("Celular");
		prod.setMarca("Samsung");
		prod.setModelo("S10");
		prod.setPreco(1000.99);
		
		System.out.println("Tipo de eletrônico: " + prod.getTipoDeAparelho());
		System.out.println("Marca: " + prod.getMarca());
		System.out.println("Modelo: " + prod.getModelo());
		System.out.println("Preço: " + prod.getPreco());

	}

}
