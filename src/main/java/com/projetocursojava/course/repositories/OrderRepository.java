package com.projetocursojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocursojava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}