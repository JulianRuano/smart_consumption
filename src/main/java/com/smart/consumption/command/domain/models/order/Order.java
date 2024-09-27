package com.smart.consumption.command.domain.models.order;

import java.util.List;

import com.smart.consumption.command.domain.models.product.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private String name;

    private List<Product> products;  
    
    public double getTotal() {
        return products.stream().mapToDouble(p -> p.getPrice().getValue()).sum();
    }
}
