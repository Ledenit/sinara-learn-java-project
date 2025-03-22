package com.night.sinara_learn_java;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("EnglishCourse")
public class EnglishCourse implements Course{
    private static final Logger logger = LoggerFactory.getLogger(Syllabus.class);

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
        logger.info("Bean EnglishCourse was created");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("Bean EnglishCourse was destroyed");
    }
}
