
public class TestaEscopoVariavel {
		public static void main(String[] args) {
		
			System.out.println("testando condicionais");
			
			int idade = 20;
			int quantidadeDePessoas = 3;
			boolean acompanhado;
			//boolean acompanhado = quantidadeDePessoas >= 2;
			
			if(quantidadeDePessoas >=2) 
			{
				acompanhado = true;
			}
			
			else 
			{
				acompanhado = false;
			}
			
			if(idade >= 18 && quantidadeDePessoas >= 2 || acompanhado)
			{		
				System.out.println("vc é maior de idade");	
		
			}
			else   
			{
	
				System.out.println("Vc é menor de idade");	
			}
			
		
		
	}

}
