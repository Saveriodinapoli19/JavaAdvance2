package Esercizio30;
/* Crea una classe Péerson con i campi firstName, lastName, age e address,
i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e
dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali)
per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video*/
public class Esercizio30 {
    public static void main(String[] args) {
    PersonBuilder builder = new PersonBuilder();
    builder.setFirstName("Mario");
    builder.setLastName("Rossi");
    builder.setAge(20);
    builder.setAdress("Via del mare 1");
    Person persona1 = builder.build();
        System.out.println("Persona1 : " + persona1);

    Person persona2 =
            new Person("Luigi", "Verdi", 22, "Via Scarlatti 2");
        System.out.println("Persona2 : " + persona2);
    }
}
