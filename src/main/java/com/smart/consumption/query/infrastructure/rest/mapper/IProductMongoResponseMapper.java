package com.smart.consumption.query.infrastructure.rest.mapper;

import org.mapstruct.Mapper;

import com.smart.consumption.query.domain.models.product.Product;
import com.smart.consumption.query.infrastructure.rest.data.response.ProductResponse;
import com.smart.consumption.query.infrastructure.shared.mapper.GenericMapper;

/**
 * Mapper interface for converting @{@link Product} to @{@link ProductResponse}
 * <p> This interface is used by MapStruct to generate the implementation at compile time </p>
 * @see Product
 * @see ProductResponse
 */
@Mapper(componentModel = "spring")
public interface IProductMongoResponseMapper extends GenericMapper<Product, ProductResponse> {

}

    
