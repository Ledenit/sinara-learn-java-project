package com.night.sinara_learn_java.DB;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TodoRequestDTO {
    private String name;
    private List<String> events;
}
