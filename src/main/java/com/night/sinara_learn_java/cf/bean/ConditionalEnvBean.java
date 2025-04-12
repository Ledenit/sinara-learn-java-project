package com.night.sinara_learn_java.cf.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@ConditionalOnExpression("#{'${EXAMPLE_TEST:default}' != 'default'}")
public class ConditionalEnvBean {
    public ConditionalEnvBean() {
        log.info("EXAMPLE_TEST value is not 'default' => ConditionalEnvBean is created");
    }
}
