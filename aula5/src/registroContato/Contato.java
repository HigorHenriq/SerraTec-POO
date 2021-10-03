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
