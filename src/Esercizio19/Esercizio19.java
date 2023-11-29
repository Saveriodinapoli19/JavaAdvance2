package Esercizio19;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
    aggiungi un anno
    sottrai un mese
    aggiungi 7 giorni
    Stampa il risultato localizzata per l'Italia*/
public class Esercizio19 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.parse("2023-03-01T13:00:00Z");
        System.out.println("Data : " + data);
        String dataLocale =
        data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy" , Locale.ITALY));
        System.out.println("Data locale : " + dataLocale);
        LocalDate dataAggiornata = data.plusYears(1).minusMonths(1).plusDays(7);
        System.out.println("Data aggiornata : " + dataAggiornata);
    }
}
