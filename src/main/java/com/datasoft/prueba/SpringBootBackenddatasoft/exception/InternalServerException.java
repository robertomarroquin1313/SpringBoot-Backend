package com.datasoft.prueba.SpringBootBackenddatasoft.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class InternalServerException {
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorMessage> errorExceptionHandler(RuntimeException ex){
        ErrorMessage errorMessage = ErrorMessage.builder().errorCode(HttpStatus.BAD_REQUEST.toString()).message(ex.getMessage()).build();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}
