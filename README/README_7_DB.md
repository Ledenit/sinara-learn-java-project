# Task 7. Работа с БД
**ФИО:** Кабицкий Георгий Станиславович

**Преподаватель:** Рогожников Дмитрий

### Контроллер  
`TodoController` имеет два метода:  
- **`@PostMapping("/todo")`**
    - Обрабатывает POST-запросы для создания списка задач
    - Принимает и возвращает: `application/json`

- **`@GetMapping("/todo")`**
    - Обрабатывает GET-запросы для получения всех списков
    - Возвращает: `application/json`  

### DTO
`TodoRequestDTO` - получение данных от клиента  
`TodoResponseDTO` - отправка данных клиенту

### Entity
`TodoEntity` хранит данные в полях:
- `Long id`
- `String name`
- `List<String> events`

Дополнительно был создан репозиторий `TodoRepository` и сервис `TodoService`

### Структура БД

Таблица todo:  
- id - автоинкремент  
- name - название списка  
- events - массив задач  