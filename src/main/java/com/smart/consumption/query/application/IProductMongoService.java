package com.smart.consumption.query.application;

import com.smart.consumption.query.domain.models.product.Product;

public interface IProductMongoService {
    public Product save(Product product);
    public Product findById(String id);
}
