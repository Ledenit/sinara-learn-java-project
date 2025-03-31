package com.night.sinara_learn_java.VI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.context.MessageSource;

import java.util.List;
import java.util.Locale;
import java.util.ArrayList;

@ControllerAdvice
public class HandlerEx {
    @Autowired
    private MessageSource messageSource;

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<String>> handleValidationException(MethodArgumentNotValidException ex, Locale locale) {
        List<String> errors = new ArrayList<>();
        for (org.springframework.validation.FieldError error : ex.getBindingResult().getFieldErrors()) {
            String errorMessage = messageSource.getMessage(error, locale);
            errors.add(errorMessage);
        }
        return ResponseEntity.badRequest().body(errors);
    }
}
