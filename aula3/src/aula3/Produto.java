package aula3;

public class Produto {
	private int cod;
	private String descricao;
	private double valor;
	private static int totalProdutos;
	
	public static double getTotalProdutos() {
		return totalProdutos;
	}
	
	public Produto() {
		
	}
	
	public Produto (int cod, String descricao, double valor) {
		this(descricao);
		this.cod = cod;
		this.descricao = descricao;
		this.valor = valor;
		Produto.totalProdutos += 1;
	}
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Produto(String descricao) {
		this();
		this.descricao = descricao;
		System.out.println("Construtor descricao");
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}
	
	
}
