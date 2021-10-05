package br.com.generation.atividade04102021;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
   
		int pessoa = 0, idade, sexo, caracteristica, calma =0, mNervosa = 0, hAgressivo =0;
		int oCalma = 0, nervosa40=0, calma18=0;
		
		Scanner leia = new Scanner(System.in);
		
  
		
while ( pessoa <150) {
	System.out.println("Informe sua idade: ");
	idade =  leia.nextInt();
	System.out.println("Informe seu sexo (1-feminino / 2-masculino / 3-Outros)");
	sexo = leia.nextInt();
	System.out.println("Informe sua característica psicológica(1 - para calma / 2  para nervosa / 3 para  agressiva)");
	 caracteristica = leia.nextInt();
	 if(caracteristica == 1) {
		 calma++;
	 }
	 if(sexo == 1 && caracteristica == 2) {
		 mNervosa++;	 
	 }
	 if(sexo == 2 && caracteristica == 3) {
		 hAgressivo++;
	 }
	 if (sexo==3 && caracteristica == 1) {
		 oCalma++;
	 }
	 if (caracteristica ==2 && idade >=40) {
		 nervosa40++;
	 }
	 if (caracteristica == 1 && idade <= 18) {
		 calma18++;
	 }

	 
}
System.out.println("Número de pessoas calmas: "+ calma);
System.out.println("Número de mulheres nervosas: "+ mNervosa);	 
System.out.println("Número de homens agressivos: "+ hAgressivo);	
System.out.println("Número de outros calmos: "+ oCalma);
System.out.println("Número de pessoas nervosas com mais de 40 anos: "+ nervosa40);
System.out.println("Número de pessoas calmas com menos de 18 anos: "+ calma18);
    
leia.close();    
	}

}
