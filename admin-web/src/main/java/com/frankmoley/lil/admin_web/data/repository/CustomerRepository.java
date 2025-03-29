package com.frankmoley.lil.admin_web.data.repository;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

import com.frankmoley.lil.admin_web.data.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {
}
