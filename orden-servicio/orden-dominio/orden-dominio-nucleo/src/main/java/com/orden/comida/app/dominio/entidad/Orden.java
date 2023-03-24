package com.orden.comida.app.dominio.entidad;

import com.orden.comida.app.dominio.objetovalor.DireccionCalle;
import com.orden.comida.app.dominio.objetovalor.IDSeguimiento;
import com.orden.comida.app.dominio.objetovalor.*;

import java.util.List;

public class Orden extends RaizAgregada<IDOrden> {
    private final IDCliente idCliente;
    private final IDRestaurante idRestaurante;
    private final DireccionCalle direccionCalle;
    private final Moneda price;
    private final List<OrdenItems> itemsList;
    private IDSeguimiento idSeguimiento;
    private EstadoOrden estadoOrden;
    private List<String> mensajesError;

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
