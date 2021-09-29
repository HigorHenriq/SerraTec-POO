package pedido;

//import java.time.LocalDate;
//git teste
public class Pedido {
	
	private Integer numero;
	private String dataPedido;
	private Double quantidade;
	private Double valor;
	//private static double valorTotal;
	private Double valorTotal;
	private static int totalPedidos;
	
	/*public static double getValorTotal() {
		return valorTotal;
	}*/
	
	public Double getValorTotal() {
		return valorTotal = valor * quantidade;
	}
	
	public static double getTotalPedidos() {
		return totalPedidos;
	}

	public Pedido() {
		//Pedido.valorTotal += 5;
		Pedido.totalPedidos += 1;
	}

	public Pedido(Integer numero, String dataPedido, Double quantidade, Double valor) {
		this();
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
		
	}



	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public String getDataPedido() {
		return dataPedido;
	}



	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}



	public Double getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}



	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	public void finalizar() {
		/* UTILIZANDO LOCAL DATE
		if(dataPedido.getDayOfWeek().name() == "SUNDAY") {
		
				setValor(getValor() - getValor() * 10/100);
			System.out.printf("\nDIA DE DESCONTO! ");
			System.out.printf("\nPedido Finalizado:"
					+ "\nDia: %s"
					+ "\nQuantidade: %.0f"
					+ "\nTotal: %.2f"
					,dataPedido, getQuantidade(), getValorTotal());
			
		}else {
			System.out.printf("\nPedido Finalizado:"
					+ "\nDia: %s"
					+ "\nQuantidade: %.0f"
					+ "\nTotal: %.2f"
					,dataPedido, getQuantidade(), getValorTotal());
		}*/
		
		// UTILIZANDO STRING PARA TESTE
		if(dataPedido == "DOMINGO") {
			
			setValor(getValor() - getValor() * 10/100);
			System.out.printf("\nDIA DE DESCONTO! ");
			System.out.printf("\nPedido Finalizado:"
					+ "\nDia: %s"
					+ "\nQuantidade: %.0f"
					+ "\nTotal: %.2f"
					,dataPedido, getQuantidade(), getValorTotal());
			
		}else {
			System.out.printf("\nPedido Finalizado:"
					+ "\nDia: %s"
					+ "\nQuantidade: %.0f"
					+ "\nTotal: %.2f"
					,dataPedido, getQuantidade(), getValorTotal());
		}
	}

}
