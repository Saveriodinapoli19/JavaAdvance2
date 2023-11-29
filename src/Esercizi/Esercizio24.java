package Esercizi;
//Scrivi un programma che contenga un metodo che
//crea un array e lo riempie con dei caratteri.
//Questo metodo dovrà poi stampare tutte le occorrenze del
//carattere 'a' o 0 in caso non ce ne siano.
public class Esercizio24 {
    public static void main(String[] args) {
        caratteri();
    }
public static void caratteri(){
        char[] ch = {'a', 'b', 'c', 'd'};
for(int i = 0; i < ch.length; i++){
    if(ch[i] == 'a'){
        System.out.println(ch[i]);
    }else{
        System.out.println('0');
    }
}
    }
}
