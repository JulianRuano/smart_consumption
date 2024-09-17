package com.smart.consumption.query.infrastructure.mongo.entity;


public class PriceValueObject {

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