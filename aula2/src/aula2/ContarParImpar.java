package aula2;

public class ContarParImpar {

	public static void main(String[] args) {
		
		Integer ContPar = 0;
		Integer ContImpar = 0;
		
		for(int i = 0; i < 30; i++) {
			if(i % 2 == 0) {
				ContPar = i;
				
			} else {
				ContImpar = i;
			
			}
		}
		System.out.println("Par: "+ ContPar);
		System.out.println("Impar: "+ ContImpar);
	}

}
