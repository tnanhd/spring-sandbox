package com.example.demo.feature.product.shared;

import java.math.BigDecimal;

public record ProductDetails(
    Integer id,
    String title,
    BigDecimal price
) {}
