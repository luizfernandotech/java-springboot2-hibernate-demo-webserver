package com.luizfernandotech.webservice.repositories;

import com.luizfernandotech.webservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
