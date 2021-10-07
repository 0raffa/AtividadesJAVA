package br.com.generation.atividade06102021;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int [] notas = new int [5];
		int  maiorN = 0;
	
		for (int i = 0; i < notas.length; i++  ) {
			System.out.println("Informe o valor de " + (i+1)+ "° nota:");
			notas[i] = leia.nextInt();
			}
        for (int i = 0; i < notas.length; i++) {
        	if (notas[i] > maiorN) {
        		maiorN = notas[i];
	                                    }
    }
        System.out.println("A maior nota é: "+ maiorN);
       	System.out.println("Os valores informados são: ");
       
       	for(int cont = 0; cont < notas.length; cont++) {
       		System.out.print(notas[cont] +"/ ");
       	}
       	leia.close();
       	
        }
}
		
