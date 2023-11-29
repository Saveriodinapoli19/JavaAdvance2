package Esercizio18;

import java.time.LocalDate;



/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
    ottieni l'anno
    ottieni il mese
    ottieni il giorno
    ottieni il giorno della settimana
    Stampa i risultati sulla console*/
public class Esercizio18 {
    public static void main(String[] args)  {
        LocalDate date = LocalDate.parse("2023-03-01T13:00:00Z");
        System.out.println("Data : " + date);
        String yearString =
                String.valueOf(date.getYear());
        System.out.println("Anno : " + yearString);
        String monthString =
                String.valueOf(date.getMonth());
        System.out.println("Mese : " + monthString);
        String dayString =
                String.valueOf(date.getDayOfMonth());
        System.out.println("Giorno : " + dayString);
        String dayOfWeek =
                String.valueOf(date.getDayOfWeek());
        System.out.println("Giorno della settimana : " + dayOfWeek);

    }
}
