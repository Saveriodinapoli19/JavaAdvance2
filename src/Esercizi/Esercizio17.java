package Esercizi;
/*Scrivi un programma che contenga un metodo che
prende in ingresso un carattere e ne identifica il tipo
per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
Nel caso non riesca ad identificare il tipo
di operazione dovrà restituire una stringa di errore. */
public class Esercizio17 {
    public static void main(String[] args) {
        char carattere = '*';
        switch (carattere){
            case '+':
                System.out.println("Addizione");
                break;
            case '-' :
                System.out.println("Sottrazione");
                break;
            case '*' :
                System.out.println("Moltiplicazione");
                break;
            case '/' :
                System.out.println("Divisione");
                break;
            default:
                System.out.println("Nessuna operazione");
        }
    }
}
