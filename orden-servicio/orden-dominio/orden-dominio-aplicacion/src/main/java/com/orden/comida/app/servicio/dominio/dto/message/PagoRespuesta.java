package com.orden.comida.app.servicio.dominio.dto.message;

import com.orden.comida.app.dominio.objetovalor.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class PagoRespuesta {
    private String id;
    private String sagaId;
    private String orderId;
    private String paymentID;
    private String customerID;
    private BigDecimal price;
    private Instant tiempoCreacion;
    private PaymentStatus paymentStatus;
    private List<String> errorMensajes;


}
