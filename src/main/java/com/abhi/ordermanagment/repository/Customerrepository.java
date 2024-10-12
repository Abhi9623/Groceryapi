package com.abhi.ordermanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.ordermanagment.entities.Customer;

@Repository
public interface Customerrepository extends JpaRepository<Customer,Long> {
    
    boolean existsByEmail(String email);
}
