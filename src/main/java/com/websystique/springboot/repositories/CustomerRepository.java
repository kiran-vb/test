package com.websystique.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.websystique.springboot.model.Customer;
import com.websystique.springboot.model.User;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    User findByName(String name);

}
