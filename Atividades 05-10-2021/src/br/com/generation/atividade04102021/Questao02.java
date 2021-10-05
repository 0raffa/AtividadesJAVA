package br.com.generation.atividade04102021;

public class Questao02 {

	public static void main(String[] args) {

		int impar = 0, par=0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0 ) {
				par ++;
			}
			else {
				impar++;
			}
		}
            System.out.println("A quantidade de pares são: "+ par + " e impares são: "+ impar);
	}

}
