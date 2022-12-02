package com.rsk.simplilearn.foodbox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsk.simplilearn.foodbox.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	public Customer findByEmail(String theEmail);
}  
