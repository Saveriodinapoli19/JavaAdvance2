package Esercizi;
//Definire una funzione che accetti in ingresso 2 interi e ne restituisca la somma.
public class Esercizio5 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        function(num1, num2);
    }
     public static int function(int num1, int num2){

        int sum = num1 + num2;
         System.out.println(sum);
        return sum;
    }

}
