package com.smart.consumption.command.infrastructure.adapter.jpa;

import com.smart.consumption.command.domain.models.product.Product;
import com.smart.consumption.command.infrastructure.adapter.jpa.entity.ProductEntity;
import com.smart.consumption.command.infrastructure.adapter.jpa.mapper.IProductPostgresMapper;
import com.smart.consumption.command.infrastructure.adapter.jpa.repository.IProductJpaRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import com.smart.consumption.command.domain.models.product.IProductRepository;

@Component
@RequiredArgsConstructor
public class ProductJpaPersistence implements IProductRepository {

    private final IProductJpaRepository productJpaRepository;
    private final IProductPostgresMapper productMapper;

    private final ApplicationEventPublisher eventPublisher;

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = productMapper.toTarget(product);
        productEntity = productJpaRepository.save(productEntity);

        eventPublisher.publishEvent(productEntity);
        
        return productMapper.toSource(productEntity);
    }
    
}
