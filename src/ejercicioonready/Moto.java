package ejercicioonready;

import java.text.DecimalFormat;

public class Moto extends Vehiculo {

    //PROPIEDADES
    private String cilindrada;

    //CONSTRUCTOR
    public Moto(String marca, String modelo, Double precio, String cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    
    @Override
    public String toString() {
        
         DecimalFormat df = new DecimalFormat("###,###.00");
       
        String precioDf= df.format(this.precio);
        
        return "Marca:" + this.marca + " // Modelo:" + this.modelo + " // Cilindrada : " + this.cilindrada + " // Precio: $" + precioDf;
    }
    
    @Override
    public int compareTo(Vehiculo o) {
        return this.precio.compareTo(o.precio);
    }

}
