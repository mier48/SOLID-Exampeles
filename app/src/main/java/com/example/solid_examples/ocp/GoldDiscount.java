package com.example.solid_examples.ocp;

public class GoldDiscount implements Discount {

    public Double apply(Double price) {
        return price * 0.3;
    }
}
