package aula2;

/*Fa�a um programa que percorra todos os n�mero de 1 at� 22. Para os n�meros m�ltiplos de 2, imprima a palavra �Java�, e
mostre o total de m�ltiplos de 2 encontrado.*/

public class Multiplos {

	public static void main(String[] args) {
		
		Integer total = 0;
		
		for(Integer i = 1; i <= 22; i++) {
			if(i % 2 == 0) {
				System.out.println("Java" + i);
				total += 1;
			}
		}
		System.out.println("Total encontrado: " + total);
	}
}
