package imposto;

public class TesteIr {

	public static void main(String[] args) {
		
		PessoaFisica pf1 = new PessoaFisica("Jhin", 10.000, "844494-84", "555.555.777-84");
		
		System.out.printf(pf1.nome);
		System.out.printf("\nCalculo Pessoa Fisica > %.3f", pf1.calculoIR());
		
		System.out.printf("\n------------------------------------");
		
		PessoaJuridica pj1 = new PessoaJuridica("Lucian", 50.000, "13.402.903/0001-40", "048.969.632.277");
		
		System.out.printf("\n%s", pj1.nome);
		System.out.printf("\nCalculo Pessoa Fisica > %.3f", pj1.calculoIR());

	}

}
