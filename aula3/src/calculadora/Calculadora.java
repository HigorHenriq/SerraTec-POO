package calculadora;

public class Calculadora {
	/*soma;
	subtracao;
	mult;
	divisao;*/
		
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
}	
}




