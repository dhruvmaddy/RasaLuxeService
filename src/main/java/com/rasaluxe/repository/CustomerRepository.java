package com.rasaluxe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rasaluxe.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}

