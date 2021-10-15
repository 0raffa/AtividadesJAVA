package br.com.generation.colecao;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
			
		ArrayList<Produto> prod = new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		int res = 0;

		prod.add(new Produto("Chocolate", 4.90,1));
		prod.add(new Produto("Refrigerante", 8.99,2));
		prod.add(new Produto("Salgadinho", 7.99,3));
		 res = 99;
		
		while(res != 0) {
			System.out.println("*****Você deseja****\n (1) Para armazenar um novo item\n (2) Para Remover item\n (3) Para apresentar lista de itens\n (0) para sair do programa");
			res = ler.nextInt();
		
			switch (res) {
			  case 1:
			  
				  			System.out.println("Informe o nome do novo produto: ");
				  			String nome = ler.next();
				  			System.out.println("Informe o preço do produto: ");
				  			double valor  = ler.nextDouble();
				  			System.out.println("Informe o código do produto: ");
				  			int cod  = ler.nextInt();
				  			prod.add(new Produto(nome,valor,cod)); 
				break;
			  
			  	case 2:
			  
				   			System.out.println("Qual o código do item que deseja remover?");
				   			int i = ler.nextInt();
				   			prod.remove(i);
				
				break;
 
                case 3:
               				System.out.println("A lista do estoque é: \n" + prod.toString());
               
		
               	break;
			
	           	case 4:
	        	
	        				System.out.println("Número inválido!");
	        	
				  break;
				  
		}
			ler.close();
	}
	}
}

	