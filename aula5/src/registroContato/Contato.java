package registroContato;

public class Contato {

	private String nome;
	private Endereco endereco;
	private Telefone[] telefone;
	
	
	public Contato(String nome, Endereco endereco, Telefone[] telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		
		return String.format("Nome: " + getNome() +
				"\n-_Estado: " + getEndereco().getCidade().getEstado().getNomeEstado() +  
				"\n-_Cidade: " + getEndereco().getCidade().getNomeCidade() +
				getEndereco().EnderecoCompleto());
	}

	public String getNome() {
		return nome;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public Telefone[] getTelefone() {
		return telefone;
	}


	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}
	
	public void mostrarTelefones() {
		
		for (Telefone telefone : telefone) {
			
			System.out.println("Contato: " + telefone.getNumero() + "\n-------");
		}
	}
}
