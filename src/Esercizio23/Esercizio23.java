package Esercizio23;
/*
    Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
            Formatta la data ottenendo 01 marzo 2023
            Stampa sulla console
            Crea dei test per questo esercizio
*/

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Esercizio23 {


    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        dataFormat(data);
    }
    public static String dataFormat(OffsetDateTime data){
        String dataFormattata =
                data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(dataFormattata);
        return dataFormattata;

    }
}
