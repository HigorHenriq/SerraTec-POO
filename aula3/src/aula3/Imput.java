package aula3;

import java.util.Scanner;

public class Imput {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b;
		
		System.out.println("Primeiro Valor:");
		a = ler.nextInt();
		
		System.out.println("Segundo Valor:");
		b = ler.nextInt();
		
		System.out.println("\nResultado da soma:\n");
		System.out.println(a + b);
		
		ler.close();

	}

}
