package com.example.userservice.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
        super("Resourse not found exception");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
