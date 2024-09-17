package com.smart.consumption.query.domain.models.product;

public interface IProductRepository {
    
    public Product save(Product product);
    public Product findById(String id);
}
