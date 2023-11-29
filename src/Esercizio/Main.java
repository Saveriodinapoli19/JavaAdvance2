package Esercizio;
/*Scrivere un metodo che a partire da un array calcoli il valore massimo e il valore minimo e
stampi l’informazione a video.*/
public class Main {
    public static void main(String[] args) {
        int[] numeri = {10,2,3,4,5};
        metodo(numeri);
    }
    public static void metodo(int[] numeri) {
        int minimo = numeri[0];
        int massimo = numeri[0];
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
            if(numeri[i] > massimo){
                massimo = numeri[i];
            }
        }
        System.out.println(minimo);
        System.out.println(massimo);
        }

    }

