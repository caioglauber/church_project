package com.my_first_project.flecha.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.my_first_project.flecha.services.exceptions.RecursoDuplicadoException;

@RestControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(RecursoDuplicadoException.class)
    public ResponseEntity<String> handleDuplicado(
            RecursoDuplicadoException e) {

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(e.getMessage());
    }
	
}
