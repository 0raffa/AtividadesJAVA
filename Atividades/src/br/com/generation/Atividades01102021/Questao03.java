package br.com.generation.Atividades01102021;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
   
		int segundos, minutos, horas;
		Scanner leia = new Scanner(System.in);
    
		System.out.println("Digite a quantidade de segundos:" );
        segundos = leia.nextInt();
        horas = segundos / 3600;
  		minutos = (segundos-(horas*3600)) / 60;
  		segundos = (segundos-(horas*3600)-(minutos*60));
  		
  		System.out.println(horas +" Horas, "+ minutos +" Minutos e " + segundos + " Segundos");
  		leia.close();

	}

}
