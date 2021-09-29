package imposto;

public class PessoaFisica extends ImpostoRenda {

	private String rg, cpf;
	
	public PessoaFisica(String nome, Double rendimentos, String rg, String cpf) {
		super(nome, rendimentos);
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
