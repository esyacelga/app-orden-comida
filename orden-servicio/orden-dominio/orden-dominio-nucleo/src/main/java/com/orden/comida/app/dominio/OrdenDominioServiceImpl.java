package com.orden.comida.app.dominio;

import com.orden.comida.app.dominio.entidad.Orden;
import com.orden.comida.app.dominio.entidad.Producto;
import com.orden.comida.app.dominio.entidad.Restaurante;
import com.orden.comida.app.dominio.evento.EventoCancelarOrden;
import com.orden.comida.app.dominio.evento.EventoCreacionOrden;
import com.orden.comida.app.dominio.evento.EventoPagoOrden;
import com.orden.comida.app.dominio.exception.ExceptionDominioOrden;
import lombok.extern.slf4j.Slf4j;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@Slf4j
public class OrdenDominioServiceImpl implements OrdenDominioService {
    private final String UTC="UTC";
    @Override
    public EventoCreacionOrden validarAndInicializarOrden(Orden orden, Restaurante restaurante) {
        validarRestaurante(restaurante);
        seteoOrdenProductoInformacion(orden, restaurante);
        orden.validarOrden();
        orden.incializeOrder();
        log.info("Error id:{} is inicializado", orden.getId().getValue());
        return new EventoCreacionOrden(orden, ZonedDateTime.now(ZoneId.of(UTC)));
    }

    private void seteoOrdenProductoInformacion(Orden orden, Restaurante restaurante) {
        orden.getItemsList().forEach(ordenItems -> restaurante.getProductos().forEach(productoRestaurante -> {
            Producto productoActual = ordenItems.getProducto();
            if (productoActual.equals(restaurante)) {
                productoActual.actualizarNombrePrecio(productoRestaurante.getNombre(), productoRestaurante.getPrecio());
            }
        }));
    }

    private void validarRestaurante(Restaurante restaurante) {
        if (!restaurante.isActive()) {
            throw new ExceptionDominioOrden("Restaurante id:  " + restaurante.getId().getValue());
        }
    }

    @Override
    public EventoPagoOrden pagarOrden(Orden orden) {
        orden.pagar();
        log.info("Orden id:{}", orden.getId().getValue());
        return new EventoPagoOrden(orden,ZonedDateTime.now(ZoneId.of(UTC)));
    }

    @Override
    public void approveOrden(Orden orden) {
        orden.pagar();
        log.info("Orden id:{}", orden.getId().getValue());
    }

    @Override
    public EventoCancelarOrden ordenPagoCancelacion(Orden orden, List<String> mensajesError) {
        orden.inicializarCancelacion(mensajesError);
        log.info("Orden pago");
        return new EventoCancelarOrden(orden, ZonedDateTime.now(ZoneId.of(UTC)));
    }

    @Override
    public void cancelarOrden(Orden orden, List<String> mensajesError) {
        orden.cancelar(mensajesError);
        log.info("Orden with id:{}", orden.getId().getValue());

    }
}
