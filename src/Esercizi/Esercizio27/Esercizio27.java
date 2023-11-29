package Esercizi.Esercizio27;
//Scrivere un programma che contenga una classe che definisce un
//Auto che abbia come proprietà cilindrata, targa, marca e modello.
//Per questa classe saranno necessari
// i metodi accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Auto.
//In questo caso la nota importante è rendere le proprietà
// della classe auto accessibili solo attraverso i metodi
public class Esercizio27 {
    public static void main(String[] args) {
   Auto auto = new Auto();
   auto.setTarga("AB123CD");
   auto.setMarca("Fiat");
   auto.setModello("Panda");
   auto.setCilindrata(1500);
        System.out.println(auto);
    }
}
