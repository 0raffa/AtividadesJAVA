package br.com.generation.atividade04102021;
import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
	
		int idade=0, menor21=0, maior50=0;
		
		while (idade != -99) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("\nInforme a idade ou digite -99 para finaliar o programa "));
			if (idade >= 0 && idade < 22) {
				menor21++;
			}
		    if (idade >= 50 && idade < 120) {
		    	maior50++;
		    }


		}
		JOptionPane.showMessageDialog(null, "A quantidade de pessoas menores de 18 anos são("+menor21+") e maiores de 50 são ("+ maior50 +")","Contagem categoria",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
