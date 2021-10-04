package br.com.generation.Atividades01102021;

import java.util.Scanner;


public class Questao04 {

	public static void main(String[] args) {

		int  a, b, c, d, r, s;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o número de A:");
	    	a = leia.nextInt();
		System.out.println("Insira o número de B");
	    	b = leia.nextInt();
		System.out.println("Insira o número de C:");
	    	c = leia.nextInt();
 
		s = (int) Math.pow ((b + c), 2.0);
		r = (int) Math.pow ((a + b), 2.0);
		d = (r + s)/2;

		System.out.println("O valor de D é: " + d);
		leia.close();	
	

	}

}
