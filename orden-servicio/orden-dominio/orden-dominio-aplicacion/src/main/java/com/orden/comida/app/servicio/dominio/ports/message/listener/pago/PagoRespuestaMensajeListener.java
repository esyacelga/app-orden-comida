package com.orden.comida.app.servicio.dominio.ports.message.listener.pago;

import com.orden.comida.app.servicio.dominio.dto.message.PagoRespuesta;

public interface PagoRespuestaMensajeListener {
    void paymentCompletado(PagoRespuesta pagoRespuesta);

    void paymentCancelado(PagoRespuesta pagoRespuesta);
}
