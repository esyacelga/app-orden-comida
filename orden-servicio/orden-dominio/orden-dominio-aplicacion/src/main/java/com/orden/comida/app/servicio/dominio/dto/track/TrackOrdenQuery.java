package com.orden.comida.app.servicio.dominio.dto.track;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackOrdenQuery {
    @NonNull
    private final UUID ordentrackingId;
}
