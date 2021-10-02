package exercicioOficina;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo{
	
	private String categoria;
	
	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}
	
	@Override
	public String toString(){
		return String.format (super.toString() + 
							"\nCategoria: " + this.categoria +
							"\n---------------------------------------");
	}
	
	public String getCategoria() {
		return categoria;
	}

	@Override
	public double trocarOleo() {
		
		double oleo = TipoServico.OLEO.getValorPorServico();
		
		if(dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			super.valorCobrado = valorCobrado + oleo - 50.00;
		}
		else {
			super.valorCobrado = valorCobrado + oleo;
		}
		return super.valorCobrado;
	}

	
	@Override
	public double revisao() {
		
		double revisao = TipoServico.REVISAO.getValorPorServico();
		
		if(dataConserto.getMonth().equals(Month.AUGUST)) {
			super.valorCobrado = valorCobrado + revisao - revisao * 10/100;
		}
		else {
			super.valorCobrado = valorCobrado + revisao;
		}
		return super.valorCobrado;
	}

}
