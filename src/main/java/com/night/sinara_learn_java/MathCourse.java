package com.night.sinara_learn_java;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MathCourse implements Course{
    private static final Logger logger = LoggerFactory.getLogger(Syllabus.class);

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
        logger.info("Bean MathCourse was created");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("Bean MathCourse was destroyed");
    }
}
