package com.orden.comida.app.servicio.dominio.dto.create;

import lombok.*;

import javax.validation.constraints.Max;

@Getter
@Builder
@AllArgsConstructor
public class DireccionOrden {
    @NonNull
    @Max(value = 50)
    private final String calle;
    @NonNull
    @Max(value = 10)
    private final String codigoPostal;
    @NonNull
    @Max(value = 50)
    private final String ciudad;


}
