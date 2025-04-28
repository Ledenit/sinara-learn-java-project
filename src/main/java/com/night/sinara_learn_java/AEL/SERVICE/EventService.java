package com.night.sinara_learn_java.AEL.SERVICE;

import com.night.sinara_learn_java.AEL.EVENTS.AsyncEvent;
import com.night.sinara_learn_java.AEL.EVENTS.CommonEvent;
import com.night.sinara_learn_java.AEL.EVENTS.TransactionalEvent;
import org.springframework.transaction.annotation.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class EventService {
    private final ApplicationEventPublisher publisher;

    public void publishCommonEvent(String name) {
        log.info("Порождаю CommonEvent и он говорит: Я '{}'", name);
        publisher.publishEvent(new CommonEvent(name));
    }

    public void publishAsyncEvent(String name) {
        log.info("Порождаю AsyncEvent и он говорит: Я '{}'", name);
        publisher.publishEvent(new AsyncEvent(name));
    }


    @Transactional
    public void publishTransactionalEvents(String name) {
        log.info("Порождаю TransactionalEvent и он говорит: Я '{}'", name);
        publisher.publishEvent(new TransactionalEvent(name));

        try {
            rollback(name);
        } catch (RuntimeException e) {
            log.info("ОТМЕНЯЮ ТРАНЗАКЦИЮ", e.getMessage());
        }
    }

    @Transactional
    public void rollback(String name) {
        log.info("Порождаю TransactionalEvent (rollback) и он говорит: Я '{}'", name);
        publisher.publishEvent(new TransactionalEvent(name));
        throw new RuntimeException();
    }
}
