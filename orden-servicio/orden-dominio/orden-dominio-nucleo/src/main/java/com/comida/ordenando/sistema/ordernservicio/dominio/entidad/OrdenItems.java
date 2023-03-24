package com.comida.ordenando.sistema.ordernservicio.dominio.entidad;

import com.comida.ordenando.sistema.ordernservicio.dominio.objetovalor.IDOrdenItem;
import com.orden.comida.app.dominio.entidad.EntidadBase;
import com.orden.comida.app.dominio.objetovalor.IDOrden;
import com.orden.comida.app.dominio.objetovalor.Moneda;

public class OrdenItems extends EntidadBase<IDOrdenItem> {
    private IDOrden idOrden;
    private final Producto producto;
    private final int cantidad;
    private final Moneda precio;
    private final Moneda subtotal;

    private OrdenItems(Builder builder) {
        super.setId(builder.idOrdenItem);
        producto = builder.producto;
        cantidad = builder.cantidad;
        precio = builder.precio;
        subtotal = builder.subtotal;
    }


    public IDOrden getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(IDOrden idOrden) {
        this.idOrden = idOrden;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Moneda getPrecio() {
        return precio;
    }

    public Moneda getSubtotal() {
        return subtotal;
    }

    public static final class Builder {
        private IDOrdenItem idOrdenItem;
        private Producto producto;
        private int cantidad;
        private Moneda precio;
        private Moneda subtotal;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder idOrdenItem(IDOrdenItem val) {
            idOrdenItem = val;
            return this;
        }

        public Builder producto(Producto val) {
            producto = val;
            return this;
        }

        public Builder cantidad(int val) {
            cantidad = val;
            return this;
        }

        public Builder precio(Moneda val) {
            precio = val;
            return this;
        }

        public Builder subtotal(Moneda val) {
            subtotal = val;
            return this;
        }

        public OrdenItems build() {
            return new OrdenItems(this);
        }
    }
}
