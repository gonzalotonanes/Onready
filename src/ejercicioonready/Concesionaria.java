package ejercicioonready;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concesionaria {

    //PROPIEDADES
    private List<Vehiculo> vehiculos;

    //CONSTRUCTOR
    public Concesionaria(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    //METODO PARA AÑADIR UN VEHICULO A LA LISTA VEHICULOS
    public void añadirAuto(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    //METODO PARA BUSCAR E IMPRIMIR EL VEHICULO MAS CARO EN LA LISTA
    public void vehiculoMasCaro() {
        Vehiculo vehiculoMasCaro = this.vehiculos.get(0);
        for (Vehiculo x : this.vehiculos) {
            if (vehiculoMasCaro.compareTo(x) == -1) {
                vehiculoMasCaro = x;
            }
        }

        System.out.println("Vehículo más caro: " + vehiculoMasCaro.marca + " " + vehiculoMasCaro.modelo);
    }

    //METODO PARA BUSCAR E IMPRIMIR EL VEHICULO MAS BARATO EN LA LISTA
    public void vehiculoMasBarato() {
        Vehiculo vehiculoMasBarato = this.vehiculos.get(0);
        for (Vehiculo x : this.vehiculos) {
            if (vehiculoMasBarato.compareTo(x) == 1) {
                vehiculoMasBarato = x;
            }
        }

        System.out.println("Vehículo más barato: " + vehiculoMasBarato.marca + " " + vehiculoMasBarato.modelo);
    }

    //METODO PARA BUSCAR EN MODELO LA LETRA Y
    public void buscarLetraY() {
        
        DecimalFormat df = new DecimalFormat("###,###.00");
       
        String precioDf;
        
        
        for (Vehiculo vehiculo : vehiculos) {

            char[] caracteres = vehiculo.marca.toCharArray();

            for (char x : caracteres) {
                if (x == 'Y' || x == 'y') {
                    precioDf= df.format(vehiculo.precio);
                    System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + vehiculo.marca + " " + vehiculo.modelo + " " + precioDf);
                }
            }
        }
    }

    //METODO PARA ORDENAR LOS VEHICULOS POR EL PRECIO DE MAYOR A MENOR 
    public void ordenarMayorMenor() {

        Collections.sort(vehiculos, Collections.reverseOrder());

        for (Vehiculo arg : vehiculos) {
            System.out.println(arg.marca + " " + arg.modelo);
        }
    }

    
    //METODO PARA IMPRIMIR TODA LA INFORMACION DE LOS VEHICULOS
    public void imprimir() {
        for (Vehiculo x : vehiculos) {
            System.out.println(x.toString());
        }
    }

}
