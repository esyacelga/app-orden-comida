package com.orden.comida.app.dominio.evento.publisher;

import com.orden.comida.app.dominio.evento.EventoDominio;

public interface DomainEventPublisher <T extends EventoDominio> {
    void publish(T eventoDominio);
}
