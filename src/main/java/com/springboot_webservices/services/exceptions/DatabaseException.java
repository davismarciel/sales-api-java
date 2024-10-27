package com.springboot_webservices.services.exceptions;

public class DatabaseException extends RuntimeException {

    public DatabaseException() {
        super("Cannot delete id");
    }

}
