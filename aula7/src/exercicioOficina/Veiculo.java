package exercicioOficina;

import java.time.LocalDate;

public class Veiculo implements Oficina {

	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {

		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	
	@Override
	public String toString(){
		return String.format("\nModelo: " + this.modelo +
							"\n" + proprietario +
							"\nValor Cobrado: " + getValorCobrado());
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	public double lavarVeiculo() {
		this.valorCobrado = valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
		return valorCobrado;
	}

	public double trocarOleo() {
		this.valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
		return valorCobrado;
	}

	public double revisao() {
		this.valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
		return valorCobrado;
	}	
	
}
