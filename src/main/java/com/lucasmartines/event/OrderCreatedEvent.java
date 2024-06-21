package com.lucasmartines.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class OrderCreatedEvent extends ApplicationEvent {
    private String email;
    private String message;

    public OrderCreatedEvent(Object source, String email, String message) {
        super(source);
        this.email = email;
        this.message = message;
    }
}
