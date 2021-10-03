package testeArrayList;

import java.util.ArrayList;

public class MainList {

	public static void main(String[] args) {
		//INSTANCIANDO A LISTA
		ArrayList<Contato> contatos = new ArrayList();
		//INSTANCIANDO OS CONTATO
		Contato contato1 = new Contato("Sergin", "PneuQueimado@gmail.com", "555555-84");
		
		Contato contato2 = new Contato("Carlo", "CarburadorFurado@gmail.com", "222222-84");
		
		Contato contato3 = new Contato("Nandin", "Fatality_1@gmail.com", "544452-84");
		
		Contato contato4 = new Contato("Sergin", "losbrabos33@gmail.com", "777775-84");
		
		//ADICIONANNDO OS CONTATO NA LISTA
		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);
		
		//FOR EACH PARA CADA TIPO DE CONTATO COMO C : PERCORRA CONTATOS
		for (Contato c : contatos) {
			//TO STRING ESTÁ NA ABA CONTATO
			System.out.println(c);
		}
		
		//VERIFICANDO O TAMNHO A LISTA
		System.out.println("Total de itens na lista > " + contatos.size());
		
		
		contatos.remove(contato2);
		System.out.println(contatos.contains(contato2));
		

	}

}
