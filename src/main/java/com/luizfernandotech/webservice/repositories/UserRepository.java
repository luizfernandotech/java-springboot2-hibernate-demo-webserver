package com.luizfernandotech.webservice.repositories;

import com.luizfernandotech.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
