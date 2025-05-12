package com.night.sinara_learn_java.AOP.aspect;

import com.night.sinara_learn_java.AOP.exception.LimitRequestException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RequestLimitAspect {

    @Value("${api.max_calls}")
    private int maxCalls;
    private int requestsCount = 0;

    @Before("@annotation(com.night.sinara_learn_java.AOP.annotation.RequestLimit)")
    public void limitCheck() {
        requestsCount++;
        if (requestsCount > maxCalls) {
            throw new LimitRequestException();
        }
    }
}
