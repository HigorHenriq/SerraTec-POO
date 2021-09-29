package calculadora;

public class Calculadora {
	/*METODO ANTIGO !SEM INTERAÇÃO
	soma;
	subtracao;
	mult;
	divisao;
		
	Integer operacao;
	Double resultado;
	Double valor1, valor2;
	
	
	public Double getResultado() {
		return resultado;
	}
	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
	public Double Calc(Double valor1,Double valor2, Integer operacao) {
		
		switch (operacao) {
			case 1:
				this.setResultado(valor1 + valor2);
				break;
			case 2:
				this.setResultado(valor1 - valor2);
				break;
			case 3:
				this.setResultado(valor1 * valor2);
				break;
			case 4:
				this.setResultado(valor1 / valor2);
				break;
			default:
				System.out.printf("Valor Invalido!");
				break;
		}
		
		return resultado;	
}*/
	
	//METODO CORRIGIDO COM INTERAÇÃO
	
	public double somar(double valor1ADD, double valor2ADD) {
		return valor1ADD + valor2ADD;
	}
	
	public double subtrair(double valor1SUB, double valor2SUB) {		
		return valor1SUB - valor2SUB;
	}
	
	public double multiplicar(double valor1MULT, double valor2MULT) {
		return valor1MULT * valor2MULT;
	}
	
	public double dividir(double valor1DIV, double valor2DIV) {
		return valor1DIV / valor2DIV;
	}
}




