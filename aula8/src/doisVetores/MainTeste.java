package doisVetores;

public class MainTeste {

	public static void main(String[] args){
		
		int[] numerador = {1, 2, 3, 4, 5};
		int[] denominador = {3, 0, 2};

		
		for (int i = 0; i < numerador.length; i++) {
			
			try {
			System.out.println ("Dividindo: " + numerador[i] + "/" +
								denominador[i] + " = " + (numerador[i] / denominador[i]));
			}
			catch(ArithmeticException e) {
				System.out.println("ERRO NA DIVISAO");
			}
			catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("OCORREU UM PROBLEMA AO ACESSAR O INDICE DO VETOR QUE NÃO EXISTE");
			}
		}
	}

}
