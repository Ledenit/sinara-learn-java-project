package com.night.sinara_learn_java.DB;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private  final TodoRepository todoRepository;

    public TodoResponseDTO  createTodoList(TodoRequestDTO request) {
        TodoEntity entity = new TodoEntity();
        entity.setName(request.getName());
        entity.setEvents(request.getEvents());
        TodoEntity savedEntity =  todoRepository.save(entity);

        return new TodoResponseDTO(
                savedEntity.getName(),
                savedEntity.getEvents()
        );
    }

    public List<TodoResponseDTO> getAllTodoLists() {
        return todoRepository.findAll().stream()
                .map(entity -> new TodoResponseDTO(
                        entity.getName(),
                        entity.getEvents()))
                .toList();
    }

}
