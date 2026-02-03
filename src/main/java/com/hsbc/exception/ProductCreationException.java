// File: src/main/java/com/hsbc/exception/ProductCreationException.java
package com.hsbc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProductCreationException extends RuntimeException {
    public ProductCreationException() { super(); }
    public ProductCreationException(String message) { super(message); }
    public ProductCreationException(String message, Throwable cause) { super(message, cause); }
    public ProductCreationException(Throwable cause) { super(cause); }
}