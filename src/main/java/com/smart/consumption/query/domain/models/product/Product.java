package com.smart.consumption.query.domain.models.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String id;
    private String name;
    private String description;
    private Price price;

    public Price applyDiscount(double porcentage) {
        if (porcentage < 0 || porcentage > 100) {
            throw new IllegalArgumentException("Porcentage must be between 0 and 100");
        }
        double discount = price.getValue() * porcentage / 100;
        return new Price(price.getValue() - discount);
    }


}
