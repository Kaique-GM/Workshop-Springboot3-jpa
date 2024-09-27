package com.javacourse.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.springProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {


}