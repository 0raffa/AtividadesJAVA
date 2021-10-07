package br.com.generation.atividade06102021;

import java.util.Scanner;

public class Questao03 { 


	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int [][] n1 = new int [4] [6];
		int [][] n2 = new int [4] [6];	
		int [][] m1 = new int [4] [6];
		int [][] m2 = new int [4] [6];
		
	    for (int l=0; l < n1.length; l++) {
	    	for (int c=0; c < n1.length; c++) {
	    		System.out.println("Informe o valor de N1: ");
	    		n1[l][c] = ler.nextInt();
	    	}
	    }
        for (int l=0; l < n2.length; l++) {
        	for (int c=0; c < n2.length; c++) {
        		System.out.println("Informe o valor de N2: ");
        		n2[l][c] = ler.nextInt();
        	}
        }
		for (int l=0; l < n1.length; l++ ) {
			for (int c=0; c< m1.length; c++) {
		       	m1[l][c] = n1[l][c] + n2[l][c];
		       	System.out.println("A soma de N1 e N2 é de: " + m1[l][c]);
			}
		}
		for (int l=0; l < m2.length; l++ ) {
			for (int c=0; c< m2.length; c++) {
		       	m2[l][c] = n1[l][c] - n2[l][c];
		       	System.out.println("A subtração  de N1 e N2 é de: " + m2[l][c]);
			}
		}
		ler.close();
	}
}