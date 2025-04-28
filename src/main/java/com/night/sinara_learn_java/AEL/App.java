package com.night.sinara_learn_java.AEL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableAsync
@EnableTransactionManagement
public class App {
    public static void main(String[] args) {
        SpringApplication.run(com.night.sinara_learn_java.AEL.App.class, args);
    }
}
