package ejercicioonready;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.text.*;

public class Program {

    public static void main(String[] args) {

        List<Vehiculo> lista = cargarVehiculos();

        Concesionaria concesionaria = new Concesionaria(lista);

        imprimir(concesionaria);

    }

    public static void imprimir(Concesionaria concesionaria) {
        concesionaria.imprimir();
        System.out.println("=============================");
        concesionaria.vehiculoMasCaro();
        concesionaria.vehiculoMasBarato();
        concesionaria.buscarLetraY();
        System.out.println("=============================");
        concesionaria.ordenarMayorMenor();
    }

    public static List<Vehiculo> cargarVehiculos() {
        Vehiculo v = new Auto("Peugeot", "206", 200000.00, 4);
        Vehiculo v2 = new Moto("Honda", "Titan", 60000.00, "125c");
        Vehiculo v3 = new Auto("Peugeot", "208", 250000.00, 5);
        Vehiculo v4 = new Moto("Yamaha", "YBR", 80500.50, "160c");

        List<Vehiculo> lista = new ArrayList<>();

        lista.add(v);
        lista.add(v2);
        lista.add(v3);
        lista.add(v4);

        return lista;
    }

}
