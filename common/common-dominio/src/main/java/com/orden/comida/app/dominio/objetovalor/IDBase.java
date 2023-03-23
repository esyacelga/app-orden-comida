package com.orden.comida.app.dominio.objetovalor;

import java.util.Objects;

public abstract class IDBase<T> {
    private final T value;

    protected IDBase(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IDBase<?> idBase = (IDBase<?>) o;
        return value.equals(idBase.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
