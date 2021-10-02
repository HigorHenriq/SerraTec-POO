package exercicioMercado;

public class Bebidas extends Produto {


	private double teorAlcoolico;

	public Bebidas(String nome, double valor, int quantidadeItens, double teorAlcoolico) {
		super(nome, valor, quantidadeItens);
		this.teorAlcoolico = teorAlcoolico;
	}
	
	
	@Override
	public String toString() {
		return String.format(super.toString() +
							"\nTeor Alcoolico: " + this.teorAlcoolico);
	}
	
	
	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}
		
}
