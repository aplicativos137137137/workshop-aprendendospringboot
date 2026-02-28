package com.aprendendospringboot.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.aprendendospringboot.course.repositories.ProductRepository;
import com.aprendendospringboot.course.entities.Product;

@Service
public class ProductService {


    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
