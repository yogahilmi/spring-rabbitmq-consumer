# Spring Boot Rabbit MQ Consumer

## Specification
- Java 17
- Spring Boot 3.0.1
- RabbitMQ 3.11.5

## Run the Application 

We can easily run the whole with command:

```bash
mvn -U clean spring-boot:run
```

Install Rabbit MQ with Docker with command:

```bash
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.11-management
```
