package Esercizi.Esercizio27;

public class Auto {
    private int cilindrata;
    private String targa;
    private String modello;
    private String marca;

    public int getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                ", modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
