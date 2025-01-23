package org.example;

public class Camion extends Vehiculo{
    private int numEjes;

    public Camion(String matricula, int numEjes) {
        super(matricula);
        this.numEjes = numEjes;
    }

    @Override
    public float calcularPeaje(){
        return 50 * numEjes;
    }
}
