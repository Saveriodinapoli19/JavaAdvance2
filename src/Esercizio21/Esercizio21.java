package Esercizio21;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/*Riprendi uno degli esercizi già svolti e corretti
    Aggiungi Junit al progetto
    Crea una funzione di test che non dia errori*/
public class Esercizio21 {
    public static void main(String[] args) {
        try {
            Integer number = 5;
            Integer denominator= null;
            nullability(number,denominator);
        }catch(Exception e){
            throw new ArithmeticException("Error");
        }
    }
    public static boolean nullability(Integer number, Integer denominator){
        if (number == null || denominator == null) {
            System.out.println("Number or denominator must be specified");
        } else{
            int result = number / denominator;
            System.out.println(result);

        }


        return false;
    }

}
