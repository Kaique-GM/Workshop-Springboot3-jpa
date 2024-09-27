package com.javacourse.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.springProject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {


}