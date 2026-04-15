package com.example.demo.feature.product.list;

import com.example.demo.domain.usecase.GetAllProductUseCase;
import com.example.demo.feature.product.shared.ProductDetails;
import com.example.demo.feature.product.shared.ProductDetailsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ListProductHandler {

  private final GetAllProductUseCase getAllProductUseCase;

  public List<ProductDetails> handle() {
    return getAllProductUseCase.execute().stream()
        .map(ProductDetailsMapper.INSTANCE::productToProductDetails)
        .toList();
  }
}
