package br.com.generation.atividade06102021;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
	
	    Scanner ler = new Scanner(System.in);
		int[] dado = new int[10];
		int  quant = 0, mPontuacao = 0, num, soma = 0, media;
		
		for (int i = 0; i < dado.length; i++) {
			System.out.println("Digite o "+ (i+1)+ "º valor: ");
			num = ler.nextInt();
			while(num < 1 || num > 6) {
				System.out.println("Valor inválido...");
				System.out.println("Digite o "+ (i+1)+ "º valor: ");
				num = ler.nextInt();
			}
		dado[i] = num;
		soma += dado[i];  
		if (dado[i]  > mPontuacao) {
			 mPontuacao = dado[i];
	      	}
		}
		for (int i = 0; i < 10; i++) {
			if (dado[i] == mPontuacao) {
				quant++;
			}
		}

       for (int i = 0; i < 10; i++) {
    	   System.out.println("A " + (i+1) + "ª pontuação é: " + dado[i]);
       }
       media = soma/10;
       System.out.println("\n\nA média aritmética é de: " + media);
       System.out.println("\n\nA quantidade de ocorrências da maior pontuação é de: " + quant + "\n");
       ler.close();
 }
}