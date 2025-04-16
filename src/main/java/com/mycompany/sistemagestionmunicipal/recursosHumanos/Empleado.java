package com.mycompany.sistemagestionmunicipal.recursosHumanos;

public abstract class Empleado {
    protected String codigo;
    protected String nombres;
    protected String apellidos;
    protected String direccion;
    protected double sueldoBasico;

    public Empleado(String codigo, String nombres, String apellidos, String direccion, double sueldoBasico) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.sueldoBasico = sueldoBasico;
    }

    public abstract double calcularSalario();
    
    public String getCodigo() {
        return codigo;
    }

    public void imprimirDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombres + " " + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Sueldo Básico: $" + sueldoBasico);
        System.out.println("Salario Total: $" + calcularSalario());
    }
}
