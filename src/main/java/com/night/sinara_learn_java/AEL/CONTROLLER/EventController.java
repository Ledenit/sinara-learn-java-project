package com.night.sinara_learn_java.AEL.CONTROLLER;

import com.night.sinara_learn_java.AEL.DTO.EventDTO;
import com.night.sinara_learn_java.AEL.SERVICE.EventService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EventController {
    private final EventService eventService;

    @PostMapping("/api/common")
    public ResponseEntity<Void> common(@RequestBody EventDTO dto) {
        eventService.publishCommonEvent(dto.getName());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/api/async")
    public ResponseEntity<Void> async(@RequestBody EventDTO dto) {
        eventService.publishAsyncEvent(dto.getName());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/api/transaction")
    public ResponseEntity<Void> transaction(@RequestBody EventDTO dto) {
        eventService.publishTransactionalEvents(dto.getName());
        return ResponseEntity.ok().build();
    }
}
