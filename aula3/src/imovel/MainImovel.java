package imovel;

public class MainImovel {

	public static void main(String[] args) {
		Imovel imo = new Imovel();
		
		imo.setCodImovel(555);
		imo.setTipo("apto");
		imo.setBairro("Centro");
		imo.setValor(25.000);
		
		imo.Reajuste();
		System.out.printf("Reajuste Para AP:R$ %.3f", imo.getValor());
		
		imo.Categoria();
		System.out.printf("\nCategoria do Imovel: %s", imo.Categoria());
		
		Imovel imo2 = new Imovel();
		
		imo2.setCodImovel(555);
		imo2.setTipo("casa");
		imo2.setBairro("Quitandinha");
		imo2.setValor(98.900);
		
		imo2.Reajuste();
		System.out.printf("\nReajuste Para CASA:R$ %.3f", imo2.getValor());
		
		imo2.Categoria();
		System.out.printf("\nCategoria do Imovel: %s", imo2.Categoria());
		

	}

}
