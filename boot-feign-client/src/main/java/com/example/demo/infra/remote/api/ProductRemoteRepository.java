package com.example.demo.infra.remote.api;

import com.example.demo.domain.model.Product;
import com.example.demo.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRemoteRepository implements ProductRepository {

  private final ProductDummyJsonFeignClient productDummyJsonFeignClient;

  @Override
  public List<Product> getAll() {
    return productDummyJsonFeignClient.getAllProducts().stream()
        .map(RemoteProductMapper.INSTANCE::remoteProductToProduct)
        .toList();
  }
}
