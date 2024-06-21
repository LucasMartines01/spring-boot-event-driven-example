package com.lucasmartines.service;

import com.lucasmartines.event.OrderCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class NotificationService {

    @Async
    @EventListener
    public void sendEmail(OrderCreatedEvent event) {
        // Send email to the user
        log.info("Email sent to: {}", event.getEmail());
    }
}
