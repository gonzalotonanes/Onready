package ejercicioonready;

public abstract class Vehiculo implements Comparable<Vehiculo> {

    protected String marca;
    protected String modelo;
    protected Double precio;

    public Vehiculo(String marca, String modelo, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

}
