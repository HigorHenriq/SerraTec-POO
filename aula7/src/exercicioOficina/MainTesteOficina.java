package exercicioOficina;

import java.time.LocalDate;

public class MainTesteOficina {

	public static void main(String[] args) {
		
		Proprietario proprietario1 = new Proprietario("Zé");
		Proprietario proprietario2 = new Proprietario("Perlin");
		Proprietario proprietario3 = new Proprietario("Kaká");
		
		Veiculo carro1 = new Carro("Uno Tunado", LocalDate.of(2021, 8, 14), proprietario1, "Fiat");

		carro1.revisao();
		carro1.trocarOleo();
		carro1.lavarVeiculo();
		System.out.printf(carro1.toString());
		
		Veiculo moto1 = new Moto("CB", LocalDate.now(), proprietario3, 150);
		
		moto1.revisao();
		moto1.trocarOleo();
		moto1.lavarVeiculo();
		System.out.printf(moto1.toString());
	}

}
