package com.orden.comida.app.servicio.dominio.ports.output.repository;

import com.orden.comida.app.dominio.entidad.Orden;
import com.orden.comida.app.dominio.objetovalor.IDSeguimiento;

import java.util.Optional;

public interface OrdenRepositorio {
    Orden guardar(Orden orden);

    Optional<Orden> buscarPorTrackId(IDSeguimiento trackingID);
}
