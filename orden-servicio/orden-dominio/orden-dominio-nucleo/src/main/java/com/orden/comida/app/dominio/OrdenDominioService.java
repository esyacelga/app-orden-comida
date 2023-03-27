package com.orden.comida.app.dominio;

import com.orden.comida.app.dominio.entidad.Orden;
import com.orden.comida.app.dominio.entidad.Restaurante;
import com.orden.comida.app.dominio.evento.EventoCancelarOrden;
import com.orden.comida.app.dominio.evento.EventoCreacionOrden;
import com.orden.comida.app.dominio.evento.EventoPagoOrden;

import java.util.List;

public interface OrdenDominioService {
    EventoCreacionOrden validarAndInicializarOrden(Orden orden, Restaurante restaurante);

    EventoPagoOrden pagarOrden(Orden orden);

    void approveOrden(Orden orden);

    EventoCancelarOrden ordenPagoCancelacion(Orden orden, List<String> mensajesError);

    void  cancelarOrden (Orden orden, List<String> mensajesError);
}
