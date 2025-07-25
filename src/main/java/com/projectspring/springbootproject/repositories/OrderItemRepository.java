package com.projectspring.springbootproject.repositories;

import com.projectspring.springbootproject.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
