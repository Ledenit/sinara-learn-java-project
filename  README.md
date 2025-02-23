# Task 1: Аннотация @SpringBootApplication
**ФИО:** Кабицкий Георгий Станиславович

**Преподаватель:** Рогожников Дмитрий

Аннотация @SpringBootApplication объединяет аннотации @Configuration, @EnableAutoConfiguration, @ComponentScan и значительно упрощает создание и настройку Spring-приложений.

Параметры аннотации @SpringBootApplication:

`exclude` - исключает определённые классы автоконфигурации из автоматической настройки Spring Boot

`excludeName` - исключает определённые имена классов автоконфигурации из автоматической настройки Spring Boot

`nameGenerator` - кастомный генератор имён для бинов

`proxyBeanMethods` - управляет проксированием методов, возвращающих бины

`scanBasePackages` - указывает пакеты, которые Spring Boot должен сканировать для поиска компонентов

`scanBasePackageClasses` - указывает классы, пакеты которых Spring Boot должен сканировать для поиска компонентов