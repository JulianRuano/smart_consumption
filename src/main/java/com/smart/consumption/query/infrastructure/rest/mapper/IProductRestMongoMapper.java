package com.smart.consumption.query.infrastructure.rest.mapper;

import org.mapstruct.Mapper;

import com.smart.consumption.query.domain.models.product.Product;
import com.smart.consumption.query.infrastructure.rest.data.request.ProductRequest;
import com.smart.consumption.query.infrastructure.rest.data.response.ProductResponse;

@Mapper(componentModel = "spring")
public interface IProductRestMongoMapper {

    Product toDomain(ProductRequest productRequest);
    ProductResponse toResponse(Product product);
    
}
