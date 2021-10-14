package jdbc;

public class Conta {

	private int numero_conta;
	private String titular;
	private double saldo;
	
	public Conta() {}
	
	public Conta(int numero_conta, String titular, double saldo) {
		this.numero_conta = numero_conta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	
	public int getNumero_conta() {
		return numero_conta;
	}
	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
