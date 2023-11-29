package Esercizi.Esercizio30;

public class Triangolo extends Forma {
 int base;
 int altezza;
 public Triangolo(int base, int altezza){
    super();
     this.base = base;
     this.altezza = altezza;
 }

    @Override
    public int calcolaArea() {
       int area = (base * altezza) / 2;
        return area ;
    }
}
