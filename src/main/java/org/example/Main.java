package org.example;

public class Main {
    public static void main(String[] args) {
        Peaje peaje = new Peaje("Peaje Central", "Ciudad Ejemplo");

        Vehiculo coche = new Coche("ABC123");
        Vehiculo moto = new Moto("BCD234");
        Vehiculo camion = new Camion("CDE345", 4);

        peaje.registrarVehiculo(coche);
        peaje.registrarVehiculo(moto);
        peaje.registrarVehiculo(camion);

        peaje.listaDeVehiculos();
    }
}