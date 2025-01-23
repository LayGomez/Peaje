package org.example;

import java.util.ArrayList;
import java.util.List;

public class Peaje {
    private String nombre;
    private String ciudad;
    private float totalRecaudado;
    private List<Vehiculo> vehiculosRegistrados;

    public Peaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalRecaudado = 0;
        this.vehiculosRegistrados = new ArrayList<>();
    }

    public float getTotalRecaudado() {
        return totalRecaudado;
    }

    public List<Vehiculo> getVehiculosRegistrados() {
        return vehiculosRegistrados;
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        float peaje = vehiculo.calcularPeaje();
        totalRecaudado += peaje;
        vehiculosRegistrados.add(vehiculo);
        System.out.println("Vehículo registrado: " + vehiculo.getMatricula() + ", Peaje: $" + peaje);
    }

    public void listaDeVehiculos() {
        System.out.println("--- Peaje ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Vehículos registrados:");
        for (Vehiculo vehiculo : vehiculosRegistrados) {
            System.out.println(" - Placa: " + vehiculo.getMatricula() + ", Peaje: $" + vehiculo.calcularPeaje());
        }
        System.out.println("Total recaudado: $" + totalRecaudado);
    }
}
