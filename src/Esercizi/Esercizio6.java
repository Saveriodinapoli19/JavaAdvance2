package Esercizi;
//Definire una funzione che accetti in ingresso una stringa e ne restituisca la lunghezza
public class Esercizio6 {
    public static void main(String[] args) {
        String stringa = "Ciao";
        stringFunc(stringa);
    }
    public static String stringFunc(String stringa){
        System.out.println(stringa.length());

        return stringa;
    }

}
