package imposto;

public class ImpostoRenda {

	protected String nome, telefone, email;
	protected Double rendimentos;
	
	//CONSTRUTOR
	public ImpostoRenda(String nome, Double rendimentos) {
		this.nome = nome;
		this.rendimentos = rendimentos;
		
	}
	
	//METODO
	public double calculoIR() {
		//Para pessoa física deverá ser calculado o desconto 12%
		//Para pessoa jurídica 15% do valor do rendimento.
		return this.rendimentos = rendimentos - rendimentos * 12/100;
	}
	
	
}
