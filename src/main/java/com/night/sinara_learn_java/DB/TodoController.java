package com.night.sinara_learn_java.DB;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @PostMapping("/todo")
    public ResponseEntity<TodoResponseDTO> createToDoList(@RequestBody TodoRequestDTO requestDTO) {
        return ResponseEntity.ok(todoService.createTodoList(requestDTO));
    }

    @GetMapping("/todo")
    public ResponseEntity<List<TodoResponseDTO>> getAllLists() {
        return ResponseEntity.ok(todoService.getAllTodoLists());
    }
}
