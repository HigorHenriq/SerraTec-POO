package aula2;

public class ExerciciosVariaveis {

	public void Funcionario() {
		//VAR
		String nome = "Brucinho Wayne";
		Integer idade = 30;
		Double altura = 1.83;
		Double peso = 80.5;
		
		//METODO PRINT 1
		System.out.println("O funcionario " + nome + " Tem:");
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		
		//METODO PRINT 2 CONCAT
		System.out.println(
				String.format("O funcionario %s Tem: \nIdade: %d \nAltura: %.2f \n Peso: %.2f ", nome, idade, altura, peso));
	}

}
