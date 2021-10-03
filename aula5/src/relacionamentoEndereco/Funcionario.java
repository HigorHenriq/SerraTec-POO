package relacionamentoEndereco;

public class Funcionario {
	private String cpf;
	private String nome;
	private Endereco endereco;
	
	@Override
	public String toString() {
		return "cpf:" + cpf + 
				"\nnome:" + nome +
				"\nendereco: " ;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	

}
