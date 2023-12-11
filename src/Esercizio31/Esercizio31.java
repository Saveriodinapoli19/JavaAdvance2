package Esercizio31;
/*Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
All'interno di User ci sarà anche una funzione che stampi a video
le informazioni di età e il nome.
Creare 2 oggetti User di cui creerà un'istanza.
Del primo si stamperanno le informazioni di default, del secondo
si cambieranno le informazioni e poi si stamperanno a video*/
public class Esercizio31 {
    public static void main(String[] args) {
    User user1 = User.getInstance();
    System.out.println("Utente1 : ");
        user1.info();
       User user2 = User.getInstance();
        user2.setName("Luca");
        user2.setAge(25);
        System.out.println("Utente2 modificato : ");
        user2.info();

    }
}
