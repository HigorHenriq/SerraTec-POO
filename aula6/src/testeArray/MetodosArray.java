package testeArray;

public class MetodosArray {
	
	private String[] elementos;
	private int tamanho;

	//USADO PARA INSTANCIAR UM ARRAY E DEFINIR SEU TAMANHO
	public void Vetor (int capacidade) {
		this.elementos = new String [capacidade];
		this.tamanho = 0;
	}
	
	//ADICIONANDO NO VETOR
	public boolean adiciona (String elemento){
		
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			
			return true;
			
		}
		return false;
	}
	
	//IMPRIMINDO OS NOSSOS ARRAYS
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		//O -1 É PARA O ARRAY IR SOMENTE ATÉ A PENULTIMA CASA
		for(int i = 0; i < this.tamanho -1; i++) {
			s.append(this.elementos[i]);
		}
		
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	//BUSCAR ALGUM ELEMENTO EM ARRAY
	public int busca(String elementos) {
		
		for(int i = 0; i < this.tamanho; i++) {
			
			if(this.elementos[i].equals(elementos)) {
				return i;
			}
		}
		return -1;
	}
}
