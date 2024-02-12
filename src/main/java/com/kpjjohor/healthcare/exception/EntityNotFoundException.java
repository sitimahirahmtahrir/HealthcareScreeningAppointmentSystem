package com.kpjjohor.healthcare.exception;

@SuppressWarnings("serial")
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }
}