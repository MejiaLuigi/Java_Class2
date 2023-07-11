package org.example.modelos;

public class Herramienta {

    private String nombre;
    private Integer capacidadDanio;

    public Herramienta() {
    }

    public Herramienta(String nombre, Integer capacidadDanio) {
        this.nombre = nombre;
        this.capacidadDanio = capacidadDanio;
    }

    @Override
    public String toString() {
        return "Herramientas{" +
                "nombre='" + nombre + '\'' +
                ", capacidadDanio=" + capacidadDanio +
                '}';
    }
}
