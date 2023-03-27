package com.orden.comida.app.dominio.evento;

import com.orden.comida.app.dominio.entidad.Orden;

import java.time.ZonedDateTime;

public class EventoPagoOrden extends EventoOrden {
    public EventoPagoOrden(Orden orden, ZonedDateTime creacionFecha) {
        super(orden, creacionFecha);
    }
}
