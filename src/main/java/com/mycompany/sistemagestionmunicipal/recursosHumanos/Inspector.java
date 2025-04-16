package com.mycompany.sistemagestionmunicipal.recursosHumanos;

public class Inspector extends Empleado {

    private String especialidad;
    private int horasExtras;
    private static final double BONO = 0.3;
    private static final double PAGO_HORA_EXTRA = 20;

    public Inspector(String codigo, String nombres, String apellidos, String direccion, double sueldoBasico, String especialidad, int horasExtras) {
        super(codigo, nombres, apellidos, direccion, sueldoBasico);
        this.especialidad = especialidad;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return sueldoBasico + (sueldoBasico * BONO) + (horasExtras * PAGO_HORA_EXTRA);
    }
}
