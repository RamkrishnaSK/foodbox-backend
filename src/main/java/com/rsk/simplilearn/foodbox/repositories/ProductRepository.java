package com.rsk.simplilearn.foodbox.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rsk.simplilearn.foodbox.entities.Product;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Integer> {
	public Page<Product> findByCategoryId(@Param("id") int id, Pageable pageable);

	public Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);
}
