package imovel;

public class Imovel {
	private Integer codImovel;
	public String bairro;
	public String tipo;
	public Double valor;
	
	
	public Integer getCodImovel() {
		return codImovel;
	}
	
	public void setCodImovel(Integer codImovel) {
		this.codImovel = codImovel;
	}
	
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	//METODOS
	
	public void Reajuste() {
		
		if (getTipo() == "apto") {
			this.setValor(this.getValor() + this.getValor() * 8/100);
			
		} else if(getTipo() == "casa") {
			this.setValor(this.getValor() + this.getValor() * 5/100);
			
		}
	}
	
	public String Categoria() {
		
		String categoria = "";
		
		if(this.getValor() >= 50.000) {
			categoria = "A";
			
		} else if (this.getValor() >= 10.000 && this.getValor() < 50.000) {
			categoria = "B";
			
		}  else{
			categoria = "C";
		}
		
		return categoria;
	}

}
