package org.example;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeajeTest {

    @Test
    public void testCalculoPeajeCoche() {
        Vehiculo coche = new Coche("ABC123");
        assertEquals(100, coche.calcularPeaje());
    }

    @Test
    public void testCalculoPeajeMoto() {
        Vehiculo moto = new Moto("DEF456");
        assertEquals(50, moto.calcularPeaje());
    }

    @Test
    public void testCalculoPeajeCamion() {
        Vehiculo camion = new Camion("GHI789", 3);
        assertEquals(150, camion.calcularPeaje());
    }

    @Test
    public void testRegistrarVehiculo() {
        Peaje peaje = new Peaje("Peaje Central", "Ciudad Ejemplo");

        Vehiculo coche = new Coche("ABC123");
        peaje.registrarVehiculo(coche);

        assertEquals(100, peaje.getTotalRecaudado());

        List<Vehiculo> vehiculos = peaje.getVehiculosRegistrados();
        assertEquals(1, vehiculos.size());
        assertEquals("ABC123", vehiculos.get(0).getMatricula());
    }

    @Test
    public void testTotalAcumuladoConVariosVehiculos() {
        Peaje peaje = new Peaje("Peaje Central", "Ciudad Ejemplo");

        Vehiculo coche = new Coche("ABC123");
        Vehiculo moto = new Moto("DEF456");
        Vehiculo camion = new Camion("GHI789", 4);

        peaje.registrarVehiculo(coche);
        peaje.registrarVehiculo(moto);
        peaje.registrarVehiculo(camion);

        assertEquals(350, peaje.getTotalRecaudado());

        List<Vehiculo> vehiculos = peaje.getVehiculosRegistrados();
        assertEquals(3, vehiculos.size());
    }

}