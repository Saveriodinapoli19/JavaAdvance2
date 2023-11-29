package Esercizi;
//Definisci un metodo per la divisione di 2 numeri interi
//che restituisca il quoziente che dovrà essere stampato.
public class Esercizio7 {
    public static void main(String[] args) {
        double num1 = 5.0;
        double num2 = 10.0;
        dividOf(num1, num2);
    }
    public static double dividOf(double num1, double num2){
        double division = num1 / num2;
        System.out.println(division);
    return division;
    }
}
