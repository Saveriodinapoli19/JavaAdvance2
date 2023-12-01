package Esercizio24;

import java.time.Month;
import java.time.OffsetDateTime;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
    ottieni l'anno
    ottieni il mese
    ottieni il giorno
    ottieni il giorno della settimana
    Stampa i risultati sulla console -Crea dei test per questo esercizio*/
public class Esercizio24 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        getYear(data);
        getMonth(data);
        getDay(data);
        getDayWeek(data);
    }
    public static int getYear(OffsetDateTime data){
        int dataString = data.getYear();
        System.out.println("Anno : " + dataString);
    return dataString;
    }
    public static String getMonth(OffsetDateTime data){
        String dataStrig = String.valueOf(data.getMonth());
        System.out.println("Mese : " + dataStrig);
    return String.valueOf(dataStrig);
    }
    public static int getDay(OffsetDateTime data){
        int dataString = data.getDayOfMonth();
        System.out.println("Giorno del mese : " + dataString);
    return dataString;
    }
    public static String getDayWeek(OffsetDateTime data){
        String dataString = String.valueOf(data.getDayOfWeek());
        System.out.println("Giorno della settimana : " + dataString);
        return dataString;
    }


}
