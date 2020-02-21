package com.example.webpoc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class WebpocApplication {

    public static void main (String[] args) {
        SpringApplication.run(WebpocApplication.class, args);
        log.info("Application is running");
        log.info("URLs:\n" +
                "======================================================\n" +
                "\tAcesse: \thttp://localhost:8080\n" +
                "======================================================");
    }

}
