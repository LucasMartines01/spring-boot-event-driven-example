package com.lucasmartines.service;

import com.lucasmartines.dto.OrderRequestDTO;
import com.lucasmartines.entities.Order;
import com.lucasmartines.event.OrderCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class OrderService {
    private final ApplicationEventPublisher eventPublisher;


    public OrderService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void createOrder(OrderRequestDTO dto) {
        Order order = new Order(dto.quantity(), dto.name(), dto.email(), dto.product());

          eventPublisher.publishEvent(
                    new OrderCreatedEvent(
                            this, order.getEmail(),
                            "Order created successfully"
                    )
          );




        log.info("Order created: {}", order);
    }
}
