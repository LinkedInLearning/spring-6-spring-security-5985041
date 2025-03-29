package com.frankmoley.lil.admin_web.web.model;

import java.util.UUID;
import lombok.Data;

@Data
public class OrderModel {
  private UUID orderId;
  private String customer;
  private UUID customerId;
  private String orderDetails;
}