package hospitalHeraca;

public class Clinica extends Plano{

	private String nome;
	private String cgc;
	
	public Clinica(String empresa, String nome, String cgc) {
		super(empresa);
		this.nome = nome;
		this.cgc = cgc;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() +
							"\nMedico: " + this.nome + 
							"\ncrm: " + this.cgc +
							"\nPagamento: " + getValorPago());
	}

	
	public String getNome() {
		return nome;
	}

	public String getCgc() {
		return cgc;
	}
	
	
}
