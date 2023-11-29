package Esercizi.Esercizio25;
/*Scrivere un programma che contenga una classe che definisce
uno Studente che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.
*/
public class Esercizio25 {
    public static void main(String[] args) {
    Student student = new Student("Mario", "Rossi", 123);
        System.out.println(student);
    }
}

