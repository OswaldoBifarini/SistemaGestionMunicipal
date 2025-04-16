package com.mycompany.sistemagestionmunicipal;

import com.mycompany.sistemagestionmunicipal.recursosHumanos.Administrador;
import com.mycompany.sistemagestionmunicipal.recursosHumanos.Empleado;
import com.mycompany.sistemagestionmunicipal.recursosHumanos.Inspector;
import com.mycompany.sistemagestionmunicipal.recursosHumanos.Obrero;
import com.mycompany.sistemagestionmunicipal.recursosHumanos.ServicioEmpleado;
import com.mycompany.sistemagestionmunicipal.recursosHumanos.Trabajador;
import java.util.Scanner;

public class SistemaGestionMunicipal {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ServicioEmpleado servicio = new ServicioEmpleado();

            boolean salir = false;

            while (!salir) {
                System.out.println("\nMunicipalidad de Orellana - Sistema de Recursos Humanos");
                System.out.println("1. Ingresar Empleado");
                System.out.println("2. Buscar Empleado por Código");
                System.out.println("3. Calcular Total en Salarios");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Código: ");
                        String cod = sc.nextLine();
                        System.out.print("Nombres: ");
                        String nom = sc.nextLine();
                        System.out.print("Apellidos: ");
                        String ape = sc.nextLine();
                        System.out.print("Dirección: ");
                        String dir = sc.nextLine();
                        System.out.print("Sueldo Básico: ");
                        double sueldo = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Tipo de empleado (1-Trabajador, 2-Inspector, 3-Obrero, 4-Administrador): ");
                        int tipo = sc.nextInt();
                        sc.nextLine();

                        switch (tipo) {
                            case 1 -> {
                                System.out.print("Área: ");
                                String area = sc.nextLine();
                                System.out.print("Horas extras: ");
                                int he = sc.nextInt();
                                servicio.agregarEmpleado(new Trabajador(cod, nom, ape, dir, sueldo, area, he));
                            }
                            case 2 -> {
                                System.out.print("Especialidad: ");
                                String esp = sc.nextLine();
                                System.out.print("Horas extras: ");
                                int he = sc.nextInt();
                                servicio.agregarEmpleado(new Inspector(cod, nom, ape, dir, sueldo, esp, he));
                            }
                            case 3 -> {
                                System.out.print("Dependencia: ");
                                String dep = sc.nextLine();
                                System.out.print("Teléfono: ");
                                String tel = sc.nextLine();
                                servicio.agregarEmpleado(new Obrero(cod, nom, ape, dir, sueldo, dep, tel));
                            }
                            case 4 -> {
                                System.out.print("Número Social: ");
                                String ns = sc.nextLine();
                                System.out.print("Horas extras: ");
                                int he = sc.nextInt();
                                servicio.agregarEmpleado(new Administrador(cod, nom, ape, dir, sueldo, ns, he));
                            }
                        }
                    }
                    case 2 -> {
                        System.out.print("Ingrese el código del empleado: ");
                        String codigo = sc.nextLine();
                        Empleado emp = servicio.buscarPorCodigo(codigo);
                        if (emp != null) {
                            emp.imprimirDatos();
                        } else {
                            System.out.println("Empleado no encontrado.");
                        }
                    }
                    case 3 -> {
                        System.out.println("Total en salarios: $" + servicio.calcularTotalSalarios());
                    }
                    case 4 ->
                        salir = true;
                    default ->
                        System.out.println("Opción inválida.");
                }
            }
        }
    }
}
