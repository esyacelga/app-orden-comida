package com.orden.comida.app.servicio.dominio.ports.output.repository;

import com.orden.comida.app.dominio.entidad.Cliente;

import java.util.Optional;
import java.util.UUID;

public interface ClienteRepositorio {
    Optional<Cliente> buscarCliente(UUID idCliente);
}
