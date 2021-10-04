package br.com.generation.Atividades01102021;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float x1, y1, x2, y2, a, b, d;
		
		System.out.println("Informe o valor de x1: ");
		x1 = leia.nextFloat();
        System.out.println("Informe o valor de y1: ");
        y1 = leia.nextFloat();
        System.out.println("Informe o valor de x2: ");
        x2 = leia.nextFloat();
        System.out.println("Informe o valor de y2: ");
        y2 = leia.nextFloat();
	
		

		a =(float) Math.pow((x2 - x1), 2.0); 
		b =(float) Math.pow((y2-y1), 2.0);

		d = (float) Math.sqrt(a+b);

		System.out.println("O resultado  é de: " + d);
		leia.close();	
		
	}

}
