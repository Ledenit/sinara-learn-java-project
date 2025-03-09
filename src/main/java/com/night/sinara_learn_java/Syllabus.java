package com.night.sinara_learn_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Syllabus {

    private final Course constructorInjcourse;

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
        System.out.println("Field Injection: " + fieldInjCourse.getCourseName());
        System.out.println("Constructor Injection: " + constructorInjcourse.getCourseName());
        System.out.println("Setter Injection: " + setterInjCourse.getCourseName());
    }
}
