package com.aprendendospringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospringboot.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}