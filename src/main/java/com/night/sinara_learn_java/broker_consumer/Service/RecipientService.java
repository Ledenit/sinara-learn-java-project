package com.night.sinara_learn_java.broker_consumer.Service;

import com.night.sinara_learn_java.broker_consumer.DTO.MessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RecipientService {

    @KafkaListener(topics = "${spring.kafka.topic}")

    public void receive(MessageDTO message) {
        log.info("Сообщение '{}' от {}", message.getText(), message.getFrom());
    }
}
