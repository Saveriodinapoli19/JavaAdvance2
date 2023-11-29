package Esercizi;
/*Scrivi un programma che calcoli la lunghezza di una stringa,
sulla base di questa lunghezza stampi
"Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".
*/
 public class Esercizio15 {
    public static void main(String[] args) {
        String testo = "Ciao";
        if(testo.length() > 10){
            System.out.println("Lunghezza maggiore 10");
        } else if(testo.length() < 10 ) {
            System.out.println("Lunghezza minore di 10");
        } else if(testo.length() == 10) {
            System.out.println("Lunghezza pari a 10");
        }else{
            System.out.println(testo.length());
        }
    }
 }
