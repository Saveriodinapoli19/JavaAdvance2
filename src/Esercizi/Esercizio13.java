package Esercizi;
/*Scrivi un programma che contiene un metodo che prenda un numero in ingresso e capisca se un
numero è pari o dispari utilizzando solo gli operatori logici.

 */
public class Esercizio13 {
    public static void main(String[] args) {
        int num = 6;
        module(num);
    }
public static boolean module(int num){
        boolean numero = num % 2 == 0;
    System.out.println("Il numero è pari? = " + numero);
    return numero;
}
}
