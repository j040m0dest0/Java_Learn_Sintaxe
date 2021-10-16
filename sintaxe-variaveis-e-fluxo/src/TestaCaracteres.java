
public class TestaCaracteres {
	public static void main (String[]  args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		// aqui usando o casting no char pois estamos tentando somar valor
		//que é do tipo char com o 1 que é do tipo inteiro e inteiro é maior que char
		//assim sendo necessario o uso do casting
		
		
		
		String palavra = "aprendendo java";
		
		System.out.println(palavra);
	}

}
