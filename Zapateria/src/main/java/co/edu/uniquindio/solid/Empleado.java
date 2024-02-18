package co.edu.uniquindio.solid;


public abstract class Empleado  {
    private String nombre;
    private String cargo;
    private int id;

    public Empleado() {
    }

    public Empleado(String nombre, String cargo, int id) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", cargo=" + cargo + ", id=" + id + "]";
    }


    }



