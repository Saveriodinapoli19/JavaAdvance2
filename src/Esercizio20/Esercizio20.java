package Esercizio20;
import java.time.OffsetDateTime;
/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
    Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
    verificare che la prima data è precedente alla seconda
    verificare che la seconda data è successiva alla prima
    verificare che le due date sono uguali ad ora
    Stampa il risultato*/
public class Esercizio20 {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse(("2023-03-01T13:00:00Z"));
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
       System.out.println("Data 1 : " + data1);
       System.out.println("Data 2 : " + data2);
     String dataBefore = String.valueOf(data1.isBefore(data2));
        System.out.println("La prima data è precedente? : " + dataBefore);
       String dataAfter = String.valueOf(data2.isAfter(data1));
        System.out.println("La seconda data è successiva? : " + dataAfter);
        String dataEquals = String.valueOf(data1.equals(data2));
        System.out.println("Le due date sono uguali? : " + dataEquals);
    }
}
