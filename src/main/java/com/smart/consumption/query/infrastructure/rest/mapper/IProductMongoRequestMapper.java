package com.smart.consumption.query.infrastructure.rest.mapper;

import org.mapstruct.Mapper;

import com.smart.consumption.query.domain.models.product.Product;
import com.smart.consumption.query.infrastructure.rest.data.request.ProductRequest;

import com.smart.consumption.query.infrastructure.shared.mapper.GenericMapper;

/**
 * Mapper interface for converting @{@link Product} to @{@link ProductRequest}
 * <p> This interface is used by MapStruct to generate the implementation at compile time </p>
 * @see GenericMapper
 * @see Product
 * @see ProductRequest
 */
@Mapper(componentModel = "spring")
public interface IProductMongoRequestMapper extends GenericMapper<Product, ProductRequest> {

}

    
