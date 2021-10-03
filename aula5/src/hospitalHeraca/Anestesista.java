package hospitalHeraca;

public class Anestesista extends Medico{

	private String anestesia;

	public Anestesista(String empresa, String nome, int crm, String anestesia) {
		super(empresa, nome, crm);
		this.anestesia = anestesia;
	}
	
	public String getAnestesia() {
		return anestesia;
	}

	public void setAnestesia(String anestesia) {
		this.anestesia = anestesia;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() +
							"\nAnestesia: " + this.anestesia);
	}
	
	@Override
	public double calcularPagamento() {
		valorPago = super.calcularPagamento() + 1000;
		return valorPago;
	}
	
}
