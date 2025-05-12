# Task 11. Брокеры сообщений (JMS, AMQP, Kafka)
**ФИО:** Кабицкий Георгий Станиславович

**Преподаватель:** Рогожников Дмитрий

## Описание
Реализованы два самостоятельных SpringBoot-сервиса, обменивающихся JSON-сообщениями через `Apache Kafka`:

- **broker-producer** — публикует JSON-сообщения в топик `sinara-java`
- **broker-consumer** — слушает этот топик и выводит каждое сообщение в лог

Ссылка на broker-producer: https://github.com/Ledenit/sinara-learn-java-project/pull/10

### Что я сделал
1. broker-producer (Producer)
   * Создал DTO `MessageDTO` с полями `from` и `text`
   * Настроил `ProducerConfiguration` через `KafkaProperties` и `ProducerConfig`, используя `JsonSerializer` для сериализации
   * Реализовал сервис `MessageService`, где считываю имя топика из `application.properties` через `@Value("${spring.kafka.topic}")` и отправляю сообщение в Kafka в методе `publish` с помощью `KafkaTemplate`
   * Реализовал REST-контроллер `MessageController`, принимающий JSON-тело и вызывающий `messageService.publish(message)`

2. broker-consumer (Consumer)
   * Создал тот же DTO `MessageDTO`
   * Настроил `ConsumerConfiguration` через `KafkaProperties` и `ConsumerConfig`, использовал `JsonDeserializer` с `addTrustedPackages("*")` для десериализации сообщений
   * Реализовал сервис `RecipientService` с методом `receive`, который слушает топик `sinara-java` и выводит каждое пришедшее сообщение в лог
   
