package ejercicioonready;

import java.text.DecimalFormat;

public class Auto extends Vehiculo {

    
    //PROPIEDADES
    private int puertas;

    //CONSTRUCTOR
    public Auto(String marca, String modelo, Double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###,###.00");
       
        String precioDf= df.format(this.precio);
            
        
        return "Marca:" + this.marca + " // Modelo: " + this.modelo + " // Puertas: " + this.puertas + " // Precio: $" + precioDf;
    }

    @Override
    public int compareTo(Vehiculo o) {
        return this.precio.compareTo(o.precio);
    }

}
