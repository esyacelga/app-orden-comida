package com.orden.comida.app.servicio.dominio.dto.message;

import com.orden.comida.app.dominio.objetovalor.EstadoAprovacionOrden;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class AprovacionRestauranteRespuesta {
    private String id;
    private String sagaId;
    private String orderId;
    private String restauranteId;
    private Instant creacionTimpo;
    private EstadoAprovacionOrden estadoAprovacionOrden;
    private List<String> errorMensajes;
}
