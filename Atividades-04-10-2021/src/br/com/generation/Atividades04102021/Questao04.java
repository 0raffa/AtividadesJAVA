package br.com.generation.Atividades04102021;

import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {

		double num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu numero"));
		
		if (num % 2 == 0 ) {
			JOptionPane.showMessageDialog(null, "O  numero informado é par e a raiz quadrada é   "
			+ Math.sqrt(num), "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "O número é impar  e o elevado ao quadrado é "+ Math.pow(num, 2.0), "AVISO", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

	}

}