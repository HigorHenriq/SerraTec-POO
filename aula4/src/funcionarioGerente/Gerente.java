package funcionarioGerente;

public class Gerente extends Funcionario {
	
	private String nivel;
	
	public Gerente(String nome, Double salario, String nivel) {
		super(nome, salario);
		this.nivel = nivel;
	}

	
	public String getNivel() {
		return nivel;
	}


	public void setNivel(String nivel) {
		this.nivel = nivel;
	}


	//METODOS
	@Override
	public Double participacao() {
		return this.salario * 1/100 + 200;
	}

}
