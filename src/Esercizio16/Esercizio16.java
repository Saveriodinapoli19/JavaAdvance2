package Esercizio16;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni */
public class Esercizio16 {
    public static void main(String[] args) {
       //OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
       ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
                dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        System.out.println("dateString : " + dateTime);
    String dateString1 =
            dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("dateString1 : " + dateString1);
    String dateString2 =
            dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("dateString2 : " + dateString2);
    }
}
