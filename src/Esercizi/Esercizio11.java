package Esercizi;
//Scrivi un programma che contiene un metodo che che confronti due caratteri
// e determini se sono diversi.
//Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza.


public class Esercizio11 {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'A';
        confrOf(ch1, ch2);
        System.out.println(ch1);
        System.out.println(ch2);
    }
   public static boolean confrOf(char ch1, char ch2){
        boolean confronto = ch1 != ch2;
       System.out.println(confronto);
        return confronto;

   }
}
