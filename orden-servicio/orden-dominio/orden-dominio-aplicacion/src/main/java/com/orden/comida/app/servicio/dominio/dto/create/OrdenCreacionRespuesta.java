package com.orden.comida.app.servicio.dominio.dto.create;

import com.orden.comida.app.dominio.objetovalor.EstadoOrden;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class OrdenCreacionRespuesta {
    @NonNull
    private final UUID idTrackOrden;
    @NonNull
    private final EstadoOrden estadoOrden;
    @NonNull
    private final String mensaje;
}
