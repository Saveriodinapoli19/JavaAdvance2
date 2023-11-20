package Esercizio10;

public class Student {
    public Student(String name, int age){
    this.name = name;
    this.age = age;
    }
    public String name;

    public String getName() {
        return name;
    }

    public int age;

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
