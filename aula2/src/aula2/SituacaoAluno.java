package aula2;

public class SituacaoAluno {

	public void MediaAluno() {
			
			Double nota1 = 10.0;
			Double nota2 = 8.4;
			
			Double total = nota1 + nota2;
			Double media = total / 2;
			
			if(media == 10) {
				System.out.println("Aprovado! Parabéns");
				
			}else if(media >= 7 && media < 10) {
				System.out.println("Aprovado!");
				
			}
			else {
				System.out.println("Reprovado!");
			}

	}

}
