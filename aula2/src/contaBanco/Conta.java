package contaBanco;

public class Conta {

	String nome;
	Integer conta;
	String tipo;
	Double saldo;
	
	
	public void Info() {
		System.out.printf ("\nCliente: %s", nome);
	}
	
	public void Deposito(Double valor) {
		
		if(valor <= 1) {
			System.out.printf ("\nOperação invalida! Valor de Deposito Abaixo do Minimo Permitido");
			
		}else {
			this.saldo += valor;
			System.out.printf ("\nDeposito Realizado com Sucesso!");
			System.out.printf ("\nDeposito de: %.2f", valor);
			System.out.printf ("\nSaldo atual de: %.2f", saldo);	
		}
	}
	
	public Boolean Saque (Double saque) {
		
		if(saldo < saque) {
			System.out.printf("\nValor de saque INDISPONIVEL! Saldo Atual -> %.2f", saldo);
			return false;
			
		} else {
			this.saldo -= saque;
			System.out.printf ("\nSaque Realizado com Sucesso!");
			System.out.printf ("\nSaque de: %.2f", saque);
			System.out.printf ("\nSaldo atual de: %.2f", saldo);
			return true;
		}
		
	}

}
