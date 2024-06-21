package com.lucasmartines.dto;

public record OrderRequestDTO(String name, String email, String product, Integer quantity) {
}
