package com.example.solid_examples.ocp;

public class DiscountManager {

    Double apply(Double price, Discount discount) {
        return discount.apply(price);
    }
}
