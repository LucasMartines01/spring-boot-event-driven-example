package com.lucasmartines.service;

import com.lucasmartines.dto.OrderRequestDTO;
import com.lucasmartines.entities.Order;
import com.lucasmartines.event.OrderCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.threads.VirtualThreadExecutor;
import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class OrderService {
    private ApplicationEventPublisher eventPublisher;


    public OrderService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void createOrder(OrderRequestDTO dto) {
        Order order = new Order();
        BeanUtils.copyProperties(dto, order);
        try (VirtualThreadExecutor executor = new VirtualThreadExecutor("OrderService")) {
            executor.execute(() -> eventPublisher.publishEvent(
                    new OrderCreatedEvent(
                            this, order.getEmail(),
                            "Order created successfully"
                    )
            ));
        }


        log.info("Order created: {}", order);
    }
}
