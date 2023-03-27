package com.orden.comida.app.dominio.evento;

public interface EventoDominio<T> {
    void publicar(T domainEvent);

}
