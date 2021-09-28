package contaBanco;

public class SaqueDeposito {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.nome = "Maki";
		c1.conta = 1112223334;
		c1.tipo = "Conta Poupança";
		c1.saldo = 1090.70;
		
		c1.Info();
		c1.Deposito(510.30);
		c1.Saque(1000.00);
		
		System.out.printf("\n-----------------NOVA OPERAÇÃO-----------------------");
		
		Conta c2 = new Conta();
		c2.nome = "Gojo";
		c2.conta = 000000001;
		c2.tipo = "Conta Corrente";
		c2.saldo = 100500.20;
		
		c2.Info();
		c2.Deposito(0.0);
		c2.Saque(50.00);

	}

}
