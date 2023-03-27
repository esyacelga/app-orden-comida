package com.orden.comida.app.servicio.dominio.ports.imput.service;

import com.orden.comida.app.servicio.dominio.dto.create.CreacionOrdenComando;
import com.orden.comida.app.servicio.dominio.dto.create.OrdenCreacionRespuesta;
import com.orden.comida.app.servicio.dominio.dto.track.TrackOrdenQuery;
import com.orden.comida.app.servicio.dominio.dto.track.TrackOrdenResponce;

import javax.validation.Valid;

public interface OrdenApilicacionServicio {
    OrdenCreacionRespuesta creacionOrden(@Valid CreacionOrdenComando creacionOrdenComando);

    TrackOrdenResponce trackOrden(@Valid TrackOrdenQuery trackOrdenQuery);

}
