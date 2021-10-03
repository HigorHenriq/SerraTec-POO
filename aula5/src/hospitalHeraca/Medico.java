package hospitalHeraca;

public class Medico extends Plano {

	protected String nome;
	private int crm;
	
	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}

	@Override
	public String toString() {
		return String.format(super.toString() +
							"\nMedico: " + this.nome + 
							"\ncrm: " + this.crm +
							"\nPagamento: %.2f", getValorPago());
	}
	
	public String getNome() {
		return nome;
	}


	public int getCrm() {
		return crm;
	}
	
	@Override
	public double calcularPagamento() {
		valorPago = super.calcularPagamento() * 1.10;
		return valorPago;
	}
	
}
