package com.night.sinara_learn_java.WS.Controller;

import com.night.sinara_learn_java.WS.DTO.RequestDTO;
import com.night.sinara_learn_java.WS.DTO.ResponseDTO;
import com.night.sinara_learn_java.WS.DTO.InfoDateId;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class JsonController {
    @RequestMapping("/post")
    public ResponseDTO getRequest(@RequestBody RequestDTO request) {
        ResponseDTO response = new ResponseDTO();
        response.setPrice(request.getPrice());

        InfoDateId infoDateId = new InfoDateId();
        infoDateId.setDate(request.getInfo().getDate());
        infoDateId.setId(ThreadLocalRandom.current().nextInt(1000)); // генерация id

        response.setInfo(infoDateId);

        return response;
    }
}
