package com.berthaudiere.berthau.web;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // globalement les erreurs et à appliquer des logiques transversales dans une
                      // application Spring Boot REST.
public class ActivitySheetErrorHandler {

    @ExceptionHandler(NoSuchElementException.class) // exeption qui gere si un element est pas trouvé
    @ResponseStatus(HttpStatus.NOT_FOUND) // reponse 404 quand quelque chose n'est pas trouvé

    public void handleNoElementException() {
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST) // reponse 400 erreur de mauvaise requete

    // retourne une map avec l'erreur et le message d'erreur
    public Map<String, String> handleValidationException(MethodArgumentNotValidException ex)// Quand @Valid échoue sur
                                                                                            // un @RequestBody

    {
        var errors = new HashMap<String, String>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
