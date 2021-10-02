package exercicioOficina;

public enum TipoServico {
	OLEO (100.00), LAVAGEM(50.00), REVISAO(200.00);
	
	private final double valorPorServico;
	
	TipoServico(double ValorPorServico) {
		this.valorPorServico = ValorPorServico;
	}

	public double getValorPorServico() {
		return valorPorServico;
	}
	
	
}
