package Esercizio22;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
    Formatta la data ottenuta in FULL, MEDIUM e SHORT
    Stampa le varie versioni -Crea dei test per questo esercizio*/
public class Esercizio22 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        dataFull(data);
        dataMedium(data);
        dataShort(data);
    }
    public static String dataFull(OffsetDateTime data) {
            String dataFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
            System.out.println("Data Full : " + dataFull);
        return dataFull;
    }
    public static String dataMedium(OffsetDateTime data) {
        String dataMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Data Medium : " + dataMedium);
    return dataMedium;
    }
   public static String dataShort(OffsetDateTime data) {
       String dataShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
       System.out.println("Data Short : " + dataShort);
   return dataShort;
    }

    }

