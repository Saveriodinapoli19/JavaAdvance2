package Esercizio14;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


//Creare un hashmap prendere tutti i valori, ordinarli e stamparli
public class Esercizio14 {
    public static void main(String[] args) {
        HashMap<String, String> articoli = new HashMap<>();
        articoli.put("Animale", "Cane");
        articoli.put("Studente", "Mario");
        articoli.put("Cancelleria", "Penna");
        articoli.put("Oggetto", "Dado");
        System.out.println(articoli);
        List<String> keyOrder = new ArrayList<>(articoli.keySet());
        Collections.sort(keyOrder);
        for(String key : keyOrder){
            System.out.println(key + ":" + articoli.get(key));
        }
    }

}
