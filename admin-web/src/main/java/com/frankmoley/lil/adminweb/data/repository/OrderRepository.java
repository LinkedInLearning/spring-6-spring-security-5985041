package com.frankmoley.lil.adminweb.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.frankmoley.lil.adminweb.data.model.Order;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<Order, UUID> {
  Iterable<Order> findAllByCustomerId(UUID customerId);
}
