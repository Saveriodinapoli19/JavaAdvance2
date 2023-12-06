package Esercizio26;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

enum Operazione {
    ADDIZIONE,
    SOTTRAZIONE,
    MOLTIPLICAZIONE,
    DIVISIONE,
    MIN,
    MAX
}

public class Esercizio26 {
    public static void main(String[] args) {
        BigDecimal numero1 = new BigDecimal("10.5");
        BigDecimal numero2 = new BigDecimal("5.2");
        Operazione operazione = Operazione.MOLTIPLICAZIONE;
        BigDecimal risultato = eseguiOperazione(numero1, numero2, Operazione.MOLTIPLICAZIONE).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Operazione: " + operazione);
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
        System.out.println("Risultato : " + risultato);
    }
    public static BigDecimal eseguiOperazione(BigDecimal num1, BigDecimal num2, Operazione operazione) {
       BigDecimal result = null;
        switch (operazione) {
            case ADDIZIONE:
                result = num1.add(num2);
            break;
            case SOTTRAZIONE:
                result = num1.subtract(num2);
            break;
            case MOLTIPLICAZIONE:
                result = num1.multiply(num2);
            break;
            case DIVISIONE:
                result = num1.divide(num2, new MathContext(3));
            break;
            case MIN:
                result = num1.min(num2);
            break;
            case MAX:
                result = num1.max(num2);
            break;


        }
        return result;
    }
}
