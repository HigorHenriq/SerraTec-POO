package aula2;

public class CalculadoraSalario {

	public static void main(String[] args) {
		
		Double desconto1 = 1.751;
		Double desconto2 = 2.919;
		Double desconto3 = 5.839;
		
		
		Double salario = 2.500;
		
		if(salario <= desconto1) {
			Double calc = salario * 8/100;
			System.out.println(
					String.format("Desconto de 8%% porc: " + calc));
		}
		
		if(salario > desconto1 && salario <= desconto2) {
			Double calc = salario * 9/100;
			System.out.println(
					String.format("Desconto de 9%% porc: " + calc));
		} 
		
		if(salario >= desconto2 && salario <= desconto3) {
			Double calc = salario * 10/100;
			System.out.println(
					String.format("Desconto de 10%% porc: " + calc));
			
		} 
		if(salario > desconto3) {
			Double calc = salario * 11/100;
			System.out.println(
					String.format("Desconto de 11%% porc: " + calc));
		}
		
	}

}

