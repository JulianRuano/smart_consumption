package com.smart.consumption.command.application.product;

import org.springframework.stereotype.Service;

import com.smart.consumption.command.domain.models.product.IProductRepository;
import com.smart.consumption.command.domain.models.product.Product;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {
    private final IProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

}
