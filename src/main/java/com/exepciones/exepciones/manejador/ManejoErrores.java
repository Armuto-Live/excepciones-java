package com.exepciones.exepciones.manejador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManejoErrores {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handleArithmeticException(ArithmeticException ERROR){
        return new ResponseEntity<>("Error: división entre 0 no permitida", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException ERROR){
        return new ResponseEntity<>("Error: el valor de la variable no debe ser null", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handleNumberFormatException(NumberFormatException ERROR){
        return new ResponseEntity<>("Error: NO es un valor entero", HttpStatus.BAD_REQUEST);
    }
}
