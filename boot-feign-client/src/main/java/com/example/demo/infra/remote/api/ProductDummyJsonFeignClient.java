package com.example.demo.infra.remote.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "productDummyJsonFeignClient", url = "${feign.client.product-url}")
public interface ProductDummyJsonFeignClient {

  @GetMapping
  List<RemoteProduct> getAllProducts();
}
