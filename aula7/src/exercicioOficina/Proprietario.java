package exercicioOficina;

public class Proprietario {

	private String nome;
	
	public Proprietario(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString(){
		return String.format("Proprietario: %s", this.nome);
	}

	public String getNome() {
		return nome;
	}
	
	
}
