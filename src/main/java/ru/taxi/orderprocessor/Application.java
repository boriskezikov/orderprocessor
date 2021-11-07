package ru.taxi.orderprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        SpringApplication.run(Application.class, args);
    }

}
