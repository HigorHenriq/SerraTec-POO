package exercicioMercado;

public abstract class Produto implements Venda {

	private String nome;
	private double valor;
	private int quantidadeItens;
	
	public Produto(String nome, double valor, int quantidadeItens) {
		this.nome = nome;
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}
	
	@Override
	public String toString() {
		return String.format("\nProduto: " + this.nome +
							"\nQuantidade: " + getQuantidadeItens() + 
							"\nTotal: " + getValor());
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	
	@Override
	public double vender() {
		
		this.valor = valor * quantidadeItens;
		return valor;
	}
}
