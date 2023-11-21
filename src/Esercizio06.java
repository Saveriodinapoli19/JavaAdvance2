/*Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing*/

public class Esercizio06 {
    public static void main(String[] args) {
        sumOfInt(5, 5 );
        chacharInput('A');
        integerInput(10, 10);
        characterInput('M');
        valuePrimitive(12, 11.5, 'S');
        valueObj(13, 20.2, 'D');

    }

    public static int sumOfInt(int number, int number2){
        int sum = number + number2;
        System.out.println("The sum int is = " + sum);
    return sum;
    }
    public static char chacharInput(char ch) {
        System.out.println("The char is = " + ch);
    return ch;
    }
    public static Integer integerInput(Integer number, Integer number2){
        Integer sum = number + number2;
        System.out.println("The sum Integer is = " + sum);
    return sum;
    }
    public static Character characterInput(Character ch){
        System.out.println("The Character is = " + ch);
    return ch;
    }
    public static void valuePrimitive(int number, double numDouble, char ch){
        Integer number1= Integer.valueOf(number);
        Double numberDouble = Double.valueOf(numDouble);
        Character ch1 = Character.valueOf(ch) ;
        System.out.println("The value of primitive to object in Integer is = " + number1);
        System.out.println("The value of primitive to object in Double is = " + numDouble);
        System.out.println("The value of primitive to object in Character is = " + ch);
    }
    public static void valueObj(Integer number, Double numDouble, Character ch){
        int numInt = number;
        double number1 = numDouble;
        char character = ch;
        System.out.println("The value of object to primitive in Integer is = " + numInt);
        System.out.println("The value of object to primitive in Double is = " + number1 );
        System.out.println("The value of object to primitive in Character is = " + character );



    }




}