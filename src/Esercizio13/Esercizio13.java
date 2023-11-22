package Esercizio13;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/*Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.*/
public class Esercizio13 {
    public static void main(String[] args) {
        String art1 = "Dado";
        String art2 = "Penna";
        String art3 = "Cane";

        Map<String, String> articolo1 = new HashMap<>();
        articolo1.put("Oggetto", art1);
        System.out.println(articolo1);

        Map<String, String> articolo2 = Map.of("Cancelleria", art2);
        System.out.println(articolo2);

        Map<String, String> articolo3 = (Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Animale", art3)));
        System.out.println(articolo3);


    }
}
