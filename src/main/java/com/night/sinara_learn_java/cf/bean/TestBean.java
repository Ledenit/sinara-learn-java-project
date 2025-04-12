package com.night.sinara_learn_java.cf.bean;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Profile("test")
public class TestBean {

    public TestBean(){
        log.info("Profile 'test' is active => TestBean is created ");
    }
}
