package com.night.sinara_learn_java;

import com.night.sinara_learn_java.cf.AppProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
@EnableConfigurationProperties(AppProperties.class)
public class SinaraLearnProjectApp {
    public static void main(String[] args) {
        SpringApplication.run(com.night.sinara_learn_java.SinaraLearnProjectApp.class, args);
    }
//
//    @Bean
//    CommandLineRunner run(ApplicationContext ctx) {
//        return args -> {
//            Syllabus syllabus = ctx.getBean(Syllabus.class);
//            syllabus.printCourses();
//            System.exit(0);
//        };
//    }

    @Bean
    CommandLineRunner checkProperties(AppProperties appProperties) {
        return args -> {
            System.out.println("App name: " + appProperties.getName());
            System.out.println("Values: " + appProperties.getValues());
            System.out.println("EnvVar: " + appProperties.getEnvVar());
        };
    }
}


