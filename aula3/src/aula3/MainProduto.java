package aula3;

public class MainProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto(8, "Feijão", 1.8);
		
		Produto p2 = new Produto(9, "Arroz", 5.5);
		
		System.out.println(Produto.getTotalProdutos());		

	}

}
