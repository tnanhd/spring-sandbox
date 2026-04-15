package com.example.demo.feature.shared;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ApiResponse<T>(T data, Metadata metadata) {

  public record Metadata(Integer page, Integer perPage, Long totalPages, Long totalItems) {}

  public static <T> ApiResponse<T> of(T data, Metadata metadata) {
    return new ApiResponse<>(data, metadata);
  }

  public static <T> ApiResponse<T> of(T data) {
    return of(data, null);
  }
}
