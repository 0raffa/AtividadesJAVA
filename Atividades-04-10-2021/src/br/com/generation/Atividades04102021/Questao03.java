package br.com.generation.Atividades04102021;

import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {

		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		
		if (idade >= 10  && idade <= 15){
			 JOptionPane.showMessageDialog(null, "Voc� esta na categoria INFANTIL", "Erro", JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
             }
		else if (idade > 15  && idade <= 17){
			 JOptionPane.showMessageDialog(null, "Voc� esta na categoria JUVENIL", "Erro", JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
		}
		else if (idade > 17  && idade <= 25){
			 JOptionPane.showMessageDialog(null, "Voc� esta na categoria ADULTO", "Erro", JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);
	   }
		else if (idade >= 0 && idade <10 ) {
			 JOptionPane.showMessageDialog(null, "Voc� ainda n�o tem idade", "Erro", JOptionPane.INFORMATION_MESSAGE);
	         System.exit(0);
		}
		else if (idade > 25 && idade <100 ) {
			 JOptionPane.showMessageDialog(null, "Voc� j� ultrapassou a idade", "Erro", JOptionPane.INFORMATION_MESSAGE);
	         System.exit(0);
		}
		else  {
			 JOptionPane.showMessageDialog(null, "Informe uma idade v�lida", "Erro", JOptionPane.INFORMATION_MESSAGE);
	         System.exit(0);
		}

}
}
