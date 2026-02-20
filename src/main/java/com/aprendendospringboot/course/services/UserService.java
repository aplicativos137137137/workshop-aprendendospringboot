package com.aprendendospringboot.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.aprendendospringboot.course.repositories.UserRepository;
import com.aprendendospringboot.course.entities.User;

@Service
public class UserService {


    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
