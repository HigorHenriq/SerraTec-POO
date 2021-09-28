package aula2;

public class CalculadoraMedia {

	public static void main(String[] args) {
		
		Double nota1 = 8.3;
		Double nota2 = 5.0;
		Double nota3 = 7.0;
		Double nota4 = 4.4;
		
		Double total = nota1 + nota2 + nota3 + nota4;
		Double media = total / 4;

		System.out.println(
				String.format("Nota Total: %.2f \nA Média: %.2f", total, media));
	}

}
