package com.javacourse.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.springProject.entities.OrderItem;
import com.javacourse.springProject.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK> {


}