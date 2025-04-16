package com.mycompany.sistemagestionmunicipal.recursosHumanos;

public class Administrador extends Empleado {
    private String numeroSocial;
    private int horasExtras;
    private static final double BONO = 0.4;
    private static final double PAGO_HORA_EXTRA = 30;

    public Administrador(String codigo, String nombres, String apellidos, String direccion, double sueldoBasico, String numeroSocial, int horasExtras) {
        super(codigo, nombres, apellidos, direccion, sueldoBasico);
        this.numeroSocial = numeroSocial;
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return sueldoBasico + (sueldoBasico * BONO) + (horasExtras * PAGO_HORA_EXTRA);
    }
}
