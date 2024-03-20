
package Modelo;

public class Auto {

    //atributos
    private int anhoSerie;
    private String marca;
    private String color;
    private int cantTotalSerie;
    private int numeroSerie;

    //Constructor
    public Auto() {
    }

    //Metodos set///////////////////////////////////////////////////////////////
    public int getAnhoSerie() {
        return anhoSerie;
    }

    public void setAnhoSerie(int anhoSerie) {
        this.anhoSerie = anhoSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantTotalSerie() {
        return cantTotalSerie;
    }

    public void setCantTotalSerie(int cantTotalSerie) {
        this.cantTotalSerie = cantTotalSerie;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

}
