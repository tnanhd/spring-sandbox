package com.example.demo.domain.model;

import java.math.BigDecimal;

public record Product(
    Integer id,
    String title,
    String description,
    String category,
    BigDecimal price
) {}
