package com.orden.comida.app.dominio.objetovalor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Moneda {
    private final BigDecimal monto;
    public static final Moneda ZERO = new Moneda(BigDecimal.ZERO);

    public Moneda(BigDecimal monto) {
        this.monto = monto;
    }


    public BigDecimal getMonto() {
        return monto;
    }

    public boolean esMayorQueCero() {
        return this.monto != null && this.monto.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean esMayorQue(Moneda moneda) {
        return this.monto != null && this.monto.compareTo(moneda.getMonto()) > 0;

    }

    public Moneda sumar(Moneda moneda) {
        return new Moneda(setScale(this.monto.add(moneda.getMonto())));
    }

    public Moneda restar(Moneda moneda) {
        return new Moneda(setScale(this.monto.subtract(moneda.getMonto())));
    }


    public Moneda multiplicar(Moneda moneda) {
        return new Moneda(setScale(this.monto.multiply(moneda.getMonto())));
    }

    private BigDecimal setScale(BigDecimal input) {
        return input.setScale(2, RoundingMode.HALF_EVEN);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moneda moneda = (Moneda) o;
        return monto.equals(moneda.monto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monto);
    }
}
