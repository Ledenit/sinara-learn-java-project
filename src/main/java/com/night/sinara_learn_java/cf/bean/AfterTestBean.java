package com.night.sinara_learn_java.cf.bean;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@ConditionalOnBean(TestBean.class)
public class AfterTestBean {

    public AfterTestBean() {
        log.info("TestBean exists => AfterTestBean is created");
    }
}
