package org.example.modelos;

public class Persona {
    private Integer id;
    private String documento;
    private String nombre;
    private String correo;
    private Integer ubicacion;

    public Persona() {
    }

    public Persona(Integer id, String documento, String nombre, String correo, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", ubicacion=" + ubicacion +
                '}';
    }
}
