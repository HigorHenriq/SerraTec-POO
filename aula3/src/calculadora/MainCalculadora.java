package calculadora;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Calculadora op1 = new Calculadora();
		
		System.out.printf("Resultado da soma> %.2f", op1.Calc(5.0, 5.5, 1));
		
		Calculadora op2 = new Calculadora();
		
		System.out.printf("\nResultado da subtração> %.2f", op2.Calc(20.0, 5.0, 2));
		
		Calculadora op3 = new Calculadora();
		
		System.out.printf("\nResultado da multiplicação> %.2f", op3.Calc(5.0, 5.0, 3));
		
		Calculadora op4 = new Calculadora();
		
		System.out.printf("\nResultado da divisão> %.2f", op4.Calc(100.0, 2.0, 4));

	}

}
