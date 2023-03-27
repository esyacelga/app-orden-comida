package com.orden.comida.app.servicio.dominio.ports.output.publisher.restorantapproval;

import com.orden.comida.app.dominio.evento.EventoPagoOrden;
import com.orden.comida.app.dominio.evento.publisher.DomainEventPublisher;

public interface PagoOrdenRestaurantPeticionMessagePublisher  extends DomainEventPublisher<EventoPagoOrden> {

}
