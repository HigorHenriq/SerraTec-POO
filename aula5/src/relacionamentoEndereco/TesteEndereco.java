package relacionamentoEndereco;

public class TesteEndereco {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Rua Alberto Torres 192", "Centro", "Petrópolis");
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setCpf("199555777-84");
		funcionario.setNome("Ana");
		funcionario.setEndereco(endereco);
		
		System.out.println(funcionario.toString() + funcionario.getEndereco().getRua() + " " + funcionario.getEndereco().getBairro() );

	}

}
