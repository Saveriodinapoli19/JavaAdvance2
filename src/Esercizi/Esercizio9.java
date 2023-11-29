package Esercizi;
//Scrivi un programma che contiene un metodo che date due variabili
// le incrementi di un valore scelto da te e le moltiplichi fra di loro.
public class Esercizio9 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2= 10;
        incrOf(num1, num2);
    }
    public static int incrOf(int num1, int num2){
        num1 ++;
        num2 ++;
        int mult = num1 * num2;
        System.out.println(mult);
    return mult;
    }
}
