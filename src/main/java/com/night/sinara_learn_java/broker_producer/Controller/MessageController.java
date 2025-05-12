package com.night.sinara_learn_java.broker_producer.Controller;

import com.night.sinara_learn_java.broker_producer.DTO.MessageDTO;
import com.night.sinara_learn_java.broker_producer.Service.MessageService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MessageController {

    final MessageService messageService;

    @PostMapping("/publish")
    public String publish(@RequestBody MessageDTO message){
        messageService.publish(message);
        return "Message published";
    }
}
