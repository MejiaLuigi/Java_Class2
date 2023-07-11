package org.example.modelos;

import java.time.LocalDate;

public class Reserva {
    private Integer id;
    private Integer idUsuario;
    private Integer idLocal;
    private Integer costoTotal;
    private LocalDate fechaReserva;

    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idLocal, Integer costoTotal, LocalDate fechaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idLocal = idLocal;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idLocal=" + idLocal +
                ", costoTotal=" + costoTotal +
                ", fecha_reserva=" + fechaReserva +
                '}';
    }
}
