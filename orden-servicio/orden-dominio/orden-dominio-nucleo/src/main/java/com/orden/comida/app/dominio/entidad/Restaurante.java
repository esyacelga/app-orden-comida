package com.orden.comida.app.dominio.entidad;

import com.orden.comida.app.dominio.objetovalor.IDRestaurante;

import java.util.List;

public class Restaurante extends RaizAgregada<IDRestaurante> {
    private final List<Producto> productos;
    private boolean active;

    private Restaurante(Builder builder) {
        super.setId(builder.id);
        productos = builder.productos;
        active = builder.active;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public boolean isActive() {
        return active;
    }

    public static final class Builder {
        private IDRestaurante id;
        private List<Producto> productos;
        private boolean active;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder id(IDRestaurante val) {
            id = val;
            return this;
        }

        public Builder productos(List<Producto> val) {
            productos = val;
            return this;
        }

        public Builder active(boolean val) {
            active = val;
            return this;
        }

        public Restaurante build() {
            return new Restaurante(this);
        }
    }
}
