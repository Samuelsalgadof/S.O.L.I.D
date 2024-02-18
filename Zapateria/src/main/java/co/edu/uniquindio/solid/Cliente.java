package co.edu.uniquindio.solid;

public class Cliente {
    private String nombre;
    private String telefono;
    private float monto;
    private int id;
    //Constructor sin parametros
    public Cliente() {}
    //Constructores con parametros
    public Cliente(String nombre, String telefono, int id){
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getMonto() {
        return monto;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", telefono=" + telefono + ", monto=" + monto + ", id=" + id + "]";
}


}
