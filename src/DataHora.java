import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataHora {

    public static void main(String[] args){

        LocalDate d01 = LocalDate.now(); //instanciar data de agora
        LocalDateTime d02 = LocalDateTime.now(); //instancia data e hora
        Instant d03 = Instant.now(); //Hora atual em Horário global (GMT/UTC)

        LocalDate d04 = LocalDate.parse("2023-05-09"); //Formata texto em data
        LocalDateTime d05 = LocalDateTime.parse("2023-05-09T01:30:36"); //Formata texto em data e hora
        Instant d06 = Instant.parse("2023-05-09T01:30:36Z"); //Formata texto em data e hora global


        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);




    }
}
