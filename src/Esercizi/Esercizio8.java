package Esercizi;
//Definisci un metodo che calcoli la media
// tra 3 numeri e restituisca il risultato che dovrà essere stampato.
public class Esercizio8 {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 10;
        double num3 = 10;
        medOf(num1, num2, num3);
    }
    public static double medOf(double num1, double num2, double num3){
        double media = (num1 + num2 + num3) / 3;
        System.out.println(media);
        return media;

    }

}
