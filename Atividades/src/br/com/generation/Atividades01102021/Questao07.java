package br.com.generation.Atividades01102021;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {

		
		float a,  b, c, d, g, f, x, y; 
		
	    Scanner leia = new Scanner(System.in);
	    
		System.out.println("Digite o coeficiente de a: ");
		a = leia.nextFloat();
		System.out.println("Digite o coeficiente de b: ");
		b = leia.nextFloat();
	    System.out.println("Digite o coeficiente de c: ");
        c = leia.nextFloat();
        System.out.println("Digite o coeficiente de d: ");
        d =  leia.nextFloat();
        System.out.println("Digite o coeficiente de e: ");
        g = leia.nextFloat();
        System.out.println("Digite o coeficiente de f: ");
        f = leia.nextFloat();



		x = ((c*g) - (b*f)) / ((a*g) - (b*d));
		y = ((a*f) - (c*d)) / ((a*g) - (b*d));

			
		
		System.out.println("O resultado de x é igual a: " + x);
		System.out.println("\nO resultado de y é igual a: " + y);
		leia.close();
		
	}

}
