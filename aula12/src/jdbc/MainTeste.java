package jdbc;

import java.sql.Connection;

public class MainTeste {

	public static void main(String[] args) {
			
		
		Conta cliente1 = new Conta();
		cliente1.setNumero_conta(555348);
		cliente1.setTitular("Casimiro");
		cliente1.setSaldo(100.50);
		
		Conta cliente2 = new Conta();
		cliente2.setNumero_conta(555789);
		cliente2.setTitular("Rafinha");
		cliente2.setSaldo(100.00);
		
		try(ContaDAO DAO = new ContaDAO()){
			
			DAO.inserir(cliente1); //ERRO! O SALDO RETORNA 0, PROVAVELMENTE TROCAR DE DOUBLE PARA FLOAT
			//DAO.apagar(cliente1);
			//DAO.buscarConta(555348); ERRO!
			//DAO.listarContas(); ???????
			
			System.out.println("OPERAÇÃO COMPLETADA COM SUCESSO!");
		}
		

	}

}
