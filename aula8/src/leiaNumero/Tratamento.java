package leiaNumero;

import java.util.Scanner;

public class Tratamento {

	public static void main(String[] args) {
		
		System.out.println("Digite um numero inteiro: ");
		
		try {
			int numero = LerNumero();
			System.out.println("Numero Digitado: " + numero);
			
		}catch (Exception e){
			System.out.println("Numero Incorreto");
		}

	}

	private static int LerNumero() throws Exception{
		
		Scanner ler = new Scanner(System.in);
		
		int numero = ler.nextInt();
		
		ler.close();
		
		return numero;
	}
	

}
