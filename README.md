# Task 3: Dependencies Injections
**ФИО:** Кабицкий Георгий Станиславович

**Преподаватель:** Рогожников Дмитрий

Бизнес-логика: учебный план студента, в котором есть два курса.  
Создан interface Course и два класса (MathCourse и EnglishCourse), которые его реализуют.  
MathCourse обладает аннотацией @Primary, которая указывает, что этот бин нужно использовать по умолчанию.
Для внедрения другого бина (EnglishCourse) мы используем аннотацию @Qualifier с указанием названия бина.   
Пример:  
```
@Component("EnglishCourse") - указание названия бина
public class EnglishCourse implements Course{
    ...
}

Использование @Qualifier
public void setCourse(@Qualifier("EnglishCourse") Course course){
        setterInjCourse = course;
}
```

Внедрение зависимостей:  
- **Field Injection** — курс (MathCourse) внедряется напрямую в поле с помощью аннотации `@Autowired`
- **Setter Injection** — курс (EnglishCourse) внедряется по имени с помощью аннотации `@Qualifier("EnglishCourse")`
- **Constructor Injection** — курс (MathCourse) передаётся в `Syllabus` через конструктор

Реализовано логирование части жизненного цикла бина. А именно создание (с помощью @PostConstruct) и "разрушение" (с помощью @PreDestroy).  

**Вывод в консоль**
```
Bean EnglishCourse was created
Bean MathCourse was created
...
Field Injection: Discrete Mathematics
Constructor Injection: Discrete Mathematics
Setter Injection: English language Part 2.B1
...
Bean MathCourse was destroyed
Bean EnglishCourse was destroyed
```
