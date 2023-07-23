package com.morandi.teste.controller;

import com.morandi.entities.Departament;
import com.morandi.entities.Product;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

  @GetMapping
  public List<Product> getObjects() {
    Departament d1 = new Departament(1L, "Tech");
    Departament d2 = new Departament(2L, "Pet");

    Product p1 = new Product(1L, "Macbook M1", 4000.0, d1);
    Product p2 = new Product(2L, "Pc Gamer", 5000.0, d1);
    Product p3 = new Product(3L, "Casa Pet", 300.0, d2);

    List<Product> productsList = Arrays.asList(p1, p2, p3);

    return productsList;
  }
}
