package com.projetocursojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocursojava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
