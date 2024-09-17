package com.smart.consumption.command.infrastructure.adapter.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.consumption.command.application.IProductService;
import com.smart.consumption.command.domain.models.product.Product;
import com.smart.consumption.command.infrastructure.adapter.rest.data.request.ProductRequest;
import com.smart.consumption.command.infrastructure.adapter.rest.data.response.ProductResponse;
import com.smart.consumption.command.infrastructure.adapter.rest.mapper.IProductPostgresResponseMapper;
import com.smart.consumption.command.infrastructure.adapter.rest.mapper.IproductPostgresRequestMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductCommandController {

    private final IProductService productService;
    private final IProductPostgresResponseMapper productResponseMapper;
    private final IproductPostgresRequestMapper productRequestMapper;

    @PostMapping("/")
    public ResponseEntity<ProductResponse> save(@RequestBody ProductRequest productRequest) {
        Product product = productRequestMapper.toSource(productRequest);
        Product savedProduct = productService.save(product);
        ProductResponse productResponse = productResponseMapper.toTarget(savedProduct);
        return ResponseEntity.ok(productResponse);
    }
    
}
