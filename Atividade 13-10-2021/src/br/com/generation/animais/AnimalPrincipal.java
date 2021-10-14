package br.com.generation.animais;

	public class AnimalPrincipal {

		public static void main(String[] args) {
	      
			Cachorro  cac = new Cachorro();
	        Cavalo    cav = new Cavalo();
	        Preguica  pre = new Preguica();
	        
	        cac.setNome("Alfredo");
	        cac.setIdade(2);
	        
	        cav.setNome("Agnaldo");
	        cav.setIdade(12);
	        
	        pre.setNome("Sid");
	        pre.setIdade(1000);
	        
	        
	        System.out.print("O nome do cachorro é "+ cac.getNome() + " e ele tem "+ cac.getIdade()+" anos. ");
			System.out.print( cac.getNome() + " ");
			cac.correr();
			System.out.print(" O som que " +  cac.getNome() + " esta emitindo é ");
			cac.som();
			System.out.println();
			
	        System.out.print("O nome do cavalo é "+ cav.getNome() + " e ele tem "+ cav.getIdade()+" anos. ");
			System.out.print( cav.getNome() + " ");
			cav.correr();
			System.out.print(" O som que " +  cav.getNome() + " esta emitindo é ");
			cav.som();
			System.out.println();
			
			
			
	        System.out.print("O nome da preguiça é "+ pre.getNome() + " e ela tem "+ pre.getIdade()+" anos. ");
			System.out.print( pre.getNome() + " esta  ");
			pre.subir();
			System.out.print(" O som que " +  pre.getNome() + " esta emitindo é ");
			pre.som();
			System.out.println();

		
	  
		}

	}