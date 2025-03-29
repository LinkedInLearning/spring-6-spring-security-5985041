package com.frankmoley.lil.admin_web.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.frankmoley.lil.admin_web.data.model.Order;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<Order, UUID> {
  Iterable<Order> findAllByCustomerId(UUID customerId);
}
