package aula2;

public class Multiplicando {

	public static void main(String[] args) {
		
		Integer mult = 2;
		
		for(Integer i = 1; i <= 10; i++) {
			
			Integer calc = mult * i;
			
			System.out.println(
					String.format("A multiplica��o de %d por %d �: %d", i, mult, calc));
		}

	}

}
