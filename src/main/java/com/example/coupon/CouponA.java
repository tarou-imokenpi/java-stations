package com.example.coupon;

public class CouponA {

    public float calculate(int[] cartItems) {
        int total = 0;
        for (int value : cartItems) {
            total += value;
        }
        return (float) total;
    }
}
