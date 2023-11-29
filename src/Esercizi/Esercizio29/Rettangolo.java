package Esercizi.Esercizio29;

public class Rettangolo extends Forma{
  int base;
  int altezza;
    public Rettangolo(int base, int altezza){
      this.base = base;
      this.altezza = altezza;

  }

    @Override
    public int calcolaArea(){
        int area = base * altezza;
    return area;
    }
}
