package com.example.demo.feature.product.shared;

import com.example.demo.domain.model.Product;
import org.mapstruct.Mapper;

import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductDetailsMapper {

  ProductDetailsMapper INSTANCE = Mappers.getMapper(ProductDetailsMapper.class);

  ProductDetails productToProductDetails(Product product);
}
