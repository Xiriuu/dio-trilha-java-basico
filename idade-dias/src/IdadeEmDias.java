import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) throws ParseException {
//		String dataNasc;
//		
//		Scanner scanner = new Scanner(System.in);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		String dataAtual = String.valueOf(sdf.format(new Date()));
//				
//		System.out.println("Data Atual: " + dataAtual);
//		
//		System.out.println("Digite sua data de Nascimento: ");
//		dataNasc = scanner.nextLine();
//		
//		Date data = sdf.parse(dataNasc);
//		
//		System.out.println("Data de Nascimento: " + sdf.format(data));
		
		LocalDateTime dataCadastro = LocalDateTime.of(2000, 8, 19, 0, 0, 0);
		LocalDateTime hoje = LocalDateTime.now();

	
		long meses = dataCadastro.until(hoje, ChronoUnit.MONTHS);
		
		System.out.println(dataCadastro);
		System.out.println(hoje);
		System.out.println(meses);
		
		
		
		
		
		
		
		
	}

}
