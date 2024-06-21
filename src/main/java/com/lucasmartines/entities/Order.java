package com.lucasmartines.entities;

import lombok.Data;

@Data
public class Order {
    private String name;
    private String email;
    private String product;
    private Integer quantity;

    public Order() {
    }

    public Order(Integer quantity, String name, String email, String product) {
        this.quantity = quantity;
        this.name = name;
        this.email = email;
        this.product = product;
    }
}
