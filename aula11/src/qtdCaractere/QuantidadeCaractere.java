package qtdCaractere;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class QuantidadeCaractere {
	public static void main(String[] args) {
		
		try {
			BufferedReader sc = new BufferedReader(new FileReader("C:\\\\SERRATEC\\\\SerraTec-Programação-Orientada-a- Objeto\\\\Aula 11\\\\Exercicios\\\\arquivo.txt"));
				int quantidadeC = 0;
			
			while(sc.ready()) {
				String linha = sc.readLine();
				quantidadeC += linha.length();
				}
			System.out.println(quantidadeC);
		}	
		catch(IOException e) {
			System.out.println("Yes! Erro");
		}
	}
}
