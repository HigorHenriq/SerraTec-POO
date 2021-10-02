package exercicioMercado;

public class MainMercado {

	public static void main(String[] args) {
		
		Bebidas bebida1 = new Bebidas("Coca-cola", 5.95, 4, 0);
		Bebidas bebida2 = new Bebidas("Vinho", 150.0, 3, 4);
		Bebidas bebida3 = new Bebidas("Cerveja", 12.0, 5, 5.6);
		
		bebida1.vender();
		System.out.println (bebida1.toString());
		
		bebida2.vender();
		System.out.println (bebida2.toString());
		
		bebida3.vender();
		System.out.println (bebida3.toString());
		
		Eletrodomestico eletro1 = new Eletrodomestico("TV", 2000.00, 9, 120);
		Eletrodomestico eletro2 = new Eletrodomestico("Radio", 837.59, 1, 120);
		Eletrodomestico eletro3 = new Eletrodomestico("Geladeira", 2352.64, 3, 220);
		
		eletro1.vender();
		System.out.println (eletro1.toString());
		
		eletro2.vender();
		System.out.println (eletro2.toString());
		
		eletro3.vender();
		System.out.println (eletro3.toString());

	}
	
	/* TESTES PARA REFAZER COM LIST E COM VENDEDOR !ARRUMANDO
	 * 
	 * ArrayList<Vendedor> vendas = new ArrayList();
	 * 
	 * Vendedor venda1 = new Vendedor (null, 0, 0, null);
	 * 
	 * bebida1.vender(2);
		System.out.println (bebida1.toString()+ bebida1.getQuantidadeItens());
		
		bebida2.vender(3);
		System.out.println (bebida2.toString()+ bebida2.getQuantidadeItens());
		
		bebida3.vender(5);
		System.out.println (bebida3.toString()+ bebida3.getQuantidadeItens());
		
		for(Vendedor vendas : ){
			System.out.println(vendas);
		}
	 */

}
