# Autoservice API

## Описание проекта

Autoservice API - это приложение на основе Spring Boot, которое предоставляет RESTful интерфейс для управления клиентами, автомобилями, историей ремонтов, запчастями и заявками на ремонт в автосервисе. Это приложение использует PostgreSQL в качестве базы данных и включает в себя интеграцию с Swagger для удобного взаимодействия с API.

## Структура проекта

Проект организован по следующей структуре:


Конечно! Вот готовый README.md файл:

markdown
Копировать код
# Autoservice API

## Описание проекта

Autoservice API - это приложение на основе Spring Boot, которое предоставляет RESTful интерфейс для управления клиентами, автомобилями, историей ремонтов, запчастями и заявками на ремонт в автосервисе. Это приложение использует PostgreSQL в качестве базы данных и включает в себя интеграцию с Swagger для удобного взаимодействия с API.

## Структура проекта

Проект организован по следующей структуре:


## API

### Основные эндпоинты

- **GET /api/clients/{id}**
    - Описание: Получение информации о клиенте по идентификатору.
    - Ответ: JSON с данными клиента.

- **POST /api/clients**
    - Описание: Создание нового клиента.
    - Запрос: JSON с данными клиента.
    - Ответ: JSON с данными созданного клиента.

- **DELETE /api/clients/{id}**
    - Описание: Удаление клиента по идентификатору.
    - Ответ: JSON с подтверждением удаления.

- **GET /api/cars/{id}**
    - Описание: Получение информации об автомобиле по идентификатору.
    - Ответ: JSON с данными автомобиля.

### Swagger UI

Swagger UI доступен по следующему пути:

[http://localhost:8080/swagger-ui/swagger-ui/index.html#/](http://localhost:8080/swagger-ui/swagger-ui/index.html#/)

## Запуск приложения

### Запуск из Docker

Для запуска приложения в Docker используйте следующие команды:

1. **Создание Docker-образа**

   ```bash
   docker build -t autoservice-api .

2. **Запуск Docker-контейнера**

   ```bash
   docker run -p 8080:8080 --env SPRING_DATASOURCE_URL=jdbc:postgresql://<db-host>:<db-port>/<db-name> --env SPRING_DATASOURCE_USERNAME=<db-username> --env SPRING_DATASOURCE_PASSWORD=<db-password> autoservice-api

### Требования
- Java 17
- PostgreSQL
- Docker (для запуска в контейнере)

### Зависимости
- Spring Boot
- Spring Data JPA
- PostgreSQL 
- Lombok
- Springdoc OpenAPI
- Logback