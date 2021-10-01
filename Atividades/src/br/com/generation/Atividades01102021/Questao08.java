package br.com.generation.Atividades01102021;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {


		float custoFabrica = 0, custoConsumidor = 0;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println(" Digite o valor do carro a custo de fábrica: ");
		custoFabrica = leia.nextFloat();
		
		custoConsumidor = (float) (custoFabrica * 1.73);
		// Imposto de 28% + valor do distribuidor = 45% = total de 73% de aumento 
						


		System.out.println("\nO custo final do carro para o consumidor  é de: R$ " + custoConsumidor);
	
        leia.close();

	}

}
