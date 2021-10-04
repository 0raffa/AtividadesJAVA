package br.com.generation.Atividades01102021;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {

		float nota1, nota2, nota3, media;
		Scanner leia = new Scanner(System.in);


		System.out.println("Informe a primeira nota: ");
		nota1 = leia.nextInt();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = leia.nextInt();
		
        System.out.println("Informe a terceira nota: ");
        nota3 = leia.nextInt();
        
		media = ((nota1*2) + (nota2*3) + (nota3*5))/10;


		System.out.println("O(A) aluno(a) teve a média final de: " + media);
		leia.close();
	}

}
