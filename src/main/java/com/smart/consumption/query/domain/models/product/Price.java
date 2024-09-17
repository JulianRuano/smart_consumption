package com.smart.consumption.query.domain.models.product;

public class Price {
    private final double value;

    protected Price() {
        this.value = 0.0;
    }

    public Price(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
