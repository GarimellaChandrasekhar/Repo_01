// File: src/main/java/com/hsbc/exception/ProductDeletionException.java
package com.hsbc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProductDeletionException extends RuntimeException {
    public ProductDeletionException() { super(); }
    public ProductDeletionException(String message) { super(message); }
    public ProductDeletionException(String message, Throwable cause) { super(message, cause); }
    public ProductDeletionException(Throwable cause) { super(cause); }
}