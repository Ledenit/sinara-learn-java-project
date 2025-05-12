package com.night.sinara_learn_java.AOP.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
public class LimitRequestException extends RuntimeException {
    public LimitRequestException(){
        super("Максимальное количество запросов превышено");
    }
}
