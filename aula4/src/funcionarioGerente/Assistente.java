package funcionarioGerente;

public class Assistente extends Funcionario {
	
	private Double adicional;
	
	public Assistente(String nome, Double salario, Double adicional) {
		super(nome, salario);
		this.adicional = adicional;
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public Double participacao() {
		return this.salario * 1/100 + getAdicional();
	}
}
