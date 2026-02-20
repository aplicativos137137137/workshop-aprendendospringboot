package com.aprendendospringboot.course.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import java.util.Arrays;
import java.time.Instant;

import com.aprendendospringboot.course.repositories.UserRepository;
import com.aprendendospringboot.course.entities.User;
import com.aprendendospringboot.course.entities.Order;
import com.aprendendospringboot.course.repositories.OrderRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    public void run(String... args) throws Exception {

        User trem = new User(null, "trem", "trem@gmail.com", "85997687485", "e7y6ig");
        User tremBala = new User(null, "trem bala", "trembala@gmail.com", "85984393928", "wo8yre");

        Order macarrão = new Order(null, Instant.parse("2026-02-20T15:30:33Z"), trem);
        Order computador = new Order(null, Instant.parse("2026-02-17T15:27:17Z"), trem);
        Order notebook = new Order(null, Instant.parse("2026-02-20T15:50:55Z"), tremBala);

        userRepository.saveAll(Arrays.asList(trem, tremBala));
        orderRepository.saveAll(Arrays.asList(macarrão, computador, notebook));

    }
}