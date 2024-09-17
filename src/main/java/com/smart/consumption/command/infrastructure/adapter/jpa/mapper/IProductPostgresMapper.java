package com.smart.consumption.command.infrastructure.adapter.jpa.mapper;

import org.mapstruct.Mapper;

import com.smart.consumption.command.domain.models.product.Product;
import com.smart.consumption.command.infrastructure.adapter.jpa.entity.ProductEntity;
import com.smart.consumption.command.infrastructure.adapter.shared.mapper.GenericMapper;

/**
 * Mapper interface for the entity {@link ProductEntity} and its Domain {@link Product}
 * <p> This interface is used by MapStruct to generate the implementation of the mapper 
 * that will be used to convert the entity to the domain and vice versa. </p> 
 * 
 * @see GenericMapper
 * @see Product
 * @see ProductEntity
 */
@Mapper(componentModel = "spring")
public interface IProductPostgresMapper extends GenericMapper<Product, ProductEntity> {

}