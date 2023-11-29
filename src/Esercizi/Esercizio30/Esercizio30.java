package Esercizi.Esercizio30;

import Esercizi.Esercizio29.Forma;
import Esercizi.Esercizio29.Rettangolo;

public class Esercizio30 {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(5,5);
        Triangolo triangolo = new Triangolo(6, 6 );
        System.out.println(forma.calcolaArea());
        System.out.println(rettangolo.calcolaArea());
        System.out.println(triangolo.calcolaArea());
    }
}
