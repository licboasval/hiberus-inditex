package com.hiberus.inditex.service.exception;

/**
 * Excepción general provocada por operaciones dentro del servicio
 */
public class InditexException extends Exception {
    public InditexException(String message) {
        super(message);
    }
    public InditexException() {
    }
}
