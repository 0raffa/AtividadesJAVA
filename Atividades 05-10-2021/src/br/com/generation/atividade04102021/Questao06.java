package br.com.generation.atividade04102021;

import javax.swing.JOptionPane;

public class Questao06 {

	public static void main(String[] args) {
	
		int num =0, cont = 0, soma=0;
		double media;
		
		do {	
		num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número ou digite 0 para finalizar o programa "));
		 if (num % 3 == 0) {
			 soma+=num;
			 cont++;
			 
		 }
		}while(num != 0);

		media = soma/cont;
		JOptionPane.showMessageDialog(null, "A média dos numeros multiplos de três é " + media,"Media dos multiplos",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
