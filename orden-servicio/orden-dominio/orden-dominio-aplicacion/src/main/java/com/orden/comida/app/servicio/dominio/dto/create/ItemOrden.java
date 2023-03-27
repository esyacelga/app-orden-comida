package com.orden.comida.app.servicio.dominio.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class ItemOrden {
    @NonNull
    private final UUID idProducto;
    @NonNull
    private final Integer cantidad;
    @NonNull
    private final BigDecimal precio;
    @NonNull
    private final BigDecimal subTotal;

}

