package com.night.sinara_learn_java.AEL.LISTENERS;

import com.night.sinara_learn_java.AEL.EVENTS.AsyncEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AsyncEventListener  {
    @EventListener
    @Async
    public void async(AsyncEvent e) {
        log.info("Обрабатываю AsyncEvent и он говорит: Я {}", e.getName());
    }
}
