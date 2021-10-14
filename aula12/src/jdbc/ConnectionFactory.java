package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	String urlConexao = "jdbc:postgresql://localhost:5432/bancocomjava";
	String usuario = "postgres";
	String senha = "postgres";
	
	Connection connection;
	
	public Connection getConnection() {
		
		System.out.println("Conectando ao Banco");
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
			
			if(connection != null) {
				System.out.println("Conectado com sucesso!");
			
			}else {
				System.out.println("Falha na conexão");
			}
			
		}catch (SQLException e) {
			System.out.println("Não foi possivel conectar. Exception " + e.toString());
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver não encontrado");
			
		}
		
		return connection;
	}
}
