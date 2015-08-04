package com.tiarebalbi.trainning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

    @Bean
    CommandLineRunner init(BookService bookService) {
        return args -> {
            bookService.add(new Book("Fast and Furius 1", "Action"));
            bookService.add(new Book("Fast and Furius 2", "Action"));
            bookService.add(new Book("Fast and Furius 3", "Action"));
            bookService.add(new Book("Fast and Furius 4", "Action"));
            bookService.add(new Book("Fast and Furius 5", "Action"));
            bookService.add(new Book("Fast and Furius 6", "Action"));
            bookService.add(new Book("Fast and Furius 7", "Action"));
        };
    }
}
