package com.night.sinara_learn_java;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MathCourse implements Course{

    @Override
    public String getCourseName() {
        return "Discrete Mathematics";
    }

    @Override
    public Integer getCourseHours() {
        return 66;
    }

    @Override
    public String getCourseChief() {
        return "Belousova V. I.";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Bean MathCourse was created");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Bean MathCourse was destroyed");
    }
}
