package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

  @Autowired
  private ProductRepository repo;

  @GetMapping("/")
  public String viewHome(Model model) {
    List<Product> products = repo.findAll();
    model.addAttribute("products", products);
    return "index";
  }
}
