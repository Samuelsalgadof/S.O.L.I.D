package co.edu.uniquindio.solid;

import java.util.ArrayList;

public class Calzado {
    private int[] talla = {25,30,35,40};
    private boolean disponibilidad;
    private float precio;
    private String color;
    private ArrayList<String> tiposCalzado = new ArrayList<>();
    //Constructor sin parametros
    public Calzado(){}
    //Constructores con parametros
    public Calzado(String color, ArrayList<String> tiposCalzado) {
        this.color = color;
        this.tiposCalzado = tiposCalzado;
    }
    public int[] getTalla() {
        return talla;
    }
    public void setTalla(int[] talla) {
        this.talla = talla;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public ArrayList<String> getTiposCalzado() {
        return tiposCalzado;
    }
    public void setTiposCalzado(ArrayList<String> tiposCalzado) {
        this.tiposCalzado = tiposCalzado;
    }
    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public void getionPrecio(int talla){
        setPrecio(talla*1000);

    }
    public void obtenerPrecio(int talla){
        if(isDisponibilidad())
            System.out.println("Precio de tu calzado es de: " + getPrecio());
    }

    @Override
    public String toString() {
        return "Calzado [talla=" + talla + ", precio=" + precio + ", color=" + color + ", tiposCalzado=" + tiposCalzado
              +"]";
}
}
