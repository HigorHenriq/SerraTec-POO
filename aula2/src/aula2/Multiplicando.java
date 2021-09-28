package aula2;

public class Multiplicando {

	public static void main(String[] args) {
		
		Integer mult = 2;
		
		for(Integer i = 1; i <= 10; i++) {
			
			Integer calc = mult * i;
			
			System.out.println(
					String.format("A multiplicação de %d por %d é: %d", i, mult, calc));
		}

	}

}
