package com.smart.consumption.query.infrastructure.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.consumption.query.application.IProductMongoService;
import com.smart.consumption.query.domain.models.product.Product;
import com.smart.consumption.query.infrastructure.rest.data.request.ProductRequest;
import com.smart.consumption.query.infrastructure.rest.data.response.ProductResponse;
import com.smart.consumption.query.infrastructure.rest.mapper.IProductRestMongoMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/products/mongo")
@RequiredArgsConstructor
public class ProductQueryController {

    private final IProductMongoService productService;
    private final IProductRestMongoMapper productRestMapper;

    @PostMapping("/")
    public ResponseEntity<ProductResponse> save(@RequestBody ProductRequest productRequest) {
        Product product = productRestMapper.toDomain(productRequest);
        Product savedProduct = productService.save(product);
        ProductResponse productResponse = productRestMapper.toResponse(savedProduct);
        return ResponseEntity.ok(productResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> findById(String id) {
        Product product = productService.findById(id);
        ProductResponse productResponse = productRestMapper.toResponse(product);
        return ResponseEntity.ok(productResponse);
    }
    
}
