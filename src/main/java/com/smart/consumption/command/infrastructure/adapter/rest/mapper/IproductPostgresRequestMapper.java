package com.smart.consumption.command.infrastructure.adapter.rest.mapper;

import org.mapstruct.Mapper;

import com.smart.consumption.command.domain.models.product.Product;
import com.smart.consumption.command.infrastructure.adapter.rest.data.request.ProductRequest;
import com.smart.consumption.command.infrastructure.adapter.shared.mapper.GenericMapper;

@Mapper(componentModel = "spring")
public interface IproductPostgresRequestMapper extends GenericMapper<Product, ProductRequest> {

}