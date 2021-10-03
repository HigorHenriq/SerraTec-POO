package hospitalHeraca;

public class TestePlano {

	public static void main(String[] args) {

		Medico md1 = new Medico("Santa Ci", "Paulo", 525);

		md1.calcularPagamento();
		System.out.println(md1.toString());
		
		Plano an1 = new Anestesista("TereMed", "Carlos", 98, "ApagaLeão");
		
		an1.calcularPagamento();
		System.out.println(an1.toString());
		
		Plano c1 = new Clinica("Medici", "Port", "Sla");
		
		c1.calcularPagamento();
		System.out.println(c1.toString());
		
		ControlePagamento contPag = new ControlePagamento ();
		
		//FORMA ALTERNATIVA DE CRIAR O PAGAMENTO TOTAL POR OUTRA CLASSE
		contPag.totalPago(an1);
		System.out.println("\nTotal Pago: " + String.format("%.2f", contPag.getTotalPago()));
	}

}
