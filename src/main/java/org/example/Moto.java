package org.example;

public class Moto extends Vehiculo{
    public Moto(String matricula) {
        super(matricula);
    }

    @Override
    public float calcularPeaje(){
        return 50;
    }
}
