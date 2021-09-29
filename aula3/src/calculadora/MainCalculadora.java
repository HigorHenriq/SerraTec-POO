package calculadora;

import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {
		/* METODO ANTIGO !SEM INTERAÇÃO
		Calculadora op1 = new Calculadora();
		
		System.out.printf("Resultado da soma> %.2f", op1.Calc(5.0, 5.5, 1));
		
		Calculadora op2 = new Calculadora();
		
		System.out.printf("\nResultado da subtração> %.2f", op2.Calc(20.0, 5.0, 2));
		
		Calculadora op3 = new Calculadora();
		
		System.out.printf("\nResultado da multiplicação> %.2f", op3.Calc(5.0, 5.0, 3));
		
		Calculadora op4 = new Calculadora();
		
		System.out.printf("\nResultado da divisão> %.2f", op4.Calc(100.0, 2.0, 4));
		*/
		
		//METODO CORRIGIDO COM INTERAÇÃO
		
		Scanner ler = new Scanner(System.in);
		
		Integer operacao = 0;
		
		
		do {
			System.out.println("\nInforme o da operação desejada.");
			System.out.println("1 - soma");
			System.out.println("2 - subtração");
			System.out.println("3 - multiplicação");
			System.out.println("4 - divisão");
			System.out.println("5 - sair");
			
			operacao = ler.nextInt();
			Calculadora calcular = new Calculadora();
			
			if(operacao != 5) {
				
				Double resultado;
				
				switch (operacao) {
				case 1: 
					System.out.println("\nInforme o PRIMEIRO valor:");
					Double valor1ADD = ler.nextDouble();
					
					System.out.println("\nInforme o SEGUNDO valor:");
					Double valor2ADD = ler.nextDouble();
					
					resultado = calcular.somar(valor1ADD, valor2ADD);
					System.out.printf("Resultado > %.2f",resultado);
					break;
					
				case 2: 
					System.out.println("Informe o PRIMEIRO valor:");
					Double valor1SUB = ler.nextDouble();
					
					System.out.println("Informe o SEGUNDO valor:");
					Double valor2SUB = ler.nextDouble();
					
					resultado = calcular.subtrair(valor1SUB, valor2SUB);
					System.out.printf("Resultado > %.2f",resultado);
					break;
					
				case 3: 
					System.out.println("Informe o PRIMEIRO valor:");
					Double valor1MULT = ler.nextDouble();
					
					System.out.println("Informe o SEGUNDO valor:");
					Double valor2MULT = ler.nextDouble();
					
					resultado = calcular.multiplicar(valor1MULT, valor2MULT);
					System.out.printf("Resultado > %.2f",resultado);
					break;
					
				case 4: 
					System.out.println("Informe o PRIMEIRO valor:");
					Double valor1DIV = ler.nextDouble();
					
					System.out.println("Informe o SEGUNDO valor:");
					Double valor2DIV = ler.nextDouble();
					
					resultado = calcular.dividir(valor1DIV, valor2DIV);
					System.out.printf("Resultado > %.2f",resultado);
					break;	
				default:
					System.out.println("Opção inválida.");
					continue;
			}
		}
				
	}while(operacao != 5);
}
}
