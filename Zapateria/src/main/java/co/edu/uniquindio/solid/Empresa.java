package co.edu.uniquindio.solid;

public class Empresa {
    private String nombre;
    private String direccion;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Empresa() {
    }
    public Empresa(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", direccion=" + direccion + "]";
    }

}