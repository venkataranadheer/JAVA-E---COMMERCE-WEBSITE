package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  private double price;

  // Getters and Setters
  // Constructor
  public Product() {}

  public Product(String name, String description, double price) {
    this.name = name;
    this.description = description;
    this.price = price;
  }

  // Getters and Setters omitted for brevity
}
