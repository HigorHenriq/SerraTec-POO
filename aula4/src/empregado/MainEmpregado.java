package empregado;

public class MainEmpregado {

	public static void main(String[] args) {
		
		Empregado f1 = new Empregado("Travis", "Scott", 100000.00);
		
		f1.calculaImpostoRenda();
		System.out.printf("Salario ap�s desconto > %f", f1.getSalario());
		
		Empregado f2 = new Empregado("Frank", "Ocean", 50000.00);
		
		f2.calculaImpostoRenda();
		System.out.printf("\nSalario ap�s desconto > %f", f2.getSalario());

	}

}
