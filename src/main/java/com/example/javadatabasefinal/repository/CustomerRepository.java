package com.example.javadatabasefinal.repository;

import com.example.javadatabasefinal.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer findByEmail(String email);
    public Optional<Customer> findById(Long id);
}
