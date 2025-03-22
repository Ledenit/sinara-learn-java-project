package com.night.sinara_learn_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Syllabus {

    private final Course constructorInjcourse;
    private static final Logger logger = LoggerFactory.getLogger(Syllabus.class);

    @Autowired
    private Course fieldInjCourse;

    private Course setterInjCourse;

    public Syllabus(Course course) {
        this.constructorInjcourse = course;
    }

    @Autowired
    public void setCourse(@Qualifier("EnglishCourse") Course course){
        setterInjCourse = course;
    }

    public void printCourses() {
        logger.info("Field Injection: {}", fieldInjCourse.getCourseName());
        logger.info("Constructor Injection: {}", constructorInjcourse.getCourseName());
        logger.info("Setter Injection: {}", setterInjCourse.getCourseName());
    }
}
