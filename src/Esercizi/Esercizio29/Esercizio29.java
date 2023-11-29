package Esercizi.Esercizio29;
/*Scrivere un programma che contenga una classe
chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che
fa override del metodo calcolaArea() per calcolare l'area del rettangolo.*/
public class Esercizio29 {
    public static void main(String[] args) {
    Forma forma = new Forma();
    Rettangolo rettangolo = new Rettangolo(5,5);
        System.out.println(forma.calcolaArea());
        System.out.println(rettangolo.calcolaArea());
    }
}
