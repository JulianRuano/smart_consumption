package com.smart.consumption.query.infrastructure.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smart.consumption.query.infrastructure.mongo.entity.ProductEntity;

public interface IProductMongoRepository extends  MongoRepository<ProductEntity, String> {
    
}
