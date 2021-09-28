package aula2;

public class Fatorial {

	public static void main(String[] args) {
		
		Integer fatorial = 1;
				
		for(Integer i = 1; i <= 10; i++) {
			
			fatorial = fatorial * i;
			
			
			System.out.println(
					String.format("O fatorial de %d é: %d", i, fatorial));
		}

	}

}
