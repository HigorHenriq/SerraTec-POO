package hospital;

public class Consulta {

	public static void main(String[] args) {
		Medico md1 = new Medico();

		md1.setCrm(55267);
		md1.setNome("Thorfin");
		md1.setSalario(10.000);
		md1.setValorConsulta(450.00);

		md1.dadosMedico();

		md1.pagamentoDinheiro();
		System.out.printf("\nPagamento C/ Dinheiro Total: %.2f", md1.pagamentoDinheiro());

		md1.pagamentoPlano();
		System.out.printf("\nPagamento C/ Plano Total: %.2f", md1.pagamentoPlano());

		System.out.printf("\n--------------------------");
		
		Medico md2 = new Medico();

		md2.setCrm(10559);
		md2.setNome("Senku Ishigami");
		md2.setSalario(25.000);
		md2.setValorConsulta(150.00);

		md2.dadosMedico();

		md2.pagamentoDinheiro();
		System.out.printf("\nPagamento C/ Dinheiro Total: %.2f", md2.pagamentoDinheiro());

		md2.pagamentoPlano();
		System.out.printf("\nPagamento C/ Plano Total: %.2f", md2.pagamentoPlano());
		
		System.out.printf("\n--------------------------");
		System.out.printf("\n------------COM CONTRUTOR-------------");
		
		Medico md3 = new Medico(10557, "Leon", 11.000, 80.0);
		
		md3.dadosMedico();

	}

}
