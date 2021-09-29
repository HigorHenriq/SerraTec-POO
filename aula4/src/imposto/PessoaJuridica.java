package imposto;

public class PessoaJuridica extends ImpostoRenda{

	private String cnpj, inscEstadual;
	
	public PessoaJuridica(String nome, Double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}
	
	//METODO OVERRIDING(SOBREESCREVENDO)
	@Override
	public double calculoIR() {
		//Para pessoa jurídica 15% do valor do rendimento.
		return this.rendimentos = rendimentos - rendimentos * 15/100;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	
	
}

