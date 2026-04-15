package com.example.demo.infra.di;

import com.example.demo.domain.repository.ProductRepository;
import com.example.demo.domain.usecase.GetAllProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductModule {

  @Bean
  public GetAllProductUseCase getAllProductUseCase(ProductRepository productRepository) {
    return new GetAllProductUseCase(productRepository);
  }
}
