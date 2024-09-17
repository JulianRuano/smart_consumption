package com.smart.consumption.command.infrastructure.adapter.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PriceValueObject {
    @Column(name = "price_value")
    private final double value;

    protected PriceValueObject() {
        this.value = 0.0;
    }

    public PriceValueObject(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}