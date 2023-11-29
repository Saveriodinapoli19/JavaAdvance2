package Esercizi;
/*Scrivi un programma che contiene un metodo che
che confronti due numeri interi e determini se sono diversi.
Il programma dovrà stampare a video i due valori e il
*/
public class Esercizio10 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        confronto(num1, num2);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
public static boolean confronto(int num1, int num2){

        boolean confronto = num1 == num2;
    System.out.println(confronto);
    return confronto;
}
}