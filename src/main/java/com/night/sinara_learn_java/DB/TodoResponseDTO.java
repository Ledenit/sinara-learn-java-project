package com.night.sinara_learn_java.DB;

import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
public class TodoResponseDTO {
    private String name;
    private List<String> events;
}
