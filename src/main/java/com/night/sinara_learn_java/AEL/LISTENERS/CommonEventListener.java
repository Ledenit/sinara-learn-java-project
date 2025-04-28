package com.night.sinara_learn_java.AEL.LISTENERS;

import com.night.sinara_learn_java.AEL.EVENTS.CommonEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommonEventListener {
    @EventListener
    public void common(CommonEvent e) {
        log.info("Обрабатываю CommonEvent и он говорит: Я {}", e.getName());
    }
}
