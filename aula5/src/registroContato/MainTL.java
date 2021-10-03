package registroContato;

public class MainTL {

	public static void main(String[] args) {
		
		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Estado estado2 = new Estado("Flori", "FR");
		Estado estado3 = new Estado("Guinland", "GL");
		
		Cidade cidade1 = new Cidade("Vinland", estado3);
		Cidade cidade2 = new Cidade("Teresopolis", estado1);
		Cidade cidade3 = new Cidade("Noven", estado2);
		
		Endereco endereco1 = new Endereco("Rua Almeida", "Centro", "25954-86", cidade1);
		
		//Instanciando o array e Definindo seu tamanho max
		Telefone telefone1 = new Telefone("954-20365");
		Telefone telefone2 = new Telefone("954-20365");
		
		Telefone[] telefoneCT1 = new Telefone[2];
		telefoneCT1[0] = telefone1;
		telefoneCT1[1] = telefone2;
		
		Contato c1 = new Contato("Toretto", endereco1, telefoneCT1);
		
		imprimirContato(c1);
		c1.mostrarTelefones();

	}
	
	public static void imprimirContato(Contato contato) {
		
		System.out.println("Nome: " + contato.getNome());
		System.out.println("-_Estado: " + contato.getEndereco().getCidade().getEstado().getNomeEstado() +  
							"\n-_Cidade: " + contato.getEndereco().getCidade().getNomeCidade() +
							contato.getEndereco().EnderecoCompleto());
	}
}
