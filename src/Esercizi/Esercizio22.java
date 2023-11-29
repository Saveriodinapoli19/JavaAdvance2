package Esercizi;
/*Scrivi un programma che contenga un metodo che
prende in ingresso un valore numerico e stampa tutti i numeri fino al
valore immesso, la stampa dovrà saltare il valore uguale a 5.*/
public class Esercizio22 {
    public static void main(String[] args) {
        int num = 0;
        metodo(num);
    }
    public static void metodo(int num){
        for(num = 0; num <= 10; num++){
            if(num == 5){
                continue;
            }
            System.out.println(num);
        }
    }
}
