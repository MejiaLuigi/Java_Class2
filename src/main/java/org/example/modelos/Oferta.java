package org.example.modelos;

import java.time.LocalDate;

public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private Integer costopersona;
    private Integer idlocal;

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fecha_inicio, LocalDate fecha_fin, Integer costopersona, Integer idlocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.costopersona = costopersona;
        this.idlocal = idlocal;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                ", costopersona=" + costopersona +
                ", idlocal=" + idlocal +
                '}';
    }
}
