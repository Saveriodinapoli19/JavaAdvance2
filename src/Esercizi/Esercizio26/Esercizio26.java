package Esercizi.Esercizio26;
/*Scrivere un programma che contenga una classe che definisce un
Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.*/
public class Esercizio26 {
    public static void main(String[] args) {
        Auto auto = new Auto(1400, "AB123CD", "Fiat", "Punto");
        System.out.println(auto);
    }

}
