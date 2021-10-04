package br.com.generation.Atividades04102021;

import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {


	
    int num1, num2, num3;
    num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
	num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
	num3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor:"));
	
		if(num1 > num2 && num1 > num3) {
		    	 JOptionPane.showMessageDialog(null, "O primeiro valor é o maior ", "Erro", JOptionPane.INFORMATION_MESSAGE);
		    	                  System.exit(0);
		    	}
		else if(num2 > num1 && num2 > num3) {
		    	 JOptionPane.showMessageDialog(null, "O segundo valor é o maior ", "Erro", JOptionPane.INFORMATION_MESSAGE);
		    	                System.exit(0);	
		}
		else {
			JOptionPane.showMessageDialog(null, "O terceiro valor é o maior", "Erro", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
}
	    