package com.orden.comida.app.servicio.dominio.dto.create;

import com.orden.comida.app.dominio.entidad.OrdenItems;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreacionOrdenComando {
    @NonNull
    private final UUID idCliente;
    @NonNull
    private final UUID idRestaurante;
    @NonNull
    private final BigDecimal price;
    @NonNull
    private final List<ItemOrden> itemsList;
    @NonNull
    private final DireccionOrden direccion;

}
