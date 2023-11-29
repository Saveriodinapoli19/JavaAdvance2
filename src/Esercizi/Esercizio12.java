package Esercizi;
/*  Scrivi un programma che contiene un metodo che
dati 2 interi in ingresso ed un valore di confronto
  verifichi se il numero di confronto è compreso
  tra due valori specifici e stampi il risultato dell'operazione
  comprensivo dei due limiti (inferiore e superiore)

 */
public class Esercizio12 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int value = 7;
        confronto(num1, num2, value);
    }
 public static boolean confronto(int num1, int num2, int value){
        boolean confOf = (num1 <= value) && (num2 >= value);
     System.out.println("E' compreso = " + confOf);
    return confOf;
    }
}
