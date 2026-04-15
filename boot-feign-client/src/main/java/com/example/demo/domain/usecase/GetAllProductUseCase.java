package com.example.demo.domain.usecase;

import com.example.demo.domain.model.Product;
import com.example.demo.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GetAllProductUseCase {

  private final ProductRepository productRepository;

  public List<Product> execute() {
    return productRepository.getAll();
  }
}
