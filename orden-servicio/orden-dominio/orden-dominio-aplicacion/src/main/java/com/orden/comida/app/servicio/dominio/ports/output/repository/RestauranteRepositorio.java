package com.orden.comida.app.servicio.dominio.ports.output.repository;

import com.orden.comida.app.dominio.entidad.Restaurante;

import java.util.Optional;

public interface RestauranteRepositorio {
    Optional<Restaurante> buscarInformacionRestaurante(Restaurante restaurante);
}
