package com.orden.comida.app.servicio.dominio.ports.output.publisher.payment;

import com.orden.comida.app.dominio.evento.EventoCancelarOrden;
import com.orden.comida.app.dominio.evento.EventoCreacionOrden;
import com.orden.comida.app.dominio.evento.publisher.DomainEventPublisher;

public interface CancelacdorOrdenPagoPeticionMessagePublisher extends DomainEventPublisher<EventoCancelarOrden> {

}
