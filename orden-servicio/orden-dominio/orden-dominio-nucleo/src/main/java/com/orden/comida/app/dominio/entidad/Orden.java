package com.orden.comida.app.dominio.entidad;

import com.orden.comida.app.dominio.exception.ExceptionDominioOrden;
import com.orden.comida.app.dominio.objetovalor.*;

import java.util.List;
import java.util.UUID;

public class Orden extends RaizAgregada<IDOrden> {
    private final IDCliente idCliente;
    private final IDRestaurante idRestaurante;
    private final DireccionCalle direccionCalle;
    private final Moneda price;
    private final List<OrdenItems> itemsList;
    private IDSeguimiento idSeguimiento;
    private EstadoOrden estadoOrden;
    private List<String> mensajesError;

    public void incializeOrder() {
        setId(new IDOrden(UUID.randomUUID()));
        idSeguimiento = new IDSeguimiento(UUID.randomUUID());
        estadoOrden = EstadoOrden.PENDIENTE;
        inicializadorOrdenItems();
    }


    public void pagar() {
        if (estadoOrden != EstadoOrden.PENDIENTE) {
            throw new ExceptionDominioOrden("Orden no posee el estado  pagado correcto");

        }
        estadoOrden = EstadoOrden.PAGADO;
    }

    public void approve() {
        if (estadoOrden != EstadoOrden.PAGADO) {
            throw new ExceptionDominioOrden("Orden no posee el estado aprovar correcto");
        }
        estadoOrden = EstadoOrden.APROVADO;
    }

    public void inicializarCancelacion(List<String> mensajesError) {
        if (estadoOrden != EstadoOrden.PAGADO) {
            throw new ExceptionDominioOrden("Orden no posee el estado  pagado correcto");
        }
        estadoOrden = EstadoOrden.CANCELANDO;
        actualizarMensajesError(mensajesError);

    }

    private void actualizarMensajesError(List<String> mensajesError) {
        if (this.mensajesError != null && mensajesError != null) {
            this.mensajesError.addAll(mensajesError.stream().filter(mensaje -> !mensaje.isEmpty()).toList());
        }
        if (this.mensajesError == null) {
            this.mensajesError = mensajesError;
        }
    }

    public void cancelar(List<String> mensajesError) {
        if (!(estadoOrden == EstadoOrden.CANCELANDO || estadoOrden == EstadoOrden.PENDIENTE)) {
            throw new ExceptionDominioOrden("Orden no posee el estado  pagado correcto");
        }
        estadoOrden = EstadoOrden.CANCELADO;
        actualizarMensajesError(mensajesError);
    }


    public void validarOrden() {
        validarOrdenInicial();
        validarPrecioTotal();
        validarPrecioItem();
    }

    private void validarPrecioItem() {
        Moneda ordenItemTotal = itemsList.stream().map(ordenItems -> {
            validarItemPrecio(ordenItems);
            return ordenItems.getSubtotal();
        }).reduce(Moneda.ZERO, Moneda::sumar);
        if (!price.equals(ordenItemTotal)) {
            throw new ExceptionDominioOrden("Precio item incorrecto");
        }
    }

    private void validarItemPrecio(OrdenItems ordenItems) {
        if (!ordenItems.precioValido()) {
            throw new ExceptionDominioOrden("Precio invalido");
        }
    }

    private void validarPrecioTotal() {
        if (price == null || !price.esMayorQueCero()) {
            throw new ExceptionDominioOrden("Oden incorrecta");
        }
    }

    private void validarOrdenInicial() {
        if (estadoOrden != null || getId() != null) {
            throw new ExceptionDominioOrden("La orden no es correcta por inicializacion");
        }
    }

    private void inicializadorOrdenItems() {
        long itemId = 1;
        for (OrdenItems ordenItems : itemsList) {
            ordenItems.inicializarOrdenItems(super.getId(), new IDOrdenItem(itemId++));
        }

    }

    private Orden(Builder builder) {
        super.setId(builder.idOrden);
        idCliente = builder.idCliente;
        idRestaurante = builder.idRestaurante;
        direccionCalle = builder.direccionCalle;
        price = builder.price;
        itemsList = builder.itemsList;
        idSeguimiento = builder.idSeguimiento;
        estadoOrden = builder.estadoOrden;
        mensajesError = builder.mensajesError;
    }


    public IDCliente getIdCliente() {
        return idCliente;
    }


    public IDRestaurante getIdRestaurante() {
        return idRestaurante;
    }

    public DireccionCalle getDireccionCalle() {
        return direccionCalle;
    }

    public Moneda getPrice() {
        return price;
    }

    public List<OrdenItems> getItemsList() {
        return itemsList;
    }

    public IDSeguimiento getIdSeguimiento() {
        return idSeguimiento;
    }

    public EstadoOrden getEstadoOrden() {
        return estadoOrden;
    }

    public List<String> getMensajesError() {
        return mensajesError;
    }

    public static final class Builder {
        private IDOrden idOrden;
        private IDCliente idCliente;
        private IDRestaurante idRestaurante;
        private DireccionCalle direccionCalle;
        private Moneda price;
        private List<OrdenItems> itemsList;
        private IDSeguimiento idSeguimiento;
        private EstadoOrden estadoOrden;
        private List<String> mensajesError;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder id(IDOrden val) {
            idOrden = val;
            return this;
        }

        public Builder idCliente(IDCliente val) {
            idCliente = val;
            return this;
        }

        public Builder idRestaurante(IDRestaurante val) {
            idRestaurante = val;
            return this;
        }

        public Builder direccionCalle(DireccionCalle val) {
            direccionCalle = val;
            return this;
        }

        public Builder price(Moneda val) {
            price = val;
            return this;
        }

        public Builder itemsList(List<OrdenItems> val) {
            itemsList = val;
            return this;
        }

        public Builder idSeguimiento(IDSeguimiento val) {
            idSeguimiento = val;
            return this;
        }

        public Builder estadoOrden(EstadoOrden val) {
            estadoOrden = val;
            return this;
        }

        public Builder mensajesError(List<String> val) {
            mensajesError = val;
            return this;
        }

        public Orden build() {
            return new Orden(this);
        }
    }
}
