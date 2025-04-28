package com.night.sinara_learn_java.AEL.LISTENERS;

import com.night.sinara_learn_java.AEL.EVENTS.TransactionalEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@Slf4j
public class TransactionalEventListenner {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void transaction(TransactionalEvent e) {
        log.info("Обрабатываю TransactionalEvent и он говорит: Я {}", e.getName());
    }
}
