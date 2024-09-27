package com.smart.consumption.command.domain.models.product;

import java.util.List;

import com.smart.consumption.command.domain.models.order.Order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private String name;
    private String description;
    private Price price;

    private List<Order> orders;

    public Price applyDiscount(double porcentage) {
        if (porcentage < 0 || porcentage > 100) {
            throw new IllegalArgumentException("Porcentage must be between 0 and 100");
        }
        double discount = price.getValue() * porcentage / 100;
        return new Price(price.getValue() - discount);
    }
}
