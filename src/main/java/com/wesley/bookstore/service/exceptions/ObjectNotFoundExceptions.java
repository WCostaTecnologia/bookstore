package com.wesley.bookstore.service.exceptions;

public class ObjectNotFoundExceptions extends  RuntimeException{

    public ObjectNotFoundExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjectNotFoundExceptions(String message) {
        super(message);
    }
}
