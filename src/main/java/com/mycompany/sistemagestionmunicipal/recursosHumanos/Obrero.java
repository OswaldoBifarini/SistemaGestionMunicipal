package com.mycompany.sistemagestionmunicipal.recursosHumanos;

public class Obrero extends Empleado {

    private String dependencia;
    private String telefono;
    private static final double BONO = 0.1;

    public Obrero(String codigo, String nombres, String apellidos, String direccion, double sueldoBasico, String dependencia, String telefono) {
        super(codigo, nombres, apellidos, direccion, sueldoBasico);
        this.dependencia = dependencia;
        this.telefono = telefono;
    }

    @Override
    public double calcularSalario() {
        return sueldoBasico + (sueldoBasico * BONO);
    }
}
