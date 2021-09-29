package empregado;

public class Empregado {
	private String nome;
	private String sobrenome;
	private Double salario;
	
	//CONSTRUTOR
	public Empregado(String nome, String sobrenome, Double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	//METODO
	public void calculaImpostoRenda () {
		
		if(salario < 1993.98) {
			setSalario(getSalario());
			
		}else if (salario >= 1993.98 || salario <= 2826.65) {
			setSalario(salario - getSalario() * 7.5/100);
			
		}else if (salario > 2826.65 || salario <= 3751.05) {
			setSalario(salario - getSalario() * 15/100);
			
		}else if (salario > 3751.05 || salario <= 4664.84) {
			setSalario(salario - getSalario() * 22.5/100);
			
		}else {
			setSalario(salario - getSalario() * 27.5/100);
		}
	}
	
}
