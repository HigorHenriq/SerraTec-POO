package exercicioOficina;

import java.time.LocalDate;

public class Moto extends Veiculo{

	private int cilindradas;
	
	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.setCilindradas(cilindradas);
	}
	
	@Override
	public String toString(){
		return String.format (super.toString() + 
							"\nCilindradas: " + this.cilindradas +
							"\n---------------------------------------");
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

}
