package com.luizfernandotech.webservice.repositories;

import com.luizfernandotech.webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
