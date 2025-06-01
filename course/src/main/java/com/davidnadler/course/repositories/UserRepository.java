package com.davidnadler.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davidnadler.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
