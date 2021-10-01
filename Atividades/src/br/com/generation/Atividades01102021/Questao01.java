package br.com.generation.Atividades01102021;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
	
		int ano, mes, dia, totalDias=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Infome o ano do seu nascimento: ");
			ano = leia.nextInt();
		 
		System.out.println("Infome o mês do seu nascimento: ");
			mes = leia.nextInt();
		
		System.out.println("Infome o dia do seu nascimento: ");
			dia = leia.nextInt();
			
			totalDias = ((2021 - ano)*365)+(mes/30)+ dia;
			System.out.println("" + totalDias);
			leia.close();	
			
			

	}

}
