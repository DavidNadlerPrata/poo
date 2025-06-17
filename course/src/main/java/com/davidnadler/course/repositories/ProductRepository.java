package com.davidnadler.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davidnadler.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
