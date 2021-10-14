package jdbc;

import java.beans.Statement;
import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class ContaDAO implements Closeable{
	//Agragação do Connection
	private  Connection connection = new ConnectionFactory().getConnection();
	
	//Construtor para o acesso as info, linkando com a tabela onde tem nosso banco;
	public void ContaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	//METODO INSERIR
	public void inserir(Conta conta) {
		//Usa a sintaxe do sql como string para inserir lá na table
		//As ? funciona como informações a serem inseridas
		String sql = "insert into conta (numero_conta, titular, saldo) values(?, ?, ?)";
		
		try {
			//PreparedStatement = Serve para alocar os valores corretamente dentro dos ?
			PreparedStatement pps = connection.prepareStatement(sql);
			//Os numeros iniciais são para definir a casa deles na tabela, sendo assim não precisa ter ordem basta passar as casas corretas
			pps.setInt(1, conta.getNumero_conta());
			pps.setString(2, conta.getTitular());
			pps.setDouble(3, 000000.00);
			
			//METODO Closeable USADO PARA QUANDO A OPERAÇÃO FOR FEITA NÃO FINIZALIZAR POR COMPLETO O METODO
			pps.execute();
			pps.close();
			
		}catch(Exception e) {
			throw new RuntimeException("why");
		}	
	}

	public void saqueDeposito(Conta conta) {
		String sql = "UPDATE conta SET saldo = ? WHERE numero_conta = ?";
		
		try {
			PreparedStatement pps = connection.prepareStatement(sql);
			
			pps.setInt(1, conta.getNumero_conta());
			pps.setString(2, conta.getTitular());
			pps.setDouble(3, conta.getSaldo());
			
			pps.execute();
			pps.close();
			
		}catch(Exception e) {
			throw new RuntimeException();
		}
	}

	public void apagar (Conta conta) {
		String sql = "DELETE FROM conta WHERE numero_conta = ?";
		
		try {
			PreparedStatement pps = connection.prepareStatement(sql);
			
			pps.setInt(1, conta.getNumero_conta());
			
			pps.execute();
			pps.close();
			
		}catch(Exception e) {
			throw new RuntimeException();
		}
	}

	public List<Conta> listarContas(){
	
		String sql = "SELECT * FROM conta";
		
		try {
			List<Conta> lista = new ArrayList<Conta>();
			PreparedStatement pps = connection.prepareStatement(sql);
			
			//
			ResultSet rs = pps.executeQuery();
			
			//.NEXT FUNCIONA COMO
			while(rs.next()) {
				Conta conta = new Conta(rs.getInt("numero_conta"),
						rs.getString("titular"),
						rs.getDouble("saldo"));
				
						lista.add(conta);
						conta = new Conta();
			}
			
			pps.close();
			rs.close();
			
			return lista;
		}catch(Exception e) {
			throw new RuntimeException();
		}
	}

	public Conta buscarConta(int numero_conta) {
		String sql = "select * from conta where numero_conta=?";
		
		try {
			PreparedStatement pps = connection.prepareStatement(sql);
			
			pps.setInt(1, numero_conta);
			Conta conta;
			ResultSet rs = pps.executeQuery();
			
			if(rs.next()) {
				conta = new Conta(rs.getInt("numero_conta"),
						rs.getString("titular"),
						rs.getDouble("valor"));
				
			} else {
				conta = null;
			}
			
			pps.close();
			rs.close();
			
			return conta;
		}catch (SQLException e) {
			throw new RuntimeException();
		}
		
	}
	@Override
	public void close(){
		try {
			this.connection.close();
		} catch (SQLException e) {
			System.out.println("Erro ao fechar conexão. " + e);
		}
	}
}
