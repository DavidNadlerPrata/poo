package com.davidnadler.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davidnadler.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
