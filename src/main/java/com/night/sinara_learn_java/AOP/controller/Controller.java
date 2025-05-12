package com.night.sinara_learn_java.AOP.controller;

import com.night.sinara_learn_java.AOP.DTO.ResponseDTO;
import com.night.sinara_learn_java.AOP.Service.AOPService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {
    private final AOPService aopService;

    @GetMapping("/monkey-work")
    public ResponseDTO monkeyWork(){
        return aopService.doMonkeyWork();
    }
}
