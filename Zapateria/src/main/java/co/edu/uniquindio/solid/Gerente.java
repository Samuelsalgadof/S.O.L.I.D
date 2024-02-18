package co.edu.uniquindio.solid;

import java.util.ArrayList;

public class Gerente extends Empleado implements iTrabajo{
    private ArrayList<Empleado>listaEmpleados=new ArrayList<>();

    public Gerente(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Gerente(String nombre, String cargo, int id, ArrayList<Empleado> listaEmpleados) {
        super(nombre, cargo, id);
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    @Override
    public void trabajar() {
        System.out.println("supervisando");
    }
}

