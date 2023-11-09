package course;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program23 {
	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		//ISO 8601
		LocalDate d04 = LocalDate.parse("2023-11-08");
		LocalDateTime d05 = LocalDateTime.parse("2023-11-08T16:55:35");
		Instant d06 = Instant.parse("2023-11-08T16:55:35Z");
		Instant d07 = Instant.parse("2023-11-08T16:55:35-03:00");
		
		//Formatado
		//LocalDate d08 = LocalDate.parse("08/11/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("08/11/2023", fmt1);		
		LocalDateTime d09 = LocalDateTime.parse("08/11/2023 16:55", fmt2);
		
		LocalDate d10 = LocalDate.of(2023, 11, 8);		
		LocalDateTime d11 = LocalDateTime.of(2023, 11, 8, 16, 02);
		
		/*Mostra todos ZonaIds disponivéis 
		for (String s: ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}*/
		//Conversão
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); 
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));		
		
		//Calculos com data
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		//comparação
		//Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0,0));
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		
		System.out.println("d01 = "+d01);
		System.out.println("d02 = "+d02);
		System.out.println("d03 = "+d03);
		System.out.println();
		System.out.println("d04 = "+d04);
		System.out.println("d04 = "+d04.format(fmt1));
		System.out.println("d04 = "+fmt1.format(d04));
		System.out.println("d04 = "+d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("d05 = "+d05);
		System.out.println("d05 = "+d05.format(fmt1));
		System.out.println("d05 = "+d05.format(fmt2));
		System.out.println("d05 = "+d05.format(fmt4));
		System.out.println("d06 = "+d06);
		System.out.println("d06 = "+fmt3.format(d06));
		System.out.println("d06 = "+fmt5.format(d06));
		System.out.println("d07 = "+d07);
		System.out.println();
		System.out.println("d08 = "+d08);
		System.out.println("d09 = "+d09);
		System.out.println();
		System.out.println("d10 = "+d10);
		System.out.println("d11 = "+d11);
		System.out.println();
		System.out.println("r1 = "+r1);
		System.out.println("r2 = "+r2);
		System.out.println("r3 = "+r3);
		System.out.println("r4 = "+r4);
		System.out.println();
		System.out.println("d04 dia = "+d04.getDayOfMonth());
		System.out.println("d04 mês = "+d04.getMonthValue());
		System.out.println("d04 ano = "+d04.getYear());
		System.out.println();
		System.out.println("d05 hora = "+d05.getHour());
		System.out.println("d05 minutos = "+d05.getMinute());
		System.out.println();
		System.out.println("nextWeekLocalDate = "+nextWeekLocalDate);
		System.out.println("pastWeekLocalDate = "+pastWeekLocalDate);
		System.out.println("nextWeekLocalDateTime = "+nextWeekLocalDateTime);
		System.out.println("pastWeekLocalDateTime = "+pastWeekLocalDateTime);
		System.out.println("nextWeekInstant = "+nextWeekInstant);
		System.out.println("pastWeekInstant = "+pastWeekInstant);
		System.out.println();
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
	}
}

//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
