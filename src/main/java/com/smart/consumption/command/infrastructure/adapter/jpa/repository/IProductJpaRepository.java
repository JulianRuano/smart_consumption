package com.smart.consumption.command.infrastructure.adapter.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.consumption.command.infrastructure.adapter.jpa.entity.ProductEntity;

public interface IProductJpaRepository extends  JpaRepository<ProductEntity, Long> {
    
}
