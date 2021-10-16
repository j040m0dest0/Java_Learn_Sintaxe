
public class TestaCondicional {
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade = 20;
		int quantidadeDePessoas = 3;
		if(idade >= 18)
		{		
			System.out.println("vc é maior de idade");			
		}
		else 
		{
			if(quantidadeDePessoas >=2) 
			{
				System.out.println("Você não é maior de idade porem esta acompanhado e pode entrar");
			}
			else
			{
				System.out.println("você não pode entrar pois é menor de idade e não esta acompanhado");
			}
			System.out.println("Vc é menor de idade");	
		}
		
	}

}
