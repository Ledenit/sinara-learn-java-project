package com.night.sinara_learn_java.broker_producer.Service;

import com.night.sinara_learn_java.broker_producer.DTO.MessageDTO;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class MessageService {
    final KafkaTemplate<String, MessageDTO> template;

    @Value("${spring.kafka.topic}")
    String topicName;

    public void publish(MessageDTO message) {
        template.send(topicName, message);
    }
}
