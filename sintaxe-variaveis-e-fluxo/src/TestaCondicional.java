
public class TestaCondicional {
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade = 20;
		int quantidadeDePessoas = 3;
		if(idade >= 18)
		{		
			System.out.println("vc � maior de idade");			
		}
		else 
		{
			if(quantidadeDePessoas >=2) 
			{
				System.out.println("Voc� n�o � maior de idade porem esta acompanhado e pode entrar");
			}
			else
			{
				System.out.println("voc� n�o pode entrar pois � menor de idade e n�o esta acompanhado");
			}
			System.out.println("Vc � menor de idade");	
		}
		
	}

}
