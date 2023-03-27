package com.orden.comida.app.dominio.evento;

import com.orden.comida.app.dominio.entidad.Orden;

import java.time.ZonedDateTime;

public abstract class EventoOrden implements EventoDominio<Orden>{
    private final Orden orden;
    private final ZonedDateTime creacionFecha;

    public EventoOrden(Orden orden, ZonedDateTime creacionFecha) {
        this.orden = orden;
        this.creacionFecha = creacionFecha;
    }

    public Orden getOrden() {
        return orden;
    }

    public ZonedDateTime getCreacionFecha() {
        return creacionFecha;
    }
}
