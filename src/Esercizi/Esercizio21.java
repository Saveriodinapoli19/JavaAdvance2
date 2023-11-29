package Esercizi;
/*Scrivi un programma che contenga un metodo che prende in ingresso
un valore numerico e stampa tutti i numeri fino al valore
immesso, la stampa dovrà interrompersi se il valore è uguale a 5.*/
public class Esercizio21 {
    public static void main(String[] args) {
        int num = 5;
        metodo(num);
    }

    public static int metodo(int num) {
        for (num = 0; num < 10; num++) {
            System.out.println(num);
            if (num == 5) {
                break;
            }
        }

    return num;
    }
}