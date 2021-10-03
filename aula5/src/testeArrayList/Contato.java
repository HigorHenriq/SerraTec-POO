package testeArrayList;

public class Contato {

	private String nome;
	private String email;
	private String cpf;
	
	
	public Contato(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return String.format("Nome: " + this.nome + 
							" | Email: " + this.email);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
