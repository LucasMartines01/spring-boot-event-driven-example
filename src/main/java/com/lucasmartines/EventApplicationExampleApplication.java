package com.lucasmartines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EventApplicationExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventApplicationExampleApplication.class, args);
    }

}
