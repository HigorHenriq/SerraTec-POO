package lerArquivo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		
		File arquivo = new File ("C:\\SERRATEC\\SerraTec-Programação-Orientada-a- Objeto\\Aula 11\\Exercicios\\teste.txt");
		Scanner sc = new Scanner(arquivo);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
