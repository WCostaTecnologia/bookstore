package com.wesley.bookstore.controller.exceptions;

import com.wesley.bookstore.service.exceptions.ObjectNotFoundExceptions;
import jakarta.servlet.ServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionsHandler {

    @ExceptionHandler(ObjectNotFoundExceptions.class)
    public ResponseEntity<StandardError> objectNotFoundExceptions(ObjectNotFoundExceptions e , ServletRequest request){
        StandardError error =new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
