package com.frankmoley.lil.admin_web.data.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="orders")
@Getter
@Setter
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="order_id")
    private UUID id;
    @Column(name="customer_id")
    private UUID customerId;
    @Column(name="order_info")
    private String orderInfo;
}
