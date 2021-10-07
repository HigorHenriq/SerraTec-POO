package exercicioMercado;

public class MainMercado {

	public static void main(String[] args) {
		
		Bebidas coca = new Bebidas("Coca-cola", 5.95, 0);
		Bebidas vinho = new Bebidas("Vinho", 150.0, 4);
		Bebidas cerveja = new Bebidas("Cerveja", 12.0, 5.6);
		
		coca.vender(4);
		System.out.println (coca.toString());
		
		vinho.vender(3);
		System.out.println (vinho.toString());
		
		cerveja.vender(5);
		System.out.println (cerveja.toString());
		
		Eletrodomestico eletro1 = new Eletrodomestico("TV", 2000.00, 120);
		Eletrodomestico eletro2 = new Eletrodomestico("Radio", 837.59, 120);
		Eletrodomestico eletro3 = new Eletrodomestico("Geladeira", 2352.64, 220);
		
		eletro1.vender(9);
		System.out.println (eletro1.toString());
		
		eletro2.vender(1);
		System.out.println (eletro2.toString());
		
		eletro3.vender(3);
		System.out.println (eletro3.toString());
		
		/*
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
		*/
	}

}
