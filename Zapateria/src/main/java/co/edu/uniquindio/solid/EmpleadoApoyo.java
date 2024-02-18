package co.edu.uniquindio.solid;

public class EmpleadoApoyo extends Empleado implements iTrabajo{
    private boolean disponibilidad;

    public EmpleadoApoyo(String nombre, String cargo, int id, boolean disponibilidad) {
        super(nombre, cargo, id);
        this.disponibilidad = disponibilidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public void trabajar() {
        System.out.println("El empleado de apoyo no cuenta con disponibilidad");
    }
}
