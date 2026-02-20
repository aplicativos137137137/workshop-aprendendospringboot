package com.aprendendospringboot.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.aprendendospringboot.course.repositories.OrderRepository;
import com.aprendendospringboot.course.entities.Order;

@Service
public class OrderService {


    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
