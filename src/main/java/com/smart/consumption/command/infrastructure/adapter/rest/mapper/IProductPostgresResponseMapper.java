package com.smart.consumption.command.infrastructure.adapter.rest.mapper;

import org.mapstruct.Mapper;

import com.smart.consumption.command.domain.models.product.Product;
import com.smart.consumption.command.infrastructure.adapter.rest.data.response.ProductResponse;
import com.smart.consumption.command.infrastructure.adapter.shared.mapper.GenericMapper;

@Mapper(componentModel = "spring")
public interface IProductPostgresResponseMapper extends GenericMapper<Product, ProductResponse> {

}