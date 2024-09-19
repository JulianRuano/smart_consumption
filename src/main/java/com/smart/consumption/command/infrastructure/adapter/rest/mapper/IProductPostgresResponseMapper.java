package com.smart.consumption.command.infrastructure.adapter.rest.mapper;

import org.mapstruct.Mapper;

import com.smart.consumption.command.domain.models.product.Product;
import com.smart.consumption.command.infrastructure.adapter.rest.data.response.ProductResponse;
import com.smart.consumption.command.infrastructure.adapter.shared.mapper.GenericMapper;

/**
 * Mapper interface for converting @{@link Product} to @{@link ProductResponse}
 * <p> This interface is used by MapStruct to generate the implementation at compile time </p>
 * @see GenericMapper
 * @see Product
 * @see ProductResponse
 */

@Mapper(componentModel = "spring")
public interface IProductPostgresResponseMapper extends GenericMapper<Product, ProductResponse> {

}