package com.lucasmartines.service;

import com.lucasmartines.event.OrderCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class NotificationService {


    @EventListener
    @Async
    public void sendEmail(OrderCreatedEvent event) {
        try {
            Thread.sleep(5000);
            log.info("Email sent to: {}", event.getEmail());
        } catch (InterruptedException e) {
            log.error("Error sending email", e);
        }
    }
}
