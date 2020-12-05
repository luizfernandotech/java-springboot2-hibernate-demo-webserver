package com.luizfernandotech.webservice.repositories;

import com.luizfernandotech.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
