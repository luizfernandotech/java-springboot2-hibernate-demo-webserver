package com.luizfernandotech.webservice.repositories;

import com.luizfernandotech.webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
