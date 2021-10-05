package br.com.generation.atividade04102021;
import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {

		int num=0, soma=0;
		
      do { 
      	  num = Integer.parseInt(JOptionPane.showInputDialog("Informe o  valor: ou digite 0 para finalizar"));
      	  soma+=num;	  
      }while(num != 0);    
  
  	JOptionPane.showMessageDialog(null, "O resultado é "+ soma,"SOMA",JOptionPane.INFORMATION_MESSAGE);
  	System.exit(0);
	}
}
