package com.example.demo.infra.remote.api;

import java.math.BigDecimal;

public record RemoteProduct(
    Integer id,
    String title,
    BigDecimal price
) {}
