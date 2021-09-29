package pedido;
//git teste
public class MainPedido {

	public static void main(String[] args) {
		
		Pedido p1 = new Pedido(1, "SEGUNDA", 2.0, 55.90);
		
		p1.finalizar();
		
		System.out.printf("\n----------------------------------;\n");
		
		Pedido p2 = new Pedido();
		p2.setNumero(2);
		p2.setDataPedido("QUARTA");
		p2.setQuantidade(3.0);
		p2.setValor(500.00);
		
		
		p2.finalizar();
		
		System.out.printf("\n----------------------------------;\n");
		
		Pedido p3 = new Pedido();
		p3.setNumero(3);
		p3.setDataPedido("DOMINGO");
		p3.setQuantidade(3.0);
		p3.setValor(25.00);
		
		p3.finalizar();
		
		
		System.out.printf("\n----------------------------------;\n");
		System.out.printf("\nTOTAL PEDIDOS NO SISTEMA > %.0f ", Pedido.getTotalPedidos());

	}

}
