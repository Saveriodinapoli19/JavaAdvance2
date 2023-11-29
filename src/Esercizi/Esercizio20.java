package Esercizi;
/*Scrivi un programma che contenga un metodo che
prende in ingresso un numero e il massimo numero di risultati
che vuoi avere e stampi tutti i numeri naturali in ordine inverso
(Quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3
risultati mi aspetto in uscita [6 5 4] stampati).*/
public class Esercizio20 {
    public static void main(String[] args) {
        int num = 6;
        metod(num);
    }
public static void metod( int num){
        for(num = 6; num >= 4; num = num - 1){
            System.out.println(num);
        }
}
}
