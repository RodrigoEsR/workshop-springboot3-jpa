package com.projectspring.springbootproject.repositories;

import com.projectspring.springbootproject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
