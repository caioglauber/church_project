# Church Children Management API

REST API developed in Java with Spring Boot for managing children, guardians and rooms in a church.

## About the project

This project was developed as a practical exercise to consolidate knowledge in:

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* REST API
* JPA entity relationships

The system allows children to be registered together with their parents/guardians and assigned to a room.

## Features

* Register children
* Register guardians
* Register rooms
* Associate a child with a guardian
* Associate a child with a room
* List all children
* Search a child by ID
* List children belonging to a specific room

## Technologies

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven
* Git / GitHub
* Postman

## Project structure

The project follows a layered architecture:

```text
Resource
   ↓
Service
   ↓
Repository
   ↓
Database
```

### Resource

Responsible for handling HTTP requests and responses.

### Service

Contains the application's business logic.

### Repository

Responsible for communication with the database through Spring Data JPA.

## Entity relationships

The main relationships are:

```text
Responsavel 1 ─────── N Crianca

Sala        1 ─────── N Crianca
```

A guardian can be associated with multiple children, while each child belongs to one guardian.

A room can contain multiple children, while each child belongs to one room.

## Example endpoint

### List children from a room

```http
GET /criancas/sala/{id}
```

Example:

```http
GET /criancas/sala/1
```

This endpoint returns the children assigned to the specified room.

## Database

The application uses PostgreSQL as its relational database.

The main entities are:

```text
tb_responsavel
tb_crianca
tb_sala
```

## Running the project

### 1. Clone the repository

```bash
git clone <repository-url>
```

### 2. Configure PostgreSQL

Create a PostgreSQL database and configure the connection in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/flecha
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Run the application

Using Maven:

```bash
./mvnw spring-boot:run
```

Or run the main class:

```text
FlechaApplication
```

## Testing

The API can be tested using Postman.

Example:

```http
GET http://localhost:8080/criancas
```

To find the children belonging to a specific room:

```http
GET http://localhost:8080/criancas/sala/1
```

## Author

Developed as a Java and Spring Boot learning project.
