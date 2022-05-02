package com.todoapp.demo.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GeneralError extends Exception {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return new ResponseEntity<>("Oops something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
