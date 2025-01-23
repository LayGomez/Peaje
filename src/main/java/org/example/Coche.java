package org.example;

public class Coche extends Vehiculo{
    public Coche(String matricula) {
        super(matricula);
    }

    @Override
    public float calcularPeaje(){
        return 100;
    }
}
