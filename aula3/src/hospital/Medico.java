package hospital;

public class Medico {
	
	private Integer crm;
	public String nome;
	private Double salario;
	public Double valorConsulta;
	
	//CONTRUTOR VAZIO PADRÃO
	public Medico() {
		
	}
	//CONTRUTOR COM DADOS
	public Medico(Integer crm, String nome, Double salario, Double valorConsulta) {
		this.setCrm(crm);
		this.setNome(nome);
		this.setSalario(salario);
		this.setValorConsulta(valorConsulta);
	}
	//----------------------------------------------------------------------------------
	public Integer getCrm() {
		return crm;
	}
	public void setCrm(Integer crm) {
		this.crm = crm;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	public Double getValorConsulta() {
		return valorConsulta;
	}
	public void setValorConsulta(Double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	//----------------------------------------------------------------------------------
	//METODOS
	public Double pagamentoDinheiro () {
		return this.getValorConsulta();
	}
	
	public Double pagamentoPlano() {
		this.setValorConsulta(getValorConsulta() + getValorConsulta() * 70/100);
		return this.getValorConsulta();
	}
	
	public void dadosMedico() {
		System.out.printf("\nCrm: %d", this.getCrm());
		System.out.printf("\nNome: %s", this.getNome());
		System.out.printf("\nSalario: %f", this.getSalario());
		System.out.printf("\nPreço Consulta: %.2f", this.getValorConsulta());
	}

}
