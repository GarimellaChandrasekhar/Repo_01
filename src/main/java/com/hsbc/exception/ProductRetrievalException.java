// File: src/main/java/com/hsbc/exception/ProductRetrievalException.java
package com.hsbc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ProductRetrievalException extends RuntimeException {
    public ProductRetrievalException() { super(); }
    public ProductRetrievalException(String message) { super(message); }
    public ProductRetrievalException(String message, Throwable cause) { super(message, cause); }
    public ProductRetrievalException(Throwable cause) { super(cause); }
}