package models;

public class Shirt implements Comparable<Shirt> {

    private String model;
    private int talla;
    private int anios;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "model='" + model + '\'' +
                ", talla=" + talla +
                ", anios=" + anios +
                '}';
    }

    @Override
    public int compareTo(Shirt o) {
        return this.talla - o.talla;
    }
}


