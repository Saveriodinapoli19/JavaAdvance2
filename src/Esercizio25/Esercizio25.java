package Esercizio25;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
    aggiungi un anno
    sottrai un mese
    aggiungi 7 giorni
    Stampa il risultato localizzata per l'Italia
    Crea dei test per questo esercizio*/
public class Esercizio25 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        updatedYear(data);
        localize(data);
    }

    public static String updatedYear(OffsetDateTime data) {
        String dataString = String.valueOf(data.plusYears(1).minusMonths(1).plusDays(7));
        System.out.println("Anno aggiornato : " + dataString);
        return dataString;
    }
    public static String localize(OffsetDateTime data) {
       String dataString =
        data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        System.out.println("Data localizzata : " + dataString);
    return dataString;
    }
}