package com.example.demo.domain.repository;

import com.example.demo.domain.model.Product;

import java.util.List;

public interface ProductRepository {
  List<Product> getAll();
}
