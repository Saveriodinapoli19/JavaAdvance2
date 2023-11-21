package Esercizio12;

public class Fruit {
    public Fruit(String name){
      this.name = name;
    }
    public String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
