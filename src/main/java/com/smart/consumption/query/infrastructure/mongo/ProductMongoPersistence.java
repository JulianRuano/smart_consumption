package com.smart.consumption.query.infrastructure.mongo;

import com.smart.consumption.query.domain.models.product.Product;
import com.smart.consumption.query.infrastructure.mongo.entity.ProductEntity;
import com.smart.consumption.query.infrastructure.mongo.mapper.IProductMongoMapper;
import com.smart.consumption.query.infrastructure.mongo.repository.IProductMongoRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.smart.consumption.query.domain.models.product.IProductRepository;

@Component
@RequiredArgsConstructor
public class ProductMongoPersistence implements IProductRepository {

    private final IProductMongoRepository productJpaRepository;
    private final IProductMongoMapper productMapper;

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = productMapper.toProduct(product);
        productEntity = productJpaRepository.save(productEntity);
        return productMapper.toProduct(productEntity);
    }

    @Override
    public Product findById(String id) {
        return productJpaRepository.findById(id).map(productMapper::toProduct).orElse(null);
    }
    
}
