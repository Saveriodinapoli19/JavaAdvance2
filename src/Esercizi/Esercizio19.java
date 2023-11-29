package Esercizi;
/*Scrivi un programma che contenga un metodo che prende in
ingresso un valore numerico e restituisca la tabellina
aritmetica di quel numero che dovrà essere stampata a video.*/
public class Esercizio19 {
    public static void main(String[] args) {
        int num = 5;
       mult(num);
    }
    public static int mult(int numero){
        for(int num = 0; num <= 10; num++){
            System.out.println(numero + " X " + num + " = " + num * numero );
        }
    return numero;
    }
}
