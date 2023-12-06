package Esercizio30;

public class Person {
    public Person(String firstName, String lastName, int age, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.adress = adress;
    }

    private String firstName;
    private String lastName;
    private int age;
    private String adress;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }
}
