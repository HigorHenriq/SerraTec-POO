package arrayFuncionario;

public class iFuncionario {

	public static void main(String[] args) {
		
		Funcionario[] vetor = new Funcionario[] {

				new Funcionario ("Daniel Ricciardo", "Piloto McLaren", 3000.00),
				new Funcionario ("Lando Norris", "Piloto McLaren", 1500.00),
		};
		
		
		for(Funcionario f: vetor) {
			
			System.out.println("--Nome: " + f.getNome() + 
					" - Função: " + f.getCargo() +
					" - Salario: " + f.getSalario() +
					" - + Abono: " + f.abonoSalario(203));
		}
	}

	/* Matriz
	Funcionario[][] vetor2 = new Funcionario[2][2] {
		
			vetor[0][0] = new Funcionario ("Hamilton", "Piloto Mercedes", 5.000),
			vetor[0][1] = new Funcionario ("Verstappen", "Piloto RedBull", 5.000)
	};
	*/
}
