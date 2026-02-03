// File: src/main/java/com/hsbc/exception/ProductUpdateException.java
package com.hsbc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProductUpdateException extends RuntimeException {
    public ProductUpdateException() { super(); }
    public ProductUpdateException(String message) { super(message); }
    public ProductUpdateException(String message, Throwable cause) { super(message, cause); }
    public ProductUpdateException(Throwable cause) { super(cause); }
}