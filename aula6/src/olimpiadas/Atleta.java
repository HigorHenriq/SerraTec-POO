package olimpiadas;

public class Atleta implements Olimpiadas {

	private String nome;
	private Double peso;
	private String modalidade;
	private static int totalParticipantes;
	private Pais pais;

	@Override
	public String toString() {
		return String.format(
				"\nNome: " + getNome() + "\nPeso: " + getPeso() + "\nModalidade " + getModalidade() + "\nPais: ");
	}

	public Atleta(String nome, Double peso, Pais pais) {
		totalParticipantes += 1;
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;

	}

	public String getNome() {
		return nome;
	}

	public Double getPeso() {
		return peso;

	}

	public String getModalidade() {

		if (getPeso() > 90.0) {
			modalidade = "Pesado";

		} else if (this.peso >= 60.0 && this.peso <= 90.0) {
			modalidade = "Médio";

		} else {
			modalidade = "Não poderá participar";
		}

		return modalidade;

	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	public Pais getPais() {
		return pais;
	}

	@Override
	public String VerificaSituacao() {

		String situacao = "";

		if (this.peso > 90.0) {
			situacao = "Participará";

		} else if (this.peso >= 60.0 && this.peso <= 90.0) {
			situacao = "Participará";

		} else {
			situacao = "Não poderá participar";
		}
		return situacao;

	}
	/*
	 * public void printInfo() { System.out.printf("\nNome: %s", getNome());
	 * System.out.printf("\nCategoria: %s", getModalidade());
	 * System.out.printf("\nPeso: %s", getPeso()); System.out.printf("\nPais: %s",
	 * getPais()); System.out.printf("\nSituação: %s", VerificaSituacao());
	 * System.out.printf("\n-----------------------------------");
	 * 
	 * }
	 */
}
