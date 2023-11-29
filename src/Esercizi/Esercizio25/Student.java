package Esercizi.Esercizio25;

public class Student {
    private String name;
    private String surname;
    private int id;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }
public Student(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;

}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
