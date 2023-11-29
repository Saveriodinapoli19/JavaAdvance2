package Esercizi;
/*Scrivere un programma che stampi i numeri da 1 a 100. Per i multipli di 3 stampi
"Fizz" al posto del numero e per i multipli di 5 stampi "Buzz".
  Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".
 */
public class Esercizio14 {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++){
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
            }else if(num % 3== 0){
                System.out.println("Fizz");
            }else if(num % 5 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(num);
            }


        }
    }
}