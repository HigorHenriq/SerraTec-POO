package exercicioMercado;

public class Eletrodomestico extends Produto{

	private int voltagem;
	
	public Eletrodomestico(String nome, double valor, int quantidadeItens, int voltagem) {
		super(nome, valor, quantidadeItens);
		this.voltagem = voltagem;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() +
							"\nVoltagem: " + this.voltagem);
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	
}
