package com.orden.comida.app.dominio.exception;

public class ExcepcionDominio  extends RuntimeException{
    public ExcepcionDominio(String message) {
        super(message);
    }

    public ExcepcionDominio(String message, Throwable cause) {
        super(message, cause);
    }
}
