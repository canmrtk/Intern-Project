package com.canmertek.leave_management.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class LeaveRequestListener {

    @RabbitListener(queues = "leaveRequestsQueue")
    public void receiveMessage(String message) {
        System.out.println("RabbitMQ'dan gelen mesaj: " + message);
    }
}
