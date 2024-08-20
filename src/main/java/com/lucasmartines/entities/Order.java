package com.lucasmartines.entities;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Order {
    private String name;
    private String email;
    private String product;
    private Integer quantity;

    public Order(Integer quantity, String name, String email, String product) {
        this.quantity = quantity;
        this.name = name;
        this.email = email;
        this.product = product;
    }


}
