package com.night.sinara_learn_java;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("EnglishCourse")
public class EnglishCourse implements Course{

    @Override
    public String getCourseName() {
        return "English language Part 2.B1";
    }

    @Override
    public Integer getCourseHours() {
        return 68;
    }

    @Override
    public String getCourseChief() {
        return "Yurku A.S.";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Bean EnglishCourse was created");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Bean EnglishCourse was destroyed");
    }
}
