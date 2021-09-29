package funcionarioGerente;

public class MainFunc {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Ash", 6500.00, "Gerente");
		
		g1.infoFinal();
		
		Assistente a1 = new Assistente("Eirian", 1600.00, 60.00);
		
		a1.infoFinal();

	}

}
