package br.com.generation.atividade06102021;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int [][] valor = new int [3] [3];
		int soma =0, diagonal =0, v=1;
			

		for (int l=0; l< valor.length; l++){
			for(int c = 0; c< valor.length; c++){
				System.out.println("Informe o " + v  + "° valor:");
				valor[l][c] = ler.nextInt();
				v++;
			}
		}
		for (int l=0; l< valor.length; l++){
			for(int c=0; c< valor.length; c++){
				soma += valor[l][c];	
			  		 if (l == c){
						diagonal += valor[l][c];		
			  }
			}
		}
		System.out.println("\nA soma de todos os valores é :"+ soma + " e a soma da diagonal é:" + diagonal );
        ler.close();
		}		
	}


