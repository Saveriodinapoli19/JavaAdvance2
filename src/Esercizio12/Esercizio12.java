package Esercizio12;

import java.util.LinkedList;

/*
    Creare una classe Fruit che accenti nel costruttore il parametro name (String)
    In questa classe avere i metodi pubblici per ottenere le informazioni.
    Creare un LinkedList con elementi e stamparlo in console.
    Aggiungere un elemento al primo posto della lista e uno all'ultimo
    Stampare la collezione aggiornata
 */
public class Esercizio12 {
    public static void main(String[] args) {
      Fruit fruitName = new Fruit("Mela");
        System.out.println(fruitName);
        LinkedList<Fruit> fruitList = new LinkedList<>();
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Kiwi"));
        fruitList.add(new Fruit("Persca"));
        System.out.println(fruitList);
        fruitList.addFirst(new Fruit("Ciliegia"));
        fruitList.addLast(new Fruit("Pera"));
        System.out.println("New fruit list: " + fruitList);

    }
}
