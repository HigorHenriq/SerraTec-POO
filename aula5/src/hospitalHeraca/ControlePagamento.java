package hospitalHeraca;

public class ControlePagamento{

	private double totalPago;

	public double getTotalPago() {
		return totalPago;
	}
	
	@Override
	public String toString() {
		return String.format("\nTotal a ser Pago: %.2f", this.totalPago);
	}
	
	
	public void totalPago(Plano plano) {
		totalPago += plano.getValorPago();
	}
	
}
