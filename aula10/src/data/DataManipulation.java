package data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataManipulation {

	public static void main(String[] args) {
		
		LocalDateTime Nascimento = LocalDateTime.of(2000, Month.JANUARY, 27, 05, 25);
		LocalDate dataNiver = LocalDate.of(2000, 01, 27);
		LocalDate hoje = LocalDate.now();
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("DD/MM/YYYY");
		
		//SE É ANO BI
		Boolean bisexto = dataNiver.isLeapYear();
		//SEGUNDOS VIVO
		Duration tempoVivo = Duration.between(Nascimento, agora);
		//SABER A QUANTOS DIAS ESTÁ VIVO
		long dias = ChronoUnit.DAYS.between(dataNiver, agora);
		
		
		//PRINT
		System.out.println("Aniversario: " + dataNiver.format(formatar));
		
		System.out.println("Hoje: " + agora);
		
		System.out.println("Nasci em ano Bisexto? " + bisexto);
		
		System.out.println("Vivendo ou Existindo hmm:  " + dias + " Dias");
		
		System.out.println("Vivendo ou Existindo hmm:  " + tempoVivo.getSeconds() + " Segundos");
		
		
	}

}
