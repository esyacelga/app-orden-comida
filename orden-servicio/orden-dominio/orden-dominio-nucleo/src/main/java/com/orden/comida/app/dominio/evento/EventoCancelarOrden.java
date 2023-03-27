package com.orden.comida.app.dominio.evento;

import com.orden.comida.app.dominio.entidad.Orden;

import java.time.ZonedDateTime;

public class EventoCancelarOrden extends EventoOrden{
    public EventoCancelarOrden(Orden orden, ZonedDateTime creacionFecha) {
        super(orden, creacionFecha);
    }
}
