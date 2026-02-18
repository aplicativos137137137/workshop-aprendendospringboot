package com.aprendendospringboot.course.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import java.util.Arrays;

import com.aprendendospringboot.course.repositories.UserRepository;
import com.aprendendospringboot.course.entities.User;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public void run(String... args) throws Exception {

        User trem = new User(null, "trem", "trem@gmail.com", "85997687485", "e7y6ig");
        User tremBala = new User(null, "trem bala", "trembala@gmail.com", "85984393928", "wo8yre");

        userRepository.saveAll(Arrays.asList(trem, tremBala));

    }
}