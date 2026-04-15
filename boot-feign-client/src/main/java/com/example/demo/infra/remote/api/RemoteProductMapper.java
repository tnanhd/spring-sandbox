package com.example.demo.infra.remote.api;

import com.example.demo.domain.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RemoteProductMapper {

  RemoteProductMapper INSTANCE = Mappers.getMapper(RemoteProductMapper.class);

  Product remoteProductToProduct(RemoteProduct remoteProduct);
}
