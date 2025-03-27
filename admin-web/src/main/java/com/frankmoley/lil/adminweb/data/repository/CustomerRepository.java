package com.frankmoley.lil.adminweb.data.repository;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

import com.frankmoley.lil.adminweb.data.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {
}
