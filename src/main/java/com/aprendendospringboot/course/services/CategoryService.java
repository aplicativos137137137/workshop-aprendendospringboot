package com.aprendendospringboot.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.aprendendospringboot.course.repositories.CategoryRepository;
import com.aprendendospringboot.course.entities.Category;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
