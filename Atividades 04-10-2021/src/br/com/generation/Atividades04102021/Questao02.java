package br.com.generation.Atividades04102021;

import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {

  int num1,num2,num3;
   
   num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
   num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor:"));
   num3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor:"));
   
   if(num1 > num2 && num1> num3 && num2 >num3) {
		JOptionPane.showMessageDialog(null, "A sequência de números é: "+num1+" "+num2+" "+num3,"ERRO",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	    }
   else if  (num1 > num2 && num1 > num3 && num3> num2) {
		JOptionPane.showMessageDialog(null, "A sequência de números é: "+num1+" "+num3+" "+num2,"ERRO",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	    }
   else if  (num2 > num1 && num2 > num3 && num1> num3) {
		JOptionPane.showMessageDialog(null, "A sequência de números é: "+num2+" "+", "+""+num1+" "+" e "+""+num3,"ERRO",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
            }
   else if  (num2 > num1 && num2 > num3 && num3> num1) {
		JOptionPane.showMessageDialog(null, "A sequência de números é: "+num2+" "+num3+" "+num1,"ERRO",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
            }
   else if  (num3 > num1 && num3 > num2 && num1> num2) {
		JOptionPane.showMessageDialog(null, "A sequência de números é: "+num3+" "+num1+" "+num2,"ERRO",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
            }
   else if  (num3 > num1 && num3 > num2 && num2> num1) {
		JOptionPane.showMessageDialog(null, "A sequência de números é: "+num3+" "+num2+" "+num1,"ERRO",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
            }
	}

}
