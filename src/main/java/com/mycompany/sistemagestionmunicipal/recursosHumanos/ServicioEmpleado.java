package com.mycompany.sistemagestionmunicipal.recursosHumanos;

import java.util.ArrayList;

public class ServicioEmpleado {

    private ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public Empleado buscarPorCodigo(String codigo) {
        for (Empleado e : empleados) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                return e;
            }
        }
        return null;
    }

    public double calcularTotalSalarios() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalario();
        }
        return total;
    }
}
