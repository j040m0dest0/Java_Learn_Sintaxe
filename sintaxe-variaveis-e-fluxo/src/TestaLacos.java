
public class TestaLacos {
	public static void main(String[] args) {
		
		System.out.println(" Gerando as taboadas basicas");
		System.out.println();
		
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			
			System.out.println();
			System.out.println("taboada do " + multiplicador);
			
			
			for(int contador = 0; contador <= 10 ; contador++ ) {		
				System.out.print(multiplicador * contador);
				
				System.out.print("  ");
				
			}
			
			System.out.println();
		}
		
	}

}
