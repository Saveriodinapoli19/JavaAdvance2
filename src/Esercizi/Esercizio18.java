package Esercizi;
/*Scrivere un programma che contenga un metodo che sfrutti il while loop e
prenda in ingresso 1 valore intero come limite superiore e
calcoli la somma di tutti i valori prima del limite e la stampi a video.
(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4) */
public class Esercizio18 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(sumOf(num));

    }
    public static int sumOf(int num){
        int sum = 0;
        int count = 0;
        while (count < num){
            sum += count;
            count++;
        }
        return sum;
    }
}
