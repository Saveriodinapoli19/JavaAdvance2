package Esercizio28;

public class Esercizio28 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Valore: " + i);
            System.out.println(checkValue(i));
        }
    }

    private static String checkValue(int value) {
        //String result = "";

        /*if (value % 5 == 0) {
            result = "FizzBuzz";
        } else {
            result = "Buzz";
        }
*/
        final String result = value % 5 == 0
                ? "FizzBuzz"
                : "Buzz";

        return result;
    }


}
