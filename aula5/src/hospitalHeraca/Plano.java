package hospitalHeraca;

public class Plano{
	
	protected String empresa;
	protected Double valorPago = 80.00;
	protected Double valorIss = 5.00;
	
	public Plano(String empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public String toString() {
		
		return String.format("\nEmpresa: " + this.empresa);
	}
	
	public double calcularPagamento() {
		
		valorPago = valorPago + valorIss - valorIss * 5/100;
		
		return valorPago;
	}

	public double getValorPago() {
		
		return valorPago;
	}
	
}
