package org.example;

public class Vehiculo {
    protected String matricula;


    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public float calcularPeaje() {
        return 0;
    }
}
