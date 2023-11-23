package Esercizio15;
//Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y
public class Esercizio15 {
    public static void main(String[] args) {
    Point point = new Point(10, 5);
        System.out.println("Coordinate = " + point);
    System.out.println("CoodinateX = " + point.x());
        System.out.println("CoordinateY = " + point.y());
        boolean sonoUguali = point.x() == point.y();
        System.out.println("Sono uguali = " + sonoUguali);
    }
}
