package com.projetocursojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocursojava.course.entities.OrderItem;
import com.projetocursojava.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}