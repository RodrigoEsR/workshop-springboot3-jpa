package com.projectspring.springbootproject.repositories;

import com.projectspring.springbootproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
