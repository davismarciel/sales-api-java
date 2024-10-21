package com.springboot_webservices.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long SerialVersionUUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }

}
