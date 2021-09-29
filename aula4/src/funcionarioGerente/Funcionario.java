package funcionarioGerente;

public class Funcionario {
	protected String nome, cpf;
	protected Double salario;
	protected String turno;
	
	
	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
		
	}
	
	@Override
	public String toString() {
		return "\n" + this.nome + "\n" + this.salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public Double getSalario() {
		return salario += this.participacao();
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	public Double participacao() {
		return this.salario * 1/100;
	}
	
	public void infoFinal() {
		System.out.printf("\nFuncionario e Salario:%s"
				+ "\nGanho em Participação: %.2f \n"
				+ "\nSalario Final: %.2f"
				+ "\n ------------------------------"
				, toString(), participacao(), getSalario());
	}
}
