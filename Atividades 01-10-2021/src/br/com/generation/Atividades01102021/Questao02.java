package br.com.generation.Atividades01102021;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
	
		int ano, mes, dia, dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade em dias: ");
		dias = leia.nextInt();
		ano = dias / 365;
		mes = (dias % 365)/30;
		dia = (dias % 365)%30;
		
		System.out.println("você tem " + ano + "anos, " + mes+" meses e "+ dia);	
		leia.close();	
	}

}
