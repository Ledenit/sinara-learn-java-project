package com.night.sinara_learn_java.DB;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private List<String> events = new ArrayList<>();
}
