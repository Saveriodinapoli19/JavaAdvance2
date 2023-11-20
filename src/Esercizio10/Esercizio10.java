package Esercizio10;

import java.util.ArrayList;

/*Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console*/
public class Esercizio10 {
    public static void main(String[] args) {
        Student studente = new Student("Mario", 22);
        System.out.println(studente);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Michele", 20));
        studentList.add(new Student("Giulio", 21));
        studentList.add(new Student("Edoardo", 17));
        studentList.add(new Student("Luca", 18));
        System.out.println(studentList);
        for(Student student : studentList) {
            System.out.println("Name = " + student.getName() + ", Age = " + student.getAge());
        }
    }

}
