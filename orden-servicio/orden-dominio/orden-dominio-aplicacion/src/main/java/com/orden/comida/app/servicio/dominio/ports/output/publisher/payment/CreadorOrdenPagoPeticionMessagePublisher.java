package com.orden.comida.app.servicio.dominio.ports.output.publisher.payment;

import com.orden.comida.app.dominio.evento.EventoCreacionOrden;
import com.orden.comida.app.dominio.evento.publisher.DomainEventPublisher;

public interface CreadorOrdenPagoPeticionMessagePublisher extends DomainEventPublisher<EventoCreacionOrden> {
}
