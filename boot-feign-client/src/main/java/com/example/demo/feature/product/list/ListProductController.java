package com.example.demo.feature.product.list;

import com.example.demo.feature.product.shared.ProductDetails;
import com.example.demo.feature.shared.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ListProductController {

  private final ListProductHandler listProductHandler;

  public ResponseEntity<ApiResponse<List<ProductDetails>>> listProducts() {
    return ResponseEntity.ok(ApiResponse.of(listProductHandler.handle()));
  }
}
