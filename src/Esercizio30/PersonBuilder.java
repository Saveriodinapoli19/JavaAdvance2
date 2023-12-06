package Esercizio30;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String adress;
    PersonBuilder() {}

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public PersonBuilder setAdress(String adress) {
        this.adress = adress;
        return this;
    }
    public Person build(){
        return new Person(firstName, lastName, age, adress);
    }
}
