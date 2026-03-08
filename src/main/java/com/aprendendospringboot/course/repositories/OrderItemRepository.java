package com.aprendendospringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospringboot.course.entities.OrderItem;
import com.aprendendospringboot.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}