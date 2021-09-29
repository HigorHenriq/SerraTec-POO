package pedido;

import java.time.LocalDate;

public class TesteData {

	public static void main(String[] args) {
		LocalDate data = LocalDate.now();
		
		System.out.println(data);//RETORNANDO ANO-MES-DIA
		
		System.out.println(data.getDayOfWeek());//RETORNA O DIA DA SEMANA

	}

}
