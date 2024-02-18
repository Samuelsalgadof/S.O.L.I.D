

import co.edu.uniquindio.solid.Empleado;
import co.edu.uniquindio.solid.EmpleadoApoyo;
import co.edu.uniquindio.solid.Gerente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new EmpleadoApoyo("Juan", "Desarrollador", 1,true);
        Empleado empleado2 = new EmpleadoApoyo("María", "Diseñador", 2,false);
        Empleado empleado3 = new EmpleadoApoyo("Pedro", "Gerente de Proyecto", 3,true);

        // Crear lista de empleados
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);

        // Crear gerentes
        Gerente gerente1 = new Gerente("Carlos", "Gerente", 4, listaEmpleados);


        // Añadir empleado a la lista de empleados del gerente2
        gerente1.getListaEmpleados().add(empleado3);

        // Mostrar información de los gerentes y sus empleados
        System.out.println("Gerente 1:");
        System.out.println("Nombre: " + gerente1.getNombre());
        System.out.println("Cargo: " + gerente1.getCargo());
        System.out.println("ID: " + gerente1.getId());
        System.out.println("Lista de empleados:");
        for (Empleado empleado : gerente1.getListaEmpleados()) {
            System.out.println("- " + empleado.getNombre());
        }
        System.out.println();


    }
}