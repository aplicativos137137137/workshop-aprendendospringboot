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
import com.aprendendospringboot.course.entities.enums.OrderStatus;
import com.aprendendospringboot.course.repositories.CategoryRepository;
import com.aprendendospringboot.course.entities.Category;
import com.aprendendospringboot.course.repositories.ProductRepository;
import com.aprendendospringboot.course.entities.Product;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    public void run(String... args) throws Exception {

        Category eletronics = new Category(null, "eletronics");
        Category foods = new Category(null, "foods");
        Category computers = new Category(null, "computers");

        Product sucoDeLaranja = new Product(null, "suco de laranja", "cruel viu", 7.0, "");
        Product macbook = new Product(null, "macbook", "cruel", 3000.0, "");
        Product microfone = new Product(null, "microfone", "urra doido", 70.0, "");
        Product arroz = new Product(null, "arroz", "vamooo", 75.0, "");
        Product carne = new Product(null, "carne", "vamooooooooo", 79.0, "");

        categoryRepository.saveAll(Arrays.asList(eletronics, foods, computers));
        productRepository.saveAll(Arrays.asList(sucoDeLaranja, macbook, microfone, arroz, carne));

        User trem = new User(null, "trem", "trem@gmail.com", "85997687485", "e7y6ig");
        User tremBala = new User(null, "trem bala", "trembala@gmail.com", "85984393928", "wo8yre");

        Order macarrão = new Order(null, Instant.parse("2026-02-20T15:30:33Z"), OrderStatus.PAID, trem);
        Order computador = new Order(null, Instant.parse("2026-02-17T15:27:17Z"), OrderStatus.PAID, trem);
        Order notebook = new Order(null, Instant.parse("2026-02-20T15:50:55Z"), OrderStatus.PAID, tremBala);

        userRepository.saveAll(Arrays.asList(trem, tremBala));
        orderRepository.saveAll(Arrays.asList(macarrão, computador, notebook));

    }
}