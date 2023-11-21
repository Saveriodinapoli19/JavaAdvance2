package Esercizio11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/*Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
mettere in ordine la collezione e stampare il risultato*/
public class Esercizio11 {
    public static void main(String[] args) {
        Student student = new Student("Mario", 18);
        System.out.println(student);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Claudio", 17));
        studentList.add(new Student("Michele", 18));
        studentList.add(new Student("Giulio", 19));
        studentList.add(new Student("Luca", 20));
        studentList.add(new Student("Marco", 21));
        studentList.add(new Student("Edoardo", 22));
        studentList.add(new Student("Antonio", 23));
        studentList.add(new Student("Simone", 24));
        studentList.add(new Student("Salvatore", 25));
        studentList.add(new Student("Nicola", 20));
        studentList.add(new Student("Pasquale", 18 ));
        studentList.add(new Student("Stefano", 17));
        System.out.println(studentList);
        Collections.sort(studentList, Comparator.comparingInt(Student:: getAge));
        System.out.println("List order by age: " + studentList);
        Collections.sort(studentList, Comparator.comparing(Student:: getName));
        System.out.println("List order by name: " + studentList);


    }
}