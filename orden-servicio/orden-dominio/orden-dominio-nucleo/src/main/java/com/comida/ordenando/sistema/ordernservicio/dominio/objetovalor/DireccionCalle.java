package com.comida.ordenando.sistema.ordernservicio.dominio.objetovalor;

import java.util.Objects;
import java.util.UUID;

public class DireccionCalle {
    private final UUID id;
    private final String calle;
    private final String codigoPostal;
    private final String ciudad;


    public DireccionCalle(UUID id, String calle, String codigoPostal, String ciudad) {
        this.id = id;
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }

    public UUID getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DireccionCalle that = (DireccionCalle) o;
        return calle.equals(that.calle) && codigoPostal.equals(that.codigoPostal) && ciudad.equals(that.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calle, codigoPostal, ciudad);
    }
}
