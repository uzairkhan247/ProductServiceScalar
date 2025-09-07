package com.scalar.ProductServiceScalar.controlleradvices;

import com.scalar.ProductServiceScalar.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException exception) {
        return new ResponseEntity<>(
                exception.getMessage(),
                HttpStatus.BAD_GATEWAY
        );
    }

//    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
//    public void handleArrayIndexedOutOfBound() {
//
//    }

//    @ExceptionHandler(Exception.class)
//    public void handleException() {
//
//    }
}
