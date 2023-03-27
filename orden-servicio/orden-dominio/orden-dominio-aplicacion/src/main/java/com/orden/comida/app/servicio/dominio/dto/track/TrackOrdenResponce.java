package com.orden.comida.app.servicio.dominio.dto.track;

import com.orden.comida.app.dominio.objetovalor.EstadoOrden;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackOrdenResponce {
    @NonNull
    private final UUID orderTrachingId;
    @NonNull
    private final EstadoOrden estadoOrden;

    private final List<String> mensajeError;
}
