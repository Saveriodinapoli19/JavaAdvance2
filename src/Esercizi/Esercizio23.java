package Esercizi;
/*Scrivi un programma che contenga un metodo che crea un array e lo
riempie con i numeri da 1 a 10 e che che calcoli la somma dei
numeri contenuti nell'array inizializzato e la stampi a video. */
public class Esercizio23 {
    public static void main(String[] args) {
        int [] numero = Array();
        metodo(numero);
    }
    public static int[] Array(){
       int[] numero = new int[] {1,2,3,4,5,6,7,8,9,10};
       for(int i = 0; i< numero.length; i++){
           numero[i] = i+1;
       }
        return numero;
    }
    public static int metodo(int[] numero){
        int sum = 0;
        for(int numero1 : numero){
            sum += numero1;

        }
        System.out.println(sum);
        return sum;

    }
}
