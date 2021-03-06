import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
		
		//int anos = olimpiadasRio.getYear() - hoje.getYear();
		//System.out.println(anos);
		
		Period periodo = Period.between(hoje, dataFutura);
		System.out.println(periodo);
		
		//LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		
		//System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		//String valorFormatado = proximasOlimpiadas.format(formatador);
		//System.out.println(valorFormatado);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(15,  30);
		System.out.println(intervalo);
		
		
		

	}

}
