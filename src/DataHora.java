import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

    public static void main(String[] args){

        LocalDate d01 = LocalDate.now(); //instanciar data de agora
        LocalDateTime d02 = LocalDateTime.now(); //instancia data e hora
        Instant d03 = Instant.now(); //Hora atual em Horário global (GMT/UTC)
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //formata data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d04 = LocalDate.parse("2023-05-09"); //Formata texto em data
        LocalDateTime d05 = LocalDateTime.parse("2023-05-09T01:30:36"); //Formata texto em data e hora
        Instant d06 = Instant.parse("2023-05-09T01:30:36Z"); //Formata texto em data e hora global
        Instant d07 = Instant.parse("2023-05-09T01:30:36-03:00"); //Formata texto em data e hora global

        LocalDate d08 = LocalDate.parse("20/07/2023", fmt1); //formata data
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 01:30", fmt2); //formata data e hora

        LocalDate d10 = LocalDate.of(2023, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2023, 7, 20, 1, 30);


        System.out.println(d01.toString());
        System.out.println(d02.toString());
        System.out.println(d03.toString());
        System.out.println(d04.toString());
        System.out.println(d05.toString());
        System.out.println(d06.toString());
        System.out.println(d07.toString());
        System.out.println(d08.toString());
        System.out.println(d09.toString());
        System.out.println(d10.toString());
        System.out.println(d11.toString());






    }
}
