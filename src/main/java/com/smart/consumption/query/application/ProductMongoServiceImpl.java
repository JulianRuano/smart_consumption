package com.smart.consumption.query.application;

import org.springframework.stereotype.Service;

import com.smart.consumption.query.domain.models.product.IProductRepository;
import com.smart.consumption.query.domain.models.product.Product;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductMongoServiceImpl implements IProductMongoService {
    private final IProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(String id) {
        return productRepository.findById(id);
    }

}
