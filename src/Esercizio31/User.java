package Esercizio31;

public class User {
    private static User user;
    public static User getInstance(){
        if(user == null){
            user = new User("Michele", 24);
        }
    return user;
    }
    private String name;
    private int age;

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void info(){
        System.out.println("Name : " + name + " , Age : " + age);
    }
}
