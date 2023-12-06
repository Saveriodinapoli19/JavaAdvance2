package Esercizio29;

public class ShapeFactory {
    public ShapeFactory(){}
    public Shape getShape(typoShape tipo){
        Shape shape = null;
        switch (tipo){
            case CERCHIO -> shape = new Shape1();
            case RETTANGOLO -> shape = new Shape2();
        }
        return shape;
    }
}
