package com.frankmoley.lil.admin_web.web.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import com.frankmoley.lil.admin_web.data.model.Customer;
import com.frankmoley.lil.admin_web.data.model.Order;
import com.frankmoley.lil.admin_web.data.repository.CustomerRepository;
import com.frankmoley.lil.admin_web.data.repository.OrderRepository;

@Controller
@RequestMapping("/customers")
public class CustomerController {

  private final CustomerRepository customerRepository;
  private final OrderRepository orderRepository;

  public CustomerController(CustomerRepository customerRepository, OrderRepository orderRepository) {
    this.customerRepository = customerRepository;
    this.orderRepository = orderRepository;
  }

  @GetMapping
  public String getAllUsers(Model model) {
    Iterable<Customer> customersIterable = this.customerRepository.findAll();
    List<Customer> customers = new ArrayList<>();
    customersIterable.forEach(customers::add);
    customers.sort(new Comparator<Customer>() {
      @Override
      public int compare(Customer o1, Customer o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
    model.addAttribute("customers", customers);
    model.addAttribute("module", "customers");
    return "customers";
  }

  @GetMapping(path = "/{id}")
  public String getUser(@PathVariable("id") UUID customerId, Model model) {
    Optional<Customer> customer = this.customerRepository.findById(customerId);
    if (customer.isEmpty()) {
      throw new ResponseStatusException(
          HttpStatus.NOT_FOUND, "entity not found");
    }
    model.addAttribute("customer", customer.get());
    Iterable<Order> ordersIterable = this.orderRepository.findAllByCustomerId(customer.get().getId());
    List<Order> orders = new ArrayList<>();
    ordersIterable.forEach(orders::add);
    model.addAttribute("orders", orders);
    model.addAttribute("module", "customers");
    return "detailed_customer";
  }
}