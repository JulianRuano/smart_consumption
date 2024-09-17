package com.smart.consumption.command.application;

import com.smart.consumption.command.domain.models.product.Product;

public interface IProductService {
    public Product save(Product product);
}
