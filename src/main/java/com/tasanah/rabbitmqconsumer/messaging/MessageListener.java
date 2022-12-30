package com.tasanah.rabbitmqconsumer.messaging;

import com.tasanah.rabbitmqconsumer.config.MQConfig;
import com.tasanah.rabbitmqconsumer.dto.CustomMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        log.info(String.valueOf(message));
    }
}
