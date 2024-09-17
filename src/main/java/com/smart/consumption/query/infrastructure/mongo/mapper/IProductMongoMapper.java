package com.smart.consumption.query.infrastructure.mongo.mapper;

import org.mapstruct.Mapper;

import com.smart.consumption.query.domain.models.product.Product;
import com.smart.consumption.query.infrastructure.mongo.entity.ProductEntity;

@Mapper(componentModel = "spring")
public interface IProductMongoMapper {
    ProductEntity toProduct(Product product);

    Product toProduct(ProductEntity productEntity);
}
