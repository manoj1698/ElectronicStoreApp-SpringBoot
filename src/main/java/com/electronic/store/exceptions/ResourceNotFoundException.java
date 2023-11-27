package com.electronic.store.exceptions;

import lombok.Builder;

@Builder
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("Resource Not Found !!");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
