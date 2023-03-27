package com.orden.comida.app.dominio.evento;

import com.orden.comida.app.dominio.entidad.Orden;

import java.time.ZonedDateTime;

public abstract class EventoCreacionOrden extends EventoOrden {

    public EventoCreacionOrden(Orden orden, ZonedDateTime creacionFecha) {
        super(orden, creacionFecha);
    }
}
