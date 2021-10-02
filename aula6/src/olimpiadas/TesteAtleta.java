package olimpiadas;

public class TesteAtleta {

	public static void main(String[] args) {

		Pais pa1 = new Pais("Brasil");
		Pais pa2 = new Pais("Argentina");
		Pais pa3 = new Pais("França");

		Atleta at1 = new Atleta("Gersin Do Bailão", 92.5, pa1);
		Atleta at2 = new Atleta("Cabron", 90.0, pa2);
		Atleta at3 = new Atleta("Pierre", 55.9, pa3);
		Atleta at4 = new Atleta("Ricardo", 85.9, pa1);

		System.out.println("Total de Atletas > " + Atleta.getTotalParticipantes());

		System.out.println(at1.toString() + pa1.getPais());

		System.out.println(at2.toString() + pa2.getPais());

		System.out.println(at3.toString() + pa3.getPais());

		System.out.println(at4.toString() + pa1.getPais());
		/*
		 * at1.printInfo(); System.out.println(pa1.getPais());
		 * 
		 * at2.printInfo();
		 * 
		 * at3.printInfo();
		 */
		/*
		 * System.out.println("Situação > " + at1.VerificaSituacao());
		 * System.out.println("Situação > " + at2.VerificaSituacao());
		 * System.out.println("Situação > " + at3.VerificaSituacao());
		 */

	}

}
