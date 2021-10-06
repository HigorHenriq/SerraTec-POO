package alunoMedia;

import java.util.ArrayList;
import java.util.List;

public class AppMedia {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Maxuel", 5.2, 5.0);
		Aluno aluno2 = new Aluno("Carlos", 11.0, 5.0);
		Aluno aluno3 = new Aluno("Allan", 7.2, 8.0);
		Aluno aluno4 = new Aluno("Lari", 9.0, -1.0);
		
		
		List<Aluno> liAluno = new ArrayList<Aluno>();
		
		liAluno.add(aluno1);
		liAluno.add(aluno2);
		liAluno.add(aluno3);
		liAluno.add(aluno4);
		
		//aluno1.calcularMedia();
		
		for (Aluno al : liAluno) {
			
			try {
				al.teste();
				
			System.out.println("-_Aluno: " + al.getNome() + 
								" --Nota 1: " + al.getNota1() +
								" --Nota 2: " + al.getNota2() +
								" ->Media: " + al.calcularMedia());
			}
			catch (AlunoException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
