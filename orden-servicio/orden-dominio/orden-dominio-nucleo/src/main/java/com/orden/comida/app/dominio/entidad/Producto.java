package com.orden.comida.app.dominio.entidad;

import com.orden.comida.app.dominio.objetovalor.IDProducto;

public class Producto extends EntidadBase<IDProducto> {
    private String nombre;
    private String precio;

    public Producto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void actualizarNombrePrecio(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
