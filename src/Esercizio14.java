import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//Creare un hashmap prendere tutti i valori, ordinarli e stamparli
public class Esercizio14 {
    public static void main(String[] args) {
        HashMap<String, String> articoli = new HashMap<>();
        articoli.put("Animale", "Cane");
        articoli.put("Studente", "Mario");
        articoli.put("Cancelleria", "Penna");
        articoli.put("Oggetto", "Dado");
        System.out.println(articoli);
        Map<String, String> animaliOrdinati = new TreeMap<>(articoli);
        System.out.println(animaliOrdinati);
    }

}
