package com.night.sinara_learn_java.AOP.Service;

import com.night.sinara_learn_java.AOP.DTO.ResponseDTO;
import com.night.sinara_learn_java.AOP.annotation.RequestLimit;
import org.springframework.stereotype.Service;

@Service
public class AOPService {

    @RequestLimit
    public ResponseDTO doMonkeyWork(){
        return new ResponseDTO( 1, "Banana" );
    }
}
